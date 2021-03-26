package me.study.programmers.levelone;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Year2016 {

    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.name().substring(0, 3);
    }

}
