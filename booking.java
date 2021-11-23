package easydinerpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class booking {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.eazydiner.com/delhi-ncr?loc=connaught-place-central-delhi");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div[1]/a/div/div[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"restaurants\"]/div[1]/div/div[3]/div[2]/div[2]/a")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"slotForm\"]/div/div/button")).click();

		driver.findElement(By.id("guest_name")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("guest_name")).sendKeys("Alan Raju");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"guest-form\"]/div/div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"guest-form\"]/div/div[2]/div/div/input")).sendKeys("9895336687");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"guest_email\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"guest_email\"]")).sendKeys("alan@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"checkout-button\"]")).click();

	}
}
