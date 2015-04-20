import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

description 'User can view a list of references'

scenario "user can view a list of references", {
    given 'at least one entry is in the database', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8080");
}
    when 'at least one entry is in the database', {
        element = driver.findElement(By.id("article-label"));
        element.sendKeys("shmuu3");
        element = driver.findElement(By.id("article-author"));
        element.sendKeys("akkep");
        element = driver.findElement(By.id("article-title"));
        element.sendKeys("shmii");
        element = driver.findElement(By.id("article-year"));
        element.sendKeys("2000");
        element = driver.findElement(By.id("article-add"));
        element.submit();
}
    then 'a listing of references is displayed', {
        driver.get("http://localhost:8080/references");
        driver.getPageSource().contains("shmuu3").shouldBe true
}
}

