import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import Settings.chromeDriverPath
import Settings.two
import Xpaths.alaskaPort
import Xpaths.destinationDropDown
import Xpaths.exploreDropDown
import Xpaths.findExcursions
import Xpaths.portFilter
import Xpaths.priceSlider
import Xpaths.shoreExcursion
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.Actions
import java.lang.Thread.sleep

fun nclTest() {
    System.setProperty("webdriver.chrome.driver", chromeDriverPath)

    val driver: WebDriver = ChromeDriver();

    driver.get("https://www.ncl.com/")

    sleep(two)

    driver.click(exploreDropDown)

    sleep(two)

    driver.click(shoreExcursion)

    sleep(two)

    driver.click(destinationDropDown)

    sleep(two)

    driver.click(alaskaPort)

    sleep(two)

    driver.click(findExcursions)

    sleep(two)

    driver.click(portFilter)

    sleep(two)

}

fun main() {
    nclTest()
}