import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jooq.meta.jaxb.ForcedType

val springBootVersion = "2.4.4"
val springFrameworkVersion = "5.3.5"

plugins {
	id("org.springframework.boot") version "2.4.4"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.4.31"
	kotlin("plugin.spring") version "1.4.31"
	id("nu.studer.jooq") version "5.2"
}

group = "com.lorenjamison.citronella"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	jooqGenerator("org.mariadb.jdbc:mariadb-java-client:2.7.2")
	implementation("org.mariadb.jdbc:mariadb-java-client:2.7.2")
	implementation("org.apache.commons:commons-dbcp2:2.0")
	implementation("org.springframework.boot:spring-boot-starter:${springBootVersion}")
	implementation("org.springframework.boot:spring-boot-starter-web:${springBootVersion}")
	implementation("org.springframework:spring-jdbc:${springFrameworkVersion}")
	implementation("org.springframework:spring-context:${springFrameworkVersion}")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test:${springBootVersion}")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

jooq {
	configurations {
		create("main") {
			jooqConfiguration.apply {
				logging = org.jooq.meta.jaxb.Logging.WARN
				jdbc.apply {
					driver = "org.mariadb.jdbc.Driver"
					url = "jdbc:mysql://localhost:3306/citronella"
					user = "root"
					password = "citronelladbpass"
//					properties.add(Property().withKey("ssl").withValue("true"))
				}
				generator.apply {
					name = "org.jooq.codegen.DefaultGenerator"
					database.apply {
						name = "org.jooq.meta.mariadb.MariaDBDatabase"
						includes = "users"
						forcedTypes.addAll(arrayOf(
							ForcedType()
								.withName("varchar")
								.withIncludeExpression(".*")
								.withIncludeTypes("JSONB?"),
							ForcedType()
								.withName("varchar")
								.withIncludeExpression(".*")
								.withIncludeTypes("INET")
						).toList())
					}
					generate.apply {
						isDeprecated = false
						isRecords = true
						isImmutablePojos = true
						isFluentSetters = true
					}
					target.apply {
						packageName = "com.lorenjamison.citronellaapi.data.generated"
						directory = "src/main/java"
					}
					strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"
				}
			}
		}
	}
}