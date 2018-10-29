package vn.edu.usth.mypro.Messages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.SearchView;

import butterknife.BindView;
import butterknife.ButterKnife;
import vn.edu.usth.mypro.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends Fragment {

    @BindView(R.id.contacts_searchview)
    SearchView searchView;

    @BindView(R.id.contacts_rv)
    RecyclerView rvList;
    ContactsAdapter myAdapter;

    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contacts, container, false);
        ButterKnife.bind(this,view);

        myAdapter = new ContactsAdapter();
        myAdapter.notifyDataSetChanged();
        rvList.setAdapter(myAdapter);
        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
