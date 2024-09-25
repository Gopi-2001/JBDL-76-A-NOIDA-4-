package Assignment1;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
       this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name +
                "', age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();
    }
}
