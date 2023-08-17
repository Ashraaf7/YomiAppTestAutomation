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

Mobile.startApplication('E:\\Projects\\Katalon\\Yomi App\\APK\\Yomi.apk', false)



if (Mobile.verifyElementExist(findTestObject('Object Repository/RegisterObjects/Instabug'), 0, FailureHandling.CONTINUE_ON_FAILURE)== true)
	{
		Mobile.delay(5)
	}
if (Mobile.verifyElementExist(findTestObject('Object Repository/RegisterObjects/Arabic'), 0, FailureHandling.CONTINUE_ON_FAILURE)== true)
		{
			
			Mobile.tap(findTestObject('Object Repository/RegisterObjects/Arabic'), 0)
		}
Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/CreateAccount'), 0)

Mobile.tap(findTestObject('RegisterObjects/CreateAccount'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/Email'), 0)

Mobile.tap(findTestObject('RegisterObjects/Email'), 0)


Mobile.setText(findTestObject('RegisterObjects/Email'), 'V201@gmail.com', 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/Password'), 0)

Mobile.tap(findTestObject('RegisterObjects/Password'), 0)

Mobile.setText(findTestObject('RegisterObjects/Password'), '123456', 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/ConfirmPassword'), 0)

Mobile.tap(findTestObject('RegisterObjects/ConfirmPassword'), 0)

Mobile.setText(findTestObject('RegisterObjects/ConfirmPassword'), '123456', 0)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/RegisterButton'), 0)

Mobile.tap(findTestObject('RegisterObjects/RegisterButton'), 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/StartButton'), 0)

Mobile.tap(findTestObject('RegisterObjects/StartButton'), 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/Name'), 0)

Mobile.tap(findTestObject('RegisterObjects/Name'), 0)

Mobile.setText(findTestObject('Object Repository/RegisterObjects/Name'), 'ahmed', 0)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/NextButton'), 0)

Mobile.tap(findTestObject('RegisterObjects/NextButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/GenderMale'), 0)

Mobile.tap(findTestObject('RegisterObjects/GenderMale'), 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/NextButtonOnGenderPage'), 0)

Mobile.tap(findTestObject('RegisterObjects/NextButtonOnGenderPage'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/Age'), 0)

Mobile.tap(findTestObject('RegisterObjects/Age'), 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/NextButtonOnAgePage'), 0)

Mobile.tap(findTestObject('RegisterObjects/NextButtonOnAgePage'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/EmotionsGroup'), 0)

Mobile.tap(findTestObject('RegisterObjects/EmotionsGroup'), 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/NextButtonOnEmotionsPage'), 0)

Mobile.tap(findTestObject('RegisterObjects/NextButtonOnEmotionsPage'), 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/ColorsEbdaay'), 0)

Mobile.tap(findTestObject('RegisterObjects/ColorsEbdaay'), 0)

Mobile.tap(findTestObject('RegisterObjects/NextButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/TrackMyMood'), 0)

Mobile.tap(findTestObject('RegisterObjects/TrackMyMood'), 0)

Mobile.tap(findTestObject('RegisterObjects/NextButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/WHILE USING THE APP'), 0)

Mobile.tap(findTestObject('RegisterObjects/WHILE USING THE APP'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/FoodActivity'), 0)

Mobile.tap(findTestObject('RegisterObjects/FoodActivity'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterObjects/HobbiesActivity'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterObjects/SleepActivity'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterObjects/SocialActivity'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterObjects/WeatherActivity'), 0)

Mobile.tap(findTestObject('RegisterObjects/NextButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/RegisterObjects/NotFan'), 0)

Mobile.tap(findTestObject('RegisterObjects/NotFan'), 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/NextButtonRemider'), 0)

Mobile.tap(findTestObject('RegisterObjects/NextButtonRemider'), 0)

Mobile.waitForElementPresent(findTestObject('RegisterObjects/StartButtonHome'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/RegisterObjects/StartButtonHome'), 0)

//Mobile.closeApplication()

