package day63_last_day;

public class TestImmutable {
    public static void main(String[] args) {
        //new object of Immutable class

        ImmutableClass imObj = new ImmutableClass("bye bye java");
        System.out.println(imObj.toString());
        System.out.println(imObj.getComment());

        //imObj.setComment ("hello java");
        String str = "java";

        imObj = new ImmutableClass("hello java");  // new object

        MutableClass mtb = new MutableClass("bye bye Muradel");
        mtb.setComment("Hello Java");
        System.out.println(mtb.getComment());
        mtb.append("Code Java!").append("Talk Java").append("Bye Java!");
        System.out.println(mtb.getComment());

    }
}
