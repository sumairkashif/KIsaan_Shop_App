package com.example.kisaanshop;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kisaanshop.items_list.buying_frag;
import com.example.kisaanshop.items_list.selling_frag;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class Byuing_Cart_Frag extends Fragment {

    Button check_btn, pay_btn;
    EditText etd;
    TextView editTextPrice;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_byuing__cart_, container, false);

        editTextPrice = view.findViewById(R.id.total_price);
        check_btn = view.findViewById(R.id.check_btn);
        pay_btn = view.findViewById(R.id.pay_btn);
        etd = view.findViewById(R.id.amount_enter);

        check_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = etd.getText().toString();
                int valu = Integer.parseInt(str);
                Bundle bundle = getArguments();
                if (bundle != null) {
                    String cropName = bundle.getString("cropName");
                    int valu1 = Integer.parseInt(cropName);
                    int abc = valu* valu1;
                    editTextPrice.setText(String.valueOf(abc));
                    String ss = editTextPrice.getText().toString();
                    pay_btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String numericValue = editTextPrice.getText().toString();
                            Bundle bundle = new Bundle();
                            bundle.putString("value", ss);

                            selling_frag secondFragment = new selling_frag();
                            secondFragment.setArguments(bundle);

                            showMessageBox("You have paid "+abc);

                        }
                    });

                }
            }
        });



        return view;
    }
    private void showMessageBox(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Payment Successfull");
        builder.setMessage(message);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}




