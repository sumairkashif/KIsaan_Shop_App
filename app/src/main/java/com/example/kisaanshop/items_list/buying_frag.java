package com.example.kisaanshop.items_list;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.kisaanshop.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class buying_frag extends Fragment {

    ListView listViewItems;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_buying_frag, container, false);

        listViewItems = view.findViewById(R.id.listview11);
        list = new ArrayList<>();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, list);


        list.add("Items1 5000");
        list.add("Items2 5200");
        list.add("Items3 3400");
        list.add("Items4 7600");
        list.add("Items5 86100");
        list.add("Items6 4550");
        list.add("Items7 8700");
        list.add("Items8 2300");


        if (getArguments() != null) {
            String data = getArguments().getString("value");
            list.add(data);
            adapter.notifyDataSetChanged();
        }


        listViewItems.setAdapter(arrayAdapter);


        return view;
    }
}