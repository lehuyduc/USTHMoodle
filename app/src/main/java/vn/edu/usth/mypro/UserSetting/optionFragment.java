package vn.edu.usth.mypro.UserSetting;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import vn.edu.usth.mypro.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class optionFragment extends Fragment {


    public optionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_option, container, false);
  /*      Button button = (Button) view.findViewById(R.id.btn_conferma);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
            }
        });*/
        return view;
    }

}
