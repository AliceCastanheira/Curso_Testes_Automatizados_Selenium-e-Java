package automatizado.pageObject.Curso;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/** Classe base para criacão das novas PagesObjets
 * Todas as pages devem ser herdadas desta classe
*/
public abstract class BasePO {
    
    /**Driver base que será usado pelas pages */ 
    protected WebDriver driver;

    /**Construtor base para cria"ao da fabrica de elementos(PageFactory). 
     * @param driver Driver da pãgina atual.
    */
    public BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
