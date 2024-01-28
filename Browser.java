package task15;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		
				       // open the browser and launch the google url
						//set the driver
					ChromeDriver driver=new ChromeDriver();
					   // add the Url
					driver.get("https://www.google.com/");
						// maximize the driver
					driver.manage().window().maximize();
						//locate the element
					driver.findElement(By.name("csi")).sendKeys("Selenium Browser Driver",Keys.ENTER);
						// close the browser
					driver.close();

	}

}
