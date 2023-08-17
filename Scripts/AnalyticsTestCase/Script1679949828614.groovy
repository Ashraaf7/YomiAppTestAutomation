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

Mobile.waitForElementPresent(findTestObject('Object Repository/AnalyticsObjects/AnalyticsButton'), 0)
Mobile.tap(findTestObject('Object Repository/AnalyticsObjects/AnalyticsButton'), 0)

//Test Days in row
Mobile.waitForElementPresent(findTestObject('Object Repository/AnalyticsObjects/RightArrow'), 0)
Mobile.tap(findTestObject('AnalyticsObjects/RightArrow'), 0)
Mobile.delay(3)
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/NoDaysText'), 0,FailureHandling.CONTINUE_ON_FAILURE)
def NoDaysText = Mobile.getText(findTestObject('Object Repository/AnalyticsObjects/NoDaysText'), 0)
Mobile.verifyMatch(NoDaysText, 'لا توجد بيانات ، الرجاء إضافة بعض الإدخالات', false ,FailureHandling.CONTINUE_ON_FAILURE )

//Test Days in row
Mobile.waitForElementPresent(findTestObject('Object Repository/AnalyticsObjects/LeftArrow'), 0)
Mobile.tap(findTestObject('AnalyticsObjects/LeftArrow'), 0)
Mobile.delay(3)
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/NoDaysText'), 0,FailureHandling.CONTINUE_ON_FAILURE)
 NoDaysText = Mobile.getText(findTestObject('Object Repository/AnalyticsObjects/NoDaysText'), 0)
Mobile.verifyNotMatch(NoDaysText, 'لا توجد بيانات ، الرجاء إضافة بعض الإدخالات', false ,FailureHandling.CONTINUE_ON_FAILURE )

//Test Postivie Counter
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/PositiveDaysNumber'), 0,FailureHandling.CONTINUE_ON_FAILURE)
def PositiveDaysNumber = Mobile.getText(findTestObject('Object Repository/AnalyticsObjects/PositiveDaysNumber'), 0)
Mobile.verifyMatch(PositiveDaysNumber, '1', false ,FailureHandling.CONTINUE_ON_FAILURE )

//Test Negative Counter
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/NegativeDaysNumber'), 0,FailureHandling.CONTINUE_ON_FAILURE)
def NegativeDaysNumber = Mobile.getText(findTestObject('Object Repository/AnalyticsObjects/NegativeDaysNumber'), 0)
Mobile.verifyMatch(NegativeDaysNumber, '0', false ,FailureHandling.CONTINUE_ON_FAILURE )

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
int endY = device_Height * 0.55

//'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

//Test Activity Graph

//Mobile.scrollToText('مشاهدة البارات') 
Mobile.verifyElementNotExist(findTestObject('Object Repository/AnalyticsObjects/NoChartText'), 0)
	//def NoChartText = Mobile.getText(findTestObject('Object Repository/AnalyticsObjects/NoChartText'), 0)
	//Mobile.verifyNotMatch(NoChartText, 'لا توجد بيانات ، الرجاء إضافه بعض الإدخالات', false ,FailureHandling.CONTINUE_ON_FAILURE )
Mobile.waitForElementPresent(findTestObject('Object Repository/AnalyticsObjects/ActivityChartButton'), 0)
Mobile.tap(findTestObject('AnalyticsObjects/ActivityChartButton'), 0)
Mobile.tap(findTestObject('AnalyticsObjects/BaratButton'), 0)


//Test Activity Counter
Mobile.scrollToText('جيتر بلوت')
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/ActivityCounterRow'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/ActivityCounterVeryHappy'), 0,FailureHandling.CONTINUE_ON_FAILURE)

//Total Counter Graph
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/TotalActivityCounter'), 0,FailureHandling.CONTINUE_ON_FAILURE)
def TotalActivityCounter = Mobile.getText(findTestObject('Object Repository/AnalyticsObjects/TotalActivityCounter'), 0)
Mobile.verifyMatch(TotalActivityCounter, 'المجموع: 1', false ,FailureHandling.CONTINUE_ON_FAILURE )

Mobile.waitForElementPresent(findTestObject('Object Repository/AnalyticsObjects/ActivityCounterGraphButton'), 0)
Mobile.tap(findTestObject('AnalyticsObjects/ActivityCounterGraphButton'), 0)

//VeryHappy Counter Graph
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/VeryHappyCounterGraphNumber'), 0,FailureHandling.CONTINUE_ON_FAILURE)
def VeryHappyCounterGraphNumber = Mobile.getText(findTestObject('Object Repository/AnalyticsObjects/VeryHappyCounterGraphNumber'), 0)
Mobile.verifyMatch(VeryHappyCounterGraphNumber, ' 1 ', false ,FailureHandling.CONTINUE_ON_FAILURE )


//Test Jitter Plot
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/HealthyLogoJitter'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementVisible(findTestObject('Object Repository/AnalyticsObjects/HealthyPointJitter'), 0,FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.closeApplication()
