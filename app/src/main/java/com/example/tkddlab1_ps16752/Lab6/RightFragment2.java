package com.example.tkddlab1_ps16752.Lab6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tkddlab1_ps16752.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RightFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RightFragment2 extends Fragment {

    public RightFragment2() {
        // Required empty public constructor
    }

    public static RightFragment2 newInstance() {
        RightFragment2 fragment = new RightFragment2();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_right2, container, false);
    }
}