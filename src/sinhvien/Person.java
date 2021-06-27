package sinhvien;

import java.util.Scanner;

public class Person {
    private String name;
    private String birthDay;
    private String gander;
    private String address;

    public Person() {
    }

    public Person(String name, String birthDay, String gander, String address) {
        this.name = name;
        this.birthDay = birthDay;
        this.gander = gander;
        this.address = address;
    }

    public void inputInfor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien");
        name = scanner.nextLine();
        System.out.println("Nhap ngay sinh");
        birthDay = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        gander = scanner.nextLine();
        System.out.println("Nhap dia chi");
        address = scanner.nextLine();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gander='" + gander + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
