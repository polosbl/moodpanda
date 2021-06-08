package pages;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedModalPage {

    private static final String GO_TO_MY_DIARY_BUTTON_CSS = ".ButtonMyDiary";

    public DiaryPage goToMyDiary() {
        $(GO_TO_MY_DIARY_BUTTON_CSS).click();
        return new DiaryPage();
    }
}
