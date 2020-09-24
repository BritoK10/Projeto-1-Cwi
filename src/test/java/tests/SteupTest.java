package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import java.math.MathContext;

import static org.junit.Assert.*;

@Feature("Testes do site de ecommerce")

public class SteupTest extends BaseTest {

    @Test
    @Story("Abrindo o site")
    public void testOpneningBrowserAndLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abri o navegador e carreguei a URL!");
    }

    @Test
    @Story("Realizando nosso login")
    public void testlogin() {

        MyAccountPage login = new MyAccountPage();

        login.clickLogin();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        login.sendEmail();
        System.out.println("Preencheu o email");
        login.sendSenha();
        System.out.println("Colocou a senha");
        login.clickSubmitLogin();
        System.out.println("Clicou em login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a URL de minha conta");
        login.isMyAccount();
        System.out.println("Validou My account no Body");

    }

    @Test
    @Story("Realizando pesquisa de um produto")
    public void testSearch() {

        String quest = "DRESS";
        String questResultQtd = "7";

        //Inicia as paginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        //Fazer a pesquisa
        home.doSearch(quest);

        //Validar o teste
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextheading_counter(), CoreMatchers.containsString(questResultQtd));

    }


    @Test
    @Story("Entrando em uma categoria")
    public void testAcessCategoryTshirts() {
        String questResult = "1";
        String quest = "T-SHIRTS";

        //Iniciar as paginas
        HomePage home = new HomePage();
        CategoryPage page = new CategoryPage();

        //Clicar na categória T-SHIRTS
        home.clickCategoryTShirts();

        //Validar a pesquisa
        assertTrue(page.isCategoryPage());

    }

    @Test
    @Story("Entrando em um produto")
    public void testBuyProduct() {
        //Acessar a categoria
        testAcessCategoryTshirts();

        //Iniciar as paginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();

        //Salva o nome do Produto
        String nameProductCategory = category.getProductName();

        //Clicar em More
        category.clickProduct();

        //Validar se está na página do produto
        assertTrue(pdp.nameProductPage().equals(nameProductCategory));
    }

    @Test
    @Story("Adicionando o produto ao carrinho")
    public void testAddProduct() {
        //Acessar a categoria
        testAcessCategoryTshirts();

        //Iniciar as paginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();
        CartPage cart = new CartPage();

        //Salva o nome do Produto
        String nameProductCategory = category.getProductName();


        //Clicar em More
        category.clickProduct();

        //Validar se está na página do produto
        assertTrue(pdp.nameProductPage().equals(nameProductCategory));

        //Adicionar ao carrinho
        pdp.clickAddToCart();
        pdp.clickProceed();

        //Validar se está na compra do produto
        assertTrue(cart.getNameProductCart().equals(nameProductCategory));

    }
}