package ra.ex01.presentation;

import ra.ex01.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n*********************QUẢN LÝ SINH VIÊN********************\n" +
                    "\n" +
                    "1. Hiển thị danh sách sinh viên\n" +
                    "\n" +
                    "2. Thêm sinh viên\n" +
                    "\n" +
                    "3. Cập nhật thông tin sinh viên theo mã sinh viên\n" +
                    "\n" +
                    "4. Xóa sinh viên theo mã sinh viên\n" +
                    "\n" +
                    "5. Tìm sinh viên theo tên sinh viên\n" +
                    "\n" +
                    "6. Thoát");
            System.out.println("moi ban chọn 1 - 6");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    displayListStudent();
                    break;
                case 2:
                    createStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    searchStudentByStudentName(scanner);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui vong chon 1 - 6");
            }
        }while (true);
    }

    // phuong thuc in danh sach sinh vien
    public static void displayListStudent(){

        for (Student student : studentList) {
            student.displayData();
        }
    }
    // phuong thuc tao sinh vien
    public static void createStudent(Scanner scanner){
        System.out.println("Bạn muốn thêm mới bao nhiêu sv : ");
        int studentNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentNum; i++) {
            // buoc 1: Khoi tao doi tuong sv
            Student student = new Student();
            System.out.println("Nhap thong tin sinh vien thu : "+(i+1));
            student.inputData(scanner);
            // buoc 2: day doi tuong sinh vien vua tao vao list
            studentList.add(student);
        }
    }

    // Tim doi tuong sinh vien theo ma sv
    public static Student findStudentByStudentCode(String studentCode){
        for (Student student : studentList) {
            if(student.getStudentCode().equals(studentCode)){
               return student;
            }
        }
        return null;
    }
    // cap nhat thong tin sinh vien theo ma sv
    public static void updateStudent(Scanner scanner){
        // B1 Lay ma sinh vien do nguoi dung nhap
        System.out.println("Nhap vao ma sinh vien ");
        String studentCode = scanner.nextLine();
        Student student = findStudentByStudentCode(studentCode);
        if (student != null){
            student.inputData(scanner);
        } else {
            System.err.println("Khong tim thay sinh vien nao co ma "+studentCode);
        }

    }
    //xoa sinh vien
    public static void deleteStudent(Scanner scanner){
        // B1 lay ma sinh vien do nguoi dung nhap vao
        System.out.println("Nhap vao ma sinh vien can xoa ");
        String studentCode = scanner.nextLine();
        // tim sinh vien dua vao studentCode
        Student student = findStudentByStudentCode(studentCode);
        // xoa student tim duoc ra khoi list bang phuong thuc remove
        studentList.remove(student);
    }

    // tìm kiếm sinh viên theo tên sinh viên
    public static void searchStudentByStudentName(Scanner scanner){
        System.out.println("Nhập vào tên sinh viên cần tìm : ");
        String studentName = scanner.nextLine();
        for (Student student : studentList) {
            if(student.getStudentName().toLowerCase().contains(studentName.toLowerCase())){
               student.displayData();
            }
        }
    }
}
