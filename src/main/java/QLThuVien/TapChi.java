package QLThuVien;

public class TapChi extends TaiLieu{
    private String soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String maTaiLieu, String tenNhaXuatBan, String soPhatHanh, String soPhatHanh1, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soPhatHanh);
        this.soPhatHanh = soPhatHanh1;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    @Override
    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
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
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
