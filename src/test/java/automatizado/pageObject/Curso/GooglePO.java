package automatizado.pageObject.Curso;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {
    
    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;

    
    /**Construtor que vai criar a pãgina do google. 
     * @param driver Driver da pagina do google.
    */
    public GooglePO(WebDriver driver) {
        super(driver);     
    }
}
