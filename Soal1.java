package Evaluasi;


import java.util.Scanner;

public class Soal1 {
	public Scanner input = new Scanner(System.in);

	public int getN() {
		int n = input.nextInt();
		return n;
	}

	public int deret(int n) {
		int a = 1;
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < n * 2; i++) {
				if (i % 2 != 0 && j == 0) {
					System.out.print(" "+a);
					a = a+2;
				}else if(i % 2 != 0 && j == 1) {
					a = a-2;
					System.out.print(" "+a);
					
				}
			}
			System.out.println("\n");
	}
		
		return a;
	}
	public void cetak() {
		System.out.println("Masukan Jumlah Deret yang Diinginkan:");
		int s = getN();
		deret(s);
	}

	public static void main(String[] args) {
		Soal1 soal = new Soal1();
		soal.cetak();
	}
}
// Ini perubahan yg coba dilakukan (nai)