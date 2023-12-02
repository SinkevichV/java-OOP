import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream stream1, Stream stream2) {
       int countStream1 = stream1.getStudentGroupList().size();
       int countStream2 = stream2.getStudentGroupList().size();
       return Integer.compare(countStream1, countStream2);
    }
}
