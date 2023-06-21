import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;
public class StatsServiceTest {

    @Test
    public void TestMinSails () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actualSales = service.minSales(sales);

        System.out.println("месяц минимальной суммы продаж " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }
    @Test
    public void TestMaxSails () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actualSales = service.maxSales(sales);

        System.out.println("месяц максимальной суммы продаж " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }
    @Test
    public void TestAllSails () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actualSales = service.AllSales(sales);

        System.out.println("сумма всех продаж " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }

    @Test
    public void AverageSales () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actualSales = service.AverageSales(sales);

        System.out.println("средняя сумма продаж в месяц " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }

    @Test
    public void HighAverageSales () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actualSales = service.HighAverageSales(sales);

        System.out.println("количество месяцев, продажи ниже стреднего " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }

    @Test
    public void LowAverageSales () {
        StatsService service = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actualSales = service.LowAverageSales(sales);

        System.out.println("количество месяцев, продажи выше стреднего " + actualSales);
        Assertions.assertEquals(expected, actualSales);
    }
}
