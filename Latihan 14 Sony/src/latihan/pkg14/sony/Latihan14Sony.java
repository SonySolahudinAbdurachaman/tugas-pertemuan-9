/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg14.sony;

/**
 *
 * @author MY PC
 * Nama : Sony Solahudin Abdurachman
 * Kelas : TI-IC
 * NIM : A2.1900171
 */
public class Latihan14Sony {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        int a = 60;
        int b = 13;
        int c = 0;
        c = a & b;
        
        System.out.println("a & b = "+c);
         c = a | b;
        
        System.out.println("a | b = "+c);
         c = a ^ b;
        
        System.out.println("a ^ b = "+c);
         c = ~a;
        
        System.out.println("~a = "+c);
         c = a << 2;
        
        System.out.println("a << 2 = "+c);
         c = a >> 2;
        
        System.out.println("a >> 2 = "+c);
    }
}
