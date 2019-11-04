/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan58.tambahkurang;

/**
 *
 * @author 
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi Program : Program ini untuk membuat tampilan 
 *                     tambah kurang bilangan.
 */
public class Latihan58TambahKurang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JumlahBilangan jBilangan = new JumlahBilangan();
        jBilangan.tampilHasilJumlah();
        
        SelisihBilangan sBilangan = new SelisihBilangan();
        sBilangan.tampilSelisih();
    }
    
}
