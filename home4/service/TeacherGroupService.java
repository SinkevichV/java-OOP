package service;

import data.Teacher;
import data.UserComparator;
import data.TeacherGroup;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    public void createTeacherGroup(Teacher teacher, List<Teacher> teachers) {
        this.teacherGroup = new TeacherGroup(teacher, teachers);
    }

    public TeacherGroup getTeacherGroup() {
        return teacherGroup;
    }

    public Teacher getTeacherFromTeacherGroup(String firstName, String secondName){
        Iterator<Teacher> iterator = teacherGroup.iterator();
        List<Teacher> result = new ArrayList<>();
        while (iterator.hasNext()){
            Teacher teacher = iterator.next();
            if(teacher.getFirstName().equalsIgnoreCase(firstName)
               && teacher.getSecondName().equalsIgnoreCase(secondName)){
                result.add(teacher);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Учитель с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного учителя с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Teacher> getSortedTeacherGroup(){
        List<Teacher> teachers = new ArrayList<>(teacherGroup.getTeachers());
        Collections.sort(teachers);
        return teachers;
    }

    public List<Teacher> getSortedByFIOTeacherGroup(){
        List<Teacher> teachers = new ArrayList<>(teacherGroup.getTeachers());
        teachers.sort(new UserComparator<Teacher>());
        return teachers;
    }
}
