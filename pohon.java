import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ardha Nur Fajri
 */
public class pohon {
    String nama;
    int tinggi;     
        void setNama(){
            Scanner input=new Scanner(System.in);
            System.out.print("Masukkan nama pohon: ");
            nama=input.next();
    }
        void setTinggi(){
            Scanner input=new Scanner(System.in);
            System.out.print("Masukkan tinggi pohon: ");
            tinggi=input.nextInt();
    }
        String getNama(){
            return nama;
    }
        int getTinggi(){
            return tinggi;
    }
}
