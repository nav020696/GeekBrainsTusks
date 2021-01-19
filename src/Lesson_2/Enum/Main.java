package Lesson_2.Enum;

import java.time.DayOfWeek;


public class Main {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.SUNDAY));
    }

    static String getWorkingHours(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case MONDAY:
                return "40 часов";
            case TUESDAY:
                return "32 часа";
            case WEDNESDAY:
                return "24 часа";
            case THURSDAY:
                return "16 часов";
            case FRIDAY:
                return "8 часов";
            case SATURDAY:
                return "Сегодня выходной";
            default:
                return "Сегодня выходной, завтра на работу :(";
        }
    }
}
