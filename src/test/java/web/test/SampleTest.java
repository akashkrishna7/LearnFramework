package web.test;

import org.testng.annotations.*;
import web.WebBase;

import static org.testng.Assert.*;

public class SampleTest extends WebBase {

    @Test
    public void exampleTest() {
        assertEquals(driver.getTitle(), "Google");
    }

}
