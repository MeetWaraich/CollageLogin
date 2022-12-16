package com.example.collagelogin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    EditText username;
    EditText password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_loginInLogin);
        btn_login.setOnClickListener(view -> {
            if(username.getText().toString().equals("admin")&&password.getText().toString().equals("Admin@123")){
                Toast.makeText(this, "Welcome Admin", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Please enter valid credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

