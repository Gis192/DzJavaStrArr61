package ru.netology.DzJavaStrArr61.StatsService;

public class StatsService {
    public long sumAllMones(long[] cash) {
        long sumAll = 0;
        for (long sale : cash) {
            sumAll += sale;
        }
        return sumAll;
    }

    public long averageSalesMouth(long[] cash) {
        long averageSales = sumAllMones(cash) / cash.length;
        return averageSales;
    }

    public int maxSalesMouth(long[] cash) {
        int maxSales = 0;
        for (int i = 0; i < cash.length; i++) {
            if (cash[i] > cash[maxSales]) {
                maxSales = i;

            }
        }
        return maxSales + 1;
    }

    public int minSalesMouth(long[] cash) {
        int minSales = 0;
        for (int i = 0; i < cash.length; i++) {
            if (cash[i] < cash[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int bellowAverageSalesMouth(long[] cash) {
        long averageSales = averageSalesMouth(cash);
        int countB = 0;
        for (long sale : cash) {
            if (sale > averageSales) {
                countB++;
            }
        }
        return countB;

    }

    public int moreAverageSalesMouth(long[] cash) {
        long averageSales = averageSalesMouth(cash);
        int countM = 0;
        for (long sale : cash) {
            if (sale < averageSales) {
                countM++;
            }
        }
        return countM;
    }
}