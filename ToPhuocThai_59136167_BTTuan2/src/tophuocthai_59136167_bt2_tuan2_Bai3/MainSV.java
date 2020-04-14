/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tophuocthai_59136167_bt2_tuan2_Bai3;

/**
 *
 * @author tophu
 */
public class MainSV {
    public static void main(String[] args) {
       SinhVienPoly sv1 = new SinhVienIT(9,8.75,8.5,"To Phuoc Thai","CNTT");
       sv1.xuat();
       SinhVienPoly sv2 = new SinhVienBiz(8,9,"Truong Hoang Khoa","KT");
       sv2.xuat();
    }
}
