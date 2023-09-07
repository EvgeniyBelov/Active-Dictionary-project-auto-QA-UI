package PriorityTranslate;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class ACDpage {
    private final SelenideElement reversLangButton = $x("//*[@class=\"link filterRow__item\"]");

    private final SelenideElement inputWord = $x("//*[@id=\"searchInput\"]");
    private final SelenideElement searchButton = $x("//*[@class=\"DButton --mid searchBox__find\"]");
    private final SelenideElement resultWord = $x("//*[@class=\"searchBox__resultsWord\"]");

    public static final SelenideElement firstWord = $x("//div[@class='searchBox__resultsItem']//following::a[1]/div[2]");

    public ACDpage(String URL) {
        Selenide.open(URL);
    }
    public void reversLangButtonClick() {
        reversLangButton.click();
    }
    public void inputWordText(String MY_QUERY) {
        inputWord.sendKeys(MY_QUERY);
    }
    public void searchButtonClick() {
        searchButton.click();
    }
    public void getResultWord() {resultWord.getText();}

    public static String getFirstWord() {
        return firstWord.getText();
    }

}
