package com.example.fragmentsusinginterfaces;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class rightf extends Fragment {


    public rightf() {
        // Required empty public constructor
    }

    public static rightf newInstance() {
        rightf fragment = new rightf();
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
       View v= inflater.inflate(R.layout.fragment_rightf, container, false);


       return v;

    }
}