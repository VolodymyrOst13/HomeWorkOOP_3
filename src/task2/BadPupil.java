package task2;

public class BadPupil extends Pupil{
    @Override
    void study() {
        super.study();
        System.out.println("I study Bad");
    }

    @Override
    void read() {
        super.read();
        System.out.println("I read Bad");
    }

    @Override
    void write() {
        super.write();
        System.out.println("I write Bad");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("I relax Bad");
    }
}
