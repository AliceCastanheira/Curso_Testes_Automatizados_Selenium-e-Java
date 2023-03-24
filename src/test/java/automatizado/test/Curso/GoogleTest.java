package automatizado.test.Curso;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import automatizado.pageObject.Curso.GooglePO;


public class GoogleTest extends BaseTest{
   
    private static GooglePO googlePage;
    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePO(driver);

    }
    
    @Test
    public void devePesquisarNoGoogle(){

        googlePage.inputPesquisa.sendKeys("Batata Frita" + Keys.ENTER);

        String resultado = googlePage.divResultadoPesquisa.getText();

       assertTrue(resultado, resultado.contains("Aproximadamente"));

    }
}