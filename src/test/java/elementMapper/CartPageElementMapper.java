package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElementMapper {
    @FindBy(id = "cart_title")
    public WebElement nameSummaryBody;

    @FindBy(css = ".cart_description .product-name")
    public WebElement nameProductCart;
}
