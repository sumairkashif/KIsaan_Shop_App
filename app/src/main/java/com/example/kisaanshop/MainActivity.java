package com.example.kisaanshop;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.kisaanshop.items_list.buying_frag;
import com.example.kisaanshop.items_list.selling_frag;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        BottomNavigationView bnv = findViewById(R.id.btm_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new HomeFragment()).commit();
        bnv.setOnItemSelectedListener(item->{
            Fragment selectedFrag = null;

            if(item.getItemId()==R.id.home1){
                selectedFrag= new HomeFragment();
            }
            else if(item.getItemId()==R.id.itemlist1){
                selectedFrag= new DataFragment();
            }
            else if(item.getItemId()==R.id.rates1){
                selectedFrag= new PricesFragment();
            }
            else if(item.getItemId()==R.id.info1){
                selectedFrag=new scrol();
            }
            else{
                return false;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,selectedFrag).commit();
            return true;
        });


    }


}