package com.example.kisaanshop;

import android.app.LauncherActivity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PricesFragment extends Fragment {

    ListView listViewItems;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_prices, container, false);

        listViewItems = view.findViewById(R.id.listview111);

        String[] predefinedItems = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10", "Item 11", "Item 12", "Item 13", "Item 14"};
        items = new ArrayList<>(Arrays.asList(predefinedItems));

        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, items);
        listViewItems.setAdapter(adapter);





        return view;
    }
}