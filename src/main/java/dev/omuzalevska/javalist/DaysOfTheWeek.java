package dev.omuzalevska.javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysOfTheWeek {
    private List<String> weekDays;

    public DaysOfTheWeek() {
        this.weekDays = new ArrayList<>();
    }

    public void createWeekDaysList() {
        weekDays.clear(); 
        Collections.addAll(weekDays, "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
    }

    public List<String> getWeekDays() {
        return new ArrayList<>(weekDays); 
    }

    public int getListSize() {
        return weekDays.size();
    }

    public boolean removeDay(String day) {
        return weekDays.remove(day);
    }

    public String getDay(int index) {
        if (index >= 0 && index < weekDays.size()) {
            return weekDays.get(index);
        }
        return null; 
    }

    public boolean dayExists(String day) {
        return weekDays.contains(day);
    }

    public void sortDays() {
        Collections.sort(weekDays);
    }

    public void clearList() {
        weekDays.clear();
    }
}