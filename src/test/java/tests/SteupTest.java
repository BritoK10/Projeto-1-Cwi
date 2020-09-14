package tests;

import org.junit.Test;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SteupTest extends BaseTest{

    @Test
    public void testOpneningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abri o navegador e carreguei a URL!");
    }
}
