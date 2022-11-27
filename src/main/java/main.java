import ru.netology.DzJavaStrArr61.StatsService.StatsService;
public class main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] cash = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sumAll = service.sumAllMones(cash);
        int averageSales = service.averageSalesMouth(cash);
        int maxSales = service.maxSalesMouth(cash);
        int minSales = service.minSalesMouth(cash);
        int count = service.moreAverageSalesMouth(cash);
        System.out.println(sumAll);
        System.out.println(averageSales);
        System.out.println(maxSales);
        System.out.println(minSales);
        System.out.println(count);
    }
}
