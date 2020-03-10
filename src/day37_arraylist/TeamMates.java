package day37_arraylist;

import java.util.ArrayList;

public class TeamMates {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String> team = new ArrayList<>();
        team.add("May");
        team.add("Jahangir");
        team.add("Omer");
        team.add("Seyma");
        team.add("Sueda");
        team.add("Ozzy");
        team.add("Charos");
        team.add("Akif");
        team.add("Mohammed");
        team.add("Stefan");
        team.add("David");
        team.add("Gunel");
        team.add("Feruz");

        System.out.println("Team size: " + team.size());
        //print first and last person
        System.out.println(team.get(0) + " | " + team.get(9));

        System.out.println(team.get(0) + " | " + team.get(team.size() - 1));//give me last teammate

        for (String eachPerson : team) {
            System.out.println(eachPerson);

        }
        //print each value using for loop

        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i));

        }
        //print each person in reverse order
        for (int j = team.size()-1; j >= 0; j--) {
            System.out.print(team.get(j)+ " , ");

        }
        System.out.println();
        //print 2 people at a time. May | Jahangir

        for (int f = 0; f < team.size() ; f +=2) {
            if(f == team.size()-1){ // in order to get the last person by itself
                System.out.println(team.get(f));
            }else{
            System.out.println(team.get(f)+ " | "+team.get(f+1));

        }
    }
        //declare string allTeam and add everyone into that string
        //separated by- print out allTeam

        String allTeam = "";
        for(String eachPerson : team){
            allTeam += eachPerson +" - ";
        }
        allTeam = allTeam.substring(0, allTeam.length()-3);
        System.out.println("allTeam = " + allTeam);
}}