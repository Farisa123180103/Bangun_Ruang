package tugas2pbo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas2PBO {

    public static void main(String[] args) {
        
        System.out.println("*PROGRAM MENGHITUNG KELILING, LUAS PERMUKAAN, DAN VOLUME*");
       // System.out.println("Masukkan Tinggi = ");
        Scanner pilihan = new Scanner(System.in);
        Scanner jari2 = new Scanner(System.in);
        Scanner tinggi = new Scanner(System.in);
        Scanner sudut = new Scanner(System.in);
        Scanner tinggi2 = new Scanner(System.in);
        Scanner jarikcl = new Scanner(System.in);
        double r, tg, r2, tg2;
        float sd;
        try{
            System.out.println("Masukkan Jari-jari = ");
            r = jari2.nextDouble();
            if(r<=0){
                throw new RuntimeException("Data Salah");
            }
            System.out.println("Masukkan Jari-jari Kecil = ");
            r2 = jarikcl.nextDouble();
            if(r2<=0){
                throw new RuntimeException("Data Salah");
            }
            System.out.println("Masukkan Tinggi = ");
            tg = tinggi.nextDouble();
            if(tg<=0){
                throw new RuntimeException("Data Salah");
            }
            System.out.println("Masukkan Tinggi Kecil = ");
            tg2 = tinggi2.nextDouble();
            if(tg2<=0){
                throw new RuntimeException("Data Salah");
            }
            System.out.println("Masukkan Sudut = ");
            sd = sudut.nextFloat();
            if(sd<=0){
                throw new RuntimeException("Data Salah");
            }
        } catch(RuntimeException a) {
            System.out.println("Data Tidak Boleh Kurang Dari Samadengan 0, Mohon Ulangi");
            
            System.out.println("Masukkan Jari-jari = ");
            r = jari2.nextDouble();
            if(r<=0){
                throw new RuntimeException("Data Salah");
            }
            System.out.println("Masukkan Jari-jari Kecil = ");
            r2 = jarikcl.nextDouble();
            if(r2<=0){
                throw new RuntimeException("Data Salah");
            }
            System.out.println("Masukkan Tinggi = ");
            tg = tinggi.nextDouble();
            if(tg<=0){
                throw new RuntimeException("Data Salah");
            }
            System.out.println("Masukkan Tinggi Kecil = ");
            tg2 = tinggi2.nextDouble();
            if(tg2<=0){
                throw new RuntimeException("Data Salah");
            }
            System.out.println("Masukkan Sudut = ");
            sd = sudut.nextFloat();
            if(sd<=0){
                throw new RuntimeException("Data Salah");
            }
        }
        Lingkaran l = new Lingkaran(r); 
        Tabung t = new Tabung(r, tg);
        Busur b = new Busur(r, sd);
        Bola bl = new Bola(r,sd);
        Kerucut k = new Kerucut(r, tg);
        KerucutTerpancung kt = new KerucutTerpancung(r, tg, r2, tg2);
        Juring2D j = new Juring2D(r, sd);
        Tembereng2D tb = new Tembereng2D(r, sd);
        Juring3D jr = new Juring3D(r, sd, tg);
        Tembereng3D tbr = new Tembereng3D(r, sd,tg);
        
        
        System.out.println("========MENU=========");
        System.out.println("1. Lingkaran");
        System.out.println("2. Tabung");
        System.out.println("3. Kerucut");
        System.out.println("4. Bola");
        System.out.println("Pilih = ");
        int pilih = pilihan.nextInt();
        
        switch(pilih){
            case 1 : System.out.println("LINGKARAN");
                    l.Luas();
                    System.out.println("Luas Lingkaran : "+l.luasling);
                    l.keliling();
                    j.Luas();
                    tb.Luas();
                    break;
            case 2 : System.out.println("TABUNG");
                    t.Luas();
                    t.volume();
                    break;
            case 3 : System.out.println("KERUCUT");
                    k.Luas();
                    k.Volume();
                    System.out.println("Volume Kerucut : "+ k.volume_kerucut);
                    kt.Luas();
                    kt.VolumeTerpancung();
                    break;
            case 4 : System.out.println("BOLA");
                    bl.Luas();
                    bl.volume();
                    bl.keliling();
                    jr.Luas();
                    tbr.Luas();
                    break;
        }
        
    }
    
}
