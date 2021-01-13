package Lesson_1.Marafon.Obstacle;

import Lesson_1.Marafon.Competitors.Competitor;
import Lesson_1.Marafon.Competitors.Team;

public class Course {
    Obstacle[] obstacle;

    public Course(Obstacle... obstacle) {
        this.obstacle = obstacle;
    }

    public void doIt(Team team){
        for (Competitor c: team.competitors) {
            for (Obstacle o: obstacle) {
                if (c.isOnDistance()){
                    o.doIt(c);
                }else{
                    break;
                }
            }
        }
    }
}
