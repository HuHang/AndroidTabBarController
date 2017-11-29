package com.cztek.concept.tabbarcontroller.tab_bar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.cztek.concept.tabbarcontroller.R;
import com.cztek.concept.tabbarcontroller.tab_bar.tab_bar_fragment_1.fragments.OneFragment;
import com.cztek.concept.tabbarcontroller.tab_bar.tab_bar_fragment_2.fragments.TwoFragment;
import com.cztek.concept.tabbarcontroller.tab_bar.tab_bar_fragment_3.fragments.ThreeFragment;
import com.cztek.concept.uitabbarcontroller.UITabBarController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        UITabBarController mUITabBarController = findViewById(R.id.bottom_bar);
        mUITabBarController.init(getSupportFragmentManager())
                .setSelectedColor(Color.RED)
                .addTabItem("首页", R.mipmap.icon_tabbar_selected0, R.mipmap.icon_tabbar0, OneFragment.class)
                .addTabItem("详情", R.mipmap.icon_tabbar_selected1, R.mipmap.icon_tabbar1, TwoFragment.class)
                .addTabItem("我的", R.mipmap.icon_tabbar_selected2, R.mipmap.icon_tabbar2, ThreeFragment.class);
    }
}
