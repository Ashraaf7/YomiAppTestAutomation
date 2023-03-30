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

Mobile.waitForElementPresent(findTestObject('Object Repository/AddMoodObjects/AddMoodButton'), 0)
Mobile.tap(findTestObject('AddMoodObjects/AddMoodButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/AddMoodObjects/VerySad'), 0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AddMoodObjects/VerySad'), 0)
Mobile.verifyElementVisible(findTestObject('Object Repository/AddMoodObjects/VerySadLabel'), 0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AddMoodObjects/Sad'), 0)
Mobile.verifyElementVisible(findTestObject('Object Repository/AddMoodObjects/SadLabel'), 0,FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('AddMoodObjects/Natural'), 0)
Mobile.verifyElementVisible(findTestObject('Object Repository/AddMoodObjects/NaturalLabel'), 0,FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('AddMoodObjects/Happy'), 0)
Mobile.verifyElementVisible(findTestObject('Object Repository/AddMoodObjects/HappyLabel'), 0,FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('AddMoodObjects/VeryHappy'), 0)
Mobile.verifyElementVisible(findTestObject('Object Repository/AddMoodObjects/VeryHappyLabel'), 0,FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('AddMoodObjects/NextButton'), 0)
/*
if (Mobile.verifyElementExist(findTestObject('Object Repository/AddMoodObjects/WHILEUSINGAPP'), 0, FailureHandling.CONTINUE_ON_FAILURE)== true)
	{
		Mobile.tap(findTestObject('AddMoodObjects/WHILEUSINGAPP'), 0)
	}
*/
Mobile.waitForElementPresent(findTestObject('Object Repository/AddMoodObjects/Healthy'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('AddMoodObjects/Healthy'), 0)

Mobile.scrollToText('إنهاء')


Mobile.tap(findTestObject('AddMoodObjects/Notes'), 0)
Mobile.setText(findTestObject('AddMoodObjects/Notes'), 'Note 1', 0)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('AddMoodObjects/FinishButton'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('AddMoodObjects/FinishButton'), 0) //Click on screen only
Mobile.tap(findTestObject('AddMoodObjects/FinishButton'), 0)

if(Mobile.verifyElementVisible(findTestObject('Object Repository/AddMoodObjects/DoneButton'), 0,FailureHandling.CONTINUE_ON_FAILURE)==true)
{
	Mobile.tap(findTestObject('AddMoodObjects/DoneButton'), 0)
}

Mobile.verifyElementVisible(findTestObject('Object Repository/AddMoodObjects/FirstMood'), 0,FailureHandling.CONTINUE_ON_FAILURE)



