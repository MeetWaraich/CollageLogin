package com.example.collagelogin;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class signUp extends AppCompatActivity {
    EditText sign_username;
    EditText sign_password;
    EditText firstName;
    EditText lastName;
    EditText email;
    Button btn_signup;
    ArrayList<String> allUsers =new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        sign_username = findViewById(R.id.et_username);
        sign_password = findViewById(R.id.et_password);
        email = findViewById(R.id.email);
        btn_signup = findViewById(R.id.btn_signUp);

        btn_signup.setOnClickListener(View ->{
            validateUser();
            if(addUser(sign_username)){
                Toast.makeText(this,"Username Taken...Please another Username...",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this,"successfully registered",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                alertDialog.setMessage("Are you sure!");
                alertDialog.setPositiveButton("ok", (dialog, id) -> {
                    firstName.setText("");
                    lastName.setText("");
                    sign_password.setText("");
                    sign_username.setText("");
                    email.setText("");
                });
                alertDialog.setNegativeButton("cancel",null);
                alertDialog.create();
                alertDialog.show();
            }
        });
    }
    public void validateUser(){
        if(firstName.getText().toString().equals("")){
            Toast.makeText(this, "Please Enter first name", Toast.LENGTH_SHORT).show();
        }else if(lastName.getText().toString().equals("")){
            Toast.makeText(this,"Please Enter last name",Toast.LENGTH_SHORT).show();
        }else if(email.getText().toString().equals("")) {
            Toast.makeText(this, "Please Enter email", Toast.LENGTH_SHORT).show();
        }else if(sign_username.getText().toString().equals("")) {
            Toast.makeText(this, "Please Enter username", Toast.LENGTH_SHORT).show();
        }else if(sign_username.getText().toString().equals("")){
            Toast.makeText(this,"Please Enter password",Toast.LENGTH_SHORT).show();
        }
    }
    public boolean addUser(EditText username){
        boolean flag = false;
        for(String i: allUsers){
            allUsers.add(username.getText().toString());
            flag = true;
        }
        return flag;
    }
}