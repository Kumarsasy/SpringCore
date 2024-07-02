package com.loosecoupling;

// A - MySql, Postgre Sql
// B - Web service, Mongo DB

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        // Directly access database here
        return "User Details from database";
    }
}
