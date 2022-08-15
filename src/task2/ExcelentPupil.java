package task2;

public class ExcelentPupil extends Pupil{

    @Override
    void study() {
        super.study();
        System.out.println("I study excelent");
    }

    @Override
    void read() {
        super.read();
        System.out.println("I read Excelent");
    }

    @Override
    void write() {
        super.write();
        System.out.println("I write Excelent");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("I relax Excelent");
    }
}
