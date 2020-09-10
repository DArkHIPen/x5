public class Aspirant extends Student {

    Aspirant(){}

    Aspirant(String firstName, double averageMark){
        super(firstName, averageMark);
    }

    public int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
