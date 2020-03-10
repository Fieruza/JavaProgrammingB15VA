package OopPractice;

public class OopPracticeTest {
    public static void main(String[] args) {

        OopPractice_01 obj1 = new OopPractice_01();
        obj1.name = "Feruz";
        obj1.lastName = "Tedla";
        obj1.age = 31;
        OopPractice_01.jobTitle = "SDET";

        obj1.printInfo();

        OopPractice_01 obj2 = new OopPractice_01();
        obj2.name = "Ahmet";
        obj2.lastName = "Toran";
        obj2.age = 29;
        obj2.jobTitle = "Developer";
        obj1.jobTitle = "Teacher";
        OopPractice_01.jobTitle = "Student";

        obj2.printInfo();
        obj1.printInfo();

        obj2.setSalary(100000);


    }
}
