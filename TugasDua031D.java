  import java.util.Scanner;
public class TugasDua031D {
    public static void main(String[] args) {

        Scanner andyNugraha031D = new Scanner(System.in);

        int menu031D;
        char pilih031D;
        Double sisi031D,alas031D,tinggi031D,luas031D,volume031D,jari2031D;
        
        

        System.out.println("1. Luas");
        System.out.println("2. volume");
        System.out.println("Pilih menu = ");
        menu031D = andyNugraha031D.nextInt();

        if(menu031D == 1){
            System.out.println("A. Persegi");
            System.out.println("B. Segitiga");
            System.out.println("Pilih salah satu");
            pilih031D = andyNugraha031D.next().charAt(0);
            if(pilih031D == 'a' || pilih031D == 'A'){
                System.out.print("Masukkan Sisi = ");
                sisi031D = andyNugraha031D.nextDouble();
                luas031D = sisi031D*sisi031D;
                System.out.println("Luas Persegi = " +luas031D);
            }else if(pilih031D == 'b' || pilih031D == 'B'){
                System.out.print("Masukkan Alas = ");
                alas031D = andyNugraha031D.nextDouble();
                System.out.print("Masukkan Tinggi = ");
                tinggi031D = andyNugraha031D.nextDouble();
                luas031D = alas031D*tinggi031D/2;
                System.out.println("Luas Segitiga =" +luas031D);
           }
           }
           else if(menu031D == 2){
            System.out.println("A. Kubus");
            System.out.println("B. Tabung");
            pilih031D = andyNugraha031D.next().charAt(0);
            if(pilih031D == 'a' || pilih031D == 'A'){
                System.out.print("Masukkan Sisi = ");
                sisi031D = andyNugraha031D.nextDouble();
                volume031D = sisi031D*sisi031D*sisi031D;
                System.out.println("volume kubus =" +volume031D);
            }else if(pilih031D == 'b' || pilih031D == 'B'){
                System.out.print("Masukkan Jari2 = ");
                jari2031D = andyNugraha031D.nextDouble();
                System.out.print("Masukkan Tinggi = ");
                tinggi031D = andyNugraha031D.nextDouble();
                volume031D = 3.14*jari2031D*jari2031D*tinggi031D;
                System.out.println("Volume tabung =" + volume031D);
            }
   
           }
    }
}
