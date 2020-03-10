package day16_memory_while_loop_intro;

public class StartEnd {
    public static void main(String[] args) {
        String str= "I love [java] programmer";
        System.out.println(str.substring(8,12));

        int start= str.indexOf("[");
        int end= str.indexOf("]");
        System.out.println(str.substring(start+1, end));

        //"I am [python] programmer"
        //"I wrote a [100] lines of code today"


    }
}
