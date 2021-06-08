package pages;

import static com.codeborne.selenide.Selenide.$;

public class FeedPage {

    private static final String UPDATE_MOOD_BUTTON_CSS = "#LinkUpdate";

    public RateYourHappinessModalPage clickOnUpdateMoodButton() {
        $(UPDATE_MOOD_BUTTON_CSS).click();
        return new RateYourHappinessModalPage();
    }
}
