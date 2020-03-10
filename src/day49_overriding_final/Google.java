package day49_overriding_final;

public class Google extends SearchEngine {

    public int search (String item){
        System.out.println("Googling for..."+item+"\nreturning results count");
        return item.length()*2;
    }
    protected void getResults(){
        System.out.println("Google displaying results...");
    }
}
