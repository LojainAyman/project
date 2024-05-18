package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Myclass {

	public static void main(String[] args) {
    
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver ;
	
		driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/index.html");
		
		List<WebElement>k=driver.findElements(By.className("cccc"));
		for (int i = 0; i < k.size(); i++) {
			System.out.println(k.get(i).getText());
		}
		
		
		
	}

}
