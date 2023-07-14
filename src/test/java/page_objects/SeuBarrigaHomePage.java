package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeuBarrigaHomePage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me";
    private By linkCadastro = By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[2]/a");
    public SeuBarrigaHomePage(WebDriver _browser) {
        super(_browser);
    }

    public void abrir() {
        driver.get(url);
    }

    public void clicarLinkCadastro() {
        driver.findElement(linkCadastro).click();
    }
}
