package quanlynhanvien;

public class NhanVienTuyenSinh extends NhanVien{
    private int soTuyenSinh;

    public NhanVienTuyenSinh() {
    }

    public NhanVienTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }

    public int getSoTuyenSinh() {
        return soTuyenSinh;
    }

    public void setSoTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }

    @Override
    public double doanhThu() {
        return super.doanhThu()+soTuyenSinh*10;
    }
}
