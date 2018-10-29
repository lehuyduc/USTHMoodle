package vn.edu.usth.mypro.Messages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import vn.edu.usth.mypro.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyMessagesFragment extends Fragment {

    @BindView(R.id.mymessages_searchview)
    SearchView searchView;

    @BindView(R.id.mymessages_rv)
    RecyclerView rvList;
    MyMessagesAdapter myAdapter;

    public MyMessagesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_messages, container, false);
        ButterKnife.bind(this,view);

        myAdapter = new MyMessagesAdapter();
        myAdapter.notifyDataSetChanged();
        rvList.setAdapter(myAdapter);
        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
