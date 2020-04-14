/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tophuocthai_59136167_bt2_tuan2_Bai1_2;

/**
 *
 * @author tophu
 */
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
    public void getThongTin(){
          System.out.println("Ten nhan vien: " + ten );
          System.out.println("Tuoi: " + tuoi );
          System.out.println("Dia chi: " + diaChi);
          System.out.println("Luong: " + tienLuong );
          System.out.println("So gio lam: " + tongGioLam );
          System.out.println("Tien thuong: "+ tinhThuong());
    }
    
    public double tinhThuong(){
        if (tongGioLam >= 200) 
            return tienLuong*0.2;  
        else 
        {
            if (100 <= tongGioLam && tongGioLam <200) 
                return tienLuong*0.1;
            return 0;  
        }
    }
}
