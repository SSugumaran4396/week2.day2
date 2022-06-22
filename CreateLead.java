package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		1. Launch URL "http://leaftaps.com/opentaps/control/login"		
		//setup the webdrivermanager for chrome browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		//Launch the application		
		driver.get("http://leaftaps.com/opentaps/control/login");		
//		 2. Enter UserName and Password Using Id Locator
		WebElement userNameElement = driver.findElement(By.id("username"));
		userNameElement.sendKeys("Demosalesmanager");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");		
//		 3. Click on Login Button using Class Locator
		WebElement loginElement = driver.findElement(By.className("decorativeSubmit"));
		loginElement.click();		
//		  4. Click on CRM/SFA Link
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();	
//		  5. Click on Leads Button
		WebElement leadsElement = driver.findElement(By.linkText("Leads"));
		leadsElement.click();		
//		 6. Click on Create Lead 		
		WebElement creatLeadElement = driver.findElement(By.linkText("Create Lead"));
		creatLeadElement.click();
		//		 7. Enter CompanyName Field Using id Locator
		WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameElement.sendKeys("Velospear");		
//		  8. Enter FirstName Field Using id Locator
		WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstNameElement.sendKeys("Sugumaran");		
//		  9. Enter LastName Field Using id Locator
		WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastNameElement.sendKeys("Subramani");		
//		  10. Enter FirstName(Local) Field Using id Locator
		WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocalElement.sendKeys("SS");		
//		11. Enter Department Field Using any Locator of Your Choice
		WebElement departmentElement = driver.findElement(By.name("departmentName"));
		departmentElement.sendKeys("QA Automation");		
//		  12. Enter Description Field Using any Locator of your choice 
		WebElement descriptionElement = driver.findElement(By.name("description"));
		descriptionElement.sendKeys("Welcome to QA Automation for Testleaf");
		
//		  13. Enter your email in the E-mail address Field using the locator of your choice
		WebElement emailIdElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailIdElement.sendKeys("sugumaran.subramaniayan@gmail.com");
		
//		  14. Select State/Province as NewYork Using Visible Text
		WebElement stateProvinancedElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDownStateProvince = new Select(stateProvinancedElement);
		dropDownStateProvince.selectByVisibleText("New York");
		
//		  15. Click on Create Button
		WebElement submitbuttonElement = driver.findElement(By.name("submitButton"));
		submitbuttonElement.click();		
		
		
//        16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		
		boolean title = driver.getTitle().contains("View");
		System.out.println(title);
		
		if (driver.getTitle().contains("View")) {
			System.out.println("Yes confirmed the title");
			
		}else {
			System.out.println("The title is not avilable");
		}
		
			                  

	}


}
