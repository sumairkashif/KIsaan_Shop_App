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


public class Fertilizers_Frag extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fertilizers_, container, false);

        recyclerView = view.findViewById(R.id.recyclerview1);

        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.img_22, "Urea", "4000"));
        list.add(new RecipeModel(R.drawable.img_23, "DAP", "5500"));
        list.add(new RecipeModel(R.drawable.img_24, "Nitrogen", "3700"));
        list.add(new RecipeModel(R.drawable.img_25, "Phosphorus", "9000"));
        list.add(new RecipeModel(R.drawable.img_26, "Organic", "3400"));
        list.add(new RecipeModel(R.drawable.img_27, "Manure", "2200"));
        list.add(new RecipeModel(R.drawable.img_28, "Potassium", "3500"));

        RecipeAdapter adapter = new RecipeAdapter(list, getContext());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
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


