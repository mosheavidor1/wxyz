package MyPack;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.sun.net.httpserver.Authenticator;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;
import net.bytebuddy.asm.Advice;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import sun.font.Script;

import java.util.concurrent.TimeUnit;

import static java.lang.System.*;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)


    public  class Main {

        private static WebDriver driver;


        @Before

        public void main() {

            UploadDriver.FirefoxD(driver);


        }



        @Test
        public void test_01() throws InterruptedException {

            driver = new FirefoxDriver();

            YouTube.Getpage(driver);

        }



    }









































