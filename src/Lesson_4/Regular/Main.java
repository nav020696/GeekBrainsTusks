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
//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("Введите пароль");
//            String password = reader.readLine();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        System.out.println(checkPassword("paSsword"));
    }

    static boolean checkPassword(String password){
        Pattern p1 = Pattern.compile("^.*[A-Z].*$"); //должна быть заглавная буква
        //Pattern p2 = Pattern.compile("[a-z]&&[A-Z]&&[0-9]"); //должна быть заглавная буква
        Pattern p2 = Pattern.compile("^.*[0-9].*$"); //должны быть хотя бы 1 цифра
        //Pattern p3 = Pattern.compile("\b\S\S\S\S\S\S\S\S\b"); //должны быть хотя бы 1 цифра
        Matcher m1 = p2.matcher(password);
        return m1.matches();
    }
}
