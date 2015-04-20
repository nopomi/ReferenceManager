import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

description 'User can view a reference entry'

scenario "user can view a reference entry they have just added", {
    given 'a new entry is added', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8080");
        element = driver.findElement(By.id("article-label"));
        element.sendKeys("shmuu4");
        element = driver.findElement(By.id("article-author"));
        element.sendKeys("akkep");
        element = driver.findElement(By.id("article-title"));
        element.sendKeys("shmii");
        element = driver.findElement(By.id("article-year"));
        element.sendKeys("2000");
        element = driver.findElement(By.id("article-journal"));
        element.sendKeys("A Journal");
        element = driver.findElement(By.id("article-add"));
        element.submit();
}
    when 'user attempts to view an entry', {
        element = driver.findElement(By.linkText("shmuu4"));
        element.click();
}
    then 'reference entry is displayed to the user', {
        driver.getPageSource().contains("A Journal").shouldBe true

}
}

scenario "user can not view any references when there are none", {
    given 'there are no references in the database' , {
        driver = new HtmlUnitDriver();

}
    when 'user attempts to view an entry', {
        driver.get("http://localhost:8080");
}
    then 'no reference entry is displayed', {
        driver.getPageSource().contains("No references yet!").shouldBe true
}
}
