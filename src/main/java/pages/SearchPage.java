package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class SearchPage  extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="/html/body/header/div[1]/div/div[3]/button")
	WebElement searchicon;
	@FindBy(id="txt_search_query")
	WebElement searchTtxt;
	@FindBy(id="btn_global_search")
	WebElement globalSearch;
	@FindBy(xpath ="/html/body/div/div[1]/div/div/main/div[3]/ul/li[2]/div/a")
	WebElement VectorAddition;
	@FindBy(xpath ="/html/body/div/div/div/div/aside/div[1]/ul/li[3]/div/a")
	WebElement lessonworksheet;
	//@FindBy(css="div.question-number")
	//WebElement Question;
	
	public void Searchlesson(String lessonName) 
	{
		clickButton(searchicon);   
		searchTtxt.clear();
		setTextElementText(searchTtxt, lessonName);
		clickButton(globalSearch);
		
	}
	public void selectSecSearchRes()
	{
		clickButton(VectorAddition);
		clickButton(lessonworksheet);
		/*
		List<WebElement> numbers = (List<WebElement>) Question;   
	          int numbersCount = numbers.size();     // Count the total Question list on Web Page
	          
	          System.out.println("Total Number of Question count on webpage = "  + numbersCount);    //Print the total count of links on webpage

*/
	}
	

}
