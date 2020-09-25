package University;

public class Aspirant extends Student {

    private String nameOfStudy;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String nameOfStudy) {
        super(firstName, lastName, group, averageMark);
        this.nameOfStudy = nameOfStudy;
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
