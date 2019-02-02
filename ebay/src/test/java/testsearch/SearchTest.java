package testsearch;

import SearchPage.SearchItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends SearchItems {
    SearchItems searchItems;
    @BeforeMethod
    public void initElements(){
        searchItems = PageFactory.initElements(ad, SearchItems.class);
    }
    @Test
    public void click(){
        searchItems.searchitem();
    }
    @Test
    public void type(){
        searchItems.typename("mobile");
    }
}
