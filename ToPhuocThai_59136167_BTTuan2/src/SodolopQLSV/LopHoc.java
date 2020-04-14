/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SodolopQLSV;
import java.util.ArrayList;
/**
 *
 * @author tophu
 */
public class LopHoc {
    QLDS qldsGVGD = new QLDS();
    QLDS qldsHS = new QLDS();
    ArrayList<HocSinh> hocSinh = new ArrayList<>();
    ArrayList<GiaoVien> giaoVienGD = new ArrayList<>();
    GiaoVien giaoVienCN = new GiaoVien();

    public LopHoc() {
    }
    
    public int themHocSinh(HocSinh hs){
        qldsHS.them(hs);
        return 1;
    }
    
    public int themGVGD(GiaoVien gv){
        qldsGVGD.them(gv);
        return 1;
    }
    
    public void inDSHS(){
        qldsHS.InDS();
    }
    
    public void inDSGVGD(){
        qldsGVGD.InDS();
    }
}
