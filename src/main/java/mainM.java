import ru.netology.DzJavaStrArr61.StatsServiceM.StatsServiceM;

public class mainM {
    public static void main(String[] args) {
        StatsServiceM service = new StatsServiceM();
        long[] cash = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sumAll = service.sumAllMones(cash);
        long averageSales = service.averageSalesMouth(cash);
        long maxSales = service.maxSalesMouth(cash);
        long minSales = service.minSalesMouth(cash);
        long countB  = service.bellowAverageSalesMouth(cash);
        long countM = service.moreAverageSalesMouth(cash);
        System.out.println(sumAll);
        System.out.println(averageSales);
        System.out.println(maxSales);
        System.out.println(minSales);
        System.out.println(countB);
        System.out.println(countM);

    }
}
