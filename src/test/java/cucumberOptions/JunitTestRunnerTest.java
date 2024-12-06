package cucumberOptions;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("src/test/java/features")
@ConfigurationParameter(key = FEATURES_PROPERTY_NAME, value = "src/test/java/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefinitions")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
public class JunitTestRunnerTest {

}

//mvn clean test "-Dcucumber.filter.tags=@PlaceOrder or @LandingPage"
//mvn clean test -Dcucumber.filter.tags=@PlaceOrder
//mvn clean test -Dbrowser=edge