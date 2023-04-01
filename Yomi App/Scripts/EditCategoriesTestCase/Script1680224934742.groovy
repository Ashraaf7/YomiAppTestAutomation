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


Mobile.waitForElementPresent(findTestObject('Object Repository/LogoutObjects/SettingButton'), 0)
Mobile.tap(findTestObject('LogoutObjects/SettingButton'), 0)

Mobile.scrollToText('عدل المتتبعات')


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/EditCategoriesButton'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/EditCategoriesButton'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/AddCategoryButton'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/AddCategoryButton'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/CategoryName'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/CategoryName'), 0)
Mobile.setText(findTestObject('EditCategoriesObjects/CategoryName'), 'Category Test', 0)



Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/AddActivityButton'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/AddActivityButton'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/AddActivityButton'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/AddActivityButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/AddActivityButton'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/AddActivityButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/FirstActivityLogo'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/FirstActivityLogo'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/FirstActivityLogo'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/ActivityName'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/ActivityName'), 0)
Mobile.setText(findTestObject('EditCategoriesObjects/ActivityName'), 'A', 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/Logo1'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/Logo1'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/Logo1'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/AddActivityTrick'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/AddActivityTrick'), 0)


//'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

//'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

//'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

//'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

//'Storing the startY value'
int startY = device_Height * 0.20

//'Storing the endY value'
int endY = device_Height * 0.40


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/SecondActivityLogo'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/SecondActivityLogo'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/ActivityName'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/ActivityName'), 0)
Mobile.setText(findTestObject('EditCategoriesObjects/ActivityName'), 'B', 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/Logo2'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/Logo2'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/Logo2'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/AddActivityTrick'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/AddActivityTrick'), 0)

Mobile.delay(2)
Mobile.swipe(startX, endY, endX, startY)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/SecondActivityLogo'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/SecondActivityLogo'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/ActivityName'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/ActivityName'), 0)
Mobile.setText(findTestObject('EditCategoriesObjects/ActivityName'), 'C', 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/Logo3'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/Logo3'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/Logo3'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/AddActivityTrick'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/AddActivityTrick'), 0)



Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/SaveCategory'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/SaveCategory'), 0)

Mobile.scrollToText('Category Test')
Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/EditCategoryIcon'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/EditCategoryIcon'), 0)

Mobile.delay(2)
Mobile.swipe(startX, endY, endX, startY)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/RemoveActivity'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/RemoveActivity'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/SaveCategory'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/SaveCategory'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/Finish'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/Finish'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/AddMoodObjects/AddMoodButton'), 0)
Mobile.tap(findTestObject('AddMoodObjects/AddMoodButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/VerySadEmoji'), 0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/EditCategoriesObjects/VerySadEmoji'), 0)


Mobile.tap(findTestObject('AddMoodObjects/NextButton'), 0)

Mobile.scrollToText('إنهاء')

Mobile.verifyElementVisible(findTestObject('Object Repository/EditCategoriesObjects/RightActivityOnAddingMood'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementVisible(findTestObject('Object Repository/EditCategoriesObjects/LeftActivityOnAddingMood'), 0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/EditCategoriesObjects/RightActivityOnAddingMood'), 0)
Mobile.tap(findTestObject('Object Repository/EditCategoriesObjects/LeftActivityOnAddingMood'), 0)

Mobile.waitForElementPresent(findTestObject('AddMoodObjects/FinishButton'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('AddMoodObjects/FinishButton'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/LogoutObjects/SettingButton'), 0)
Mobile.tap(findTestObject('LogoutObjects/SettingButton'), 0)

Mobile.scrollToText('عدل المتتبعات')


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/EditCategoriesButton'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/EditCategoriesButton'), 0)


Mobile.scrollToText('Category Test')
Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/EditCategoryIcon'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/EditCategoryIcon'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/RemoveCategory'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/RemoveCategory'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/Finish'), 0)
Mobile.tap(findTestObject('EditCategoriesObjects/Finish'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/AddMoodObjects/AddMoodButton'), 0)
Mobile.tap(findTestObject('AddMoodObjects/AddMoodButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/EditCategoriesObjects/VerySadEmoji'), 0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/EditCategoriesObjects/VerySadEmoji'), 0)


Mobile.tap(findTestObject('AddMoodObjects/NextButton'), 0)
Mobile.delay(5)
Mobile.scrollToText('إنهاء')

Mobile.verifyElementNotVisible(findTestObject('Object Repository/EditCategoriesObjects/RightActivityOnAddingMood'), 0,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementNotVisible(findTestObject('Object Repository/EditCategoriesObjects/LeftActivityOnAddingMood'), 0,FailureHandling.CONTINUE_ON_FAILURE)


'Back to previous screen'
Mobile.pressBack()
Mobile.pressBack()




