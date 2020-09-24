package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElementMapper {
    @FindBy(css = "h1[itemprop=name]")
    public WebElement itemNameProductPage;

    @FindBy(id = "add_to_cart")
    public WebElement add_to_Cart;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    public WebElement proceed_to_checkout;
}
