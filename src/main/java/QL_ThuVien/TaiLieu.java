package QL_ThuVien;

public class TaiLieu {
    private Sach sach;
    private TaiLieu taiLieu;
    private TapChi tapChi;
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private String soPhatHanh;

    // region Method TaiLieu

    public TaiLieu() {}

    public TaiLieu(Sach sach, String maTaiLieu, String tenNhaXuatBan, String soPhatHanh) {
        this.sach = sach;
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public TaiLieu(TaiLieu taiLieu, String maTaiLieu, String tenNhaXuatBan, String soPhatHanh) {
        this.taiLieu = taiLieu;
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public TaiLieu(TapChi tapChi, String maTaiLieu, String tenNhaXuatBan, String soPhatHanh) {
        this.tapChi = tapChi;
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public String getSoPhatHanh() {
        return this.soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getMaTaiLieu() {
        return this.maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return this.tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public Sach getSach() {
        return this.sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public TaiLieu getTaiLieu() {
        return this.taiLieu;
    }

    public void setTaiLieu(TaiLieu taiLieu) {
        this.taiLieu = taiLieu;
    }

    public TapChi getTapChi() {
        return this.tapChi;
    }

    public void setTapChi(TapChi tapChi) {
        this.tapChi = tapChi;
    }
    // endregion

    // region Xoa tai lieu theo ma
    private void xoaTaiLieu(String maTaiLieu){

    }

    // endregion

}
