import java.util.ArrayList;
import java.util.Scanner;

public class Quarter {

    private InputOutputInterface io = new DialogIO();

    private ArrayList<Team>quarter;

    public Quarter(){
        quarter = new ArrayList<Team>();
    }

    public void addTeam1(Team team1){
        quarter.add(team1);
    }

    public void addTeam2(Team team2){
        quarter.add(team2);
    }

    public Team winner(){
        int choice = io.readInt("Who wins between: "+quarter.get(0).getName() +" VS " +quarter.get(1).getName());

        if (choice == 1) {
            return quarter.get(0);
        }
        else if (choice == 2) {
            return quarter.get(1);
        }
        return null;
    }

    public String winnerString(){
        return winner().getName();
    }

    public static void main(String[] args){
        Team arg = new Team("arg");
        Team bra = new Team("bra");
        Team chi = new Team("Chi");
        Team uru = new Team("Uru");

        Quarter q1 = new Quarter();
        q1.addTeam1(chi);
        q1.addTeam2(uru);
        System.out.println(q1.winnerString());
    }
}
