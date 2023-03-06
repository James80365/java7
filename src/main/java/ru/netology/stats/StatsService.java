package ru.netology.stats;

public class StatsService {

    private long average;

    public long sumSales(long[] sales) {
        long allsale = 0;

        for (long sale : sales) {
            allsale = allsale + sale;
        }
        return allsale;
    }

    public long average(long[] sales) {

        long average = sumSales(sales) / 12;

        return average;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long maximum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximum) {
                maxMonth = i;
                maximum = sales[i];
            }
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        long minimum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimum) {
                minMonth = i;
                minimum = sales[i];

            }
        }
        return minMonth + 1;
    }


    public int lessAverageMonth(long[] sales) {
        int count = 0;
        for (long sale : sales) {

            if (sale < average(sales)) {
                count++;

            }
        }
        return count;

    }


    public int moreAverageMonth(long[] sales) {
        int count = 0;
        for (long sale : sales) {

            if (sale > average(sales)) {
                count++;

            }
        }
        return count;

    }
}





