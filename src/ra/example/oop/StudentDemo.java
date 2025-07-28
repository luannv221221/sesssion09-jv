package ra.example.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // khoi tạo đối tượng
        // Khởi tạo từ Constructor ko tham số
//        Student student1 = new Student();

        // truy cập vào thuộc tính
//        student1.inputData(scanner);

//        student1.displayData();

        // Khoi tao constructor co day du tham so
        Student student1 = new Student("B01","Cap Quang Huy",20,"IT");
        Student student2 = new Student("B02","Cap Quang Linh",20,"IT");
        student2.setAge(30);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.remove(student2);
        for (Student student : list) {
           student.displayData();

        }
    }
}
