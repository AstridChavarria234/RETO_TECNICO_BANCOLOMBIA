package commons;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Setup {

    EnvironmentVariables environmentVariable;
    String urlBaseFront;

    @Managed(driver = "chrome")
    public WebDriver driver;

    @Before()
    public void configurarPrecondiciones() {
        final String RUTA_URL_FRONT = "url.baseurl";
        environmentVariable = Injectors.getInjector().getInstance(EnvironmentVariables.class);
        urlBaseFront =
                EnvironmentSpecificConfiguration.from(environmentVariable).getProperty(RUTA_URL_FRONT);
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("René").can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().wasAbleTo(Open.url(urlBaseFront));
    }


}