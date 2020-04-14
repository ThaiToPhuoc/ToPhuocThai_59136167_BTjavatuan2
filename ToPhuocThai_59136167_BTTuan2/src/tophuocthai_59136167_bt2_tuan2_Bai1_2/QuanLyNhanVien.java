/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tophuocthai_59136167_bt2_tuan2_Bai1_2;
import tophuocthai_59136167_bt2_tuan2_Bai1_2.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author tophu
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsnv = new ArrayList<>();

    @Override
    public void themNV(NhanVien NV) {
        dsnv.add(NV);
    }

    @Override
    public void inDS() {
         for(int i = 0; i<dsnv.size(); i++) {
            System.out.println("\nNhân viên thứ " + i);
            dsnv.get(i).getThongTin();
        }
    }
    
}
