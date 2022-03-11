package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement serachtextbox = driver.findElement(By.name("q"));
Dimension s = serachtextbox.getSize();
System.out.println(s.getHeight());
System.out.println(s.getWidth());

driver.close();
}
}
