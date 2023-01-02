import java.util.Scanner;
public class TugasSatu031D {
    public static void main(String[] args) {

        Scanner andyNugraha03 = new Scanner(System.in);

        String kodeKeberangkatan031D;
        int biayaTiketpg031D, biayaTiketsg031D, biayaTiketmg031D, biayaTiketreg031D,administrasi031D;
        biayaTiketpg031D = 12500000;
        biayaTiketsg031D = 1375000;
        biayaTiketmg031D = 2500000;
        biayaTiketreg031D = 50000;
        administrasi031D = 50000;

        System.out.println("Masukkan Kode Keberangkatan [pg,sg,mg,reg] :");
        kodeKeberangkatan031D = andyNugraha03.nextLine();
        System.out.println("kode keberangkatan = "+kodeKeberangkatan031D);

        String tipeKelas = "";
        if(kodeKeberangkatan031D.equalsIgnoreCase("pg")) {
                System.out.println("Kelas Kereta = Eksekutif");
                System.out.println("Biaya Tiket = " +biayaTiketpg031D);
                System.out.println("Total Bayar = " + (biayaTiketpg031D+administrasi031D) );
            } else if(kodeKeberangkatan031D.equalsIgnoreCase("sg")){
                System.out.println("Kelas Kereta = Bisnis");
                System.out.println("Biaya Tiket = " +biayaTiketsg031D);
                System.out.println("Total Bayar = " + (biayaTiketsg031D+administrasi031D) );
            }else if (kodeKeberangkatan031D.equalsIgnoreCase("mg")){
                System.out.println("Kelas Kereta = Luxury");
                System.out.println("Biaya Tiket = " +biayaTiketmg031D);
                System.out.println("Total Bayar = " + (biayaTiketmg031D+administrasi031D));
            }else if (kodeKeberangkatan031D.equalsIgnoreCase("reg")){
                System.out.println("Kelas Kereta = Reguler");
                System.out.println("Biaya Tiket = " + biayaTiketreg031D);
                System.out.println("Total Bayar = " + biayaTiketreg031D );
            }else {
                System.out.println("Kode Yang Anda Masukkan Salah");
            }
        }
    }
