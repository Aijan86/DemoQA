import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.PracticeFormEntity;
import com.demoqa.entities.TextBoxEntity;
import com.demoqa.helper.*;
import com.demoqa.pages.DemoQAPages;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.utils.RandomUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;

@Listeners(com.demoqa.listener.ScreenshotListener.class)
public class PracticeFormTest extends BaseTest{

//    @BeforeClass(alwaysRun = true)
//    public void setUp() {
//        driver = DriverManager.getDriver();
//    }


    @Test
    public void practiceFormTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/automation-practice-form");
//        driver.get("https://demoqa.com/automation-practice-form");
        PracticeFormEntity practiceFormEntity = randomUtils.generateRandomPracticeFormEntity();
        demoQAPages.getPracticeFormPage().fillUpPracticeForm(practiceFormEntity);

    }

    @Test
    public void test123() throws InterruptedException {
        browserHelper.open("https://demoqa.com/automation-practice-form");
        demoQAPages.getPracticeFormPage().selectDateMonthYear("30 June 2020");
    }

    // Local Date
    // Local Time

        @AfterClass(alwaysRun = true)
        public void tearDown()  {
            DriverManager.closeDriver();
        }

}
