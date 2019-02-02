package ButtonsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by mrahman on 1/15/17.
 */
public class Buttons extends Base {
   @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
   WebElement button;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Background Image\"]")
    WebElement backGroundImage;
    @FindBy (xpath ="//XCUIElementTypeButton[@name=\"Gray\"]" )
    WebElement color;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Button with Image\"]")
WebElement buttonWithImage;

    public void clickButton(){
        button.click();
    }

}
