/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4.sony;

/**
 *
 * @author MY PC
 * NAMA : Sony Solahudin Abdurachman
 * Kelas : TI-IC
 * NIM  : 1900171
 */
public class Latihan4Sony {

     public void tambahKambing(){
        //Deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + 
                jumlahKambing);
    
    }
     
    public static void main(String[] args) {
        Latihan4Sony kambingJantan = new Latihan4Sony();
        kambingJantan.tambahKambing();
        
    }
}
