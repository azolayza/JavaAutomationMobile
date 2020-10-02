import org.junit.Assert;
import org.junit.Test;
public class MainClass
    {
    int class_number = 20;
    
       @Test
         public void testGetClassNumber() {
            int c = getClassNumber();
           Assert.assertTrue("GetClassNumber less than 45", c>45);
       }

        public int getClassNumber() {
            return this.class_number;
        }
    }
