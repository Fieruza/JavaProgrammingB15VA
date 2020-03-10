package day42_encapsulation;

public class People {
    public static void main(String[] args) {
        Person p1= new Person();
       // p1.name ="Feruz";
       // p1.age = -22;

        System.out.println(p1.toString());
        p1.setName("Feruz");
        System.out.println(p1.getName());
        System.out.println(p1.toString());

        Person p2 = new Person();
        p2.setName("Rahel");
        System.out.println(p2.getName());

        p2.setAge(-3);
        System.out.println(p2.getAge());
        p2.setAge(44);
        System.out.println("Rahel's age: "+p2.getAge());
        System.out.println(p2.toString());
    }
}
