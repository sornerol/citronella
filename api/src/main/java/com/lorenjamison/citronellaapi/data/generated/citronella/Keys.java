/*
 * This file is generated by jOOQ.
 */
package com.lorenjamison.citronellaapi.data.generated.citronella;


import com.lorenjamison.citronellaapi.data.generated.citronella.tables.Users;
import com.lorenjamison.citronellaapi.data.generated.citronella.tables.records.UsersRecord;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>citronella</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<UsersRecord, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;
    public static final UniqueKey<UsersRecord> KEY_USERS_USERS_AUTH0_ID_IDX = UniqueKeys0.KEY_USERS_USERS_AUTH0_ID_IDX;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<UsersRecord, Integer> IDENTITY_USERS = Internal.createIdentity(Users.USERS, Users.USERS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = Internal.createUniqueKey(Users.USERS, "KEY_users_PRIMARY", new TableField[] { Users.USERS.ID }, true);
        public static final UniqueKey<UsersRecord> KEY_USERS_USERS_AUTH0_ID_IDX = Internal.createUniqueKey(Users.USERS, "KEY_users_users_auth0_id_IDX", new TableField[] { Users.USERS.AUTH0_ID }, true);
    }
}
