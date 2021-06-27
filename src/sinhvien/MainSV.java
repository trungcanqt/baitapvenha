package sinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> arrayList = new ArrayList<>();
        int choose ;
        do {
            showMenu();
            System.out.println(" Chon :");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println(" nhap so luong sinh vien");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i =0; i<n;i++){
                        Student student = new Student();
                        student.inputInfor();

                        arrayList.add(student);
                    }
                    break;
                case 2:
                    for (Person e: arrayList) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("sinh vien co diem cao nhat");
                    System.out.println("sinh vien co diem cao nhat");
                    break;
                case 4:
//                    System.out.println("nhap rollNo can tim");
//                    String rollNo = scanner.nextLine();
//                    for (Student e: arrayList) {
//                        if (e.getName().equals(rollNo)) {


                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("nhap sai");
                    break;
            }

        }while (choose != 7);


    }
    public static void showMenu(){
        System.out.println("1 : nhap vao N sinh vien");
        System.out.println("2 : hien thi thong tin sinh vien");
        System.out.println("3 : hien thi sinh vien co maxmark, minmark");
        System.out.println("4 : tim kiem theo rollNo sinh vien");
        System.out.println("5 : sap xep sinh vien theo ten  A => Z");
        System.out.println("6 : hien thi sinh vien co hong bong sap xep tu cao den thap");
        System.out.println("7 : Exit");
    }
}
