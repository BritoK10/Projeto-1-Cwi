package pageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {

    public CategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTextCat_name() {
        return cat_name.getText();
    }

    public String getTexteHeading_counter(){
        return heading_counter.getText();
    }

    public String getTextNavigation_pipe(){
        return navigation_pipe.getText();
    }

    public boolean isCategoryPage(){
        return getTextCat_name().contains("T-SHIRTS ");
    }

    public void clickProduct(){
        BasePage.mouseOver(productNameCategory);
        buttonMore.click();
    }

    public String getProductName(){
        return productNameCategory.getText();
    }

}