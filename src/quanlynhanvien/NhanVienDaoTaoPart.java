package quanlynhanvien;

import java.util.Scanner;

public class NhanVienDaoTaoPart extends NhanVien{
    private double timeLv;

    public NhanVienDaoTaoPart() {
    }

    public NhanVienDaoTaoPart(double timeLv) {
        this.timeLv = timeLv;
    }

    public double getTimeLv() {
        return timeLv;
    }

    public void setTimeLv(double timeLv) {
        this.timeLv = timeLv;
    }

    @Override
    public double doanhThu() {
        return getSalary()*timeLv;
    }

    @Override
    public String toString() {
        return "NhanVienDaoTaoPart{" +
                "timeLv=" + timeLv +
                '}' + super.toString();
    }

    @Override
    public void inputNhanVien() {
        Scanner scanner = new Scanner(System.in);
        super.inputNhanVien();
        System.out.println("nhap thoi gian lam viec");
        timeLv = Double.parseDouble(scanner.nextLine());
    }
}
