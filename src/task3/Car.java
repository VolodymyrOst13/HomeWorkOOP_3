package task3;

public class Car extends Vehicle{
    public Car(){
        super();
    }

    public Car(int price, int speed, int yearOfIssue){
        super(price, speed, yearOfIssue);
    }

    @Override
    public void showInfo() {
        System.out.println("Car:");
        super.showInfo();
    }
}
