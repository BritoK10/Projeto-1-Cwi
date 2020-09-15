package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SteupTest extends BaseTest{

    @Test
    public void testOpneningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abri o navegador e carreguei a URL!");
    }

    @Test
    public void testlogin(){
        Browser.getCurrentDriver().findElement(By.className("login")).click();
        System.out.println("Click no Login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("kevin.sabrito19@gmail.com");
        System.out.println("Preencheu o email");
        Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("kevinandre19");
        System.out.println("Colocou a senha");
        Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        System.out.println("Clicou em login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a URL de minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou My account no Body");

    }

    @Test
    public void compracarrinho(){
        Browser.getCurrentDriver().findElement(By.id("search_query_top")).click();
        Browser.getCurrentDriver().
    }

}
