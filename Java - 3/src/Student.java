public class Student {
    String firstName, lastName, group;
    double averageMark;

    Student(){}

    Student(String firstName, double averageMark){
        this.firstName = firstName;
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        if (averageMark == 5){
            return 100;
        }
        else{
            return 80;
        }
    }
}
