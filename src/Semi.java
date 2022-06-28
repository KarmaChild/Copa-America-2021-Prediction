import java.util.ArrayList;
import java.util.Scanner;

public class Semi {

    private InputOutputInterface io = new DialogIO();

    private ArrayList<Team> semi;

    public Semi(){
        semi = new ArrayList<Team>();
    }

    public void addTeam1(Team team1){
        semi.add(team1);
    }

    public void addTeam2(Team team2){
        semi.add(team2);
    }
    public Team winner(){
        Scanner scan = new Scanner(System.in);
        int choice = io.readInt("Who wins between: "+semi.get(0).getName() +" VS " +semi.get(1).getName(),"Semi Final");

        if (choice == 1) {
            return semi.get(0);
        }
        else if (choice == 2) {
            return semi.get(1);
        }
        return null;
    }

    public String winnerString() {
        return winner().getName();
    }

    public static void main(String[] args){
        Team arg = new Team("arg");
        Team bra = new Team("bra");
        Team chi = new Team("Chi");
        Team uru = new Team("Uru");

        Semi s1 = new Semi();
        s1.addTeam1(chi);
        s1.addTeam2(uru);
        System.out.println(s1.winnerString());
        }
    }
