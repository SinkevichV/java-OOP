package Service;


import Data.Student;
import Data.StudentGroup;
import Data.Teacher;

import java.util.List;

public class StudentGroupService {

    private List<StudentGroup> studentGroupList;
    public void createStudentGroup(Teacher teacher, List<Student> students) {
        new StudentGroup(teacher, students);
    }


}