import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

description 'User can view a list of references'

scenario "user can view a list of references", {
    given 'at least one entry is in the database', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8080");
}
    when 'at least one entry is in the database', {
        element = driver.findElement(By.name("id"));
        element.sendKeys("1");
        element = driver.findElement(By.name("reference"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("add"));
        element.submit();
}
    then 'a listing of references is displayed', {
        driver.getPageSource().contains("akkep").shouldBe true
}
}

