import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

description 'User can view a reference entry'

scenario "user can view a reference entry they have just added", {
    given 'a new entry is added', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8080");
}
    when 'user attempts to view an entry', {
        element = driver.findElement(By.name("id"));
        element.sendKeys("1");
        element = driver.findElement(By.name("reference"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("add"));
        element.submit();
}
    then 'reference entry is displayed to the user', {
        driver.getPageSource().contains("akkep").shouldBe true

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
