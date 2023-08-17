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


Mobile.waitForElementPresent(findTestObject('Object Repository/LogoutObjects/SettingButton'), 0)
Mobile.tap(findTestObject('LogoutObjects/SettingButton'), 0)
Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/EnglishChangeLanguage'), 0)
Mobile.tap(findTestObject('SettingObjects/EnglishChangeLanguage'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/English'), 0)
Mobile.tap(findTestObject('SettingObjects/English'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/SettingOnEnglish'), 0)
Mobile.tap(findTestObject('SettingObjects/SettingOnEnglish'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SettingObjects/ArabicChangeLanguage'), 0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/ArabicChangeLanguage'), 0)
Mobile.tap(findTestObject('SettingObjects/ArabicChangeLanguage'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/Arabic'), 0)
Mobile.tap(findTestObject('SettingObjects/Arabic'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/LogoutObjects/SettingButton'), 0)
Mobile.tap(findTestObject('LogoutObjects/SettingButton'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SettingObjects/EnglishChangeLanguage'), 0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/DarkMoodToggle'), 0)
Mobile.tap(findTestObject('SettingObjects/DarkMoodToggle'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/LocationToggle'), 0)
Mobile.tap(findTestObject('SettingObjects/LocationToggle'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SettingObjects/WeatherToggle'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(3)
Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/WeatherToggle'), 0)
Mobile.tap(findTestObject('SettingObjects/WeatherToggle'), 0)




//'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

//'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

//'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

//'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

//'Storing the startY value'
int startY = device_Height * 0.30

//'Storing the endY value'
int endY = device_Height * 0.40

//'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

def WeatherMsg = Mobile.getText(findTestObject('Object Repository/SettingObjects/WeatherMsg'), 0)
Mobile.verifyNotMatch(WeatherMsg, 'قم بتمكين التطبيق لاستيراد بيانات الطقس', false)

//'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)
Mobile.swipe(startX, endY, endX, startY)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/FavouriteTeam'), 0)
Mobile.tap(findTestObject('SettingObjects/FavouriteTeam'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/PL'), 0)
Mobile.tap(findTestObject('SettingObjects/PL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/ManUtd'), 0)
Mobile.tap(findTestObject('SettingObjects/ManUtd'), 0)
Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/NextButtonFav'), 0)
Mobile.tap(findTestObject('SettingObjects/NextButtonFav'), 0)

Mobile.delay(3)
Mobile.swipe(startX, endY, endX, startY)
Mobile.verifyElementVisible(findTestObject('Object Repository/SettingObjects/FavouriteIcon'), 0,FailureHandling.CONTINUE_ON_FAILURE)

//'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)
Mobile.swipe(startX, endY, endX, startY)




Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/ReminderToggle'), 0)
Mobile.tap(findTestObject('SettingObjects/ReminderToggle'), 0)

Mobile.scrollToText('تعديل الواني')

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/EditEmotions'), 0)
Mobile.tap(findTestObject('SettingObjects/EditEmotions'), 0)

//Delay for clicking on Edit Emotions
//Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/LastEmotions'), 0)
Mobile.tap(findTestObject('SettingObjects/LastEmotions'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/UpdateButton'), 0)
Mobile.tap(findTestObject('SettingObjects/UpdateButton'), 0)



Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/EditColors'), 0)
Mobile.tap(findTestObject('SettingObjects/EditColors'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/LastColor'), 0)
Mobile.tap(findTestObject('SettingObjects/LastColor'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/SettingObjects/UpdateButton'), 0)
Mobile.tap(findTestObject('SettingObjects/UpdateButton'), 0)