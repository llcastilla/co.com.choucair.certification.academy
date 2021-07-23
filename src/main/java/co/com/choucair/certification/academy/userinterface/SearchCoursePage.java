package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC =
            Target.the("seleccionar la universidad choucair")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE =
            Target.the("busca el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO =
            Target.the("da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE =
            Target.the("da click para buscar el curso")
            .located(By.xpath("//h4[@class='result-title']/a[contains(@href, 'https://operacion.choucairtesting.com/academy/course/view.php?id=489')]"));

    public static final Target NAME_COURSE =
            Target.the("da click para buscar el curso")
            .located(By.xpath("//*[@class='page-header-headings']/h1[contains(text(), 'Metodología Bancolombia')]"));

}
