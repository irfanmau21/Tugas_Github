package Evaluasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {
	public Scanner input = new Scanner(System.in);
	public int []arr;
	
	public int getN() {
		System.out.println("Masukan Jumlah Uang");
		int n = input.nextInt();
		return n;	
}
	public int [] Kacamata(){
		int [] Kacamata = new int [3];
		System.out.println("Masukan Harga Kacamata");
		for (int i = 0; i < 3; i++) {	
			int x = input.nextInt();
			Kacamata[i] = x;
		}
		System.out.println(Arrays.toString(Kacamata));
		return Kacamata;
	}
	
	public int [] Baju(){
		int [] Baju = new int [3];
		System.out.println("Masukan Harga Baju");
		for (int i = 0; i < 3; i++) {	
			int x = input.nextInt();
			Baju[i] = x;
			
		}
		System.out.println(Arrays.toString(Baju));
		return Baju;
	}
	public void menghitungHarga() {
		int []Baju = Kacamata();
		int []Kacamata = Baju();
		int sum = 0;
		int max = 0;
		int uang = getN();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<3; j++) {
				sum = Baju[i] + Kacamata[j];
				if(sum >= max && sum <= uang ) {
					max = sum;
				}
			}
			
		}
		if(max == 0) {
			System.out.print("Dana Tidak Mencukupi");
		}else {
			System.out.print("Dana maksimal yang dibelanjaklan: "+max);
		}
		
	}
	public static void main(String[] args) {
		Soal2 soal = new Soal2();
		soal.menghitungHarga();
	}
}