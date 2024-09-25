package Assignment1;

import java.util.*;

public class MapStudentImpl implements StudentInterface{
    public Map<Student,Integer> students;

    public MapStudentImpl(){
        students = new HashMap<>();
    }

    @Override
    public Map<Student, Integer> getNameFreq() {
        return students;
    }

    @Override
    public int noOfStudents() {
        return students.size();
    }

    @Override
    public List<Student> returnListStudent() {
        return List.of(students.keySet().toArray(new Student[0]));
    }

    @Override
    public void saveStudent(Student s) {
        if(students.containsKey(s)){
            Integer countFreq = students.get(s);
            students.put(s,countFreq+1);
        } else {
            students.put(s,1);
        }
    }

    @Override
    public List<Student> nTopStudent(int n) {
        StudentInterface.super.nTopStudent(n);
        Queue<Student> queue = new PriorityQueue<>((o1,o2) -> {return students.get(o2)-students.get(o1);});

        queue.addAll(students.keySet());

        List<Student> list = new ArrayList<>();
        while (n>0) {
            list.add(queue.poll());
            n--;
        }

        return list;
    }
}


