package QLThuVien;

public class TapChi extends TaiLieu{
    private int thangPhatHanh;

    public TapChi(String maTaiLieu, String tenNhaXuatBan, String soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soPhatHanh);
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String soPhatHanh, int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }


    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
