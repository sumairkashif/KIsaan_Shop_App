package com.example.kisaanshop.BuyingItems;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.kisaanshop.Adapters.RecipeAdapter;
import com.example.kisaanshop.Byuing_Cart_Frag;
import com.example.kisaanshop.Classes.RecyclerItemClickListener;
import com.example.kisaanshop.Models.RecipeModel;
import com.example.kisaanshop.R;

import java.util.ArrayList;


public class Pesticide_Frag extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crop_, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);

        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.img_7, "Sona Urea", "4000"));
        list.add(new RecipeModel(R.drawable.img_8, "Sona DAP", "2800"));
        list.add(new RecipeModel(R.drawable.img_9, "pearl millet", "3000"));
        list.add(new RecipeModel(R.drawable.img_10, "Rice", "4500"));
        list.add(new RecipeModel(R.drawable.img_11, "Potatos", "3400"));
        list.add(new RecipeModel(R.drawable.img_12, "SugarCane", "2200"));
        list.add(new RecipeModel(R.drawable.img_13, "Zabardast", "1500"));

        RecipeAdapter adapter = new RecipeAdapter(list, getContext());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                switch (position){
                    case 0:
                        replaceFragment(new Byuing_Cart_Frag());
                        break;

                    case 1:
                        replaceFragment(new Byuing_Cart_Frag());
                        break;
                    case 2:
                        replaceFragment(new Byuing_Cart_Frag());
                        break;
                    case 3:
                        replaceFragment(new Byuing_Cart_Frag());
                        break;
                    case 4:
                        replaceFragment(new Byuing_Cart_Frag());
                        break;
                    case 5:
                        replaceFragment(new Byuing_Cart_Frag());
                        break;
                    case 6:
                        replaceFragment(new Byuing_Cart_Frag());
                        break;

                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {
                // Handle long item click if necessary
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Not used, but required by the interface
            }
        }
        ));

        return view;
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fram33, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}


