import java.util.Scanner;  // このライブラリをParseIntクラスで使う宣言

public class Multiplication100 {
	public static void main(String[] args) {
		System.out.println("整数値を入力してください");
		Scanner in = new Scanner(System.in);
		String inputLine = in.nextLine();
		int tmp = Integer.parseInt(inputLine);
		System.out.println("計算結果:"+tmp*100);
		in.close();
	}
}
