package day17_while_do_while_loop;

public class Alphabet {
    public static void main(String[] args) {

        char reversed= 'z';
        while(reversed>='a'){
        System.out.println(reversed + " ");
        reversed--;

        }
        System.out.println();
        String letters= "";
        char l= 'A';
        letters +=l;
        l='B';
        letters +=l;
        System.out.println("letters =" + letters);

        char myLetter= 'A';
        String alphabet="";

        while(myLetter <= 'Z') {
            //attach/concatenate myLetter to alphabet
alphabet += myLetter;
            //print alphabet
            System.out.println(alphabet);
            //increase myLetter by one
            myLetter++;
        }
        }
    }
