package com.example.kisaanshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {

    EditText email, pass;
    DatabaseReference databaseReference;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.login_email);
        pass = findViewById(R.id.login_password);

        btn = findViewById(R.id.signin_page_btn);
        txt = findViewById(R.id.signup_txtview);

        databaseReference = FirebaseDatabase.getInstance("https://kisaan-shop-5240b-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("User");




        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, signup.class);
                startActivity(intent);
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String email1 = email.getText().toString().trim();
//                String password1 = pass.getText().toString().trim();
//
//                if (!email1.isEmpty() && !password1.isEmpty()) {
//                    databaseReference.orderByChild("email1").equalTo(email1).addListenerForSingleValueEvent(new ValueEventListener() {
//                        @Override
//                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                            if (dataSnapshot.exists()) {
//                                for (DataSnapshot userSnapshot : dataSnapshot.getChildren()) {
//                                    Helper user = userSnapshot.getValue(Helper.class);
//                                    if (user != null && user.getUpassword().equals(password1)) {
//                                        Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                                        startActivity(new Intent(login.this, MainActivity.class));
//                                    } else {
//                                        Toast.makeText(login.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
//                                    }
//                                }
//                            }
//                        }
//
//                        @Override
//                        public void onCancelled(@NonNull DatabaseError error) {
//                            Toast.makeText(login.this, "Database Error", Toast.LENGTH_SHORT).show();
//                        }
//                    });
//                } else {
//                    Toast.makeText(login.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
//                }
//          }



                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}