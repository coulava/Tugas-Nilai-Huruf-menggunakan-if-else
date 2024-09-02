import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = in.nextLine();
        System.out.println("ID: ");
        int id = in.nextInt();
        System.out.println("IPK: ");
        double ipk = in.nextDouble();
        
        Siswa fira = new Siswa(id, nama, ipk);
        //Nilai diatas 75 lulus
        if (fira.getIpk() >= 75) {
            System.out.println(fira.getNama() + " Lulus");
        }else {
            System.out.println(fira.getNama() + " Tidak lulus");
        }
        
        //Nilai Huruf
        if (fira.getIpk() < 60) {
            System.out.println("E");
        }else if (fira.getIpk() > 60 && fira.getIpk() <= 70) {
            System.out.println("D");
        }else if (fira.getIpk() > 70 && fira.getIpk() <= 80){
            System.out.println("C");
        }else if (fira.getIpk() > 80 && fira.getIpk() <= 90) {
            System.out.println("B");
        }else if (fira.getIpk() > 90 && fira.getIpk() <= 100) {
            System.out.println("A");
        }


        in.close();
    }    
    
}
