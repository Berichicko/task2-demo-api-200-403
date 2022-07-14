import models.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest{

    @Test
    //проверка, что код ответа 200
    public void testIsResponseOK() {
        Assertions.assertEquals(Utils.codeOK, homePageYandex.getResponseCode(Utils.BASE_URL));
    }

    @Test
    //проверка, что код ответа 403
    public void testIsResponseForbidden() {
        Assertions.assertEquals(Utils.codeForbidden, homePageYandex.postResponseCode(Utils.BASE_URL));
    }
}
