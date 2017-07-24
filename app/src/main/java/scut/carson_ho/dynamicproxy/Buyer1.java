package scut.carson_ho.dynamicproxy;

/**
 * Created by Carson_Ho on 17/7/24.
 */


// 小成，真正的想买Mac的对象 = 目标对象 = 被代理的对象
public class Buyer1 implements Subject  {

    @Override
    public void buybuybuy() {
        System.out.println("小成要买Mac");
    }

}
