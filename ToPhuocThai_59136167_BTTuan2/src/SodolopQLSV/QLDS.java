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
public class QLDS implements IQLDS{

     ArrayList<CaNhan> dscanhan = new ArrayList<>();

    public QLDS() {
    }

    public QLDS(ArrayList<CaNhan> dscanhan) {
        this.dscanhan = dscanhan;
    }
     
     
    @Override
    public int them(CaNhan p) {
        dscanhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for (int i =0; i<dscanhan.size(); i++){
            if (dscanhan.get(i).getHoTen() == ten)
                dscanhan.remove(i);
        }
        return 1;  
    }

    @Override
    public void InDS() {
        for (int i =0; i<dscanhan.size(); i++){
            dscanhan.get(i).HienThiTT();
        }    
    }
    
}
