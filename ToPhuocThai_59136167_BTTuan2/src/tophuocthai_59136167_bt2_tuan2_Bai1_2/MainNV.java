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
public class MainNV {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien NV = new NhanVien("To Phuoc Thai",28,"To 15 Ngoc Son",4000000,200);
        NV.getThongTin();
        
         QuanLyNhanVien ds = new QuanLyNhanVien();
        NhanVien NV1 = new NhanVien("To Phuoc Thai",22,"50 Vo Van Tan",1500000.0,250);
        NhanVien NV2 = new NhanVien("Le The Dung",23,"24 Nguyen Dinh Chieu",2100000.0,120);
        NhanVien NV3 = new NhanVien("Truong Hoang Khoa",24,"34 Le Loi",1500000.0,250);
        NhanVien NV4 = new NhanVien("Luong Duc Toan",25,"70 Vo Thi Sau",2300000.0,130);
        NhanVien NV5 = new NhanVien("Bui Thi Thanh",26,"80 Võ Thị Sáu",2400000.0,150);
        
        
        ds.themNV(NV1);
        ds.themNV(NV2);
        ds.themNV(NV3);
        ds.themNV(NV4);
        ds.themNV(NV5);
        ds.inDS();
    }
    
}
