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
public class MainCX {
    public static void main(String[] args) {
        
        QuanLyChuyenXe QLCX = new QuanLyChuyenXe();
        
        ChuyenXeNoiThanh CXNoiThanh = new ChuyenXeNoiThanh(40, 20.5, "CX001", "To Phuoc Thai", "59136167", 200000);
        ChuyenXeNgoaiThanh CXNgoaiThanh = new ChuyenXeNgoaiThanh("Nha Trang",20,"Lê Thế Dũng","CX02","59130403",400000);
        
        QLCX.themChuyenXe(CXNoiThanh);
        QLCX.themChuyenXe(CXNgoaiThanh);
        
        
        QLCX.inDS();
        
        
        System.out.println("tổng doanh thu ngoại thành " + QLCX.tinhDoanhThuNgoaiThanh());
        System.out.println("tổng doanh thu nội thành " + QLCX.tinhDoanhThuNoiThanh());
        
    }
}
