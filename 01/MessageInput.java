import java.util.Scanner;  // このライブラリをParseIntクラスで使う宣言

public class MessageInput {
	public static void main(String[] args) {
		System.out.println("こんにちは、メッセージをどうぞ");
		Scanner in = new Scanner(System.in);
		String inputLine = in.nextLine();
		System.out.printf("メッセージを受信しました\n---\n%s\n---\n",inputLine);
		in.close();
	}
}
