package com.company.task9;

/**
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 * Создать переменную типа Student, которая ссылается на объект типа Aspirant. (Задание с урока)
 */
public class DemoStudentAspirant {
    public static void main(String[] args) {
        Student student = new Aspirant("Петя", "Пупкин", "35", "Работа1");
        System.out.println(student);
        Student[] student1 = new Student[2];

        student1[0] = new Student("Петя1", "Пупкин9", "353");
        student1[1] = new Aspirant("Петя4", "Пупкин4", "354", "Работа12");
        for (Student st : student1) {
            st.getScholarship();
        }
    }
}
