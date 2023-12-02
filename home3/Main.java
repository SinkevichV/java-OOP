import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        Student student5 = new Student(1, "bbb", "bbb", "bbb");
        Student student6 = new Student(1, "bbb", "bbb", "bbb");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup1 = new StudentGroup(studentList);
        StudentGroup studentGroup2 = new StudentGroup(studentList);
        StudentGroup studentGroup3 = new StudentGroup(studentList);
        studentGroup1.addStudent(student1);
        studentGroup2.addStudent(student2);
        studentGroup2.addStudent(student3);
        studentGroup3.addStudent(student4);
        studentGroup3.addStudent(student5);
        studentGroup3.addStudent(student6);
        
        // for (Student student : studentGroup) {
        //     System.out.println(student);
        // }
        // System.out.println();
        // for (Student student : service.getSortedStudentGroup()) {
        //     System.out.println(student);
        // }
        // System.out.println();
        // for (Student student : service.getSortedStudentGroupByFIO()) {
        //     System.out.println(student);
        // }

        

        Stream stream1 = new Stream(null, null);
        Stream stream2 = new Stream(null, null);
        Stream stream3 = new Stream(null, null);

        stream1.addStudentGroup(studentGroup1);
        stream2.addStudentGroup(studentGroup2);
        stream3.addStudentGroup(studentGroup3);

        for (StudentGroup studentGroup : stream3) {
            System.out.println(studentGroup);

        }
    }
}