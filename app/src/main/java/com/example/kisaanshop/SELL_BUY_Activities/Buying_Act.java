package com.example.kisaanshop.SELL_BUY_Activities;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kisaanshop.BuyingItems.Crop_Frag;
import com.example.kisaanshop.BuyingItems.Fertilizers_Frag;
import com.example.kisaanshop.BuyingItems.Pesticide_Frag;
import com.example.kisaanshop.BuyingItems.Seeds_Frag;
import com.example.kisaanshop.R;

public class Buying_Act extends AppCompatActivity {

    ImageView img, img1, img2, img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_buying);

        img = findViewById(R.id.crop_img);
        img1 = findViewById(R.id.fert_img);
        img2 = findViewById(R.id.pest_img);
        img3 = findViewById(R.id.seed_img);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.fram2, new Crop_Frag()).addToBackStack(null).commit();
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.fram2, new Fertilizers_Frag()).addToBackStack(null).commit();

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.fram2, new Pesticide_Frag()).addToBackStack(null).commit();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.fram2, new Seeds_Frag()).addToBackStack(null).commit();
            }
        });
    }

}