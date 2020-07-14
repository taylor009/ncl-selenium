import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

fun WebDriver.click(xpath: String) {
    findElement(By.xpath(xpath)).click()
}

fun WebDriver.textExtract(xpath: String): String {
    return findElement(By.xpath(xpath)).text
}

fun WebDriver.textInput(xpath: String, keys: String) {
    findElement(By.xpath(xpath)).sendKeys(keys)
}

fun WebDriver.fillInForm(params: Map<String, String>) {
    params.forEach { (key, value) ->
        findElement(By.xpath(key)).sendKeys(value)
    }
}