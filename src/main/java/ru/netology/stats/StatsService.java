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

    public long allSales(long[] sales) {
        long allSales = 0;

        for (int i = 0; i < sales.length; i++) {
        allSales = sales[i] + allSales;

        }
        return allSales;
    }

    public long averageSales(long[] sales) {

        return allSales(sales) / sales.length;

    }

    public int highAverageSales(long[] sales) {

        int count = 0;
        long averageSale = averageSales(sales);

        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }

        return count;
    }

    public int lowAverageSales(long[] sales) {

        int count = 0;
        long averageSale = averageSales(sales);

        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }

        return count;
    }
}
