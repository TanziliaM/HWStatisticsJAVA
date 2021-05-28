package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int average = 0;
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
            average = sum/sales.length;
        }
        return average;
    }

    public int calculateBelowAverage(int[] sales){
        int average = calculateAverage(sales);
        int monthCount = 0;
        for (int sale : sales)
            if (sale < average) {
                monthCount++;
            }

        return monthCount;
    }

    public int calculateAboveAverage(int[] sales) {
        int average = calculateAverage(sales);
        int monthCount = 0;
        for (int sale : sales)
            if (sale > average) {
                monthCount++;
            }

        return monthCount;
    }
}
