package com.example.fragmentsusinginterfaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Leftf lf;
    private rightf rf;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int orientation=getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();

            lf=Leftf.newInstance();
            rf=rightf.newInstance();
            //ft.replace(R.id.fcv1,lf);
            //ft.replace(R.id.fcv2,rf);
            ft.commit();
        }
    }
}