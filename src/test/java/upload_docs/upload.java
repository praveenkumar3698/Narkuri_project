package upload_docs;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class upload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		

		
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.naukri.com/");

		        System.out.println("Current url = " + driver.getCurrentUrl());

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		        driver.findElement(By.id("login_Layer")).click();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Got it']"))).click();

		        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("praveenkumar36t.pk@gmail.com");
		        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Pr@v3698");
		        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='view-profile-wrapper']"))).click();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='button'])[1]"))).click();

		        StringSelection fp = new StringSelection(
		                "C:\\Users\\Admin\\Documents\\Downloads\\praveen_software_tester_1.10.pdf");
		        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fp, null);

		        Robot rb = new Robot();
		        rb.keyPress(KeyEvent.VK_CONTROL);
		        rb.keyPress(KeyEvent.VK_V);
		        rb.keyRelease(KeyEvent.VK_V);
		        rb.keyRelease(KeyEvent.VK_CONTROL);
		        rb.keyPress(KeyEvent.VK_ENTER);
		        rb.keyRelease(KeyEvent.VK_ENTER);

		        System.out.println("Resume uploaded successfully");

		        Thread.sleep(9000); // You can also convert this to wait if needed

		        driver.quit();
		    }
		

	}


