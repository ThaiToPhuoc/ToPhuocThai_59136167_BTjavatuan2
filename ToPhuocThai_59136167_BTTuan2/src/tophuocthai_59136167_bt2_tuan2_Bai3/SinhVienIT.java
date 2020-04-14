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
public class SinhVienIT extends SinhVienPoly{
    double java;
    double html;
    double css;

    public SinhVienIT() {
    }
    
    public SinhVienIT(double java, double html, double css, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getjava() {
        return java;
    }

    public void setjava(double java) {
        this.java = java;
    }

    public double gethtml() {
        return html;
    }

    public void sethtml(double html) {
        this.html = html;
    }

    public double getcss() {
        return css;
    }

    public void setcss(double css) {
        this.css = css;
    }
    
    @Override
    public double getDiem() {
            return (2*java + html + css)/4;
    }
}
