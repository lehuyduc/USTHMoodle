package vn.edu.usth.mypro.Home.Courses;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import vn.edu.usth.mypro.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CoursesFragment extends Fragment {

    @BindView(R.id.courses_spinner)
    Spinner spinner;

    @BindView(R.id.courses_rv)
    RecyclerView rvList;
    CoursesListAdapter myAdapter;

    public CoursesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_courses, container, false);

        ButterKnife.bind(this,view);

        String[] items = new String[] {"In progress","Future","Past"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this.getContext(), android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(adapter);

        myAdapter = new CoursesListAdapter();
        myAdapter.notifyDataSetChanged();
        rvList.setAdapter(myAdapter);
        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
