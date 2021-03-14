package tests;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.SearchPage;
public class SearchTest  extends TestBase{
	Homepage pageobject;
	SearchPage searchobject;
	String lessonName="addition";
	@Test
	public void UserCanSearchForProducts() 
	{
		pageobject =new Homepage(driver);
		searchobject  = new SearchPage(driver); 
		pageobject.selectLanguage();
		
		searchobject.Searchlesson(lessonName);
	       searchobject.selectSecSearchRes();
	}


}
