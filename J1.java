import java.util.*;
class RuntimeException extends Exception{
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, n = 0;
		try {
			System.out.println("密碼輸入測試");
			System.out.print("請輸入密碼:");
			int num1 = sc.nextInt();
			System.out.print("請再輸入一次密碼:");
			int num2 = sc.nextInt();
			for(int i = 1; i <= 2; i++) {
				if(num1 != num2) {
					System.out.println("與第一次輸入的不同!");
					System.out.print("請再輸入一次密碼:");
					int num3 = sc.nextInt();
					num2 = num3;
				}
				else if(num1 == num2) {
					System.out.println("密碼正確");
					n = 1;
					break;
				}
			}
			if(n == 0) {
				throw new RuntimeException();
			}
		}
		catch(RuntimeException e){
			System.out.println("輸入三次錯誤!程式停止!");
		}
	}
}
