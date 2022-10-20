package uts;

// Created by Muhammad Asyrof_21343056

import javax.swing.JOptionPane;

public class UTS_Nomor3 {
    public static void main(String[] args) {
        String Kata = JOptionPane.showInputDialog("Masukkan Bilangan Angka ");
        int Angka = Integer.parseInt(Kata);

        if (Angka < 0){
            String Bil = Kata + ("Bilangan Negatif");
            JOptionPane.showMessageDialog(null,Bil);
        } 
        else if (Angka >= 0){
            String Bil2 = ("Bilangan Positif");
            JOptionPane.showMessageDialog(null,Bil2);
        }
        else {
            String Bil3 = ("Maaf, Bilangan Tidak Ditemukan!");
            JOptionPane.showMessageDialog(null,Bil3);
        }
    }
}
