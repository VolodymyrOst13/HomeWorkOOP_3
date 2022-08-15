package task2;

public class ClassRoom {
    public Pupil[] classRoom;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.classRoom = new Pupil[]{pupil1, pupil2, pupil3, pupil4};
    }
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(
                new ExcelentPupil(),
                new GoodPupil(),
                new BadPupil(),
                new BadPupil()
        );

        classRoom.showClassRoom();

    }public void showClassRoom() {
        for (Pupil pupil: classRoom) {
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println();
        }



    }

}
