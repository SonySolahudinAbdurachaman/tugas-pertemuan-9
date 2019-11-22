/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5.sony;

/**
 *
 * @author MY PC
 * Nama : Sony Solahudin Abdurachman
 * Kelas : TI-IC
 * NIM : A2.1900171
 */
public class Latihan5Sony {

   //variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan5Sony kambingSusu = new Latihan5Sony();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menmapilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
}
