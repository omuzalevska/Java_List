package dev.omuzalevska.javalist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DaysOfTheWeekTest {
    private DaysOfTheWeek daysOfTheWeek;

    @BeforeEach
    public void setUp() {
        daysOfTheWeek = new DaysOfTheWeek();
        daysOfTheWeek.createWeekDaysList();
    }

    @Test
    public void testCreateWeekDaysList() {
        List<String> days = daysOfTheWeek.getWeekDays();
        assertEquals(7, days.size(), "The list should contain 7 days.");
    }

    @Test
    public void testGetWeekDays() {
        List<String> days = daysOfTheWeek.getWeekDays();
        assertTrue(days.contains("Monday"), "The list should contain 'Monday'.");
        assertTrue(days.contains("Sunday"), "The list should contain 'Sunday'.");
    }

    @Test
    public void testGetListSize() {
        int size = daysOfTheWeek.getListSize();
        assertEquals(7, size, "The list size should be 7.");
    }

    @Test
    public void testRemoveDay() {
        boolean result = daysOfTheWeek.removeDay("Monday");
        assertTrue(result, "'Monday' should be removed.");
        assertFalse(daysOfTheWeek.dayExists("Monday"), "The list should not contain 'Monday'.");
    }

    @Test
    public void testRemoveNonExistentDay() {
        boolean result = daysOfTheWeek.removeDay("Funlyday");
        assertFalse(result, "'Funlyday' does not exist and should not be removed.");
    }

    @Test
    public void testGetDay() {
        String day = daysOfTheWeek.getDay(0);
        assertEquals("Sunday", day, "The day at index 0 should be 'Monday'.");
    }

    @Test
    public void testGetDayInvalidIndex() {
        String day = daysOfTheWeek.getDay(10);
        assertNull(day, "An invalid index should return null.");
    }

    @Test
    public void testDayExists() {
        boolean exists = daysOfTheWeek.dayExists("Tuesday");
        assertTrue(exists, "The list should contain 'Tuesday'.");
    }

    @Test
    public void testDayDoesNotExist() {
        boolean exists = daysOfTheWeek.dayExists("Funlyday");
        assertFalse(exists, "The list should not contain 'Funlyday'.");
    }

    @Test
    public void testSortDays() {
        daysOfTheWeek.sortDays();
        List<String> days = daysOfTheWeek.getWeekDays();
        assertEquals("Friday", days.get(0), "The first day 'Sunday'.");
        assertEquals("Thursday", days.get(4), "The fifth day 'Friday'.");
    }

    @Test
    public void testClearList() {
        daysOfTheWeek.clearList();
        assertEquals(0, daysOfTheWeek.getListSize(), "The list should be empty.");
    }
}