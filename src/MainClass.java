import org.junit.Assert;
import org.junit.Test;
public class MainClass
    {
        @Test
        public void MainClassTest() {
            int a = getLocalNumber();
            Assert.assertTrue("getLocalNumber return 14", a==14);}

            public int getLocalNumber() {
                    return 14;
                }
    }
