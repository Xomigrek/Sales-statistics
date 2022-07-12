package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        int [] sales = {5,9,7,9,1,144,5,6,3,9,8,8};
        int expected = 214;
        int actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMidSales() {
        StatsService service = new StatsService();
        int [] sales = {5,9,7,9,1,144,5,6,3,9,8,8};
        int expected = 17;
        int actual = service.midSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        int [] sales = {5,9,7,9,1,144,5,6,3,9,1,8};
        int expected = 6;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        int [] sales = {5,9,7,9,1,144,5,6,3,9,1,8};
        int expected = 11;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDownMidSales() {
        StatsService service = new StatsService();
        int [] sales = {5,9,7,9,1,144,5,6,3,9,8,8};
        int expected = 11;
        int actual = service.downMidSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testUpMidSales() {
        StatsService service = new StatsService();
        int [] sales = {5,9,7,9,1,144,5,6,3,9,8,8};
        int expected = 1;
        int actual = service.upMidSales(sales);
        Assertions.assertEquals(expected, actual);
    }

}
