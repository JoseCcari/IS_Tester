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
	public void testGooglePage() {

		driver.findElement(By.id("cpar1")).sendKeys("10");
		driver.findElement(By.id("cpar2")).sendKeys("50");
		driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
		String result =
		         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

		      
		      // Print a Log In message to the screen
		System.out.println(" The Result is " + result);
	}

	@After
	public void tearDown() {
		// cierra el navegador una vez que completa la prueba
		driver.quit();
	}
}