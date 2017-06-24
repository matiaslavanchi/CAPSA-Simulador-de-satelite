/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matt
 */
public class MetodosLoginTest {
    
    public MetodosLoginTest() {
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
     * Test of validar_ingreso method, of class MetodosLogin.
     * @throws java.lang.Exception
     */
    @Test
    public void testValidar_ingreso_false() throws Exception {
        System.out.println("validar_ingreso");
        String usuario = "";
        String clave = "";
        MetodosLogin instance = new MetodosLogin();
        int expResult = 0;
        int result = instance.validar_ingreso(usuario, clave);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidar_ingreso_true() throws Exception {
        System.out.println("validar_ingreso");
        String usuario = "root";
        String clave = "root";
        MetodosLogin instance = new MetodosLogin();
        int expResult = 1;
        int result = instance.validar_ingreso(usuario, clave);
        assertEquals(expResult, result);
    }
    
}
