package com.function.luo.soulpermission.guide;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import com.function.luo.soulpermission.R;
import com.function.luo.soulpermission.guide.fragment.PagerItemFragment;

import java.util.Arrays;
import java.util.List;

public class WithPagerFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_fragment);
        findViewById(R.id.FragmentPagerAdapter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewPager viewPager = findViewById(R.id.vp);
                viewPager.setAdapter(new MyFragmentAdapter(getSupportFragmentManager()));
            }
        });
        findViewById(R.id.FragmentStatePagerAdapter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewPager viewPager = findViewById(R.id.vp);
                viewPager.setAdapter(new MyFragmentStateAdapter(getSupportFragmentManager()));
            }
        });
    }

    class MyFragmentStateAdapter extends FragmentStatePagerAdapter {
        private final static int TAB_COUNT = 3;

        private List<Integer> listData = Arrays.asList(Color.RED, Color.GREEN, Color.BLUE);

        MyFragmentStateAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public PagerItemFragment getItem(int position) {
            return PagerItemFragment.get(listData.get(position));
        }

        @Override
        public int getCount() {
            return TAB_COUNT;
        }
    }

    class MyFragmentAdapter extends FragmentPagerAdapter {
        private final static int TAB_COUNT = 3;

        private List<Integer> listData = Arrays.asList(Color.RED, Color.GREEN, Color.BLUE);

        MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public PagerItemFragment getItem(int position) {
            return PagerItemFragment.get(listData.get(position));
        }

        @Override
        public int getCount() {
            return TAB_COUNT;
        }
    }
}
