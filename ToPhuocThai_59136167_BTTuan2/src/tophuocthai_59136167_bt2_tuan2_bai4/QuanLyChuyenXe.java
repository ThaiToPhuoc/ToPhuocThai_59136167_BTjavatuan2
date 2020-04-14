/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tophuocthai_59136167_bt2_tuan2_bai4;
import java.util.ArrayList;
/**
 *
 * @author tophu
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> DSChuyenXe = new ArrayList<>();

    public QuanLyChuyenXe() {
    }
    
    public void themChuyenXe(ChuyenXe cx){
        DSChuyenXe.add(cx);
    }
    
    public void inDS(){
        for(int i=0;i<DSChuyenXe.size(); i++){
            DSChuyenXe.get(i).hienThiTT();
        }
    }
    
    public double tinhDoanhThuNoiThanh(){
        double Tongtien = 0;
        for(int i=0;i<DSChuyenXe.size(); i++){
            if(DSChuyenXe.get(i)  instanceof ChuyenXeNoiThanh){
                Tongtien += DSChuyenXe.get(i).getDoanhThu();
            }
        }
        return Tongtien;
    }
    
    public double tinhDoanhThuNgoaiThanh(){
        double Tongtien = 0;
        for(int i=0;i<DSChuyenXe.size(); i++){
            if(DSChuyenXe.get(i)  instanceof ChuyenXeNgoaiThanh){
                Tongtien += DSChuyenXe.get(i).getDoanhThu();
            }
        }
        return Tongtien;
    }
    
     public double tongDoanhthu(){
        double Tongtien = 0;
        for(int i=0;i<DSChuyenXe.size(); i++){
            Tongtien = DSChuyenXe.get(i).getDoanhThu();
        }
        return Tongtien;
    }
}
