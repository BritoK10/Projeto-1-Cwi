package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageElementMapper {

    @FindBy(className = "cat-name")
    public WebElement cat_name;

    @FindBy(className = "heading-counter")
    public WebElement heading_counter;

    @FindBy(className = "navigation-pipe")
    public WebElement navigation_pipe;

    @FindBy(css = ".product-container")
    public WebElement product;

    @FindBy(css = ".button[title=View]")
    public WebElement buttonMore;

    @FindBy(css = ".product_list .product-name")
    public WebElement productNameCategory;
}
