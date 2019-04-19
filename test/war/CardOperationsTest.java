/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sadiq
 */
public class CardOperationsTest {
    
    public CardOperationsTest() {
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
     * Test of compareCards method, of class CardOperations.
     */
    @Test
    public void testGoodCompareCards() {
        System.out.println("compareCards good");
        int r1 = 2;
        int r2 = 1;
        String s1 = "card1";
        String s2 = "card2";
        CardOperations instance = new CardOperations();
        String expResult = "p1";
        String result = instance.compareCards(r1, r2, s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBadCompareCards() {
        System.out.println("compareCards bad");
        int r1 = 0;
        int r2 = 2;
        String s1 = "card1";
        String s2 = "card2";
        CardOperations instance = new CardOperations();
        String expResult = "failed";
        String result = instance.compareCards(r1, r2, s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBoundaryCompareCards() {
        System.out.println("compareCards boundary");
        int r1 = 4;
        int r2 = 4;
        String s1 = "card1";
        String s2 = "card2";
        CardOperations instance = new CardOperations();
        String expResult = "war";
        String result = instance.compareCards(r1, r2, s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
