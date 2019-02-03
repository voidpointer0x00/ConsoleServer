/**
 * Authorizable.java
 *
 * Copyright 2019.02.01 Vasiliy Petukhov
 * 
 * @version 1.0
 */
package me.nyanguymf.console.server.types;

/**
 * @author nyanguymf
 */
public interface Authorizable {
    /**
     * Authorizes some user with login in system.
     * 
     * @param login : User's login.
     * @param password : User's password.
     * @return <tt>true</tt> if authorized successfully
     * and <tt>false</tt> if not.
     */
    public boolean authorise(String password);

    /** Returns <tt>true</tt> if user authorized. */
    public boolean isAuthorized();

    /** Gets Client's auth tries count. */
    public int getAuthTries();

    /** Gets Client's login. */
    public String getLogin();

    /** Gets hash code of password. */
    public String getPassHash();
}
