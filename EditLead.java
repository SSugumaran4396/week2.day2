package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		WebElement userNameElement = driver.findElement(By.id("username"));
		userNameElement.sendKeys("Demosalesmanager");
		
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");
		
		
		WebElement loginButtonElement = driver.findElement(By.className("decorativeSubmit"));
		loginButtonElement.click();
		
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		
		WebElement leadsElement = driver.findElement(By.linkText("Leads"));
		leadsElement.click();
		
		
		WebElement createLeadsElement = driver.findElement(By.linkText("Create Lead"));
		createLeadsElement.click();
		
		WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameElement.sendKeys("FastEdge AI");
		
		WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
	    firstNameElement.sendKeys("sugu");
	    
	    WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
	    lastNameElement.sendKeys("Subramani");
		
	    WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	    firstNameLocalElement.sendKeys("Maran");
	    
	    WebElement departmentElement = driver.findElement(By.id("createLeadForm_departmentName"));
	    departmentElement.sendKeys("QA");
	    
	    WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));
	    descriptionElement.sendKeys("Welcome to testleaf");
	    
	    
	    WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
	    emailElement.sendKeys("ssugu@gmail.com");
	    
	    
	   WebElement stateProvinaceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	   Select stProvinance = new Select(stateProvinaceElement);
	   stProvinance.selectByVisibleText("New York");
	   
	   WebElement submitButonElement = driver.findElement(By.name("submitButton"));
	   submitButonElement.click();
		
	   
	   WebElement editElement = driver.findElement(By.linkText("Edit"));
	   editElement.click();
	   
	   
	   WebElement updateDescriptionElement = driver.findElement(By.id("updateLeadForm_description"));
	   updateDescriptionElement.clear();
	   
	   
	   WebElement updateImportantNoteElement = driver.findElement(By.id("updateLeadForm_importantNote"));
	   updateImportantNoteElement.sendKeys("update the automation" );
	   
	   WebElement updateEditElement = driver.findElement(By.name("submitButton"));
	   updateEditElement.click();
	   		
		
	}

}
