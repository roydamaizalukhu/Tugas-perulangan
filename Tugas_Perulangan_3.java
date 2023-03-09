import java.util.Scanner;

public class Tugas_Perulangan_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Nearest Palindrome======");
        System.out.println("Program ini akan meminta input dari pengguna berupa sebuah angka.");
        System.out.println("===Roi damai zalukhu===");
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        int angkaPalindrome = angka;
        while (!isPalindrome(angkaPalindrome)) {
            angkaPalindrome++;
        }
        System.out.println("Angka palindrome terdekat dari " + angka + " adalah " + angkaPalindrome);
    }

    public static boolean isPalindrome(int angka) {
        int reversedNumber = 0;
        int originalNumber = angka;
        while (angka != 0) {
            int digit = angka % 10;
            reversedNumber = reversedNumber * 10 + digit;
            angka /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
