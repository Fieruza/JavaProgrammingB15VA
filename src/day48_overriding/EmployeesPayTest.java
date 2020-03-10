package day48_overriding;

import day47_inheritance_02.FulltimeEmployee;

public class EmployeesPayTest {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.calculatePay(40, 65);
        Contractor contractor = new Contractor();
        contractor.calculatePay(40, 65);
        FullTimeEmployee ftEmp = new FullTimeEmployee();
        ftEmp.calculatePay(40, 65);

        System.out.println(emp.toString());
        System.out.println(contractor.toString());
        System.out.println(ftEmp.toString());
    }
}


