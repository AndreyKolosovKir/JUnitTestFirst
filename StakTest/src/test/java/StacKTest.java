import org.junit.jupiter.api.*;

public class StacKTest {
    Stack sut;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Tests started");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test start");
        sut = new Stack();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Tests ended");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test ended");
    }

    @Test
    public void testPopHeadNull() {
        String textResponse = "нет элементов";

        String result = sut.pop();

        Assertions.assertEquals(textResponse, result);
    }

    @Test
    public void testPopHeadIfNotNull() {
        sut.push("1");
        String expected = "1";

        String result = sut.pop();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPushFirstPrev() {
        String first = "3";
        Node expected = new Node("3", null);

        Node result = sut.push(first);

        Assertions.assertEquals(expected.prev, result.prev);
    }

    @Test
    public void testPushFirstValue() {
        String first = "3";
        Node expected = new Node("3", null);

        Node result = sut.push(first);

        Assertions.assertEquals(expected.value, result.value);
    }

}
