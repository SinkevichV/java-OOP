import Controler.Controler;
import Data.Student;
import Data.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1","1","1");
        controler.createStudent("2", "2","2","2");
        controler.getAllStudent();
        controler.createStudent("3", "3","3","3");
        controler.createStudent("4", "4","4","4");
        controler.getAllStudent();
        controler.createStudentGroup(new Teacher("3", "3", "3", "3", 1),
                (List<Student>) new Student("1", "1", "1", "1",5));

    }
}