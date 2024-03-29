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

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.maximizeWindow()

String url = WebUI.getUrl()

System.out.println('The url is : ' + url)

WebUI.delay(2)

WebUI.setText(findTestObject('TC_OrangeHRM_Login_001/Page_OrangeHRM/input_username', [('variable') : username]), username)

WebUI.delay(2)

WebUI.setText(findTestObject('TC_OrangeHRM_Login_001/Page_OrangeHRM/input_password', [('variable') : password]), password)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/TC_OrangeHRM_Login_001/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('TC_OrangeHRM_Login_001/Page_OrangeHRM/h6_Dashboard'))

WebUI.verifyElementText(findTestObject('TC_OrangeHRM_Login_001/Page_OrangeHRM/h6_Dashboard'), 'Dashboard')

WebUI.delay(2)

WebUI.closeBrowser()

