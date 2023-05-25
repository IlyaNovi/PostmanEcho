package ru.netology.echo;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.specification.Argument;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoTest {
    @Test
    void shouldReturnCorrectAnswer() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo ("some data"))
        ;
    }
}
