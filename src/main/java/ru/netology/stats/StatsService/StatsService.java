package ru.netology.stats.StatsService;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum = sum + i;
        }
        return sum;
    }

    public int midSales(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int i : sales) {
            sum = sum + i;
            month = month + 1;
        }
        return sum / month;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int downMidSales(int[] sales) {
        int midSale = midSales(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < midSale) {
                month = month + 1;
            }
        }
        return month;
    }

    public int upMidSales(int[] sales) {
        int midSale = midSales(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > midSale) {
                month = month + 1;
            }
        }
        return month;
    }
}
