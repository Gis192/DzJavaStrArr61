package ru.netology.DzJavaStrArr61.StatsService;

public class StatsService {
    public int sumAllMones(int[] cash) {
        int sumAll = 0;
        for (int i = 0; i < cash.length; i++) {
            sumAll += cash[i];
        }
        return sumAll;
    }

    public int averageSalesMouth(int[] cash) {
        int quantityMouth = 0;
        int sumAll = 0;
        for (int i = 0; i < cash.length; i++) {
            quantityMouth++;
            sumAll += cash[i];
        }
        int averageSales = sumAll / quantityMouth;
        return averageSales;
    }

    public int maxSalesMouth (int[] cash){
        int maxSales =0;
        for (int i = 0; i < cash.length; i++) {
            if (cash[i] > cash[maxSales]) {
                maxSales =i;

            }
        }
        return maxSales+1;
    }
    public int minSalesMouth (int[] cash){
        int minSales =0;
        for (int i = 0; i < cash.length; i++) {
            if (cash[i] < cash[minSales]) {
                minSales =i;

            }
        }
        return minSales+1;
    }
    public int moreAverageSalesMouth (int[] cash) {
        int quantityMouth = 0;
        int sumAll = 0;
        for (int i = 0; i < cash.length; i++) {
            quantityMouth++;
            sumAll += cash[i];
        }
        int averageSales = sumAll / quantityMouth;
        int count = 0;
        for (int i = 0; i < cash.length; i++) {
            if (cash[i] > averageSales){
                count++;
            }
        }
        return count;
    }
}