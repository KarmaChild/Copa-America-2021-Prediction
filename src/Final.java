import java.util.ArrayList;
import java.util.Scanner;

public class Final {

    private InputOutputInterface io = new DialogIO();

    private ArrayList<Team>Final;

    public Final(){
        Final = new ArrayList<Team>();
    }

    public void addTeam1(Team team1){
        Final.add(0,team1);
    }

    public void addTeam2(Team team2){
        Final.add(1,team2);
    }
    
    public Team winner(){
        Scanner scan = new Scanner(System.in);
        int choice = io.readInt("Who wins between: "+Final.get(0).getName() +" VS " +Final.get(1).getName());

        if (choice == 1) {
            return Final.get(0);
        }
        else if (choice == 2) {
            return Final.get(1);
        }
        return null;
    }

    public String winnerString() {
        return winner().getName();
    }
}
