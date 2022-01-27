import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AppointmentSteps {
	
	@Given("User masuk kehalaman login")
	public void user_masuk_kehalaman_login() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
		WebUI.click(findTestObject('CURA Healthcare Service/Login Page/button_Make Appointment'))
	}
	
	@When("User input (.*) dan (.*) yang valid")
	public void user_input_John_Doe_dan_ThisIsNotAPassword_yang_valid(String username, String password) {
		println ("Username: "+username)
		println ("Password: "+password)
		WebUI.setText(findTestObject('CURA Healthcare Service/Login Page/input_Username'), username)
		WebUI.setText(findTestObject('CURA Healthcare Service/Login Page/input_Password'), password)
	}
	
	@And("Klik button login")
	public void klik_button_login() {
		WebUI.click(findTestObject('CURA Healthcare Service/Login Page/button_Login'))

	}
	
	@Then("User masuk kehalaman Make Appointment")
	public void user_masuk_kehalaman_Make_Appointment() {

	}
	
	@And("User pilih Facility")
	public void user_pilih_Facility() {
		WebUI.click(findTestObject('CURA Healthcare Service/Make Appointment Page/select_Facility'))

	}
	
	@And("Check Apply for hospital readmission")
	public void check_Apply_for_hospital_readmission() {
		WebUI.click(findTestObject('CURA Healthcare Service/Make Appointment Page/check_Apply for hospital readmission'))

	}
	
	@Then("Pilih Healthcare Program")
	public void pilih_Healthcare_Program() {
		WebUI.click(findTestObject('CURA Healthcare Service/Make Appointment Page/input_Medicaid Program'))

	}
	
	@And("Input Visit Date")
	public void input_Visit_Date() {
		WebUI.click(findTestObject('CURA Healthcare Service/Make Appointment Page/input_Visit Date'))
		WebUI.click(findTestObject('CURA Healthcare Service/Make Appointment Page/select_ Visit Date'))

	}
	
	@And("Input Comment")
	public void input_Comment() {
		WebUI.setText(findTestObject('CURA Healthcare Service/Make Appointment Page/textarea_Comment'), 'Test')

	}
	
	@Then("Klik button Book Appointment")
	public void klik_button_Book_Appointment() {
		WebUI.click(findTestObject('CURA Healthcare Service/Make Appointment Page/button_Book Appointment'))

	}
	
	@Then("Masuk kehalaman Appointment Confirmation")
	public void masuk_kehalaman_Appointment_Confirmation() {

	}
}