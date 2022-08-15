package task2;

public class GoodPupil extends Pupil{
    @Override
    void study() {
        super.study();
        System.out.println("I study good");
    }

    @Override
    void read() {
        super.read();
        System.out.println("I read good");
    }

    @Override
    void write() {
        super.write();
        System.out.println("I write good");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("I relax good");
    }
}
