import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Demo{

    @Test
    public void useCanSearchKeywordWithGoogle(){
        open("http://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();

        $$("##ires.li.g").shouldHave(size(10));
        $("##ires.li.g").shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
