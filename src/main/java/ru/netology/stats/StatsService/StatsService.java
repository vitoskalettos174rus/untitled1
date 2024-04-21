

package ru.netology.stats.StatsService;

public class StatsService {

    public int allSalesSum(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSumSales(long[] sales) {
        int averageSum = 0;
        for (int i = 0; i < sales.length; i++)
            averageSum += sales[i];
        return averageSum / sales.length;
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

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSumSales(long[] sales) {
        int averageSales = averageSumSales(sales);
        int monthCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int aboveAverageSumSales(long[] sales) {
        int averageSales = averageSumSales(sales);
        int monthCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                monthCount++;
            }
        }
        return monthCount;
    }
}