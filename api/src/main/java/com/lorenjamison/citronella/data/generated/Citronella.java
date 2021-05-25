/*
 * This file is generated by jOOQ.
 */
package com.lorenjamison.citronella.data.generated;


import com.lorenjamison.citronella.data.generated.tables.Project;
import com.lorenjamison.citronella.data.generated.tables.Sprint;
import com.lorenjamison.citronella.data.generated.tables.User;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Citronella extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>citronella</code>
     */
    public static final Citronella CITRONELLA = new Citronella();

    /**
     * The table <code>citronella.project</code>.
     */
    public final Project PROJECT = Project.PROJECT;

    /**
     * The table <code>citronella.sprint</code>.
     */
    public final Sprint SPRINT = Sprint.SPRINT;

    /**
     * The table <code>citronella.user</code>.
     */
    public final User USER = User.USER;

    /**
     * No further instances allowed
     */
    private Citronella() {
        super("citronella", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Project.PROJECT,
            Sprint.SPRINT,
            User.USER);
    }
}
