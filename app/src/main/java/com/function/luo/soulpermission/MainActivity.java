package com.function.luo.soulpermission;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.function.luo.soulpermission.guide.ApiGuideActivity;
import com.function.luo.soulpermission.guide.ApiGuideAppComponentActivity;
import com.function.luo.soulpermission.guide.WithPagerFragmentActivity;
import com.function.luo.soulpermission.guide.fragment.ContainerActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 用SoulPermission之前
     * @param view
     */
    public void before(View view) {
        startActivity(new Intent(MainActivity.this, BeforeActivity.class));
    }

    /**
     * 用SoulPermission之后
     * @param view
     */
    public void after(View view) {
        startActivity(new Intent(MainActivity.this, AfterActivity.class));
    }

    /**
     * Activity 中引导使用
     * @param view
     */
    public void apiGuideActivity(View view) {
        startActivity(new Intent(MainActivity.this, ApiGuideActivity.class));
    }
    /**
     * ApiGuideAppComponentActivity 中引导使用
     * @param view
     */
    public void apiGuideAppComponentActivity(View view) {
        startActivity(new Intent(MainActivity.this, ApiGuideAppComponentActivity.class));
    }

    /**
     * Fragment 中引导使用
     * @param view
     */
    public void fragment(View view) {
        ContainerActivity.start(this, false);
    }
    /**
     * supportFragment 中引导使用
     * @param view
     */
    public void supportFragment(View view) {
        ContainerActivity.start(this, true);
    }
    /**
     * fragmentWithViewPager 中引导使用
     * @param view
     */
    public void fragmentWithViewPager(View view) {
        startActivity(new Intent(MainActivity.this, WithPagerFragmentActivity.class));
    }

}
