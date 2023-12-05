package controller;

import data.Teacher;
import service.TeacherGroupService;
import service.TeacherService;
import view.TeacherView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService dataService = new TeacherService();
    private final TeacherGroupService teacherGroupService = new TeacherGroupService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void createTeacherGroup(Teacher teacher, List<Teacher> teachers){
        teacherGroupService.createTeacherGroup(teacher, teachers);
        teacherView.sendOnConsoleUserGroup(teacherGroupService.getTeacherGroup());
    }

    public void getTeacherInTeacherGroup(String firstName, String secondName){
        Teacher teacher = teacherGroupService.getTeacherFromTeacherGroup(firstName, secondName);
        teacherView.sendOnConsole(Collections.singletonList(teacher));
    }

    public void getSortedListTeacherFromTeacherGroup(){
        List<Teacher> teachers = teacherGroupService.getSortedTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }

    public void getSortedListByFIOTeacherFromTeacherGroup(){
        List<Teacher> teachers = teacherGroupService.getSortedByFIOTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }

    


}
