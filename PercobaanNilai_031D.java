import java.util.Scanner;
public class PercobaanNilai_031D {
    public static void main(String[] args) {

        Scanner andyNugraha03 = new Scanner(System.in);

        int nilai031D;
        System.out.print("Masukkan Nilai =");
        nilai031D = andyNugraha03.nextInt();

        if (nilai031D >=0 || nilai031D <=100){
            if (nilai031D >=90 && nilai031D <=100){
                System.out.println("Nilai A,EXCELLENT");
            }else if (nilai031D >=80 && nilai031D <=89){
                System.out.println("Nilai B,Pertahankan Prestasi Anda");
            }else if (nilai031D >=60 && nilai031D <=79){
                System.out.println("Nilai C,Tingkatkan Prestasi Anda");
            }else if (nilai031D >=50 && nilai031D <=59){
                System.out.println("Nilai D,Tingkatkan Belajar Anda");
            }else{
                System.out.println("Nilai E,Anda Tidak Lulus");
            }
          }else {
            System.out.println("Nilai Yang Anda Masukkan Tidak Valid");
    
}
    }
}