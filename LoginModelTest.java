/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class LoginModelTest {
    
    public LoginModelTest() {
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
     * Test of loginUnsuccessful method, of class LoginModel.
     */
    @Test
    public void testLoginUnsuccessful() throws InstantiationException, IllegalAccessException {
        System.out.println("loginUnsuccessful");
        LoginModel instance = new LoginModel();
        String expResult = "";
        String result = instance.loginUnsuccessful();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmLogin method, of class LoginModel.
     */
    @Test
    public void testConfirmLogin() throws InstantiationException, IllegalAccessException {
        System.out.println("confirmLogin");
        String email = "";
        String pass = "";
        LoginModel instance = new LoginModel();
        String expResult = "";
        String result = instance.confirmLogin(email, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
