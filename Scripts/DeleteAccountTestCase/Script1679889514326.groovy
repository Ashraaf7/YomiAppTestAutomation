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

//Mobile.waitForElementPresent(findTestObject('Object Repository/DeleteAccountObjects/SettingButton'), 0)
//Mobile.tap(findTestObject('DeleteAccountObjects/SettingButton'), 0)

Mobile.scrollToText('حذف الحساب')


Mobile.tap(findTestObject('DeleteAccountObjects/DeleteAccountButton'), 0)

Mobile.tap(findTestObject('DeleteAccountObjects/DeleteAccountFinishButton'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/DeleteAccountObjects/EnteringLabel'), 0,FailureHandling.CONTINUE_ON_FAILURE)