package com.example.kisaanshop.items_list;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.kisaanshop.R;

import java.util.ArrayList;


//public class selling_frag extends Fragment {
//    ListView listView;
//    ArrayAdapter<Integer> adapter;
//    ArrayList<Integer> listItems;
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_selling_frag, container, false);
//        listView = view.findViewById(R.id.listview10);
//        listItems = new ArrayList<>();
//        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, listItems);
//        listView.setAdapter(adapter);
//
//        if (getArguments() != null) {
//            String data = getArguments().getString("value");
//            assert data != null;
//            int valu11 = Integer.parseInt(data);
//            listItems.add(valu11);
//            adapter.notifyDataSetChanged();
//        }
//
//        return view;
//    }
//}







public class selling_frag extends Fragment {

    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> items;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_selling_frag, container, false);

        listView = view.findViewById(R.id.listview10);
        items = new ArrayList<>();
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String receivedText = bundle.getString("text_key");
            if (receivedText != null) {
                items.add(receivedText);
                adapter.notifyDataSetChanged();
            }
        }

        return view;
    }
}

