package lesson7.salary;

public class FixedSalary implements Salary {
    private int salary;

    public FixedSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void salary() {
        System.out.println("Фіксована заробітна плата = " + salary + "грн.");
    }
}
