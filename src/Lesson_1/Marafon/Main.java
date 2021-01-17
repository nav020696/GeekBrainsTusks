package Lesson_1.Marafon;

import Lesson_1.Marafon.Competitors.*;
import Lesson_1.Marafon.Obstacle.*;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Pirats", new Dog("Av"), new Cat("Vaska"), new Dog("Pipi"), new Human("Oleg"), new Human("Alex"));
        Course course = new Course(new Cross(30), new Wall(9), new Water(4), new Cross(10));
        course.doIt(team);
        team.showResults();
    }
}