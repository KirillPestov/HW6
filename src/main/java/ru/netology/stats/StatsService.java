package ru.netology.stats;
public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long AllSales(long[] sales) {
        long allSales = 0;

        for (int i = 0; i < sales.length; i++) {
        allSales = sales[i] + allSales;

        }
        return allSales;
    }

    public long AverageSales(long[] sales) {

        long allSales = AllSales(sales);
        long AverageSales = allSales / sales.length;

        return AverageSales;
    }

    public int HighAverageSales(long[] sales) {

        int count = 0;

        for (long sale : sales) {
            if (sale < AverageSales(sales)) {
                count++;
            }
        }

        return count;
    }

    public int LowAverageSales(long[] sales) {

        int count = 0;

        for (long sale : sales) {
            if (sale > AverageSales(sales)) {
                count++;
            }
        }

        return count;
    }
}
