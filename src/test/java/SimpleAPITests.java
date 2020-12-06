import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static io.restassured.RestAssured.get;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SimpleAPITests {

    @Test
    void bookStoreTest() {
        get("https://demoqa.com/BookStore/v1/Books")
                .then()
                .body("books[0].title", is("Git Pocket Guide"));
    }

    @Test
    void positiveTest() {
        int a = 3;
        int b = 4;
        assertEquals(a + b, 7);
    }

    @Test
    void negativeTest() {
        int a = 3;
        int b = 4;
        assertNotEquals(a + b, 8);
    }

}
