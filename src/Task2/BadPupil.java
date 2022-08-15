package Task2;

public class BadPupil extends Pupil{
    @Override
    void study() {
        super.study();
        System.out.print("Bad");
    }

    @Override
    void read() {
        super.read();
        System.out.print("Bad");
    }

    @Override
    void write() {
        super.write();
        System.out.print("Bad");
    }

    @Override
    void relax() {
        super.relax();
        System.out.print("Bad");
    }
}
