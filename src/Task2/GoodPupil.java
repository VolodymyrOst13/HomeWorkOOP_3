package Task2;

public class GoodPupil extends Pupil{
    @Override
    void study() {
        super.study();
        System.out.print("Good");
    }

    @Override
    void read() {
        super.read();
        System.out.print("Good");
    }

    @Override
    void write() {
        super.write();
        System.out.print("Good");
    }

    @Override
    void relax() {
        super.relax();
        System.out.print("Good");
    }
}
