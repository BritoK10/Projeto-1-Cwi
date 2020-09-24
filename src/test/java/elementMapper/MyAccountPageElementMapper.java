package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageElementMapper {
    @FindBy(className = "login")
    public WebElement login;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement senha;

    @FindBy(id = "SubmitLogin")
    public WebElement clickSubmitInLogin;

    @FindBy(className = "page-heading")
    public WebElement pageheading;


}
