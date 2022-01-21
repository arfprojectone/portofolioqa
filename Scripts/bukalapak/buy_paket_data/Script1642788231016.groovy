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

WebUI.callTestCase(findTestCase('bukalapak/Login/valid_login_bukalapak'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('bukalapak/Buy_Paket_Data/input_Search Product'), 'paket data')

WebUI.click(findTestObject('bukalapak/Buy_Paket_Data/div_Paket Data'))

'Isikan Nomer Telkomsel'
WebUI.setText(findTestObject('bukalapak/Buy_Paket_Data/input_Nomer Telepon'), '')

WebUI.click(findTestObject('bukalapak/Buy_Paket_Data/div_OMG 1 hari Rp16.000'))

WebUI.click(findTestObject('bukalapak/Buy_Paket_Data/button_Beli'))

WebUI.click(findTestObject('bukalapak/Buy_Paket_Data/input_Payment Category'))

WebUI.click(findTestObject('bukalapak/Buy_Paket_Data/div_Pilih Bank'))

WebUI.click(findTestObject('bukalapak/Buy_Paket_Data/div_BNI'))

WebUI.click(findTestObject('bukalapak/Buy_Paket_Data/button_Bayar dengan Virtual Account'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('bukalapak/Buy_Paket_Data/button_Lanjutkan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

