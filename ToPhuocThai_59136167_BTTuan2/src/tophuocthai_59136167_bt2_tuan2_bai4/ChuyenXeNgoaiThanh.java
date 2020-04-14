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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgay;

    public ChuyenXeNgoaiThanh(String noiDen, int soNgay, String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
    @Override
    public void hienThiTT() {
        super.hienThiTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Noi den:" + noiDen);
        System.out.println("So ngay:" +soNgay);
    }
    
    
}
