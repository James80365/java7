package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSumSales() {
        StatsService Service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = Service.sumSales(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testAverage() {
        StatsService Service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = Service.average(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxMounth() {
        StatsService Service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long  actual = Service.maxSales(sales) ;
        Assertions.assertEquals(expected, actual);
}

    @Test
    public void minMounth() {
        StatsService Service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long  actual = Service.minSales(sales) ;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void lessAverageMonth() {
        StatsService Service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long  actual = Service.lessAverageMonth(sales) ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreAverageMonth() {
        StatsService Service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long  actual = Service.moreAverageMonth(sales) ;
        Assertions.assertEquals(expected, actual);
    }
}