package ru.netology.DzJavaStrArr61.StatsServiceM;

// Это файл написал когда заглянул в разбор занятий и понял что можно сделать по короче

public class StatsServiceM {
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
        int countB = 0;
        for (long sale : cash) {
            if (sale > averageSalesMouth(cash)) {
                countB++;
            }
        }
        return countB;

    }

    public int moreAverageSalesMouth(long[] cash) {
        int countM = 0;
        for (long sale : cash) {
            if (sale < averageSalesMouth(cash)) {
                countM++;
            }
        }
            return countM;
    }
}



