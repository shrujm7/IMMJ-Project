package Immj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {

  LoadProp prop = new LoadProp();
  String browser = prop.getProperty("browser");

  public void setUpBrowser(){



    if(browser.equalsIgnoreCase("Firefox")){

      System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");


      driver = new FirefoxDriver();
    }
    else if (browser.equalsIgnoreCase("chrome")){

      System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");



      driver = new ChromeDriver();


    }
    else{

      System.out.println("Browser name is empty or typed wrong "+ browser );
    }


  }



}
