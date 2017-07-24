package scut.carson_ho.dynamicproxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 1. 创建动态代理类对象
        DynamicProxy DynamicProxy = new DynamicProxy();
        // 2. 根据传入的目标对象实例，为其创建动态代理对象
        // 2.1 代购为小成代购Mac
        Subject Buyer1_DynamicProxy = (Subject) DynamicProxy.newProxyInstance(new Buyer1());
        Buyer1_DynamicProxy.buybuybuy();

        // 2.2 代购为小何代购iPhone
        Subject Buyer2_DynamicProxy = (Subject) DynamicProxy.newProxyInstance(new Buyer2());
        Buyer2_DynamicProxy.buybuybuy();
    }
}
