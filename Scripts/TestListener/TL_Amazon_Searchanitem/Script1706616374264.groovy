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

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://www.amazon.com/')

//WebUI.setText(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon.com/input_field-keywords'), 'TMXNBU')

//WebUI.click(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon.com/button_Continue shopping'))

//WebUI.click(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

//WebUI.setText(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon Sign-In/input_email'), '8333850525')

//WebUI.click(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon Sign-In/inputcontinue'))

//WebUI.setText(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon Sign-In/input_email'), '+91 8333850525')

//WebUI.click(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon Sign-In/inputcontinue'))

//WebUI.setEncryptedText(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon Sign-In/input_password'), 'gnJRfLEd4AELu0dUXJgQTQ==')

//WebUI.click(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.setText(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'heater')

WebUI.click(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon.com  heater/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon.com  heater/h2_Amazon Basics Indoor Portable Radiator H_1bd972'))

WebUI.click(findTestObject('Object Repository/TL_Amazon_Searchanitem_OR/Page_Amazon.com  heater/img_s-image'))

//WebUI.closeBrowser()

