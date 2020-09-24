package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {
    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    public void clickLogin(){
        login.click();
    }
    public void sendEmail(){
        email.sendKeys("kevin.sabrito19@gmail.com");
    }
    public void sendSenha(){
        senha.sendKeys("kevinandre19");
    }
    public void clickSubmitLogin(){
        clickSubmitInLogin.click();
    }

    public String getTextMyaccount(){
        return pageheading.getText();
    }
    public boolean isMyAccount(){
        return getTextMyaccount().equals("MY ACCOUNT");
    }
}
