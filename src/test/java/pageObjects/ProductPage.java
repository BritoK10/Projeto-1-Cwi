package pageObjects;

import elementMapper.ProductPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {

    public ProductPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    public String nameProductPage(){
        return itemNameProductPage.getText();
    }
    public void clickAddToCart(){
        add_to_Cart.click();
    }
    public void clickProceed(){
        proceed_to_checkout.click();
    }


}
