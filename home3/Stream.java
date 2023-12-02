import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private String name;
    private List<StudentGroup> studentGroupList;

    public Stream(String name, List<StudentGroup> studentGroupList) {
        this.name = name;
        this.studentGroupList = studentGroupList;
    }

    public String getName() {
        return name;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }
    public void addStudentGroup(StudentGroup studentGroup){
        studentGroupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }
}
