import java.util.ArrayList;
import java.util.*;

public class copaSystem {

    private InputOutputInterface io = new DialogIO();

    public copaSystem(Table north, Table south){
        Quarter quarter1 = new Quarter();
        quarter1.addTeam1(north.getFirst());
        quarter1.addTeam2(south.getFourth());

        Quarter quarter2 = new Quarter();
        quarter2.addTeam1(north.getSecond());
        quarter2.addTeam2(south.getThird());

        Quarter quarter3 = new Quarter();
        quarter3.addTeam1(south.getFirst());
        quarter3.addTeam2(north.getFourth());

        Quarter quarter4 = new Quarter();
        quarter4.addTeam1(south.getSecond());
        quarter4.addTeam2(north.getThird());

        /* SEMI */

        Semi semi1 = new Semi();
        semi1.addTeam1(quarter1.winner());
        semi1.addTeam2(quarter2.winner());

        Semi semi2 = new Semi();
        semi2.addTeam1(quarter3.winner());
        semi2.addTeam2(quarter4.winner());

        /* FINAL */

        Final Final = new Final();
        Final.addTeam1(semi1.winner());
        Final.addTeam2(semi2.winner());
        io.outputString("\n"+Final.winnerString()+ " are Copa America 2021 Champions!!");
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

        Table GroupB = new Table(argentina,chile,uruguay,paraguay,bolivia);
        Table GroupA = new Table(brazil,colombia,ecuador,venezuela,peru);

        copaSystem copa = new copaSystem(GroupA,GroupB);
    }
}
