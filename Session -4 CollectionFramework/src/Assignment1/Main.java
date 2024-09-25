package Assignment1;

import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //StudentInterface studentDoubt = new ListStudentImpl();
        //StudentInterface studentDoubt = new SetStudentImpl();
        //StudentInterface studentDoubt = new MapStudentImpl();
        StudentInterface studentDoubt = new QueueStudentImpl();

        Student student1 = new Student(1,"amit",20);
        Student student2 = new Student(2,"Shyam",20);
        Student student3 = new Student(3,"Sudhir",20);
        Student student4 = new Student(4,"rohan",20);
        Student student5 = new Student(5,"punit",20);
        Student student6 = new Student(6,"amit",20);

        studentDoubt.saveStudent(student1);
        studentDoubt.saveStudent(student2);
        studentDoubt.saveStudent(student3);
        studentDoubt.saveStudent(student1);
        studentDoubt.saveStudent(student4);
        studentDoubt.saveStudent(student5);
        studentDoubt.saveStudent(student6);
        studentDoubt.saveStudent(student6);
        studentDoubt.saveStudent(student6);
        studentDoubt.saveStudent(student6);
        studentDoubt.saveStudent(student6);
        studentDoubt.saveStudent(student2);
        studentDoubt.saveStudent(student3);

        System.out.println("List of students: " + studentDoubt.returnListStudent());
        System.out.println("Total no of students: " + studentDoubt.noOfStudents());
        System.out.println("List of top students : " + studentDoubt.nTopStudent(2));

        try {
            Map<Student, Integer> nameFreq = studentDoubt.getNameFreq();
            Iterator<Map.Entry<Student, Integer>> iterator = nameFreq.entrySet().iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
    }
}
