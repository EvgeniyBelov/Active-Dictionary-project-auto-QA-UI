package DemoProject;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseACD {
    public void setUp(){
        ChromeOptions options = new ChromeOptions() // установка локализации
                .setHeadless(true)
                .addArguments("--lang=en_US");
        Configuration.browserCapabilities = options;
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = false;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Configuration.timeout = 5000;
    }

    /* Настраиваем действия до ТЕСТА */
    @Before
    public void init() {
        setUp(); // создаём метод init  в котром вызываем метод setUp с параметрами указанными выше
    }

    /* Настраиваем действие после ТЕСТА*/
    @After
    public void tearDown() {
        Selenide.closeWebDriver(); // создаём метод tearDown в котором вызываем метод который закрывает браузер
    }

}
