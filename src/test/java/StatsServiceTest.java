import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.DzJavaStrArr61.StatsService.StatsService;

public class StatsServiceTest {
    @Test
    public void sumAll() {
        StatsService service = new StatsService();
        int[] cash = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int excpectedSum = 180;
        int actualSum = service.sumAllMones(cash);
        Assertions.assertEquals(excpectedSum, actualSum);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        int[] cash = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int excpectedAverage = 15;
        int actualAverage = service.averageSalesMouth(cash);
        Assertions.assertEquals(excpectedAverage, actualAverage);

    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int[] cash = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int excpectedMax = 6;
        int actualMax = service.maxSalesMouth(cash);
        Assertions.assertEquals(excpectedMax, actualMax);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int[] cash = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int excpectedMin = 9;
        int actualMin = service.minSalesMouth(cash);
        Assertions.assertEquals(excpectedMin, actualMin);
    }

    @Test
    public void moreAverageSalesMouth() {
        StatsService service = new StatsService();
        int[] cash = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int excpectedMore = 5;
        int actualMore = service.moreAverageSalesMouth(cash);
        Assertions.assertEquals(excpectedMore, actualMore);

    }
}
