package jp.ac.uryukyu.ie.e175769;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    public Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public void wounded(int damage){
        setHitPoint(getHitPoint() -damage);
        if( getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
