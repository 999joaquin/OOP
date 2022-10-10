import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama anda: ");
        String nama = sc.nextLine();
        System.out.println("Masukkan NIM anda: ");
        String NIM = sc.nextLine();

        System.out.println("Masukkan nilai Tubes anda: ");
        double nilaiTubes = sc.nextDouble();
        System.out.println("Masukkan nilai Quiz anda: ");
        double nilaiQuiz = sc.nextDouble();
        System.out.println("Masukkan nilai Tugas anda: ");
        double nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai UTS anda: ");
        double nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS anda: ");
        double nilaiUAS = sc.nextDouble();

        double TotalNilai = (nilaiTubes*30/100)+(nilaiQuiz*10/100)+(nilaiTugas*10/100)+(nilaiUTS*25/100)+(nilaiUAS*25/100);

        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek: " + TotalNilai);
        sc.close();
        
    }
}
