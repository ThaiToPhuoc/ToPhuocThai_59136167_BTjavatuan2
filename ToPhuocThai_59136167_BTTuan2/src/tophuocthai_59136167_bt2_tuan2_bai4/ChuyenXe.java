/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tophuocthai_59136167_bt2_tuan2_bai4;

/**
 *
 * @author tophu
 */
public class ChuyenXe {
    String maSoChuyen;
    String hoTenTX;
    String soXe;
    double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTX() {
        return hoTenTX;
    }

    public void setHoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public void hienThiTT(){
        System.out.print("Ma so chuyen xe : " + maSoChuyen );
        System.out.print("Ho ten tai xe : " + hoTenTX);
        System.out.print("So xe : " + soXe );
        System.out.print("Doanh thu : " + doanhThu );
    }

}
