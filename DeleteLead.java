package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		String Leadid;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
		ChromeDriver drivers = new ChromeDriver();
		
		//1.Launch URL
		
		drivers.get("http://leaftaps.com/opentaps/control/login");
		drivers.manage().window().maximize();
		
		//2.Enter UserName Using Id Locator
		
		WebElement EleUsername=drivers.findElementById("username");
		EleUsername.sendKeys("Demosalesmanager");
		
		//2.1.Enter Password Using Id Locator
		
		WebElement ElePassword = drivers.findElementById("password");
		ElePassword.sendKeys("crmsfa");
		
		//3.Click on Login Button using Class Locator
		
		WebElement EleLogin = drivers.findElementByClassName("decorativeSubmit");
		EleLogin.click();
		
		//4.Click on CRM/SFA Link by LinkText
		
       drivers.findElementByLinkText("CRM/SFA").click();
       
       //5.Click on Leads Button by LinkText
       
       drivers.findElementByLinkText("Leads").click();
       
       // 6. Click on Find Leads
       drivers.findElementByXPath("//a[contains(@href,'/crmsfa/control/findLeads')]").click();
       
       //7.Click on Email and Enter the Email that you have given in CreateLead assignment
       drivers.findElementByXPath("//span[text()='Email']").click();
       drivers.findElementByXPath("//input[@name='emailAddress']").sendKeys("sindhuusathy@gmail.com");
       
      //8. Click on Find Leads using xpath Locator 
       drivers.findElementByXPath("//button[text()='Find Leads']").click();
       Thread.sleep(3000);
     
       //9.Get the first result LeadId in a variable and click on it
      WebElement LeadId= drivers.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]");
         String Lead=LeadId.getText();
        System.out.println(Lead);
        LeadId.click();
      //9.1 Click on the Delete Button
        
        drivers.findElementByLinkText("Delete").click();
		//Thread.sleep(3000);
       //10. Click on Find Leads
		drivers.findElementByLinkText("Find Leads").click();
		
	//11. Enter the Deleted LeadID and click Find Leads
		drivers.findElementByXPath("//input[@name='id']").sendKeys(Lead);
		
	//12.12. Verify the "No records to display" message.
	 drivers.findElementByXPath("(//td[@class='x-btn-center']//button)[7]").click();
	  
      
	}

}
