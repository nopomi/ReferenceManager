import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

description 'User can add a valid reference entry to the database'

scenario "user can add a reference when content is appropriate", {
    given 'page is opened', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8080"); 
    }
    when 'mandatory fields are filled', {
        element = driver.findElement(By.id("inproceedings-label"));
        element.sendKeys("shmuu6");
        element = driver.findElement(By.id("inproceedings-author"));
        element.sendKeys("akkep");
        element = driver.findElement(By.id("inproceedings-title"));
        element.sendKeys("shmii");
        element = driver.findElement(By.id("inproceedings-year"));
        element.sendKeys("2000");
        element = driver.findElement(By.id("inproceedings-add"));
        element.submit();
    }
    then 'reference entry will be added to the database', {
        driver.getPageSource().contains("shmuu6").shouldBe true
    }
}

scenario "user can not add a reference when content is not appropriate", {
    given 'page is opened', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8080"); 
    }
    when 'mandatory fields are not filled', {
        element = driver.findElement(By.id("inproceedings-label"));
        element.sendKeys("shmuu2");
        element = driver.findElement(By.id("inproceedings-author"));
        element.sendKeys("akkep");
        element = driver.findElement(By.id("inproceedings-title"));
        element.sendKeys("shmii");
        element = driver.findElement(By.id("inproceedings-add"));
        element.submit();
    }
    then 'reference entry will not be added to the database', {
        driver.getPageSource().contains("Validation failed").shouldBe true
    }
}
