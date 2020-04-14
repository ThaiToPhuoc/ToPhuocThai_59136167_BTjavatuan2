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
public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen;
    double soKm;

    public ChuyenXeNoiThanh(int soTuyen, double soKm, String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT(); //To change body of generated methods, choose Tools | Templates
        System.out.println("So tuyen:" +soTuyen);
        System.out.println("So km:" +soKm);
    }
    
    
    
}
