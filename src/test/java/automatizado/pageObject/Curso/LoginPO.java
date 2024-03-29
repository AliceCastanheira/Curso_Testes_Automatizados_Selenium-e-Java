package automatizado.pageObject.Curso;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO{

   @FindBy(id = "email")
   public WebElement inputEmail;

   @FindBy(id = "senha")
   public WebElement inputSenha;

   @FindBy(id = "btn-entrar")
   public WebElement buttonEntrar;

   @FindBy(id = "mensagem")
   public WebElement spanMensagem;

   @FindBy(xpath = "/html/body/nav/a")
   public WebElement classNavbarBrand;
    
    public LoginPO(WebDriver driver) {
        super(driver);
    }

    public void escrever(WebElement input, String texto){
        input.clear();
        input.sendKeys(texto + Keys.TAB);
    }
    
   public String obterMensagem() {
        return this.spanMensagem.getText();
    }

    public String obterTexto() {
        return this.classNavbarBrand.getText();
    }

    public void executarAcaoDeLogar(String email, String senha){
        escrever(inputEmail, email);
        escrever(inputSenha, senha);

        buttonEntrar.click();
    }

}
