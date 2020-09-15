package tests;

import org.junit.After;
import org.junit.Before;
import utils.Browser;
import utils.Utils;

public class BaseTest {

    @Before
    public  void setup() {

        Browser.loadPage(Utils.getBaseUrl());
    }

    @After
    public void tearDown(){
        Browser.close();
    }



}
