package PriorityTranslate;

import org.junit.Assert;
import org.junit.Test;


public class realTest extends BasePriorityTranslate  {
    private  final static String MY_URL = "https://activedictionary.com";
    private  final static String FIRST_QUERY = "second";
    private  final static String SECOND_QUERY = "cat";
    private  final static String THREE_QUERY = "country";
    private  final static String FIRST_WORD = "второй";
    private  final static String SECOND_WORD = "кот";
    private  final static String THREE_WORD = "страна";



    @Test
    public void priorityTranslation1() {
        ACDpage ACDpage = new ACDpage(MY_URL);
        ACDpage.inputWordText(FIRST_QUERY);
        ACDpage.searchButtonClick();
        String word1 = ACDpage.getFirstWord();
        Assert.assertTrue(word1.startsWith(FIRST_WORD));

    }
    @Test
    public void priorityTranslation2() {
        ACDpage ACDpage = new ACDpage(MY_URL);
        ACDpage.inputWordText(SECOND_QUERY);
        ACDpage.searchButtonClick();
        String word1 = ACDpage.getFirstWord();
        Assert.assertTrue(word1.startsWith(SECOND_WORD));

    }

    @Test
    public void priorityTranslation3() {
        ACDpage ACDpage = new ACDpage(MY_URL);
        ACDpage.inputWordText(THREE_QUERY);
        ACDpage.searchButtonClick();
        String word1 = ACDpage.getFirstWord();
        Assert.assertTrue(word1.startsWith(THREE_WORD));

    }



}
