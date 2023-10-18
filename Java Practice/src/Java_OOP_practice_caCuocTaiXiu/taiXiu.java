package Java_OOP_practice_caCuocTaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/* 
 * game cá cược tài xỉu
 * Một người chơi sẽ có 1 tài khoản. người chơi có quyền đặt cược số tiền ít hơn hoặc bằng số tiền họ đang có
 * 
 * Luật chơi:
 * - Có 3 viên xúc xắc, mỗi viên có 6 mặt có giá trị từ 1 đến 6
 * 1. nếu tổng = 3 hoặc 18 ==> cái ăn hết, người chơi thua
 * 2. nếu tổng = (11->17) <--> tài => nếu người chơi đặt tài, người chơi thắng, ngược lại thua
 * 3. nếu tổng = (4->10) <--> xỉu => nếu người chơi đặt xỉu, người chơi thắng, ngược lại thua
 * 
 * */

public class taiXiu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale lc = new Locale("vi", "VN");
//		NumberFormat numf = NumberFormat.getInstance(lc);
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		double Useraccount = 5000000;
		int choice = 0;
		
		do {
			System.out.println("==========Mời bạn lựa chọn===========");
			System.out.println("Chọn (1) để tiếp tục chơi.");
			System.out.println("Chọn (phím bất kỳ) để thoát");
			choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("***Bắt đầu chơi***");
				
				// Hàm đặt tiền cược
				System.out.println("Your user account: "+numf.format(Useraccount)+ ", bạn muốn cược bao nhiêu: ");
				double datCuoc = 0;
				do {
					System.out.println("tiền đặt cược (0 < tiền đặt cược <= " +numf.format(Useraccount)+ " )");
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > Useraccount);
				
				// Hàm chọn tài xỉu
				int chonTaiXiu = 0;
				do {
					System.out.println("Chọn 1 <==> tài | Chọn 2 <==> xỉu");
					chonTaiXiu = sc.nextInt();
				} while (chonTaiXiu != 1 && chonTaiXiu != 2);
				
				// Hàm tung xúc sắc
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				int giaTri1 = xucXac1.nextInt(5)+1;
				int giaTri2 = xucXac2.nextInt(5)+1;
				int giaTri3 = xucXac3.nextInt(5)+1;
				
				// Hàm tinh kết quả
				int tong = giaTri1 + giaTri2 + giaTri3;
//				double UserAccountIfLost = Useraccount - datCuoc;
//				double UserAccountIfWin = Useraccount + datCuoc;
				System.out.println("kết quả xuc xac: " +giaTri1+ "-" +giaTri2+ "-" +giaTri3);
				switch (tong) {
				case 3, 18:
					System.out.println("Cái ăn hết, người chơi thua");
					Useraccount -= datCuoc;
					System.out.println("So tiền bạn còn lại: " +numf.format(Useraccount));
					break;
				case 11, 12, 13, 14, 15, 16, 17:
					if (chonTaiXiu == 1) {
						System.out.println("Kết quả là tài, chúc mừng bạn đã chọn đúng ");
						Useraccount += datCuoc;
						System.out.println("số tiền bạn nhận được là: "+numf.format(Useraccount));
					}else if (chonTaiXiu == 2) {
						System.out.println("Cái ăn hết, người chơi thua");
						Useraccount -= datCuoc;
						System.out.println("So tiền bạn còn lại: " +numf.format(Useraccount));
					}
					break;
				case 4, 5, 6, 7, 8, 9, 10:
					if (chonTaiXiu == 1) {
						System.out.println("Cái ăn hết, người chơi thua");
						Useraccount -= datCuoc;
						System.out.println("So tiền bạn còn lại: " +numf.format(Useraccount));
					}else if (chonTaiXiu == 2) {
						System.out.println("Kết quả là tài, chúc mừng bạn đã chọn đúng ");
						Useraccount += datCuoc;
						System.out.println("số tiền bạn nhận được là: "+numf.format(Useraccount));
					}
					break;
				default: 
					break;
				}
			}
			
		} while (choice == 1);
	}
}
