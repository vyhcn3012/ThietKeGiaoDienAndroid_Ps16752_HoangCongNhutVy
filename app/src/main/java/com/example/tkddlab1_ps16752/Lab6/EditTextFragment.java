package com.example.tkddlab1_ps16752.Lab6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.tkddlab1_ps16752.R;

import org.jetbrains.annotations.NotNull;

public class EditTextFragment extends Fragment {

    Button btnEdt;
    EditText edtFrag;
    TextView txtRight;

    public EditTextFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnEdt = view.findViewById(R.id.button4);
        edtFrag = view.findViewById(R.id.editTextTextPersonName);

        btnEdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi = edtFrag.getText().toString();
                FragmentManager ma = getActivity().getSupportFragmentManager();
                RightFragment rf = (RightFragment) ma.findFragmentById(R.id.rightFrame);
                rf.tv.setText(chuoi);
            }
        });
    }

//    @Override
//    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        edtFrag = view.findViewById(R.id.edtFig);
//        btnEdt = view.findViewById(R.id.button4);
//        txtRight = view.findViewById(R.id.txtTextRight);
//
//        btnEdt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String chuoi = edtFrag.getText().toString();
//                FragmentManager ma = getActivity().getSupportFragmentManager();
//                RightFragment rf = (RightFragment) ma.findFragmentById(R.id.rightFrame);
//                rf.tv.setText(chuoi);
//            }
//        });
//    }



    public static EditTextFragment newInstance() {
        EditTextFragment fragment = new EditTextFragment();
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
        return inflater.inflate(R.layout.fragment_editext, container, false);
    }
}
