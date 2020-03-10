package day17_while_do_while_loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        //print 1- 10 using do while loop

        int n=0;
        do{
            System.out.println(n);//(n++)
            n++;
        }while(n<=10);

        //print 0-100 every other number
        //0 2 4 6 8 10
        int n1=0;
        do{
            System.out.println(n1+" ");
            n1+=2;
        }while(n1<=100);

    }
}
