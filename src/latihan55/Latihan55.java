/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan55;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        a.setKeyStore("234ibfd3840fo");
        BlackBerry b = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        b.setPinBB("BHS249");
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUUQOJWORJ");
        a.displayProduct();
        System.out.println(a.getKeyStore()+"\n");
        b.displayProduct();
        System.out.println(b.getPinBB()+"\n");
        wp.displayProduct();
        System.out.println(wp.getWpKeyStore()+"\n");
    }

}
