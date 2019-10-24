import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class ExceptionTest {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test(expected = ArithmeticException.class)
   public void testExceptMessage() {	
      System.out.println("Inside testExceptMessage()");     
      messageUtil.exceptMessage();     
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}