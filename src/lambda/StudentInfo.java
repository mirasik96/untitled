package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student student : al) {
            if (pr.test(student)) {
                System.out.println(student);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentMixedCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 3, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student student) {
//                return student.age < 30;
//            }
//        });
        System.out.println("------------------");
        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';
        info.testStudents(students, p1.and(p2));
        info.testStudents(students, p1.or(p2));
        info.testStudents(students, p1.negate());

        info.testStudents(students, (Student s) -> {return s.age > 30;});
        info.testStudents(students, s -> s.age > 30);
//        info.printStudentsOverGrade(students, 8);
//        System.out.println("------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("------------------");
//        info.printStudentMixedCondition(students, 20, 9.5, 'f');

        Function<Student, Double> f = student -> student.avgGrade;
        double res = avfOfSmth(students, student -> student.avgGrade);
        System.out.println(res);

    }

    private static double avfOfSmth(List<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (Student s : list) {
            result += function.apply(s);
        }
        result = result/list.size();
        return result;
    }

}

//interface StudentChecks {
//    boolean check(Student student);
//}
//
//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student student) {
//        return student.avgGrade > 8;
//    }
//}
