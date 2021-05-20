package jp.ac.ait.x19068;

//            ↓小クラス,サブクラス　↓親クラス,スーパークラス
public class Hero extends CharacterBase {
    public Hero(String name, int hp, int atk, int def, int agi) {
        super(name, hp, atk, def, agi);
        //thisが自分だとすると,superは親
    }
}