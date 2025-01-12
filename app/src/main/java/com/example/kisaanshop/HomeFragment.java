package com.example.kisaanshop;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.kisaanshop.SELL_BUY_Activities.Buying_Act;
import com.example.kisaanshop.SELL_BUY_Activities.Selling_Act;


public class HomeFragment extends Fragment {


    Button btn, btn1;

    TextView textView;

    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_home, container, false);

         btn = view.findViewById(R.id.buy_btn);
        btn1 = view.findViewById(R.id.sell_btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Selling_Act.class);
                startActivity(intent);
            }
        });
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getActivity(), Buying_Act.class);
                 startActivity(intent);
             }
         });
        return view;


    }
}