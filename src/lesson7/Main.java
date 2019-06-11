package lesson7;

import lesson7.salary.FixedSalary;
import lesson7.salary.HourlySalary;
import lesson7.salary.Salary;

public class Main {
    public static void main(String[] args) {
        Salary first = new HourlySalary(100, 36);
        first.salary();
        Salary second = new FixedSalary(4173);
        second.salary();
    }
}


