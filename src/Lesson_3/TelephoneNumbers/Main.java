package Lesson_3.TelephoneNumbers;

public class Main {
    public static void main(String[] args) {
        TelephoneNumbers telephoneNumbers = new TelephoneNumbers();
        telephoneNumbers.add("Сидоров", "+7(999)921-45-84", "+7(921)833-82-92", "+7(922)223-54-33");
        telephoneNumbers.add("Осипов", "+7(900)855-43-33", "+7(921)000-22-22");
        telephoneNumbers.add("Алжиров", "+7(989)845-32-33");

        telephoneNumbers.get("Алжиров");
        System.out.println();
        telephoneNumbers.get("Анищенко");
    }
}
