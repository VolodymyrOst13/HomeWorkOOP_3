package task3;

public class Vehicle {
    private int price;
    private int speed;
    private int yearOfIssue;

    public Vehicle(){
    }

    public Vehicle(int price, int speed, int yearOfIssue) {
        this.price = price;
        this.speed = speed;
        this.yearOfIssue = yearOfIssue;
    }

    public void showInfo() {
        System.out.println("Price - " + price + " $");
        System.out.println("Speed - " + speed + " km/h");
        System.out.println("Year of issue - " + yearOfIssue);
    }
}
