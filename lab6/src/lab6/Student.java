package lab6;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

    private final String lastName;
    private final int age;
    private final boolean arrears;

    public Student(String lastName, int age, boolean arrears) {
        this.lastName = lastName;
        this.age = age;
        this.arrears = arrears;
    }

    public int getAge() {
        return age;
    }

    public boolean isArrears() {
        return arrears;
    }

    public String getLastName() {
        return lastName;
    }


    public static double calculateAverageAge(List<Student> students) {
        if (students.isEmpty()){
            return 0;
        }
        int sum = 0;
        for (Student student : students){
            sum += student.getAge();
        }

        return (double) sum / students.size();
    }

    public static long countStudentsWithArrears(List<Student> students) {
        int count = 0;
        for (Student student : students) {
            if (student.isArrears()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Студент[" + "Фамилия= " + lastName + ", Возраст=" + age + ", Наличие задолженностей=" + (arrears ? "Да" : "Нет") + "]";
    }
}
