import org.junit.Test;
public class MainClass
    {
    int class_number = 20;

       @Test
         public void testGetClassNumber() {
            int c = getClassNumber();
            if (c>45) {
                System.out.print("Test pass: c more than 45");
            } else
                if (c==0) {
                System.out.println("Test failed: c is zero");
            } else {
                    System.out.print("Test failed: c less than 45");
           }
       }

        public int getClassNumber() {
            return this.class_number;
        }
    }
