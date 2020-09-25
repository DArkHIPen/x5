package University;

public class StudentsMain {
    public static void main(String[] args) {

        Student[] students = new Student[]{new Student("Иванов", "Ростислав", "2-A", 4.1),
                new Aspirant("Сидоров", "Яр", "5-Ф", 5.0, "Изучение генома человека.")};

        for (Student student : students) {
            System.out.println("Стипендия студента по фамилии " + student.getFirstName() +
                    " равна " + student.getScholarship() + " рублям.");
        }


    }
}
