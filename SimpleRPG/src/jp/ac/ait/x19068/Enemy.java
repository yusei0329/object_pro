package jp.ac.ait.x19068;

public class Enemy extends CharacterBase{
    public Enemy(String name, int hp, int atk, int def, int agi) {
        super(name, hp, atk, def, agi);
        //thisが自分だとすると,superは親
    }
}
