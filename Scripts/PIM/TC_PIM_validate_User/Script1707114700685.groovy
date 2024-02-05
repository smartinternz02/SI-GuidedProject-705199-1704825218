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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/PIM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_username (1)'), 'Admin')

WebUI.setText(findTestObject('Object Repository/PIM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_password (1)'), 'admin123')

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/a_PIM'))

WebUI.setText(findTestObject('Object Repository/PIM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input'), 'Sai')

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/span_(1) Record Found'))

WebUI.verifyElementText(findTestObject('Object Repository/PIM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/span_(1) Record Found'), 
    '(1) Record Found')

WebUI.closeBrowser()

