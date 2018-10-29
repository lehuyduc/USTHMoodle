package vn.edu.usth.mypro.Messages;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import vn.edu.usth.mypro.EmptyFragment;

public class MessagesPagerAdapter extends FragmentPagerAdapter {
    private static final int PAGE_COUNT = 2;
    private String titles[] = new String[] {"Messages","Contact"};

    public MessagesPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int page) {
        switch (page) {
            case 0: return new MyMessagesFragment();
            case 1: return new ContactsFragment();
        }
        return new EmptyFragment();
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
