package com.example.tkddlab1_ps16752.Lab6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tkddlab1_ps16752.R;

public class RightFragment extends Fragment {

    TextView tv;
    public RightFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment Lab6_Bai1.
     */
    // TODO: Rename and change types and number of parameters
    public static RightFragment newInstance() {
        RightFragment fragment = new RightFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.right_fragment, container, false);
        tv = v.findViewById(R.id.txtTextRight);
        return v;
    }
}
