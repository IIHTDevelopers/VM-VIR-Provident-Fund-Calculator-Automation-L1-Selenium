package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Provident_Fund_Calculator_L1_Pages2 extends StartupPage 
{
	public SoftAssert softAssert;
	
	// please write all locators here

	/*
	 * Getting the page name
	 */	
	String pageName = this.getClass().getSimpleName();

	/*
	 * constructor Initialization
	 */	
	public Provident_Fund_Calculator_L1_Pages2(WebDriver driver) 
	{
		super(driver);
	}	
	
	/**@Test1
	 * about this method navigateToProvidentFundCalculatorPage() 
	 * @param : null
	 * @description : mousehover to Personal Finance Navigation bar and will click on Provident Fund calculator link
	 * @return : return the title of that page as String type
	 * @author : Yaksha
	 */
	public String titleOfProvidentFundCalculatorPage() throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test2
	 * about this method enterBasicMonthlySalaryInProvidentFundCalculatorForm() 
	 * @param : get the data from Map<String, String> expectedData using field "yourBasicSalaryMonthly"
	 * @description : enter value in basic monthly salary text field as per expected data and fetch the value of that text field ,
	 * @return : fetch the value from the basic monthly salary text field as string type
	 * @author : Yaksha
	 */
	public String enterBasicMonthlySalaryInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test3
	 * about this method enterValueInYourContributionToEPFInProvidentFundCalculatorForm() 
	 * @param : get the data from Map<String, String> expectedData using field "contributioToEPF"
	 * @description : enter value in Your Contribution To EPF text field as per expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Contribution To EPF text field as string type
	 * @author : Yaksha
	 */
	public String enterValueInYourContributionToEPFInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test4
	 * about this method enterYourEmployersContributionToEPFInProvidentFundCalculatorForm() 
	 * @param : get the data from Map<String, String> expectedData using field "employersContributionToEPF"
	 * @description : enter value in Your Employers Contribution To EPF text field as per expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Employers Contribution To EPF text field as string type
	 * @author : Yaksha
	 */
	public String enterYourEmployersContributionToEPFInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test5
	 * about this method enterAvgIncreaseInSalaryYouExpectInProvidentFundCalculatorForm() 
	 * @param : get the data from Map<String, String> expectedData using field "avgIncreaseInSalaryYouExpect"
	 * @description : enter value in Your Avg Increase In Salary You Expect text field as per expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Avg Increase In Salary You Expect text field as string type
	 * @author : Yaksha
	 */
	public String enterAvgIncreaseInSalaryYouExpectInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test6
	 * about this method enterAgeWhenYouIntendToRetireInProvidentFundCalculatorForm() 
	 * @param : get the data from Map<String, String> expectedData using field "ageWhenYouIntendToRetire"
	 * @description : enter value in Your Age When You Intend To Retire text field as per expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Age When You Intend To Retire text field as string type
	 * @author : Yaksha
	 */
	public String enterAgeWhenYouIntendToRetireInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test7
	 * about this method enterCurrentEpfBalanceIfAnyInProvidentFundCalculatorForm() 
	 * @param : get the data from Map<String, String> expectedData using field "currentEpfBalanceIfAny"
	 * @description : enter value in Your Current Epf Balance If Any text field as per expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Current Epf Balance If Any text field as string type
	 * @author : Yaksha
	 */
	public String enterCurrentEpfBalanceIfAnyInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test8
	 * about this method enterCurrentInterestRateInProvidentFundCalculatorForm() 
	 * @param :  get the data from Map<String, String> expectedData using field "currentInterestRate"
	 * @description : enter value in Your Current Interest Rate text field as per expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Current Interest Rate text field as string type
	 * @author : Yaksha
	 */
	public String enterCurrentInterestRateInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return null;
	}
	
	/**@test9
	 * about this method clickOnCalculateButtonInProvidentFundCalculatorForm() 
	 * @param : null
	 * @description : it will click on the calculate button if calculate button is displayed in the page 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean clickOnCalculateButtonInProvidentFundCalculatorForm() throws Exception {
		// write your logic here
		return false;
	}
	
	/**@test10
	 * about this method fetchTotalAmountByTheTimeYouRetire() 
	 * @param : null
	 * @description : fetch the total Amount By The Time You Retire 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTotalAmountByTheTimeYouRetire() throws Exception {
		// write your logic here
		return false;
	}
}
