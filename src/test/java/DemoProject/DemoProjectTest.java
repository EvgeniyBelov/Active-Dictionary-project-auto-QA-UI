package DemoProject;

import com.codeborne.selenide.Screenshots;
import org.junit.Test;

public class DemoProjectTest extends BaseACD {
    private  final static String MY_URL = "https://acddev.ru/en/projects/1/texts/4245";


    @Test
    public void openMyProject(){
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.myProjectButtonClick();
        DPP.searchAuthorizationPopap();
        Screenshots.takeScreenShot(" testACD");
    }

    @Test
    public void openMyDictionary(){
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.myDictionaryButtonClick();
        DPP.searchAuthorizationPopap();
        Screenshots.takeScreenShot(" testACD");
    }

    @Test
    public void openSearch() {
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.searchButtonClick();
        DPP.searchAuthorizationPopap();
        Screenshots.takeScreenShot(" testACD");
    }

    @Test
    public void openAcdIcon() {
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.acdIconButtonClick();
        DPP.searchAuthorizationPopap();
        Screenshots.takeScreenShot(" testACD");
    }
    @Test
    public void openTexts() {
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.textsButtonClick();
        DPP.searchAuthorizationPopap();
        Screenshots.takeScreenShot(" testACD");
    }
    @Test
    public void openMaterials() {
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.materialsButtonClick();
        DPP.searchAuthorizationPopap();
        Screenshots.takeScreenShot(" testACD");
    }
    @Test
    public void openGlossary() {
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.glossaryButtonClick();
        DPP.searchAuthorizationPopap();
        Screenshots.takeScreenShot(" testACD");
    }
    @Test
    public void openSummaries() {
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.summariesButtonClick();
        DPP.searchAuthorizationPopap();
        Screenshots.takeScreenShot(" testACD");
    }
    @Test
    public void openAboutDemoProjectPopap() {
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.aboutButtonClick();
        DPP.demoProjectPopap();
        Screenshots.takeScreenShot(" testACD");
    }
    @Test
    public void openReportBugButton() {
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.reportBugButtonClick();
        DPP.searchAuthorizationPopap();
        Screenshots.takeScreenShot(" testACD");
    }
    @Test
    public void openAuthologinPage() {
        DemoProjectPage DPP = new DemoProjectPage(MY_URL);
        DPP.burgerButtonClick();
        DPP.signInButtonClick();
        DPP.authoLoginPage();
        Screenshots.takeScreenShot(" testACD");
    }
}
