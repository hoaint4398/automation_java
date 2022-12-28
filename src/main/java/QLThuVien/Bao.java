package QLThuVien;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;
    private TaiLieu taiLieu;

    public Bao(String maTaiLieu, String tenNhaXuatBan, String soPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
