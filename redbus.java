package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class redbus {
	WebDriver driver;

	@Test
	public void initailizeBrowswer() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj.konangi\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		// driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//input[@data-message=\"Please enter a source city\"]")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-message=\"Please enter a source city\"]")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//input[@data-message=\"Please enter a destination city\"]"))
				.sendKeys("Vijayawada");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-message=\"Please enter a destination city\"]")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//label[text()='Onward Date']/parent::div")).click();
		driver.findElement(By.xpath(
				"//div[@id='rb-calendar_onward_cal']//td[text()='Aug 2019']/parent::tr/following-sibling::tr[1]/th[text()='Mo']/parent::tr/following-sibling::tr[5]/td[text()='30']"))
				.click();
		driver.findElement(By.xpath("//label[text()=\"Return Date\"]")).click();
		driver.findElement(By.xpath(
				"//div[@id=\"rb-calendar_return_cal\"]//td[text()=\"Aug 2019\"]/parent::tr/following-sibling::tr[1]/th[text()='Sa']/parent::tr/following-sibling::tr[5]/td[text()='31']"))
				.click();
		driver.findElement(By.xpath(".//*[@id='search_btn']")).click();

		Thread.sleep(3000);

		/*driver.findElement((By.xpath("(//div[@class=\"button\"])[1]"))).click();

		Thread.sleep(3000);
		
		 * driver.findElement((By.xpath("(//div[@class=\"button view-seats fr\"])[1]")))
		 * .click(); Thread.sleep(3000);
		 * driver.findElement((By.xpath("(//div[@class=\"radio-unchecked\"])[1]"))).
		 * click(); Thread.sleep(3000);
		 * driver.findElement((By.xpath("(//div[@class=\"radio-unchecked\"])[1]"))).
		 * click(); Thread.sleep(3000);
		 * driver.findElement(By.xpath("(//div[@class=\"radio-unchecked\"])[3]")).click(
		 * );
		 */
	}
}
