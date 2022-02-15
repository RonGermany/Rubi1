/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
//import model.User;
/**
 *
 * @author Jess
 */
public class DBHandler {
    
    //private static final String DBURL = "jdbc:derby:C:/Derby/RUBIDB";
    private static final String DBURL = "jdbc:sqlserver://localhost:1433;databaseName=RUBI;user=sa;password=team22";
    private Connection conn;
    private static Statement stmt = null;
    private String TableName = "";
    private static boolean status = false;
    
    public DBHandler() throws SQLException, InstantiationException, IllegalAccessException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        } catch (ClassNotFoundException e) {
            //handle exception
        }
        this.conn = DriverManager.getConnection(DBURL);
        //createConnection();
    }
//    public DBHandler() throws SQLException, InstantiationException, IllegalAccessException {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//        } catch (ClassNotFoundException e) {
//            //handle exception
//        }
//        this.conn = DriverManager.getConnection(DBURL);
//        Statement stat = conn.createStatement();
//        String query = "SELECT * FROM rawData WHERE sensory_type LIKE '%T%'";
//        ResultSet rs = stat.executeQuery(query);
//        while(rs.next())
//        {
//            System.out.println(rs.getString(0) + rs.getString(1) + rs.getString(2));
//        }
//        //createConnection();
//    }
//    private void createConnection(){
//        try{
//            conn = DriverManager.getConnection(DBURL);
//            System.out.println("I made it to DB");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
    //Function that executes a SELECT query and returns the requested values/data from the database
    public ResultSet executeQuery(String query) {
        ResultSet result;
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeQuery(query);
        }
        catch (SQLException ex) {
            System.out.println("Exception at executeQuery:dataHandler --> ERROR: " + ex.getLocalizedMessage());
            return null;
        }
        return result;
    }
    
    //Function that executes an insertion, deletion, or update query
    public boolean executeAction(String query2) {
        try {
            stmt = conn.createStatement();
            stmt.execute(query2);
            return true;
        }
        catch (SQLException ex) {
            System.out.println("Exception at executeQuery:dataHandler  --> ERROR: " + ex.getLocalizedMessage());
            return false;
        }
        finally {
        }
    }    
    //Get user name from database by using login information. This will carry throughout the session for ID purposes.
    //This is how a typical query should look...
    
    public String getUserName(String email) {
        String name = "";
        String nameQuery = "SELECT NAME "
                + "FROM USERS "
                + "WHERE EMAIL= '" + email + "'";
        ResultSet rs = executeQuery(nameQuery);
        try {
            while (rs.next()) {
                name = rs.getString("NAME");
            }
        } catch (SQLException e) {

        }
        return name;
    }

    public String getUserType(String email) {
        String type = "";
        String typeQuery = "SELECT TYPE "
                + "FROM USERS "
                + "WHERE EMAIL= '" + email + "'";
        ResultSet rs = executeQuery(typeQuery);
        try {
            while (rs.next()) {
                type = rs.getString("TYPE");
            }
        } catch (SQLException e) {

        }
        return type;
    }

    public boolean authenticateUser(String email, String pass) {
        String user;
        String password;
        String checkUser = "SELECT EMAIL, PASSWORD FROM USERS WHERE EMAIL= '" + email + "'";

        ResultSet res = executeQuery(checkUser);
        try {
            while (res.next()) {
                user = res.getString("EMAIL");
                password = res.getString("PASSWORD");
                status = user.equals(email) && password.equals(pass);
            }
        } catch (SQLException ex) {
            System.out.println("Error authenticating user.");
        }
        return status;
    }
    
    /*two methods to create users*/
    public void createAdminUser(String query) throws SQLException{
        stmt = conn.createStatement();
        stmt.executeUpdate(query);            
    }
    
    public void createClientUser(String query) throws SQLException{
        stmt = conn.createStatement();
        stmt.executeUpdate(query); 
    }
    
    public void editUser(String query) throws SQLException{
        stmt = conn.createStatement();
        stmt.executeUpdate(query);
    }
    
    public int getCount(String query) throws SQLException{
        ResultSet res = executeQuery(query);
        res.next();
        int count = res.getInt(1);
        return count;
    }
    
}
