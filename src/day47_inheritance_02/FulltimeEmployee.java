package day47_inheritance_02;

public class FulltimeEmployee extends Employee {

    public FulltimeEmployee(String name, String title, double bonus) {
        super(name, title);  // it's used to call super class constructor
        this.bonus = bonus;
    }

    public FulltimeEmployee(){
        System.out.println("Fulltime NO-ARGS Constructor");
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
