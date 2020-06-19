package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		
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
       
       //6.Click on Create Leads
		
		drivers.findElementByLinkText("Create Lead").click();
		
		// 8. Enter First Name Field Using Xpath Locator
		
		drivers.findElementByXPath("//input[@id = \"createLeadForm_firstName\"]").sendKeys("Sindhu");
		
		//7. Enter company Name Field Using Xpath Locator
		
		drivers.findElementByXPath("//input[@id = \"createLeadForm_companyName\"]").sendKeys("Testleaf");
		
		//9.Enter Last Name Field Using Xpath Locator
		
		drivers.findElementByXPath("//input[@id = \"createLeadForm_lastName\"]").sendKeys("Sridharan");
		
		//10.Select Source as Employee using SelectByValue
		WebElement eleDD1 = drivers.findElementById("createLeadForm_dataSourceId");
		Select dd =new Select(eleDD1);
         dd.selectByValue("LEAD_TRADESHOW");
         
        //11. Enter value for AnnualRevenue Field using Xpath Locator
        drivers.findElementByXPath("//input[@name='annualRevenue']").sendKeys("12.5");
        
       // 12. Select Industry as ComputerSoftware
          WebElement eleDD2 = drivers.findElementById("createLeadForm_industryEnumId");
		  Select dd1 =new Select(eleDD2);
          dd1.selectByValue("IND_SOFTWARE");
          
       //13.Select OwnerShip as S-Corporation using SelectByVisibletext
          WebElement eleDD3 = drivers.findElementById("createLeadForm_ownershipEnumId");
		 Select dd2 =new Select(eleDD3);
		 dd2.selectByVisibleText("S-Corporation");
		 
		//14.Enter Description as "Selenium Automation Tester" 
		 drivers.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
		 
		//15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		 WebElement eleDD4 = drivers.findElementById("createLeadForm_marketingCampaignId");
		 Select dd3 =new Select(eleDD4);
		 dd3.selectByIndex(6);
		 
		 //16.Select State/Province as Texas using SelectByValue 
		 WebElement eleDD5 = drivers.findElementById("createLeadForm_generalStateProvinceGeoId");
		 Select dd4 =new Select(eleDD5);
		 dd4.selectByValue("TX");
		 
		 //17.Enter E-Mail Address 
		 drivers.findElementById("createLeadForm_primaryEmail").sendKeys("sindhuusathy@gmail.com");
		 
		 //18.Enter Phone Number 
		 drivers.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7708558293");
		 
		 //19.Click Create Lead button using Xpath Locator
		 
		 drivers.findElementByXPath("//input[@type='submit']").click();
		 
		 
		 
		 
		 
		 
          
         
        
         
         
         
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
