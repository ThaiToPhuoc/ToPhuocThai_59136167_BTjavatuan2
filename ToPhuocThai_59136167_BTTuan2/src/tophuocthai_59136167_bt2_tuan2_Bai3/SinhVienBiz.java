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
public class SinhVienBiz extends SinhVienPoly{
    double makerting;
    double sales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double makerting, double sales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.makerting = makerting;
        this.sales = sales;
    }

    public double getMakerting() {
        return makerting;
    }

    public void setMakerting(double makerting) {
        this.makerting = makerting;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    
    @Override
    public double getDiem() {

            return (2*makerting + sales)/3;
    }
}
