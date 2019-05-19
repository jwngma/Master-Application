package com.example.tryl.FragmentStatePagerAdapter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tryl.R;



public class BlankFragment extends Fragment {

    private TextView textView;


    public BlankFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_blank2, container, false);
        textView=view.findViewById(R.id.frag_text);
        Bundle bundle=getArguments();
        String message=Integer.toString(bundle.getInt("count"));
        textView.setText(message);




        return  view;
    }

}
