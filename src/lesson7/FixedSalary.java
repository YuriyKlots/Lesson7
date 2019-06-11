package lesson7;

public class FixedSalary implements Salary {
    private int salary;

    FixedSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void salary() {
        System.out.println("Фіксована заробітна плата = " + salary + "грн.");
    }
}
