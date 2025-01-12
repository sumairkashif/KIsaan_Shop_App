package com.example.kisaanshop;

import android.app.ProgressDialog;
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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    EditText username, email, password;

    FirebaseDatabase database;
    DatabaseReference reference;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.signup_username);
        email = findViewById(R.id.signup_email);
        password = findViewById(R.id.signup_password);

        btn = findViewById(R.id.signup_page_btn);
        txt = findViewById(R.id.login_txtview);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                database = FirebaseDatabase.getInstance("https://kisaan-shop-5240b-default-rtdb.asia-southeast1.firebasedatabase.app/");
                reference = database.getReference("User");
                String username1 = username.getText().toString();
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();

                if (!username1.isEmpty() && !email1.isEmpty() && !password1.isEmpty()) {
                    Helper helper = new Helper(username1, email1, password1);
                    reference.child(username1).setValue(helper);


                    Toast.makeText(signup.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(signup.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(signup.this, "Please Fill all the requirements", Toast.LENGTH_SHORT).show();
                }
            }

        });

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });
    }
}