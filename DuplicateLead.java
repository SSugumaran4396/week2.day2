package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.SELContext;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	WebElement usernameElement = driver.findElement(By.id("username"));
	usernameElement.sendKeys("Demosalesmanager");
	WebElement passwordElement = driver.findElement(By.id("password"));
	passwordElement.sendKeys("crmsfa");
	
	WebElement loginElement = driver.findElement(By.className("decorativeSubmit"));
	loginElement.click();
	
	 WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
	 crmsfaElement.click();
	 
	 WebElement leadsElement = driver.findElement(By.linkText("Leads"));
	 leadsElement.click();
	 
	 WebElement createleadElement = driver.findElement(By.linkText("Create Lead"));
	 createleadElement.click();
	
	 WebElement companynameElement = driver.findElement(By.id("createLeadForm_companyName"));
	 companynameElement.sendKeys("Evolution digital");
	 
	 WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
	 firstnameElement.sendKeys("parthiv");
	 
	 WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName"));
	 lastnameElement.sendKeys("S");
	 
	 
	 WebElement firstnameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	 firstnameLocalElement.sendKeys("SS");
	 
	 WebElement departmentElement = driver.findElement(By.id("createLeadForm_departmentName"));
	 departmentElement.sendKeys("Testing");
	 
	 WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));
	 descriptionElement.sendKeys(" This is the best practice");
	 
	 WebElement emailidElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
	 emailidElement.sendKeys("ss@gamil.com");
	 
	 WebElement stateprovinaceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select stateProvinace = new Select(stateprovinaceElement);	 
	 stateProvinace.selectByVisibleText(" New York");
	 
	 WebElement submitElement = driver.findElement(By.name("submitButton"));
	 submitElement.click();
	 
	 System.out.println(driver.getTitle());
	 
	 WebElement duplicateElement = driver.findElement(By.linkText("Duplicate Lead"));
	 duplicateElement.click();
	
	 
	 WebElement duplicatecompanynameElement = driver.findElement(By.id("createLeadForm_companyName"));
	 duplicatecompanynameElement.clear();
	 
	 WebElement duplicatefirstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
	 duplicatefirstnameElement.clear();
	 
	 WebElement duplicatesubmitElement = driver.findElement(By.name("submitButton"));
	 duplicatesubmitElement.click();
	 System.out.println(driver.getTitle());
	 
	 
	 
	
	
}
}
