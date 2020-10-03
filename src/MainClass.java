import org.junit.Assert;
import org.junit.Test;
public class MainClass
{
 String class_string = "Hello, world";

        @Test
        public void testGetClassString() {
          // String sub1 = " Hello ";
            String s = getClassString();
            Assert.assertTrue("Our string contains Hello", s.contains("Hello"));
        }

        public String getClassString(){
         String a = this.class_string;
            return a;
        }
    }
