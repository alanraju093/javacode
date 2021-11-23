package easydinerpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class aboutus {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.eazydiner.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[16]/div/div[1]/div[1]/p[1]/a")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"help\"]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ed-restaurant\"]/div/h2/a")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[1]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"restaurants\"]/div[1]/div/a/div/img")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"slotForm\"]/div/div/button")).click();
		Thread.sleep(3000);
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
