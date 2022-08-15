package task3;

public class Plane extends Vehicle{
    int height;
    int passenger;

    public Plane(){
        super();
        this.height = 0;
    }

    public Plane(int price, int speed, int yearOfIssue, int height, int passenger){
        super(price, speed, yearOfIssue);
        this.height = height;
        this.passenger = passenger;
    }

    @Override
    public void showInfo() {
        System.out.println("Plane:");
        super.showInfo();
        System.out.println("Height - " + height + " m");
        System.out.println("Passengers - " + passenger);
    }
}
