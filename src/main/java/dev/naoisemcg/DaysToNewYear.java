package dev.naoisemcg;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class DaysToNewYear {
    private String days;

    public Days daysToNewYear(LocalDate fromDate) {
        LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
        return Days.daysBetween(fromDate, newYear);
    }
}
