package com.testapp.ic.content;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created on 2/27/15.
 */
public class FragmentPageAdder extends FragmentPagerAdapter {

    /*
     * Number of pages to be made, must update the array tabTitles, and the PAGE_COUNT variable.
     */
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Tab 1", "Tab 2", "Tab 3", "Tab 4" };
    private Context context;

    public FragmentPageAdder(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}