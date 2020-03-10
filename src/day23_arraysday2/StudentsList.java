package day23_arraysday2;

public class StudentsList {
    public static void main(String[] args) {
        String [] students= new String[8];
        students[0]= "Rahel";
        students[1]= "May";
        students[2]= "Jahangir";
        students[3]= "Jeyhun";
        students[4]= "Ahmet";
        students[5]="Hussein";
        students[6]= "Feruz";
        students[7]= "Abu";
        //below string easier way, x Murodil cheap way
        String[] student2= {"Rahel","May","Jahangir",
                           "Jeyhun","Ahmet","Hussein",
                            "Feruz","Abu"};
        //print students count
        //"Total students: 9"
        System.out.println("Total students: " + students.length);
        //print first student:
        System.out.println("First student : " + students[0]);
        System.out.println(students[0].toUpperCase());
        //using For loop print.
        //Rahel >> 7
        //Aika >> 4
        //Tahmina >> 7
        //..
        for(int i = 0; i < students.length; i++){
            System.out.println((i+1)+". "+students[i] + " >> " + students[i].length());
        }
        //for each loop :
        for(String friend : students){
            System.out.println(friend +" >> "+ friend.length());
        }

        String friend1 = students[0];
        System.out.println("friend1 = " + friend1);
        //for each loop :
        //declare counter and set to 0
        int counter = 0;
        for(String friend : students){
            System.out.println(counter+". "+friend +" >> "+ friend.length());
            //increment ++
            counter++;
        }
        String allFriends = "";// Rahel,May

        for(String friend : students){
            allFriends += friend +", ";
        }
        //remove last ", "
        allFriends = allFriends.substring(0, allFriends.length()-2);
        System.out.println("allFriends = " + allFriends);
        //Print 2 friends at a time.

        for(int i = 0; i < students.length; i += 2){
            // System.out.println("i : " + i);
            if(i == students.length-1){ // check if i is at last index
                System.out.println(students[i]);
            }else {
                System.out.println(students[i] + ", " + students[i + 1]);
            }
        }
        //0 2 4 6 8
    }
}


