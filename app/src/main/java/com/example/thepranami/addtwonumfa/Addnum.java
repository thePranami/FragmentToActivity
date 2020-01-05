package com.example.thepranami.addtwonumfa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Addnum extends Fragment {
    EditText e1, e2;
    Button button;

    public Addnum() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_addnum, container, false);

        e1 = (EditText) view.findViewById(R.id.ed1);
        e2 = (EditText) view.findViewById(R.id.ed2);
        button = (Button) view.findViewById(R.id.result_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2, res;
             n1 = Integer.parseInt(e1.getText().toString());
             n2 = Integer.parseInt(e2.getText().toString());
             res = n1+n2;
             MainActivity mainActivity = (MainActivity) getActivity();
             mainActivity.disp(res);
            }
        });
        return view;
    }
}
