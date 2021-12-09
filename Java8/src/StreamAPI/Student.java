package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Student {
    private int id;
    private String name;
    private boolean gender;//true - male, false - female
    private int age;

    public Student() {
    }

    public Student(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        setGender(gender);
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        if(gender == true){
            return "male";
        }else{
            return "female";
        }
    }

    public void setGender(String gender) {
        if(gender.equals("male")){
            this.gender = true;
        }else {
            this.gender = false;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showStudent(){
        System.out.println("ID: " + id +
                "\nName: " + name +
                "\nGender: " + getGender() +
                "\nAge: " + age);
    }
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"Nguyễn Văn A","male", 25));
        studentList.add(new Student(2,"Hoàng Văn B","male", 18));
        studentList.add(new Student(3,"Lý Văn C","male", 21));
        studentList.add(new Student(4,"Đinh Ngọc D","male", 16));
        studentList.add(new Student(5,"Nguyễn Văn E","male", 17));
        studentList.add(new Student(6,"Nguyễn Văn F","male", 23));
        studentList.add(new Student(7,"Nguyễn Văn G","male", 20));
        studentList.add(new Student(8,"Phạm Thị H","female", 56));
        studentList.add(new Student(9,"Nguyễn Văn I","male", 22));
        studentList.add(new Student(10,"Nguyễn Thị J","female", 19));

        studentList.stream().filter(student -> student.getGender() == "male").forEach(student -> student.showStudent());
        System.out.println("\n\nCount students with age > 20: " + studentList.stream().filter(student -> student.getAge() > 20).count());
    }
}
