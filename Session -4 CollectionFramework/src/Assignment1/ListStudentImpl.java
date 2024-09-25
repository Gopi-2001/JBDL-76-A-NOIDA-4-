package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class ListStudentImpl implements StudentInterface{
    List<Student> students;

    public ListStudentImpl(){
        students = new ArrayList<>();
    }

    @Override
    public void saveStudent(Student s) {
        students.add(s);
    }

    @Override
    public List<Student> returnListStudent() {
        return students;
    }

    @Override
    public int noOfStudents() {
        return students.size();
    }

}
