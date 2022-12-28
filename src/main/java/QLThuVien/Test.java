package QLThuVien;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("S001", "Pham Van Dong", "1234", "Hoai", 123);
        Sach sach2 = new Sach("S001", "Phuong Nam", "2342", "Fish", 1234);
        List<Sach> sachList = new ArrayList<>();
        sachList.add(sach1);
        sachList.add(sach2);

        Bao bao1 = new Bao("B002", "Phuong Nam", "434", 12);
        Bao bao2 = new Bao("B002", "Tran Van Toan", "22344", 24);

        TapChi tapChi1 = new TapChi("TC001", "Pham Van Dong", "3345", 12);
        TapChi tapChi2 = new TapChi("TC001", "Phuong Nam", "34542", 11);

        TaiLieu taiLieu1 = new TaiLieu();

        System.out.println(sachList);
        QuanLySach quanLySach = new QuanLySach();
        // b1: tao tai lieu => done
        // b2:


    }
}
