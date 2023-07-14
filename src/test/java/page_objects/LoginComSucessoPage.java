package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_class.BasePage;

public class LoginComSucessoPage extends BasePage {

	private String url = "https://the-internet.herokuapp.com/login";
	private By inputUsername = By.id("username")  ;
	private By inputPassword  = By.id("password")  ;;
	private By btnLogin = By.xpath("//*[@id=\"login\"]/button");
	private By messagemSucesso = By.id("flash-messages");

	public LoginComSucessoPage(WebDriver _browser) {
		super(_browser);
		// TODO Auto-generated constructor stub
	}
	
	public void abriPagina() {
		driver.get(url);
	}
	
	public void preencherUsername(String user) {
		driver.findElement(inputUsername).sendKeys(user);
	}
	
	public void preencherPassword(String pass) {
		driver.findElement(inputPassword).sendKeys(pass);
	}
	
	public void clickBtnLogin() {
		driver.findElement(btnLogin).click();
	}
	
	public String verificarMensagemSucesso() {
		return driver.findElement(messagemSucesso).getText().replace("\n", "").replace("×", "");
	}
}
