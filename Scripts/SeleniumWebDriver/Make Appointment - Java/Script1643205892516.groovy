import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

import com.kms.katalon.core.webui.driver.DriverFactory
  
WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

	driver.get("https://katalon-demo-cura.herokuapp.com/");
	
	driver.findElement(By.id("btn-make-appointment")).click();
	driver.findElement(By.id("txt-username")).click();
	driver.findElement(By.id("txt-username")).sendKeys("John Doe");
	driver.findElement(By.id("txt-password")).click();
	driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
	driver.findElement(By.id("btn-login")).click();
	driver.findElement(By.id("combo_facility")).click();
	
	  WebElement dropdown = driver.findElement(By.id("combo_facility"));
	  dropdown.findElement(By.xpath("//option[. = 'Hongkong CURA Healthcare Center']")).click();

	driver.findElement(By.id("chk_hospotal_readmission")).click();
	driver.findElement(By.id("radio_program_medicaid")).click();
	driver.findElement(By.id("txt_visit_date")).click();
	driver.findElement(By.cssSelector("tr:nth-child(5) > .day:nth-child(5)")).click();
	driver.findElement(By.id("txt_comment")).click();
	driver.findElement(By.id("txt_comment")).sendKeys("test");
	driver.findElement(By.id("btn-book-appointment")).click();
	assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Appointment Confirmation"));
