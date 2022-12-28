package QLThuVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<TaiLieu> taiLieuList;

    public QuanLySach(List<TaiLieu> taiLieuList) {
        this.taiLieuList = taiLieuList;
    }

    public QuanLySach(){}

    public List<TaiLieu> getTaiLieuList() {
        return taiLieuList;
    }

    public void setTaiLieuList(List<TaiLieu> taiLieuList) {
        this.taiLieuList = taiLieuList;
    }

    public void themTaiLieuQLSach(TaiLieu taiLieu){
        taiLieuList.add(taiLieu);
    }

    public void searchMaTaiLieu(String maTaiLieu){
        for (TaiLieu tl:taiLieuList) {
            if(tl.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)) System.out.println(tl);
        }
    }

    public void deleteTaiLieu(String maTaiLieu){
        taiLieuList.remove(getTaiLieuList().stream().filter(v->v.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)));
    }

    public void printTaiLieuQLSach(){
        for (TaiLieu tl:taiLieuList) {
            System.out.println(tl);
        }
    }
}
