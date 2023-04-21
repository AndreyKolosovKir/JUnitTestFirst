import org.junit.jupiter.api.*;

public class SortTest {

    Sort sut;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Tests started");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test start");
        sut = new Sort();
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
    public void testSortCommands() {
        int[] firs = {45, 32, 24, 22, 20, 17, 15, 13, 12, 10};
        int[] second = {31, 18, 15, 12, 10, 8, 6, 4, 2, 1};
        int[] commandFinal = {45, 32, 31, 24, 22, 20, 18, 17, 15, 15};

        int[] resolt = sut.merge(firs, second);

        Assertions.assertArrayEquals(commandFinal, resolt);
    }

    @Test
    public void testResoltTeamIfComandNotTen() {
        int[] commandFinal = {100, 99, 98, 97, 80, 79, 78, 77, 76, 75};
        int[][] regionalTeam = {
                {100, 99, 98, 97},
                {80, 79, 78, 77, 76, 75, 74, 73, 72, 71},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };

        int[] resolt = sut.nationalTeam(regionalTeam);

        Assertions.assertArrayEquals(commandFinal, resolt);
    }
}
