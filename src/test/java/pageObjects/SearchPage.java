package pageObjects;

import elementMapper.SeacrhPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SearchPage extends SeacrhPageElementMapper {

    public SearchPage(){ PageFactory.initElements(Browser.getCurrentDriver(), this); }

    public String getTextNavigation_page() {
        return navigation_page.getText();
    }

    public String getTextLighter(){
        return lighter.getText();
    }

    public String getTextheading_counter(){
        return heading_counter.getText();
    }

    public boolean isSearchPage(){
        return getTextNavigation_page().equals("Search");
    }

}
