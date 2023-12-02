import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    private int counter;
    
    public StreamIterator(Stream stream) {
        this.studentGroupList = stream.getStudentGroupList();
        counter = 0;
    }

    public StreamIterator() {
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }
    @Override
    public StudentGroup next() {
        if(hasNext()){
            return studentGroupList.get(counter++);
        }
        return null;
    }
}
