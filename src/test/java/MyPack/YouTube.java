package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class YouTube {


        public static void Getpage(WebDriver driver) throws InterruptedException {



            driver.get("https://www.google.com/search?client=firefox-b-d&ei=GHAHXZvTBoTewALyhq_gDQ&q=%D7%9E%D7%93%D7%95%D7%A0%D7%94+%D7%90%D7%A8%D7%95%D7%95%D7%99%D7%96%D7%99%D7%95%D7%9F+youtube&oq=%D7%9E%D7%93%D7%95%D7%A0%D7%94+%D7%90%D7%A8%D7%95%D7%95%D7%99%D7%96%D7%99%D7%95%D7%9F+youtube&gs_l=psy-ab.3...5253.9738..9945...1.0..1.325.1257.0j8j0j1......0....1..gws-wiz.......33i160.zqOzr6ahrK8");


            driver.manage().window().maximize();


            Thread.sleep(100);


//
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//
//            js.executeScript("window.scrollBy(0,1000)");
//
//            Thread.sleep(100);



            driver.findElement(By.xpath("//img[@class=\"rISBZc M4dUYb\"]")).click();





        }

    }


