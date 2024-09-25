package Assignment1;

import java.util.List;
import java.util.Map;

public interface StudentInterface {

    void saveStudent(Student s);

    List<Student> returnListStudent();

    int noOfStudents();

    default Map<Student,Integer> getNameFreq(){
        return null;
    }

    default List<Student> nTopStudent(int n) {
        return null;
    }

}
