/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SodolopQLSV;

public class GiaoVien extends CaNhan{
    String monDay;
    String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public void HienThiTT() {
        System.out.println("Ho ten giao vien: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("SDT: " + sdt);
        System.out.println("Mon day: " + monDay);
        System.out.println("To bo mon: " + toBoMon);
    }
    
    
}
