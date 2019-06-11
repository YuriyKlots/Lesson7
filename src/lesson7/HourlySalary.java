package lesson7;

public class HourlySalary implements Salary {
    private int price;
    private int time;

    HourlySalary(int price, int time) {
        this.price = price;
        this.time = time;
    }

    @Override
    public void salary() {
        System.out.println("Погодинна оплата = " + price * time + "грн.");

    }
}
