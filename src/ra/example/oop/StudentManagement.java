package ra.example.oop;

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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

        }
    }
}
