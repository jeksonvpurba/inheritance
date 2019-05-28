/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author jekson viktory purba
 */
public class mulai {
    public static void main(String[] args) {
        barang produksi=new barang();
        
        produksi.produksiBaju();
        produksi.produksiCelana();
        produksi.produksiJaket();
        
        
        System.out.println("\nJumlah produksi baju   : "+produksi.baju+" Buah");
        System.out.println("Jumlah produksi celana : "+produksi.celana+" Buah");
        System.out.println("Jumlah produksi topi   : "+produksi.jaket+" Buah");
        
        
    }

}
