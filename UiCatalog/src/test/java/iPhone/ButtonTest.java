package iPhone;

import ButtonsPage.Buttons;
import UiCatalogPage.UiCatalog;
import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 9/5/15.
 */
public class ButtonTest extends Buttons {
    Buttons buttons;
    //@Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();

    }
    @Test
    public void clickOnButton() {
        buttons.clickButton();
    }


}
