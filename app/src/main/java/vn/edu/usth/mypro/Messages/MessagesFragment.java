package vn.edu.usth.mypro.Messages;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import vn.edu.usth.mypro.R;


public class MessagesFragment extends Fragment {

    @BindView(R.id.messages_tabs)
    TabLayout tabs;

    @BindView(R.id.messages_viewpager)
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_messages, container, false);
        ButterKnife.bind(this,view);

        MessagesPagerAdapter adapter = new MessagesPagerAdapter(getChildFragmentManager());
        adapter.notifyDataSetChanged();
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);

        return view;
    }
}
