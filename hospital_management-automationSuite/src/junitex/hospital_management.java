package junitex;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hospital_management {
	static WebDriver driver = null;

	@BeforeTest
	public void initiateDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\CA_Automation-main\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8021/HealthCare/SignIn.jsp");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void validateLogin() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.id("sub")).click();
		assertTrue(driver.getCurrentUrl().contains("HealthCare/LoginServlet"));
	}
	@Test(priority=2)
	public void validateHomePageElements() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8021/HealthCare/HomePage.jsp");
		Thread.sleep(1000);
		boolean validationresult=((driver.findElement(By.xpath("//*[@id='navbar']/ul/li[1]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[2]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[4]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[5]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[6]/a")).isDisplayed()));
		assertTrue(validationresult);
	}
	@Test(priority=3)
	public void validatepatientPageElements() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8021/HealthCare/Patients.jsp");
		Thread.sleep(1000);
		boolean validationresult=((driver.findElement(By.xpath("//*[@id='navbar']/ul/li[1]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[2]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[4]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[5]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[6]/a")).isDisplayed())&&(driver.findElement(By.id("newpatient")).isDisplayed())&&(driver.findElement(By.id("old patient")).isDisplayed()));
		assertTrue(validationresult);
	}
	@Test(priority=4)
	public void validatedoctorPageElements() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8021/HealthCare/DoctorsHomePage.jsp");
		Thread.sleep(1000);
		boolean validationresult=((driver.findElement(By.xpath("//*[@id='navbar']/ul/li[1]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[2]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[4]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[5]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[6]/a")).isDisplayed())&&(driver.findElement(By.id("mytable")).isDisplayed()));
	}
	@Test(priority=5)
	public void validatelabPageElements() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8021/HealthCare/Lab_HomePage.jsp");
		Thread.sleep(1000);
		boolean validationresult=((driver.findElement(By.xpath("//*[@id='navbar']/ul/li[1]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[2]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[4]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[5]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[6]/a")).isDisplayed())&&(driver.findElement(By.id("mytable")).isDisplayed()));
		assertTrue(validationresult);
	}
	@Test(priority=6)
	public void validateRoomPageElements() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8021/HealthCare/RoomPage.jsp");
		Thread.sleep(1000);
		boolean validationresult=((driver.findElement(By.xpath("//*[@id='navbar']/ul/li[1]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[2]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[4]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[5]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[6]/a")).isDisplayed())&&(driver.findElement(By.id("mytable")).isDisplayed()));
		assertTrue(validationresult);
	}
	@Test(priority=7)
	public void validatepharmacyPageElements() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8021/HealthCare/PharmacyHomePage.jsp");
		Thread.sleep(1000);
		boolean validationresult=((driver.findElement(By.xpath("//*[@id='navbar']/ul/li[1]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[2]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[4]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[5]/a")).isDisplayed())&&(driver.findElement(By.xpath("//*[@id='navbar']/ul/li[6]/a")).isDisplayed())&&(driver.findElement(By.id("mytable")).isDisplayed()));
		assertTrue(validationresult);
	}
	@Test(priority=8)
	public void validatecontactUsPageElements() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8021/HealthCare/ContactUs.jsp");
		Thread.sleep(1000);
		boolean validationresult=((driver.findElement(By.id("fname")).isDisplayed())&&(driver.findElement(By.id("lname")).isDisplayed())&&(driver.findElement(By.id("country")).isDisplayed())&&(driver.findElement(By.id("emailid")).isDisplayed()));
		assertTrue(validationresult);
	}
	@Test(priority=9)
	public void validatepatientNavigationfromHomepage() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8021/HealthCare/HomePage.jsp");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='navbar']/ul/li[2]/a")).click();
		Thread.sleep(1000);
		assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/Patients.jsp"));
	}
	@Test(priority=10)
	public void validateNewpatientPageNavigation() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8021/HealthCare/Patients.jsp");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='newpatient']/button/a")).click();
		Thread.sleep(1000);
		assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/NewPatient.jsp"));
	}
	@Test(priority = 11)
		public void VerifyAddNewPatientFunctionality() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/Patients.jsp");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='newpatient']/button/a")).click();
			Thread.sleep(1000);
			assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/NewPatient.jsp"));
			driver.findElement(By.id("name")).sendKeys("test123");
			driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
			driver.findElement(By.name("age")).sendKeys("21");

			driver.findElement(By.xpath("/html/body/div/div/form/select[2]/option[1]")).click();
			driver.findElement(By.name("mno")).sendKeys("9176660664");
			driver.findElement(By.xpath("/html/body/div/div/form/button[1]")).click();
			assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/Patients.jsp"));

		}	
	@Test(priority = 12)
		public void ValidateCancelButtonFunctionalityinAddnewpatientpage() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/Patients.jsp");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='newpatient']/button/a")).click();
			Thread.sleep(1000);
			assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/NewPatient.jsp"));

			driver.findElement(By.xpath("/html/body/div/div/form/button[2]")).click();
			assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/Patients.jsp"));
		}
	
	@Test(priority = 14)
		public void ValidateShowdetailsButtonFunctionalityINDoctorsHomepage() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/DoctorsHomePage.jsp");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr/td[8]/input")).click();
			Thread.sleep(1000);
			assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/DoctorsPage.jsp"));
		}

	@Test(priority = 15)
		public void ValidatethepresenceofdeleteButtoninpatientpage() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/Patients.jsp");
			Thread.sleep(1000);

			assertTrue(driver.findElement(By.id("delete")).isDisplayed());
		}
			@Test(priority = 16)
		public void ValidateDoctorDetailPageelement() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/DoctorsHomePage.jsp");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr/td[8]/input")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe[2]")));
			boolean validationResult=((driver.findElement(By.name("disease")).isDisplayed()));
			assertTrue(validationResult);
		}


		@Test(priority = 17)
		public void ValidateShowdetailsButtonFunctionalityInLabHomepage() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/Lab_HomePage.jsp");
			Thread.sleep(1000);
			driver.findElement(By.id("show details")).click();
			Thread.sleep(1000);
			assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/LaboratoryPage.jsp"));
		}

		@Test(priority = 18)
		public void ValidateShowdetailsButtonFunctionalityInPharmacyHomepage() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/PharmacyHomePage.jsp");
			Thread.sleep(1000);
			driver.findElement(By.id("show details")).click();
			Thread.sleep(1000);
			assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/PharamacticalPage.jsp"));
		}

		@Test(priority = 19)
		public void ValidatecancelButtonincontactuspage() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/ContactUs.jsp");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/input[5]")).click();
			Thread.sleep(1000);
			assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/HomePage.jsp"));
		}
		@Test(priority = 13)
		public void ValidateStatusinDoctorHomepage() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/DoctorsHomePage.jsp");
			Thread.sleep(1000);
			assertTrue(driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr/td[7]/input")).getAttribute("value").equals("Pending"));
			
			
			
		}
		@Test(priority = 20)
		public void ValidateSignoutFunctionality() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().to("http://localhost:8021/HealthCare/HomePage.jsp");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[8]/a")).click();
			Thread.sleep(1000);
			assertTrue(driver.getCurrentUrl().equals("http://localhost:8021/HealthCare/SignOut.jsp"));
		}
		
	
@AfterTest
public void quitdriver() {
	driver.quit();
}
}
