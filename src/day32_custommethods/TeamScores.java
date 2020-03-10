package day32_custommethods;

public class TeamScores {
    public static void main(String[] args) {
        int [][] teamScores ={{8, 5, 19, 0, 4},{7, 2, 2, 8, 6},
                              {5, 3, 5, 4, 1,},{2, 7, 7, 5, 9}};
        int sumTeamScore =0;
        int winner = -1;

        for (int team = 0; team < teamScores.length; team++) {
            int sum= 0;
            for (int score = 0; score < teamScores[team].length ; score++) {
                sum += teamScores[team][score];
            }
            System.out.println("Team: "+team+" Sum: "+ sum );
            if(sum > sumTeamScore){
                sumTeamScore = sum;
                winner = team;
            }
        }
        System.out.println("Winner Team : "+winner+ " with score");
    }
}
