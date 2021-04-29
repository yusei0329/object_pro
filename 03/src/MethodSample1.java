public class MethodSample1 {
    //メインメソッド
    public static void main(String[] args) {
        //MethodSample1.showMessage();//他のクラスにあるstaticメソットを呼び出す際の処理
        //自分のクラスのshowMessageメソッドを単純に呼び出す。
        showMessage();

        MethodSample1 app = new MethodSample1();
        app.showMessage2();
    }
    //画面上にメッセージを表示するメソッド
    static void showMessage() {
        System.out.println("Hello,World!!");
    }
    void showMessage2() {
        System.out.println("Hello,World!! not static");
    }
}