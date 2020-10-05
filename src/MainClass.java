import org.junit.Assert;
import org.junit.Test;
public class MainClass
{
 String class_string = "Hello, world";

        @Test
        public void testGetClassString() {
            String s = getClassString();
            String sub1 = "Hello";
            String sub2 = "hello";
            Assert.assertTrue("Our string not contains Hello or hello", s.contains(sub1)||s.contains(sub2));
        }

        public String getClassString(){
         String a = this.class_string;
            return a;
        }
    }
