import java.util.Scanner;  // このライブラリをStandardInputクラスで使う宣言

public class AtodashiJanken {
    public static void main(String[] args) {

        // 変数には、0から3未満のint型の整数値がランダムで格納されます。
        int randomNumber = new java.util.Random().nextInt(3);

        // 確認用
        //System.out.println(randomNumber);
        if(randomNumber == 0){
            System.out.println("コンピュータはグーを出します");
        }else if(randomNumber == 1){
            System.out.println("コンピュータはチョキを出します");
        }else if(randomNumber == 2){
            System.out.println("コンピュータはパーを出します");
        }
        System.out.println("何を出しますか？ (0:グー,1:チョキ,2:パー)");

        Scanner in = new Scanner(System.in);// 標準入力をScannerで取得する
        String inputLine = in.nextLine();
        int num = Integer.parseInt(inputLine);

        int winNum = randomNumber-1;
        if(winNum < 0){
            winNum = 2;
        }

        int loseNum = randomNumber+1;
        if(2 < loseNum){
            loseNum = 0;
        }

        if(num<0 && 2<num){
            System.out.println("あなたの出した手が判断できません。勝負はしません。");
            return;
        }

        if(randomNumber == num){
            System.out.println("あいこ");
        }else if(winNum == num){
            System.out.println("勝ち");
        }else if(loseNum == num){
            System.out.println("負け");
        }

        // ↑と同じだけど違う書き方。複数ランダムな値を取得したい場合に使ってください。
        // rnd.nextInt(3)で0〜2のランダムな値を取得できます。
        //java.util.Random rnd = new java.util.Random();
        //int randomNumber = rnd.nextInt(3);

        return;
    }
}
