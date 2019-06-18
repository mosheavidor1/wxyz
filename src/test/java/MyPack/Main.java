
package MyPack;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)


    public  class Main {

        private static WebDriver driver;


        @Before

        public void main() {

          //  UploadDriver.FirefoxD(driver);



            System.setProperty(UploadDriver.upload1, UploadDriver.upload2);


        }



        @Test
        public void test_01() throws InterruptedException {

          //  driver = new FirefoxDriver();

            driver = new ChromeDriver();

            YouTube.Getpage(driver);

        }



    }
















































































