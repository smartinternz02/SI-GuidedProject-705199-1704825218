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

WebUI.callTestCase(findTestCase('Login'), [('url') : 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'
        , ('username') : 'Admin\t', ('password') : 'admin123'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AdminJob/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/AdminJob/Page_OrangeHRM/i_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/AdminJob/Page_OrangeHRM/a_Job Titles'))

WebUI.click(findTestObject('Object Repository/AdminJob/Page_OrangeHRM/i_oxd-icon bi-plus oxd-button-icon'))

WebUI.setText(findTestObject('Object Repository/AdminJob/Page_OrangeHRM/input_oxd-input oxd-input--focus'), 'Software Engineer Senior')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AdminJob/Page_OrangeHRM/textarea_oxd-textarea oxd-textarea--focus o_a93838'), 
    'Senior Software Engineer or Director of Engineering')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AdminJob/Page_OrangeHRM/textarea_oxd-textarea oxd-textarea--focus o_a93838_1'), 
    'Candidate has to be updated within time')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AdminJob/Page_OrangeHRM/button_Save'))

WebUI.delay(2)

WebUI.closeBrowser()

