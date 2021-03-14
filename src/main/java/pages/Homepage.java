package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageBase {

	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "/html/body/div/div/main/div[2]/ul/li[1]/a")
	WebElement EnglishLanguage;
	
	public void selectLanguage()
	{
		clickButton(EnglishLanguage);
		
   
	}
}
