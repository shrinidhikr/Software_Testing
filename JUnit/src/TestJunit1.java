/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shrinidhi KR
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestJunit1 {
   @Test
   public void testAdd() {
      //test data
      int num = 5;
      String temp = null;
      String str = "Junit is working fine";

      //check for equality
      assertEquals("Junit is working fine", str);
      
      //check for false condition
      assertFalse(num > 6);

      //check for not null value
      assertNull(temp);
   }
}
