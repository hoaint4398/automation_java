package QL_ThuVien;

public class TapChi {
    private String soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getThangPhatHanh() {
        return this.thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return this.soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }
}
