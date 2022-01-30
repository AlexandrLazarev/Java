package Task260122;

public class Student {
    public String surName;
    public String name;
    public String adress;

    Student(String surName, String name, String adress) {
        this.surName = surName;
        this.name = name;
        this.adress = adress;
    }

    void comparisonStudend(Student student, Student student2) {
        student = student;
        student2 = student2;
        if (student.surName.equals(student2.surName) && student.name.equals(student2.name) && student.adress.equals(student2.adress)) {
            System.out.println("Один и тот же студент");
        } else {
            System.out.println("Разные студенты");
        }
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Иванов", "Андрей", "г. Минск");
        Student st2 = new Student("Иванов", "Андрей", "г. Минск");
        st1.comparisonStudend(st1, st2);
    }
}




