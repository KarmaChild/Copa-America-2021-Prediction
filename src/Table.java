import java.util.ArrayList;
import java.util.TreeMap;

public class Table {
    private ArrayList<Team>standings;

    private InputOutputInterface io = new DialogIO();

    private TreeMap<Integer,Team>teamTreeMap;

    public Table(Team team1,Team team2,Team team3,Team team4,Team team5,String group){

        teamTreeMap = new TreeMap<Integer,Team>();

        teamTreeMap.put(1,team1);
        teamTreeMap.put(2,team2);
        teamTreeMap.put(3,team3);
        teamTreeMap.put(4,team4);
        teamTreeMap.put(5,team5);

        String[] teams = {team1.getName(),team2.getName(),team3.getName(),team4.getName(),
        team5.getName()};

        int group1 = io.readChoice(teams,"Select the group winner",group);
        int group2 = io.readChoice(teams, "Select group 2nd place",group);
        int group3 = io.readChoice(teams,"Select group 3rd place",group);
        int group4 = io.readChoice(teams,"Select group 4th place",group);
        int group5 = io.readChoice(teams,"Select group 5th place",group);

        standings = new ArrayList<Team>();
        standings.add(0, teamTreeMap.get(group1));
        standings.add(1,teamTreeMap.get(group2));
        standings.add(2,teamTreeMap.get(group3));
        standings.add(3,teamTreeMap.get(group4));
        standings.add(4,teamTreeMap.get(group5));
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
        Team argentina = new Team("Argentina");
        Team bolivia = new Team("Bolivia");
        Team chile = new Team("Chile");
        Team uruguay = new Team("Uruguay");
        Team brazil = new Team("Brazil");
        Team paraguay = new Team("Paraguay");
        Team colombia = new Team ("Colombia");
        Team ecuador = new Team("Ecuador");
        Team peru = new Team("Peru");
        Team venezuela = new Team("Venezuela");

        Table table = new Table(argentina,chile,bolivia,uruguay,paraguay,"Group B");

        System.out.println(table.standings.get(0).getName()+
                table.standings.get(1).getName()+
                table.standings.get(2).getName()+
                table.standings.get(3).getName()+
                table.standings.get(4).getName());

    }
}
