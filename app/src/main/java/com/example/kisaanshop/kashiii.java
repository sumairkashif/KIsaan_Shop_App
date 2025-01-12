package com.example.kisaanshop;

import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kisaanshop.DataBase.DatabaseHelper;

import java.util.ArrayList;

public class kashiii extends Fragment {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> listItems = new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kashiii, container, false);

        listView = view.findViewById(R.id.userlist);
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, listItems);
        listView.setAdapter(adapter);

        // Retrieve the value from the bundle
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value = bundle.getString("value");
            if (value != null) {
                listItems.add(value);
                adapter.notifyDataSetChanged();
            }
        }

        return view;
    }
}
