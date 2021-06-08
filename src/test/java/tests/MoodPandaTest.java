package tests;

import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest implements ITestConstants{

    @Test
    public void loginTest() {
        loginPage
                .openPage()
                .login(EMAIL,PASSWORD);
        //TODO: Implement assertion
    }

    @Test
    public void rateHappinessTest() {
        loginPage
                .openPage()
                .login(EMAIL,PASSWORD)
                .clickOnUpdateMoodButton()
                .updateMood(5)
                .goToMyDiary();
    }
}
