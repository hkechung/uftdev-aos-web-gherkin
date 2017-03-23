package net.hpe.presales;


import com.hpe.alm.octane.OctaneCucumber;
import org.junit.*;
import org.junit.runner.RunWith;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import unittesting.*;

//@RunWith(Cucumber.class)
@RunWith(OctaneCucumber.class)
//The below was done to insure a good run no matter what other feature files may be added.
@CucumberOptions(plugin = {"junit:leanftResults.xml"}, features="classpath:advantage.feature")//the feature to execute
public class LeanFtTest extends UnitTestClassBase {

	public LeanFtTest() {
		//Change this constructor to private if you supply your own public constructor
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new LeanFtTest();
		globalSetup(LeanFtTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() throws GeneralLeanFtException {

	}

}