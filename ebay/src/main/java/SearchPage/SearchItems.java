package SearchPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchItems extends Base {
    @FindBy(id = "com.ebay.mobile:id/search_box")
    WebElement search;
    @FindBy(id = "com.ebay.mobile:id/search_src_text")
    WebElement typeitems;

    public void searchitem() {
        search.click();
    }
    public void typename(String Value){
        typeitems.sendKeys("mobile");
    }

}
