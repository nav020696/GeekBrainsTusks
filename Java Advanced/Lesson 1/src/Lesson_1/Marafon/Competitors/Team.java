package Lesson_1.Marafon.Competitors;

public class Team {
    private String name;
    public Competitor[] competitors;


    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public void showResults(){
        for (Competitor c: competitors) {
            c.info();
        }
    }
}
