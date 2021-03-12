/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author prudvi
 */
public class ArrayHighNumbersTest {
    
    public ArrayHighNumbersTest() {
    }


    @Test
    public void testCount() {
        System.out.println("count");
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int n = 6;
        int expResult = 5;
        int result = ArrayHighNumbers.count(x, n);
        assertEquals(expResult, result);
        
    }
    
}
