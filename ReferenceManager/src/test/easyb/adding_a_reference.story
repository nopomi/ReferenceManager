import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

description 'User can add a valid reference entry to the database'

scenario "user can add a reference when content is appropriate", {
    given 'page is opened', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8080"); 
    }
    when 'mandatory fields are filled', {
        element = driver.findElement(By.name("id"));
        element.sendKeys("1");
        element = driver.findElement(By.name("reference"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("add"));
        element.submit();
    }
    then 'reference entry will be added to the database', {
        driver.getPageSource().contains("akkep").shouldBe true
    }
}
