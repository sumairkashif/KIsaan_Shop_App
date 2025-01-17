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
import android.widget.TextView;

import com.example.kisaanshop.Adapters.RecipeAdapter;
import com.example.kisaanshop.Byuing_Cart_Frag;
import com.example.kisaanshop.Classes.RecyclerItemClickListener;
import com.example.kisaanshop.Models.RecipeModel;
import com.example.kisaanshop.R;

import java.util.ArrayList;


public class Crop_Frag extends Fragment {


    RecyclerView recyclerView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crop_, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);

        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.img_7, "Wheat", "4000"));
        list.add(new RecipeModel(R.drawable.img_8, "Corn", "2800"));
        list.add(new RecipeModel(R.drawable.img_9, "pearl millet", "3000"));
        list.add(new RecipeModel(R.drawable.img_10, "Rice", "4500"));
        list.add(new RecipeModel(R.drawable.img_11, "Potatoes", "3400"));
        list.add(new RecipeModel(R.drawable.img_12, "SugarCane", "2200"));
        list.add(new RecipeModel(R.drawable.img_13, "Vegetables", "1500"));


        RecipeAdapter adapter = new RecipeAdapter(list, getContext());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);


        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {


            public void onItemClick(View view, int position) {
                RecipeModel selectedRecipe = list.get(position);
                Bundle bundle = new Bundle();
                bundle.putString("cropName", selectedRecipe.getTxt1());

                Byuing_Cart_Frag byuingCartFrag = new Byuing_Cart_Frag();
                byuingCartFrag.setArguments(bundle);

                replaceFragment(byuingCartFrag);
            }


            @Override
            public void onLongItemClick(View view, int position) {
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
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


