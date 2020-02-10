package com.example.android.navigation1234235123123.Fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.navigation1234235123123.R;


public class Fragment2 extends Fragment implements View.OnClickListener {

    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }

    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        ((Button)view.findViewById(R.id.btnNext2)).setOnClickListener(this);
        ((Button)view.findViewById(R.id.btnBack2)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNext2:
                navController.navigate(R.id.action_fragment2_to_fragment3);
                break;
            case R.id.btnBack2:
                navController.navigate(R.id.fragment1);
                break;
        }
    }
}
