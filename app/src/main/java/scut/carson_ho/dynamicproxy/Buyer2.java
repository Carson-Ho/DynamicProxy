package scut.carson_ho.dynamicproxy;

/**
 * Created by Carson_Ho on 17/7/24.
 */

// 小何，真正的想买iPhone的对象 = 目标对象 = 被代理的对象
public class Buyer2 implements Subject  {


    @Override
    public void buybuybuy() {
        System.out.println("小何要买iPhone");
    }

}