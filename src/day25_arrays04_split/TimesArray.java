package day25_arrays04_split;

public class TimesArray {
    public static void main(String[] args) {

        //Declare 2 int arrays: time1, time2
        int[] time1={12, 45};
        int[] time2={16, 45};

        //check if time1 and time2 have valid values
        //hour -0-23 minute -0-59;
        //assume time1 and time2 have valid data


        if(time1[0] < time2[0]){
            System.out.println("Time1 is earlier "+time1[0]+":"+time1[1]);
        }else if(time2[0] < time1[0]){
            System.out.println("Time2 is earlier "+time2[0]+":"+time2[1]);
        }else if(time1[1] < time2[1]) { //compare minutes
            System.out.println("Time1 is earlier "+time1[0]+":"+time1[1]);
        }else if(time2[1] < time1[1]){
            System.out.println("Time2 is earlier "+time2[0]+":"+time2[1]);
        }else{
            System.out.println("Time1 and Time2 are same " + time1[0]+":"+time1[1]);
        }
    }
}

/*
        if time1 is earlier
        print "time1 is earlier - 10:35"
        if time2 is earlier
        print "time2 is earlier - 10:35"
        if time1 and time2 are same
        print "time1 and time2 are equal - 10:35"
         */
