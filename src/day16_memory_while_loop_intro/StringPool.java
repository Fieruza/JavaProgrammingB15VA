package day16_memory_while_loop_intro;

public class StringPool {
    public static void main(String[] args) {
        String word1= "java";  //string pool
        String word2= "java";  //srting pool re-used
        String word3= new String("java");//outside pool, in heap

        System.out.println(word1==word2);// true, both are pointing to same object in pool

        System.out.println(word1==word3); //false word3 is outside the string pool
        //false because word1 ad word3 are pointing to different object in heap.
        //when we use ==, it does not check if values are matching.
        //it only check if variables are pointing to same object in memory.

        String word4= new String("java"); //outside pool, in heap
        //check if word3 and word4 are point to same object
        System.out.println(word3==word4);

        String word5= word4;
        System.out.println(word5==word4); //true, they point to the same object in heap

        String str= "macbook"; //string pool in HEAP
        String tr2="macbook"; //re-use "macbook" in pool
        String str3= str;// point same object as str

    }

}
