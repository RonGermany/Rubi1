/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jess
 */
public class DBHandlerTest {
    
    public DBHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of executeQuery method, of class DBHandler.
     */
    @Test
    public void testExecuteQuery() throws SQLException, InstantiationException, IllegalAccessException {
        System.out.println("executeQuery");
        String query = "";
        DBHandler instance = new DBHandler();
        ResultSet expResult = null;
        ResultSet result = instance.executeQuery(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeAction method, of class DBHandler.
     */
    @Test
    public void testExecuteAction() throws SQLException, InstantiationException, IllegalAccessException {
        System.out.println("executeAction");
        String query2 = "";
        DBHandler instance = new DBHandler();
        boolean expResult = false;
        boolean result = instance.executeAction(query2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class DBHandler.
     */
    @Test
    public void testGetUserName() throws SQLException, InstantiationException, IllegalAccessException {
        System.out.println("getUserName");
        String email = "";
        DBHandler instance = new DBHandler();
        String expResult = "";
        String result = instance.getUserName(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserType method, of class DBHandler.
     */
    @Test
    public void testGetUserType() throws SQLException, InstantiationException, IllegalAccessException {
        System.out.println("getUserType");
        String email = "";
        DBHandler instance = new DBHandler();
        String expResult = "";
        String result = instance.getUserType(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticateUser method, of class DBHandler.
     */
    @Test
    public void testAuthenticateUser() throws SQLException, InstantiationException, IllegalAccessException {
        System.out.println("authenticateUser");
        String email = "";
        String pass = "";
        DBHandler instance = new DBHandler();
        boolean expResult = false;
        boolean result = instance.authenticateUser(email, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

//    /**
//     * Test of createAdminUser method, of class DBHandler.
//     */
//    @Test
//    public void testCreateAdminUser() throws Exception {
//        System.out.println("createAdminUser");
//        String query = "";
//        DBHandler instance = new DBHandler();
//        instance.createAdminUser(query);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createClientUser method, of class DBHandler.
//     */
//    @Test
//    public void testCreateClientUser() throws Exception {
//        System.out.println("createClientUser");
//        String query = "";
//        DBHandler instance = new DBHandler();
//        instance.createClientUser(query);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of editUser method, of class DBHandler.
//     */
//    @Test
//    public void testEditUser() throws Exception {
//        System.out.println("editUser");
//        String query = "";
//        DBHandler instance = new DBHandler();
//        instance.editUser(query);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//  
}
