import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;
public class StatsServiceTest {

    @Test
    public void testMinSails () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actualSales = service.minSales(sales);

        System.out.println("месяц минимальной суммы продаж " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }
    @Test
    public void testMaxSails () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actualSales = service.maxSales(sales);

        System.out.println("месяц максимальной суммы продаж " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }
    @Test
    public void testAllSails () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actualSales = service.allSales(sales);

        System.out.println("сумма всех продаж " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }

    @Test
    public void averageSales () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actualSales = service.averageSales(sales);

        System.out.println("средняя сумма продаж в месяц " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }

    @Test
    public void highAverageSales () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actualSales = service.highAverageSales(sales);

        System.out.println("количество месяцев, продажи ниже стреднего " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }

    @Test
    public void lowAverageSales () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actualSales = service.lowAverageSales(sales);

        System.out.println("количество месяцев, продажи выше стреднего " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }
}
