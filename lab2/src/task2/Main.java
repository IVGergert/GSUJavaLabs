package task2;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[10];

        students[0] = new Student("Аксёнов",18,true);
        students[1] = new Student("Гергерт",19,false);
        students[2] = new Student("Денгубенко",18,true);
        students[3] = new Student("Руснак",23,false);
        students[4] = new Student("Масальский",18,true);
        students[5] = new Student("Скрижендевский",25,false);
        students[6] = new Student("Криволап",20,true);
        students[7] = new Student("Новиков",19,true);
        students[8] = new Student("Емельянченко",23,false);
        students[9] = new Student("Шилец",18,true);

        int CountStudentWithArrears = 0;
        int sumAge = 0;

        for (Student student : students) {
            sumAge += student.age;
            if (student.arrears) {
                CountStudentWithArrears++;
            }
        }

        int averageAge = sumAge / students.length;

        System.out.println("Средний возраст студентов равен: " + averageAge);
        System.out.println("Количество студентов с задолженностями: " + CountStudentWithArrears);
    }
}