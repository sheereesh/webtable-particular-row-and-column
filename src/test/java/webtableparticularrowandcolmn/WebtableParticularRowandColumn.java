package webtableparticularrowandcolmn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableParticularRowandColumn {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.manage().window().maximize();
			driver.findElement(By.xpath("//div/ul/li/a[contains(text(),'Sortable Data Tables')]")).click();
String text=driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr[3]/td[5]")).getText();
System.out.println("url text" +text);
driver.get(text);

	}

}
