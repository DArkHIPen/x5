public class StudentsMain {
    public static void main(String[] args) {
        Student Vasiliy =  new Aspirant();

        Student[] students = new Student[]{new Student("Иванов",5),
                new Aspirant("Сидоров",3.4)};

        for (Student student : students) {
            System.out.println("Стипендия " + student.firstName +
                    " равна " + student.getScholarship() + " рублям.");
        }



    }
}
