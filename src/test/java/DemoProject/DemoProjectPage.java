package DemoProject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DemoProjectPage {
    private final SelenideElement analyseText = $x ("//*[@id=\"__layout\"]/div/div/div/div/div/div[1]/div/div/div[2]/div[1]/button[2]");
    private final SelenideElement testButton = $x ("//*[@class=\"DButton --mid --thin searchBox__btn\"]");
    private final SelenideElement burgerButton = $x ("//*[@id=\"__layout\"]/div/div[2]/div/div/div[2]/div/button[2]");
    private final SelenideElement acdIcon = $x ("//*[@id=\"__layout\"]/div/div[1]/div/div[1]/a");
    private final SelenideElement myProjectButton = $x ("//html/body/div[1]/div/div/div[1]/div/div[2]/ul/li[1]/div/div");
    private final SelenideElement myDictionaryButton = $x ("//html/body/div[1]/div/div/div[1]/div/div[2]/ul/li[2]/div/div");
    private final SelenideElement searchButton = $x ("//html/body/div[1]/div/div/div[1]/div/div[2]/ul/li[3]/div/div");
    private final SelenideElement acdIconButton = $x ("//html/body/div[1]/div/div/div[1]/div/div[3]/button");
    private final SelenideElement textsButton = $x ("//html/body/div[1]/div/div/div[1]/div/div[4]/ul/li[1]/div/div");
    private final SelenideElement materialsButton = $x ("//*[@id=\"__layout\"]/div/div[1]/div/div[4]/ul/li[2]/div");
    private final SelenideElement glossaryButton = $x ("//*[@id=\"__layout\"]/div/div[1]/div/div[4]/ul/li[3]/div/div/div");
    private final SelenideElement summariesButton = $x ("//*[@id=\"__layout\"]/div/div[1]/div/div[4]/ul/li[4]/div/div/div");
    private final SelenideElement aboutButton = $x ("//*[@id=\"__layout\"]/div/div[1]/div/div[4]/ul/li[5]/div/div/div");
    private final SelenideElement reportBugButton = $x ("//*[@class=\"link d-flex align-center w-full\"]");
    private final SelenideElement signInButton = $x ("//*[@id=\"__layout\"]/div/div[1]/div/div[5]/div/div[3]/a/div/div");


    private static final SelenideElement authorizationPopap = $x("//*[@id=\"__layout\"]/div/div[2]/div/span/div/div[2]/div");
    private static final SelenideElement demoProjectPopap = $x("//*[@class=\"_ProjectInfoModal popup --page _DScrollBar-source init\"]");
    private static final SelenideElement authoLoginForm = $x("//*[@class=\"_AuthLogin\"]");


    public DemoProjectPage (String URL) {
        Selenide.open(URL);
    }

    public void analyseTextClick() {
        analyseText.click();
    }
    public void testButtonClick() {
        testButton.click();
    }
    public void burgerButtonClick() {
        burgerButton.click();
    }
    public void acdIconClick() {
        acdIcon.click();
    }
    public void myProjectButtonClick() {
        myProjectButton.click();
    }
    public void myDictionaryButtonClick() {
        myDictionaryButton.click();
    }
    public void searchButtonClick() {
        searchButton.click();
    }
    public void acdIconButtonClick() {
        acdIconButton.click();
    }
    public void textsButtonClick() {textsButton.click();}
    public void materialsButtonClick() {materialsButton.click();}
    public void glossaryButtonClick() {glossaryButton.click();}
    public void summariesButtonClick() {summariesButton.click();}
    public void aboutButtonClick() {aboutButton.click();}
    public void reportBugButtonClick() {reportBugButton.click();}
    public void signInButtonClick() {signInButton.click();}
    public SelenideElement searchAuthorizationPopap() {
        return authorizationPopap.shouldBe(Condition.visible);
    }
    public SelenideElement demoProjectPopap() { return demoProjectPopap.shouldBe(Condition.visible);}

    public SelenideElement authoLoginPage() { return authoLoginForm.shouldBe(Condition.visible);}


}
