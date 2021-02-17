package Lesson_4.Regular;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1 Должна быть заглавная буква
//2 Должна быть хотябы 1 цифра
//3 Минимум 8 символов
//4 Латиница
//5 Спец. символ

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите пароль");
            String password = reader.readLine();
            System.out.println(checkPassword(password));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static boolean checkPassword(String password){
        Pattern p1 = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])+.{8,}"); //?= - значит логическое выражение (блок)
        Matcher m1 = p1.matcher(password);
        return m1.matches();
    }
}
