/*
 * This file is generated by jOOQ.
 */
package com.lorenjamison.citronellaapi.data.generated.citronella.tables.records;


import com.lorenjamison.citronellaapi.data.generated.citronella.tables.Users;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends TableRecordImpl<UsersRecord> implements Record5<ULong, String, String, String, String> {

    private static final long serialVersionUID = 1287002999;

    /**
     * Setter for <code>citronella.users.id</code>.
     */
    public UsersRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>citronella.users.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>citronella.users.auth0_id</code>.
     */
    public UsersRecord setAuth0Id(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>citronella.users.auth0_id</code>.
     */
    public String getAuth0Id() {
        return (String) get(1);
    }

    /**
     * Setter for <code>citronella.users.first_name</code>.
     */
    public UsersRecord setFirstName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>citronella.users.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>citronella.users.last_name</code>.
     */
    public UsersRecord setLastName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>citronella.users.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>citronella.users.email</code>.
     */
    public UsersRecord setEmail(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>citronella.users.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<ULong, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<ULong, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return Users.USERS.ID;
    }

    @Override
    public Field<String> field2() {
        return Users.USERS.AUTH0_ID;
    }

    @Override
    public Field<String> field3() {
        return Users.USERS.FIRST_NAME;
    }

    @Override
    public Field<String> field4() {
        return Users.USERS.LAST_NAME;
    }

    @Override
    public Field<String> field5() {
        return Users.USERS.EMAIL;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAuth0Id();
    }

    @Override
    public String component3() {
        return getFirstName();
    }

    @Override
    public String component4() {
        return getLastName();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAuth0Id();
    }

    @Override
    public String value3() {
        return getFirstName();
    }

    @Override
    public String value4() {
        return getLastName();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public UsersRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public UsersRecord value2(String value) {
        setAuth0Id(value);
        return this;
    }

    @Override
    public UsersRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public UsersRecord value4(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public UsersRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UsersRecord values(ULong value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(ULong id, String auth0Id, String firstName, String lastName, String email) {
        super(Users.USERS);

        set(0, id);
        set(1, auth0Id);
        set(2, firstName);
        set(3, lastName);
        set(4, email);
    }
}
