import java.util.Scanner;  // このライブラリをStandardInputクラスで使う宣言

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// 標準入力をScannerで取得する
        String inputLine = in.nextLine();// nextLine()メソッドは、キーボードからReturnキーの入力があるまで待ち、入力された1行を返す

        int num = Integer.parseInt(inputLine);

        if(num<2){
            System.out.println("素数ではありません");
            return;
        }

        int count = 0;

        for(int i=2; i<num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count < 1){
            System.out.println("素数です");
        }else{
            System.out.println("素数ではありません");
        }
        return;
    }
}
