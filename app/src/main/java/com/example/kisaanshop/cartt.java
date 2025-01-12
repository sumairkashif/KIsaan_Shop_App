package com.example.kisaanshop;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.kisaanshop.Byuing_Cart_Frag;
import com.example.kisaanshop.R;

public class cartt extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartt);

        // Retrieve the data from the intent
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            Byuing_Cart_Frag byuingCartFrag = new Byuing_Cart_Frag();
            byuingCartFrag.setArguments(bundle);

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.kashi, byuingCartFrag);
            transaction.commit();
        }
    }
}
