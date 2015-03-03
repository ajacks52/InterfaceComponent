package com.testapp.ic.main;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import android.os.Bundle;

import com.testapp.ic.R;
import com.testapp.ic.content.FragmentPageAdder;
import com.testapp.ic.layout.SlidingTabLayout;

import java.util.Random;

/**
 * Created on 2/27/15.
 */
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentPageAdder(getSupportFragmentManager(),
                MainActivity.this));

        // Give the SlidingTabLayout the ViewPager
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
        // Center the tabs in the layout
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);
        slidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {

            /* Change the color of the tabs */
            @Override
            public int getIndicatorColor(int position) {
                int color;
                switch (position)
                {
                    case 0: color =  Color.BLUE;
                        break;
                    case 1: color =  Color.RED;
                        break;
                    case 2: color =  Color.GREEN;
                        break;
                    case 3: color =  Color.CYAN;
                        break;
                    default: Random rnd = new Random();
                        color =  Color.rgb(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
                }
                return color;
            }
        });
    }

}
