package com.cztek.concept.tabbarcontroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.cztek.concept.uitabbarcontroller.UITabBarController;

public class MainActivity extends AppCompatActivity {
    private UITabBarController mUITabBarController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        mUITabBarController = (UITabBarController)findViewById(R.id.bottom_bar);
//        mUITabBarController.init(getSupportFragmentManager())
//                .setImgSize(90,90)
//                .setFontSize(12)
//                .setTabPadding(4,6,10)
//                .setChangeColor(Color.GREEN,Color.RED)
//                .addTabItem("1",)
    }
}
