package Controler;

import Data.*;
import Service.*;
import View.*;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    private final StudentGroupService serviceGroup  = new StudentGroupService();

    private  final StudentGroupView studentGroupView = new StudentGroupView();





    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        serviceGroup.createStudentGroup(teacher, students);
    }



}