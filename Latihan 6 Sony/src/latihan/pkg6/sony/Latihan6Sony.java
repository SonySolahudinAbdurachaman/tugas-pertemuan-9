/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg6.sony;

/**
 *
 * @author MY PC
 * Nama : Sony Solahudin Abdurachman
 * Kelas : TI-IC
 * NIM : A2.1900171
 */
public class Latihan6Sony {
   //variabel jumlahKambing dideklarasikan sebagai statik
        public static int jumlahKambing;
}
class KambingStatic{
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = " MIDUN "; 
    
    public static void main(String[] args) {
        Latihan6Sony.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Latihan6Sony.jumlahKambing);
    }
}
