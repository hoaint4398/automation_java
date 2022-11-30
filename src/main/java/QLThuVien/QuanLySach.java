package QLThuVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<Sach> danhSachSach;
    private List<TapChi> danhSachTapChi;
    private List<Bao> danhSachBao;

    public QuanLySach(List<Sach> danhSachSach, List<TapChi> danhSachTapChi, List<Bao> danhSachBao) {
        this.danhSachSach = danhSachSach;
        this.danhSachTapChi = danhSachTapChi;
        this.danhSachBao = danhSachBao;
    }

    public QuanLySach(){
        this.danhSachSach = new ArrayList<>();
        this.danhSachBao = new ArrayList<>();
        this.danhSachTapChi = new ArrayList<>();
    }

    public List<Sach> getDanhSachSach() {
        return danhSachSach;
    }

    public void setDanhSachSach(List<Sach> danhSachSach) {
        this.danhSachSach = danhSachSach;
    }

    public List<TapChi> getDanhSachTapChi() {
        return danhSachTapChi;
    }

    public void setDanhSachTapChi(List<TapChi> danhSachTapChi) {
        this.danhSachTapChi = danhSachTapChi;
    }

    public List<Bao> getDanhSachBao() {
        return danhSachBao;
    }

    public void setDanhSachBao(List<Bao> danhSachBao) {
        this.danhSachBao = danhSachBao;
    }

    @Override
    public String toString() {
        return "QuanLySach{" +
                "danhSachSach=" + danhSachSach +
                ", danhSachTapChi=" + danhSachTapChi +
                ", danhSachBao=" + danhSachBao +
                '}';
    }
}
