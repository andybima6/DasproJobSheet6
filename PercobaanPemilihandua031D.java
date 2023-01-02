import java.util.Scanner;
public class PercobaanPemilihandua031D {
    public static void main(String[] args) {

        Scanner andyNugraha03 = new Scanner(System.in);

        String kategori031D;
        int penghasilan031D,gajiBersih031D;
        double pajak031D;

        System.out.println("Masukkan Kategori");
        kategori031D = andyNugraha03.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan = ");
        penghasilan031D = andyNugraha03.nextInt();

        if(kategori031D.equals("pekerja")) {
            if(penghasilan031D <=0) {
                pajak031D = 0.1;
            }else if(penghasilan031D <= 3000000){
                pajak031D = 0.15;
            }else {
                pajak031D = 0.2;
            }
        
        gajiBersih031D = (int) (penghasilan031D-(penghasilan031D*pajak031D));
        System.out.println("Gaji Bersih Yang Anda Terima =" +gajiBersih031D);
        }else if (kategori031D.equals("pebisnis")) {
           if (penghasilan031D <= 0) {
                pajak031D = 0.15;
           }  else if(penghasilan031D <= 3500000){
                pajak031D = 0.2;
           }  else {
                pajak031D = 0.25;
           }
        gajiBersih031D = (int)(penghasilan031D- (penghasilan031D*pajak031D));
        System.out.println ("Gaji Bersih Yang Anda Terima =" +gajiBersih031D);
        } else {
            System.out.println("kategori Yang Anda Msukkkan Salah");
        }
    }
}
    