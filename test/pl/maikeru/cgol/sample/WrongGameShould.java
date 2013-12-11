/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.maikeru.cgol.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maikeru
 */
public class WrongGameShould {

    public WrongGameShould() {
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
     * Test of toArray method, of class WrongGame.
     */
    @Test
    public void presentStateAsArray() {
        System.out.println("toArray");
        WrongGame instance = new WrongGame();
        Boolean[][] expResult = null;
        Boolean[][] result = instance.toArray();
        assertEquals(instance.size, result.length);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of nextState method, of class WrongGame.
     */
    @Test
    public void goToNextState() {
        System.out.println("nextState");
        WrongGame instance = new WrongGame();
        instance.nextState();
    }

    /**
     * Test of resetState method, of class WrongGame.
     */
    @Test
    public void resetItsState() {
        System.out.println("resetState");
        WrongGame instance = new WrongGame();
        instance.resetState();
    }
    
}
