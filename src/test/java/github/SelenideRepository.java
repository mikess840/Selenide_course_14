package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideRepository {
    @Test
    void shouldFindSelenideAsRepository (){
        //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(byLinkText("Soft assertions")).click();
        // проверить, что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5"));


        //$$ - ищет все элементы в разных местах, поэтому нужно выбирать через first()
        //$$("ul.repo-list li").first().$("a").click();
        //$$("") - команда для консоли показывающая сколько раз появляется элемент
        //$("#repository-container-header").shouldHave(text("selenide / selenide"));
        //sleep(6000); //посмотреть чего случилось

        //ARRANGE -
        //ACT - один должен быть, что-то должны совершить
        //ACT
        //ASSERT - обязательный, что-то должны проверить
        //ACT
        //ASSERT - командой shot
    }
}
