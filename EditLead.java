package week2.day1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
		ChromeDriver drivers = new ChromeDriver();
				
				//1.Launch URL
				
				drivers.get("http://leaftaps.com/opentaps/control/login");
				drivers.manage().window().maximize();
				
				//2.Enter UserName & Password Using Id Locator
				
				WebElement EleUsername=drivers.findElementById("username");
				EleUsername.sendKeys("Demosalesmanager");
				
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
		       
		       //7.Enter the Company name that you have given in CreateLead assignment
		   
		      drivers.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TestLeaf");
		       
		      //8. Click on Find Leads using xpath Locator 
		       drivers.findElementByXPath("//button[text()='Find Leads']").click();
		     Thread.sleep(3000);
		       
		      //8. Click on Find Leads using xpath Locator and click on the first result
		       drivers.findElementByXPath("(//a[@class='linktext'])[4]").click();
		       
		      //9. Click on the edit Button 
		      drivers.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		       
		      // 10. Get the Text of Company Name and Print
		      // driver.findElementByXPath("(//span[@class='requiredField'])[1]").getText();
		      String CompanyName = drivers.findElementById("updateLeadForm_companyName").getAttribute("value");
		      System.out.println("Company Name is "+ CompanyName);
		      
		      //11. Update the Company name with new value
		        drivers.findElementById("updateLeadForm_companyName").clear();
				drivers.findElementById("updateLeadForm_companyName").sendKeys("TestLeaf OpenTaps");
				//12. Click the Update button and verify the updated name.
				drivers.findElementByXPath("//input[@value='Update']").click();
		      
		      
		      
		      
		      
		       
		       
		       
		       
		       
		       
		       
	}
}
		      
			
                