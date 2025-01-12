package com.example.kisaanshop.SELL_BUY_Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kisaanshop.Adapters.RecipeAdapter;
import com.example.kisaanshop.Byuing_Cart_Frag;
import com.example.kisaanshop.Classes.RecyclerItemClickListener;
import com.example.kisaanshop.Models.RecipeModel;
import com.example.kisaanshop.R;
import com.example.kisaanshop.cartt;

import java.util.ArrayList;

public class Selling_Act extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selling);

        recyclerView = findViewById(R.id.recyclerview5);

        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.img_7, "Wheat", "5100"));
        list.add(new RecipeModel(R.drawable.img_8, "Corn", "3300"));
        list.add(new RecipeModel(R.drawable.img_9, "pearl millet", "3550"));
        list.add(new RecipeModel(R.drawable.img_10, "Rice", "5300"));
        list.add(new RecipeModel(R.drawable.img_11, "Potatoes", "2870"));
        list.add(new RecipeModel(R.drawable.img_12, "SugarCane", "2120"));
        list.add(new RecipeModel(R.drawable.img_13, "Vegetables", "1700"));

        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                RecipeModel selectedRecipe = list.get(position);
                Bundle bundle = new Bundle();
                bundle.putString("cropName", selectedRecipe.getTxt1());

                Byuing_Cart_Frag byuingCartFrag = new Byuing_Cart_Frag();
                byuingCartFrag.setArguments(bundle);

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction().addToBackStack(null);
                transaction.replace(R.id.fram333, byuingCartFrag);
                transaction.commit();


            }

            @Override
            public void onLongItemClick(View view, int position) {
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        }
        ));
    }
}



