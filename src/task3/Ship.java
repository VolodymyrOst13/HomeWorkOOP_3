package task3;

public class Ship extends Vehicle{
    int port;
    int passenger;

    public Ship(){
        super();
    }

    public Ship(int price, int speed, int yearOfIssue, int port, int passenger){
        super(price, speed, yearOfIssue);
        this.port = port;
        this.passenger = passenger;
    }

    @Override
    public void showInfo() {
        System.out.println("Ship:");
        super.showInfo();
        System.out.println("Port - " + port);
        System.out.println("Passengers - " + passenger);
    }
}
