package sinhvien;

import java.util.Scanner;

public class Student extends Person {
    private String rollNo;
    private float mark;
    private String email;

    public Student() {
    }

    public Student(String rollNo, float mark, String email) {
        this.rollNo = rollNo;
        this.mark = mark;
        this.email = email;
    }
    public boolean checkScholarship(){
        if (mark >= 8){
            return true;
        }else return false;
    }
    public void sortSVName(){
    }
    public void sortSVMark(){

    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap rollNo");
        while (true) {
            String rollNoInput = scanner.nextLine();
            boolean check = setRollNo(rollNoInput);
            if (check) {
                break;
            }
        }
        // viet gon
//        while (!setRollNo(scanner.nextLine()));

        System.out.println("Nhap float mark");
        while (true){
            float markInput = Float.parseFloat(scanner.nextLine());
            boolean check = setMark(markInput);
            if (check){
                break;
            }
        }
        System.out.println("Nhap email");
        while (true){
            String mailInput = scanner.nextLine();
            boolean check =  setEmail(mailInput);
            if (check){
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", mark=" + mark +
                ", email='" + email + '\'' +
                '}' + super.toString();
    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if (rollNo != null && rollNo.length() == 8) {
            this.rollNo = rollNo;
            return true;
        } else {
            System.err.println("nhap sai. rollNo gom 8 ky tu");
            return false;
        }

    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.err.println("Nhap sai diem");
            return false;
        }
    }

    public String getEmail() {
            return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")){
            this.email = email;
            return true;
        }else {
            System.err.println("nhap email khong chua khoang trong va phai co @");
            return false;
        }

    }
}
