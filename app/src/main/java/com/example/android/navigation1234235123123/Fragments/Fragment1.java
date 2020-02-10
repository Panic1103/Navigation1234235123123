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


public class Fragment1 extends Fragment implements View.OnClickListener {

    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        ((Button)view.findViewById(R.id.btnNext1)).setOnClickListener(this);
        ((Button)view.findViewById(R.id.btnBack1)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNext1:
                navController.navigate(R.id.action_fragment1_to_fragment2);
                break;
            case R.id.btnBack1:
                break;
        }
    }
}
