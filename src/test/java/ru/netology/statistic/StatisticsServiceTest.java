//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    public StatisticsServiceTest() {
    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = new long[]{12L, 5L, 8L, 4L, 5L, 3L, 8L, 6L, 11L, 11L, 12L};
        long expected = 12L;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfNotFirst() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = new long[]{1L, 5L, 8L, 4L, 5L, 3L, 8L, 6L, 11L, 11L, 12L};
        long expected = 12L;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}
