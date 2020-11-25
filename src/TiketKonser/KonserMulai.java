/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiketKonser;

/**
 *
 * @author wulan
 */
public class KonserMulai {
    
     public static void main(String[] args) {
        KelasKonser kk=new KelasKonser();
         
        System.out.println("Deskripsi Konser;");
        kk.judul("CARATLAND");
        kk.tempat_duduk("VVIP");
        kk.harga(3000000);
        kk.pembelian(2);
    }

}
