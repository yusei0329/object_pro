import java.util.Scanner;  // このライブラリをStandardInputクラスで使う宣言

public class Saiten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// 標準入力をScannerで取得する
        String inputLine = in.nextLine();// nextLine()メソッドは、キーボードからReturnキーの入力があるまで待ち、入力された1行を返す

        int num = Integer.parseInt(inputLine);

        if(-1<num && num<20){
            System.out.println("不合格です。来年もう一年頑張りましょう。");
        }else if(19<num && num<60){
            System.out.println("不合格です。再テストを行いましょう！");
        }else if(59<num && num<101){
            System.out.println("「合格です。おめでとう！」");
        }else{
            System.out.println("入力された値は点数として正しくありません。");
        }
        return;
    }


}
