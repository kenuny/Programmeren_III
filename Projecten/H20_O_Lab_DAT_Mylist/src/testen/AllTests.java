package testen;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ TestLeesBestand.class, TestMyListGeneriek.class, TestMyListIterableGeneriek.class,
		TestQueueGeneriek.class, TestStackGeneriek.class })
public class AllTests {

}
