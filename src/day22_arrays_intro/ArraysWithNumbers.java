package day22_arrays_intro;

public class ArraysWithNumbers {
    public static void main(String[] args) {
        //declare numsArray with 5 numbers
        //assign values to each index
        int[] numsArray = new int[5];
        numsArray[0] = 123;
        numsArray[1] = 345;
        numsArray[2] = 33;
        numsArray[3] = 10;
        numsArray[4] = numsArray[0] + numsArray[1]; //468

        //declare and assign values in same statement

        int[] numsArray2 = {44, 12, 44, 66, 55, 88};

        //declare and assign values in same statement using new keyword
        int[] numsArray3 = new int[]{33, 55, 6, 1, 42, 54, 900, 324};

        //declare 3 int variables and assign values
        int n1 = 23;
        int n2 = 45;
        int n3 = 10;

        int[] numsArray4 = {n1, n2, n3, 4};

        //print size of each array
        //numsArray4= 5;

        System.out.println("numsArray  = " + numsArray.length);
        System.out.println("numsArray2 = " + numsArray2.length);
        System.out.println("numsArray3 = " + numsArray3.length);
        System.out.println("numsArray4 = " + numsArray4.length);

        //read from array
        System.out.println(numsArray[0]);//123
        int j = 0;
        System.out.println(numsArray[j]);//123
        //print last one
        int l1 = numsArray.length;
        System.out.println(numsArray[l1 - 1]);

        System.out.println(numsArray[numsArray.length - 1]); //with nested loop

        //print all numebers using a for loop

        for (int i = 0; i < numsArray.length; i++) {
            System.out.println(numsArray[i] + ", ");
        }

        System.out.println();

        //print the number if it is more than 100
        for (int n = 0; n < numsArray.length; n++) {
            if (numsArray[n] > 100) {
                System.out.println(numsArray[n] + " | ");
            }

        }
        System.out.println();
        //print array items in reverse in same line
        for (int i = numsArray.length;i >=0; i--) {
                System.out.println(numsArray[i] + ", ");

            }
        }
    }


