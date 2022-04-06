package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test(dataProvider = "age-data")
    public void testVerifyAgeBeforePlay(int age, boolean expected, String message) {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertEquals(ageChecker.canPlayGame(age), expected, message);
    }

    @DataProvider(name="age-data")
    public Object[][] dataAgeProvider() {
        return new Object[][] {
                {17, false, "User is not an adult and shouldn't be allowed to play"},
                {18, true, "User is an adult and should be allowed to play"},
                {19, true, "User is an adult and should be allowed to play"}
        };
    }
}
