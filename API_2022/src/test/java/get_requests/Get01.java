import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get01 {
    /*
    1- Postman manuel API testi icin kullanilir
    2- API otomasyon testi icin Rest-Assured Library kullaniyoruz
    3- Otomasyon kodlarinin yazimi icin su adimlari izliyoruz
        a-Gereksinimleri anlamak
        b-TestCase'i yazma
            i-TestCase yazimi icin 'Gherkin Language' kullaniyoruz
            ii- 'Gherkin' bazi keywordlere sahip, bunlar
                x-Given: önkosullar
                y-When: islemler, aksiyonlar  get, put gibi
                z-Then: ciktilar veya dönütler dogrulama icin
                0-And: coklu islemler icin

        c-Test kodunun yazimi:
            i- Set the URL (endpoint ) kurulma
            ii- Set the expected data (beklenen verileri olustur. POST-PUT-PATCH) de kullanilir
            iii- Type code to send request (talep göndermek için kod yazma)
            iv- Do Assertion (dogrulama)
     */

/*
        Given
            https://restful-booker.herokuapp.com/booking/3
        When
            User sends a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
 */
@Test
public void get01(){

          //  i- Set the URL (endpoint ) kurulma
            String url="https://restful-booker.herokuapp.com/booking/555";

           // ii- Set the expected data (beklenen verileri olustur. POT-PUT-PATCH) de kullanilir


           // iii- Type code to send request (talep göndermek için kod yazma)
            Response response = given().when().get(url);

    response
            .then()
            .assertThat()
            .statusCode(200)
            .contentType("application/json").statusLine("HTTP/1.1 200 OK");

           // response.prettyPrint();    //json format yadirma sekli
           // iv- Do Assertion (dogrulama)
    //status code yazdiralim
    System.out.println("Status Code : "+response.statusCode());

    //'Content Type' yazdiralim

    System.out.println("Content Type : "+response.contentType());

    // 'StatusLine' yazdiralim

    System.out.println("Status Line : "+response.statusLine());

    // Header nasil yazdirilir
    System.out.println(response.header("Connection"));
    System.out.println(response.header("Host"));
    System.out.println(response.header("User-Agent"));
    System.out.println("Headers : \n"+response.headers());

    // Time nasil yazdirilir

    System.out.println("Time ; " +response.getTime());

}

}
