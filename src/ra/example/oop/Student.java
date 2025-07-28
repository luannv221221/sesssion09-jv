package ra.example.oop;

import java.util.Scanner;

public class Student {
    // thuộc tính đối tượng
    private String studentCode; // ST010101
    private String studentName;
    private int age;
    private String major;

    // 2 Constructor

    // constructor ko tham so

    public Student() {
    }

    // constructor day du tham so

    public Student(String studentCode, String studentName, int age, String major) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.major = major;
    }

    //

    public String getStudentCode() {
        return studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // phung thuc nhap thong tin
    public void inputData(Scanner scanner){
        System.out.println("Nhap vao ma sinh vien : ");
        this.studentCode = scanner.nextLine();
        System.out.println("Nhap vao ten sinh vien : ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhap vao tuoi sinh vien : ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao chuyen nganh : ");
        this.major = scanner.nextLine();
    }

    public void  displayData(){
        System.out.printf("Ma SV: %s - Ten SV: %s - Tuoi: %d - Chuyen nganh %s "
                ,this.studentCode, this.studentName, this.age,this.major);
    }
}
