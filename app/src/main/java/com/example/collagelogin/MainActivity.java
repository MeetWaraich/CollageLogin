package com.example.collagelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.collagelogin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(view->{
            Intent intent = new Intent(MainActivity.this, login.class);
            startActivity(intent);
        });
        binding.btnSignUp.setOnClickListener(view->{
            Intent intent = new Intent(MainActivity.this, signUp.class);
            startActivity(intent);
        });

    }
}