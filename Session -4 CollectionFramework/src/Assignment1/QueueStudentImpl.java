package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudentImpl implements StudentInterface{
    Queue<Student> students;

    public QueueStudentImpl(){
        students = new PriorityQueue<>();
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

    @Override
    public List<Student> nTopStudent(int n) {
        List<Student> list = new ArrayList<>();
        while (n>0) {
            list.add(students.poll());
            n--;
        }
        return list;
    }

}
