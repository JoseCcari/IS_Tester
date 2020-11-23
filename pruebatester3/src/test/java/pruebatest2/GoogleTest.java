package pruebatest2;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
public class GoogleTest {
	private WebDriver driver;

	@Before
	public void setUp() {
		
		// carga el driver
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		// crear el objeto webdriver
		driver = new ChromeDriver();
		// abre una instancia del navegador
		driver.manage().window().maximize();
		// url que queremos abrir
		driver.get("https://www.calculator.net/percent-calculator.html");
	}

	@Test
	public String  testGooglePage(String A, String B) {

		driver.findElement(By.id("cpar1")).sendKeys(A);
		driver.findElement(By.id("cpar2")).sendKeys(B);
		driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
		String result =
		         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

		//assertEquals(A,result);
		return result;
	}
	
	@test
	public  void test2() {
		
	}
	
	
	
	@After
	public void tearDown() {
		// cierra el navegador una vez que completa la prueba
		driver.quit();
	}
}
*/
public class GoogleTest{
	static String result ;
	
	void Calculatorpercent(WebDriver driver,String value1,String value2) {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.navigate().to("http://www.calculator.net/");
	      driver.manage().window().maximize();

	      driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();

	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();

	      driver.findElement(By.id("cpar1")).sendKeys(value1);

	      driver.findElement(By.id("cpar2")).sendKeys(value2);

	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	}
   
   @Test
   public void testNumPositive() {
	   System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      Calculatorpercent(driver,"10","50");
	      result =
	 	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      driver.close();
		assertEquals(result, "5" );
   }
   
   @Test
   public void testNumNegative() {
	   System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      Calculatorpercent(driver,"-10","50");
	      result =
	 	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      driver.close();
		assertEquals(result, "-5" );
   }
   
   @Test
   public void testStringNum() {
	   System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      Calculatorpercent(driver,"-10","palabra");
	      result =
	 	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]")).getText();
	      driver.close();
		assertEquals(result,"Please provide two numeric values in any fields below.");
   }
   
}