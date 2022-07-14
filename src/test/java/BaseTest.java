import models.HomePageYandex;
import models.Utils;
import org.junit.jupiter.api.BeforeEach;


class BaseTest {

    HomePageYandex homePageYandex = new HomePageYandex();

    @BeforeEach
    public void getHeadersInfo() {
        //получение headers
        String headersInfo = homePageYandex.getHeaders(Utils.BASE_URL);
        System.out.println(headersInfo);
    }

    @BeforeEach
    public void getStatusLine() {
        //получение statusLine: протокол, код ответа, фраза ответа
        String statusLine = homePageYandex.getStatusLine(Utils.BASE_URL);
        System.out.println(statusLine);
    }

    @BeforeEach
    public void getContentType() {
        //получение ContentType
        String contentType = homePageYandex.getContentType(Utils.BASE_URL);
        System.out.println(contentType);
    }
}
