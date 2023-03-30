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

//Mobile.startApplication('E:\\MyApps\\Katalon\\Yomi App\\APK\\Yomi.apk', false)
/*
if (Mobile.verifyElementExist(findTestObject('Object Repository/LoginObjects/Instabug'), 0, FailureHandling.CONTINUE_ON_FAILURE)== true)
	{
		Mobile.delay(5)
	}

if (Mobile.verifyElementExist(findTestObject('Object Repository/LoginObjects/Arabic'), 0, FailureHandling.CONTINUE_ON_FAILURE)== true)
	{
		Mobile.tap(findTestObject('Object Repository/LoginObjects/Arabic'), 0)
	}
	*/
	Mobile.waitForElementPresent(findTestObject('Object Repository/LoginObjects/EmailLogin'), 0)
	Mobile.tap(findTestObject('LoginObjects/EmailLogin'), 0)
	Mobile.setText(findTestObject('LoginObjects/EmailLogin'), 'V201@gmail.com', 0)
	
	Mobile.hideKeyboard()
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/LoginObjects/PasswordLogin'), 0)
	Mobile.tap(findTestObject('LoginObjects/PasswordLogin'), 0)
	Mobile.setText(findTestObject('LoginObjects/PasswordLogin'), '123456', 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/LoginObjects/EyeTool'), 0)
	Mobile.tap(findTestObject('LoginObjects/EyeTool'), 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/LoginObjects/LoginButton'), 0)
	Mobile.tap(findTestObject('LoginObjects/LoginButton'), 0)
	
	Mobile.waitForElementPresent(findTestObject('LoginObjects/AddMoodButton'), 0)
	
	Mobile.verifyElementVisible(findTestObject('Object Repository/LoginObjects/AddMoodButton'), 0)
	
	