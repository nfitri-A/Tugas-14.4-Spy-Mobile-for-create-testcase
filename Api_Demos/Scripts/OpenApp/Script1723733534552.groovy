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

Mobile.startApplication('D:\\belajar\\Katalon_Studio\\Api_Demos\\MobileApp\\ApiDemos-debug.apk', true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.TextView - App'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.TextView - Activity'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.TextView - Animation'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.Button - Fade in'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.Button - OK Cancel dialog with a message'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.Button - OK'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.TextView - Animation'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.Button - Zoom in'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.Button - OK Cancel dialog with a long message'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.Button - Text Entry dialog'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/android.widget.EditText'), 'Fitri', 0)

Mobile.setText(findTestObject('Object Repository/Mobile/android.widget.LinearLayout'), '11gg2453', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Mobile/android.widget.EditText (1)'), '6a4NCP0jmbntcFpXl0YOyA==', 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/android.widget.TextView - AppAlert Dialogs'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

