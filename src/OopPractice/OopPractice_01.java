package OopPractice;

public class OopPractice_01 {

static {

}

    String name; //instance variables, object variables, fields
    String lastName;
    int age;
    static String jobTitle;
    private int salary;
    public String gender;
    protected int ssn; //it can be accessed by any class in the same package also it can be accessed
    // by subclasses in classes in other packaged


    @Override
    public String toString() {
        return "OopPractice_01{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", ssn=" + ssn +
                '}';
    }

    public void printInfo(){
        System.out.println("Her name is "+name+" "+lastName+ " and her age " +age+ " " +
                "and her job title is "+jobTitle+" and her salary is "+salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
