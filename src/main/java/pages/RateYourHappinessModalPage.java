package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class RateYourHappinessModalPage {

    private static final String SLIDER_CSS = ".ui-slider-handle";
    private static final String UPDATE_MOOD_BUTTON = ".ButtonUpdate";

    public MoodUpdatedModalPage updateMood(int moodValue) {
        $(SLIDER_CSS).click();
        int defaultMoodValue = 5;
        Keys direction = null;
        if (moodValue > 5) {
            direction = Keys.ARROW_RIGHT;
        } else if (moodValue < 5) {
            direction = Keys.ARROW_LEFT;
        } else {
            $(UPDATE_MOOD_BUTTON).click();
            return new MoodUpdatedModalPage();
        }
        if (moodValue != defaultMoodValue) {
            for (int i = 0; i < Math.abs(moodValue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        $(UPDATE_MOOD_BUTTON).click();
        return new MoodUpdatedModalPage();
    }
}
