import java.util.ArrayList;

public class Table {
    private ArrayList<Team>standings;

    public Table(Team team1,Team team2,Team team3,Team team4,Team team5){
        standings = new ArrayList<Team>();
        standings.add(team1);
        standings.add(team2);
        standings.add(team3);
        standings.add(team4);
        standings.add(team5);
    }

    public Team getFirst(){
        return standings.get(0);
    }

    public Team getSecond(){
        return standings.get(1);
    }

    public Team getThird(){
        return standings.get(2);
    }

    public Team getFourth(){
        return standings.get(3);
    }

    public Team getFifth(){
        return standings.get(4);
    }


    public static void main(String[] args){
    }
}
