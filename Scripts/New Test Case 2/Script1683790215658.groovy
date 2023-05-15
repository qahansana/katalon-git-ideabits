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

Mobile.startApplication('/Users/ideabits/Downloads/app-release (4).apk', true)

Mobile.takeScreenshot('/var/folders/g2/73pnpvf1277g89bks7b2wc9m0000gp/T/screenshot3823959087857006608.png')

Mobile.takeScreenshot('/var/folders/g2/73pnpvf1277g89bks7b2wc9m0000gp/T/screenshot199938320209201887.png')

Mobile.tap(findTestObject('Object Repository/Page_Sprint Crowd/android.view.ViewGroup'), 0)

Mobile.switchToPortrait()

Mobile.takeScreenshot('/var/folders/g2/73pnpvf1277g89bks7b2wc9m0000gp/T/screenshot5798969736489536504.png')

Mobile.pressBack()

Mobile.closeApplication()

