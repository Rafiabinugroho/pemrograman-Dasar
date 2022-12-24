package koding;

import java.util.Scanner;

public class warungMakan {

	public static void main(String[] args) {
						
				int pilihan;
				char yesNo;
				
				Scanner input = new Scanner(System.in);
				
			    String totalBayar;
				MieAyam Miyam = new MieAyam();
				Bakso bks = new Bakso();
				bakmiRebus mibus = new bakmiRebus();
	            nasiGudek Nasgu = new nasiGudek();
				NasiRames Names = new NasiRames();
				
				
				System.out.println("Warung Makan");
				System.out.println("Makan kenyang");
				System.out.println("---------------");
				System.out.println("1. MieAyam_____________Rp. 10.000");
				System.out.println("2. Bakso_______________Rp. 10.000");
				System.out.println("3. bamiRebus___________Rp. 13.000");
				System.out.println("4. NasiGudek____________Rp. 8.000");
				System.out.println("5. NasiRames____________Rp. 8.000");
				System.out.println("6. Keluar");
				System.out.println("---------------------------------");
				
				
				do {
					System.out.print("Pilih [1-5] : ");
				pilihan = input.nextInt();
				
				
				switch(pilihan) {
				
				case 1 :
					System.out.print("Mie Ayam, beli berapa porsi = ");
					Miyam.Jumlah1 = input.nextInt();
					System.out.println("MieAyam yang anda pesan seharga = Rp. " + Miyam.getTotal1() + "\n" );
					break;
					
				case 2 :
					System.out.print("Bakso, beli berapa porsi = ");
					bks.Jumlah2 = input.nextInt();
					System.out.println("Bakso yang anda pesan seharga = Rp. " + bks.getTotal2() +  "\n");
					break;
					
				case 3 :
					System.out.print("bakmiRebus, beli berapa porsi = ");
					mibus.Jumlah3 = input.nextInt();
					System.out.println("bakmiRebus yang anda pesan seharga = Rp. " + mibus.getTotal3() + "\n");
					break;
					
				case 4 :
					System.out.print("Nasi Gudek, beli berapa porsi = ");
					Nasgu.Jumlah4 = input.nextInt();
					System.out.println("Nasi Gudek yang anda pesan seharga = Rp. "+ Nasgu.getTotal4() + "\n");
					break;
					
				case 5 :
					System.out.print("Nasi Rames, beli berapa porsi =");
				    Names.Jumlah5 = input.nextInt();
					System.out.println("Nasi Rames yang anda pesan seharga = Rp. " + Names.getTotal5() + "\n");
					break;
					
					
				case 6 :
					System.out.print("Tidak jadi memesan, Sistem Keluar");
					System.exit(0);
					
				default :
					System.out.println("Pilihan yang anda masukkan salah!!!");
				}
				System.out.print("Tambah pesanan klik y, jika tidak klik n : ");
				yesNo = input.next().charAt(0);
				} 
				
				while(yesNo != 'n');
				
	            totalBayar = (Miyam.getTotal1() + bks.getTotal2() + mibus.getTotal3() + Nasgu.getTotal4() + Names.getTotal5());
				System.out.println("Total yang harus dibayar = Rp. " + totalBayar);
				input.close();
							
			}
					



	}


