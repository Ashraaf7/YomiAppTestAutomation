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

//Mobile.startApplication('E:\\Projects\\Katalon\\Yomi App\\APK\\Yomi.apk', false)


Mobile.waitForElementPresent(findTestObject('Object Repository/LogoutObjects/SettingButton'), 0)
Mobile.tap(findTestObject('LogoutObjects/SettingButton'), 0)

Mobile.scrollToText('عدل المتتبعات')



Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/EditTrackableButton'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/EditTrackableButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/AddTrackableButton'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/AddTrackableButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/TrackableName'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/TrackableName'), 0)
Mobile.setText(findTestObject('EditTrackablesObjects/TrackableName'), 'Test', 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/ChooseNoOfTrackables'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/ChooseNoOfTrackables'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/3TrackableChoices'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/3TrackableChoices'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/NextButton'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/NextButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/LastEmotions'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/LastEmotions'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/LastEmotions'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/LastEmotions'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/NextButton'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/NextButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/FirstEmoj'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/FirstEmoj'), 0)
Mobile.setText(findTestObject('EditTrackablesObjects/FirstEmoj'), 'A', 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/SecondEmoj'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/SecondEmoj'), 0)
Mobile.setText(findTestObject('EditTrackablesObjects/SecondEmoj'), 'B', 0)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/ThirdEmoj'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/ThirdEmoj'), 0)
Mobile.setText(findTestObject('EditTrackablesObjects/ThirdEmoj'), 'C', 0)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/NextButtonOnLastScreen'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/NextButtonOnLastScreen'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/NextButtonOnLastScreen'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/FinishCreatingTrackable'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/FinishCreatingTrackable'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/FinishTrackables'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/FinishTrackables'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/AddMoodObjects/AddMoodButton'), 0)
Mobile.tap(findTestObject('AddMoodObjects/AddMoodButton'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/EditTrackablesObjects/RightEmoj'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementVisible(findTestObject('Object Repository/EditTrackablesObjects/TrackableNameOnboarding'), 0,FailureHandling.CONTINUE_ON_FAILURE)


Mobile.pressBack()


Mobile.scrollToText('عدل المتتبعات')


Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/EditTrackableButton'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/EditTrackableButton'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/DeleteTrackable'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/DeleteTrackable'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditTrackablesObjects/FinishTrackables'), 0)
Mobile.tap(findTestObject('EditTrackablesObjects/FinishTrackables'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/AddMoodObjects/AddMoodButton'), 0)
Mobile.tap(findTestObject('AddMoodObjects/AddMoodButton'), 0)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/EditTrackablesObjects/RightEmoj'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementNotVisible(findTestObject('Object Repository/EditTrackablesObjects/TrackableNameOnboarding'), 0,FailureHandling.CONTINUE_ON_FAILURE)










