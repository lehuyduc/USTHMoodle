package vn.edu.usth.mypro.Home;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import vn.edu.usth.mypro.Home.Courses.CoursesFragment;

public class HomePagerAdapter extends FragmentPagerAdapter {
    private static final int PAGE_COUNT = 3;
    private String titles[] = new String[] {"Site home","Courses","Timeline"};

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int page) {
        Log.d("Pager_get_item","Hello");
        switch (page) {
            case 0: return new SitehomeFragment();
            case 1: return new CoursesFragment();
            case 2: return new TimelineFragment();
        }
        return new SitehomeFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
