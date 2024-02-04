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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Amazon_Registration_Local and Global_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.click(findTestObject('Amazon_Registration_Local and Global_OR/Page_Amazon Sign-In/a_Create your Amazon account'))

WebUI.setText(findTestObject('Amazon_Registration_Local and Global_OR/Page_Amazon Registration/input_customerName'), GlobalVariable.Name)

WebUI.setText(findTestObject('Amazon_Registration_Local and Global_OR/Page_Amazon Registration/input_email'), GlobalVariable.Email)

WebUI.setEncryptedText(findTestObject('Amazon_Registration_Local and Global_OR/Page_Amazon Registration/input_password'), 
    'gWraoQDoqaK2Xu+cTfJh+A==')

WebUI.setEncryptedText(findTestObject('Amazon_Registration_Local and Global_OR/Page_Amazon Registration/input_passwordCheck'), 
    'gWraoQDoqaK2Xu+cTfJh+A==')

WebUI.click(findTestObject('Amazon_Registration_Local and Global_OR/Page_Amazon Registration/inputcontinue'))

WebUI.closeBrowser()

