/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan19.saldotabungan;
import java.util.Scanner;
/**
 *
 * @author Akmal
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM SALDO TABUNGAN
 */
public class PBO210116417Latihan19SaldoTabungan {
static int saldoAkhir;
static Void hitung(int a, int b){
    saldoAkhir =  (a + (a*b/100));
    return null;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i = 1;
        int saldoAwal = 2500000;
        double bunga = 0.15;
        int saldoBulanan;
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke- "+ i + " Rp " + saldoAwal);
            i++;
        } while (i<=6);
        System.out.println("Devoloped by  Gilang Panji Waneng Pati");
    }
    
}
