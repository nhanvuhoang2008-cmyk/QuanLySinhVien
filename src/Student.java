package src;

public class Student {
    private String maSV;
    private String hoTen;
    private String ngaySinh;

    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen.toUpperCase();
        this.ngaySinh = ngaySinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen.toUpperCase();
    }

    public void hienThiThongTin() {
        System.out.println("Ma SV: " + maSV + " | Ho ten: " + hoTen + " | Ngay sinh: " + ngaySinh);
    }
}
