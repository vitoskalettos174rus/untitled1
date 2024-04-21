

package ru.netology.stats.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void SumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.allSalesSum(sales);
//        System.out.println("Сумма всех продаж: " + actualSum);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void AverageSumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.averageSumSales(sales);
//        System.out.println("Средняя сумма продаж в месяц: " + actualSum);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void MonthOfMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
//        System.out.println("Месяц пика продаж: " + actualMonth);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void MonthOfMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
//        System.out.println("Месяц минимума продаж: " + actualMonth);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void BelowAverageMonthCount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.belowAverageSumSales(sales);
//        System.out.println("Количество месяцев минимума продаж: " + actualCount);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    void AboveAverageMonthCount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.aboveAverageSumSales(sales);
//        System.out.println("Количество месяцев пика продаж: " + actualCount);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
