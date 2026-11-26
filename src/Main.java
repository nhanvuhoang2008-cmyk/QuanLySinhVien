package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Student timKiemTheoMaSV(List<Student> danhSach, String maSV) {
        for (Student sv : danhSach) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                return sv;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Student> danhSach = new ArrayList<>();
        danhSach.add(new Student("SV001", "Nguyen Van A", "15/05/2005"));
        danhSach.add(new Student("SV002", "Tran Thi B", "20/08/2005"));

        System.out.println("=== DANH SACH SINH VIEN ===");
        for (Student sv : danhSach) {
            sv.hienThiThongTin();
        }

        System.out.println("\n=== TIM KIEM MA SV002 ===");
        Student ketQua = timKiemTheoMaSV(danhSach, "SV002");
        if (ketQua != null) {
            ketQua.hienThiThongTin();
        } else {
            System.out.println("Khong tim thay sinh vien.");
        }
    }
}
