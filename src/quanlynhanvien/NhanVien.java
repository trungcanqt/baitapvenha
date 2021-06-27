package quanlynhanvien;

import java.util.Scanner;

public class NhanVien {
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String mail;
    private double salary;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String gender, String phone, String mail, double salary) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.mail = mail;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double doanhThu(){
        return salary*8;
    }
    public void inputNhanVien(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap ten nhan vien");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi nhan vien");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh nhan vien");
        gender = scanner.nextLine();
        System.out.println("Nhap sdt nhan vien");
        phone = scanner.nextLine();
        System.out.println("Nhap email nhan vien");
        mail = scanner.nextLine();
        System.out.println("Nhap ten nhan vien");
        salary = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", salary=" + salary +
                '}';
    }
}
