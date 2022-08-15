package task3;

public class Main {
    public static void main(String[] args) {
        Plane boeing77 = new Plane(12000000, 1200, 2022, 12000, 180);
        boeing77.showInfo();

        System.out.println();

        Car mazerati = new Car(85000, 320,2021);
        mazerati.showInfo();

        System.out.println();

        Ship tatiana = new Ship(89000000, 40, 2019, 1200, 40);
        tatiana.showInfo();
    }
}
