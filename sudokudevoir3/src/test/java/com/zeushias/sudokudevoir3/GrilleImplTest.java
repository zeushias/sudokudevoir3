/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeushias.sudokudevoir3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeuhias
 */
public class GrilleImplTest {
    
    public GrilleImplTest() {
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
     * Test of getGrille method, of class GrilleImpl.
     */
    @Test
    public void testGetGrille() {
        System.out.println("getGrille");
        GrilleImpl instance = null;
        char[][] expResult = null;
        char[][] result = instance.getGrille();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDimension method, of class GrilleImpl.
     */
    @Test
    public void testGetDimension() {
        System.out.println("getDimension");
        GrilleImpl instance = null;
        int expResult = 0;
        int result = instance.getDimension();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class GrilleImpl.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int x = 0;
        int y = 0;
        char value = ' ';
        GrilleImpl instance = null;
        instance.setValue(x, y, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class GrilleImpl.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        int x = 0;
        int y = 0;
        GrilleImpl instance = null;
        char expResult = ' ';
        char result = instance.getValue(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of complete method, of class GrilleImpl.
     */
    @Test
    public void testComplete() {
        System.out.println("complete");
        GrilleImpl instance = null;
        boolean expResult = false;
        boolean result = instance.complete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of possible method, of class GrilleImpl.
     */
    @Test
    public void testPossible() {
        System.out.println("possible");
        int x = 0;
        int y = 0;
        char value = ' ';
        GrilleImpl instance = null;
        boolean expResult = false;
        boolean result = instance.possible(x, y, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrille method, of class GrilleImpl.
     */
    @Test
    public void testSetGrille() {
        System.out.println("setGrille");
        char[][] grilleTab = null;
        GrilleImpl instance = null;
        instance.setGrille(grilleTab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
