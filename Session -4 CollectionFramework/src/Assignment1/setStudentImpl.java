package Assignment1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setStudentImpl implements StudentInterface{
    Set<Student> students;

    public setStudentImpl() {
        this.students = new TreeSet<>();
    }

    @Override
    public void saveStudent(Student s) {
        students.add(s);
    }

    @Override
    public List<Student> returnListStudent() {
        return List.of(students.toArray(new Student[0]));
    }

    @Override
    public int noOfStudents() {
        return students.size();
    }
}
