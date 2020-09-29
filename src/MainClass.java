import org.junit.Test;
public class MainClass
    {
        @Test
        public void MainClassTest() {
        int a = getLocalNumber();
        if (a == 14) {
            System.out.print("Test pass: getLocalNumber = 14");
        } else {System.out.print("Test failed: getLocalNumber not is 14");
        }
    }
        public int getLocalNumber() {
            return 14;
        }

    }
