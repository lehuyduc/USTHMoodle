package vn.edu.usth.mypro.Home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import vn.edu.usth.mypro.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SitehomeFragment extends Fragment {


    public SitehomeFragment() {
        // Required empty public constructor
    }

    @BindView(R.id.sitehome_rv)
    RecyclerView rvList;
    SiteNewsAdapter myAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("Inflating","Hello");
        View view = inflater.inflate(R.layout.fragment_sitehome, container, false);
        ButterKnife.bind(this,view);

        myAdapter = new SiteNewsAdapter();
        myAdapter.notifyDataSetChanged();
        rvList.setAdapter(myAdapter);
        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        Log.d("Aadpter","" + myAdapter.getItemCount());
        return view;
    }

}
