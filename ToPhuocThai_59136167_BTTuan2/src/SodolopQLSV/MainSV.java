/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SodolopQLSV;

/**
 *
 * @author tophu
 */
public class MainSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LopHoc lophoc = new LopHoc();
        HocSinh hs1 = new HocSinh("59CNTT-1","IT","To Phuoc Thai",20,"To 15 Ngoc Son","0338303823");
        HocSinh hs2 = new HocSinh("59CNTT-1","IT","Truong Hoang Khoa",20,"134 Nguyen Dinh chieu","0905174944");
        HocSinh hs3 = new HocSinh("59CNTT-1","IT","Le The Dung",20,"32 Tran Nhan Tong","0369337366");
        GiaoVien gv1 = new GiaoVien("Mau Thiet Ke", "IT", "Huynh Tuan Anh", 45, "So 2 NDC", "0945865165");
        
        lophoc.themHocSinh(hs1);
        lophoc.themHocSinh(hs2);
        lophoc.themHocSinh(hs3);
        lophoc.themGVGD(gv1);
        
        lophoc.qldsHS.xoa("Le The Dung");
        lophoc.inDSHS();
        lophoc.inDSGVGD();
    }
    
}
