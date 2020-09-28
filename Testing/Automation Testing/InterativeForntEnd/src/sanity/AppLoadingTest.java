package sanity;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppLoadingTest {
	WebDriver driver = new ChromeDriver(); // Initialization

	@BeforeTest()
	public void openBrowser() {
		// 1) Open the browser // 2) Maximize it // 3) Navigate to the app
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://interactive-front-end-design-project--deborahbs.repl.co/");
		driver.switchTo().alert().accept();
	}

	// 4) Verify Title
	@Test(priority = 0)
	public void verifyMainPageTitle() {
		String expectedTitle = "Enjoy Your Holiday";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 1)
	public void verifyAdventourtourspage() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='adventure.html']")).click();
		String expectedTitle1 = "Become Adventurious";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
	}

	@Test(priority = 2)
	public void verifyContactUS() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='contactus.html']")).click();
		String expectedTitle1 = "Contact Us";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void verifyFAQs() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='faqs.html']")).click();
		String expectedTitle1 = "FAQs";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
	
	}

	@Test(priority = 4)
	public void verifyTravelEssentials() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='TravelEssentials.html']")).click();
		String expectedTitle1 = "Travel Essentials";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);

	}
	@Test(priority = 4)
	public void verifySignIn() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='sign.html']")).click();
		String expectedTitle1 = "Sign-In/Sign-up";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);

	}
}
