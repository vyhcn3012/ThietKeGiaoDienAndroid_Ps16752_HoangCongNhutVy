package com.example.tkddlab1_ps16752.Lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tkddlab1_ps16752.R;
import com.google.android.material.textfield.TextInputLayout;

public class Lab7_Bai2 extends AppCompatActivity {

    private TextInputLayout edtName, edtPass, edtEmail;
    private Button btnSign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab7_bai2);

        edtName = findViewById(R.id.edTextname);
        edtPass = findViewById(R.id.edTextPass);
        edtEmail = findViewById(R.id.edTextEmail);
        btnSign = findViewById(R.id.button_signup);

        btnSign.setOnClickListener(this::submitData);

        edtEmail.setErrorTextColor(ColorStateList.valueOf(Color.RED));
    }

    private boolean validateEmailAddress(){
        String emailAddress = edtEmail.getEditText().getText().toString().trim();

        if(emailAddress.isEmpty()){
            edtEmail.setError("Email is required. Can't be empty");
            return false;
        }else{
            edtEmail.setError(null);
            return true;
        }
    }

    private boolean validatePassword(){
        String password = edtPass.getEditText().getText().toString().trim();
        if(password.isEmpty()) {
            edtPass.setError("Password is required. Can't be empty");
            return false;
        }else if(password.length() < 8){
            edtPass.setError("Password is short. Characters are required");
            return false;
        }else{
            edtPass.setError(null);
            return true;
        }
    }

    private boolean validateUsername() {
        String username = edtName.getEditText().getText().toString().trim();

        if (username.isEmpty()) {
            edtName.setError("Password is required. Can't be empty");
            return false;
        } else if (username.length() < 10) {
            edtName.setError("Password is short. Characters are required");
            return false;
        } else {
            edtName.setError(null);
            return true;
        }
    }

    private void submitData(View view){
        if(!validateEmailAddress() | !validatePassword() | !validateUsername()){
            return;
        }

        String data = edtEmail.getEditText().getText().toString().trim() + "\n" +
                edtPass.getEditText().getText().toString().trim() + "\n" +
                edtName.getEditText().getText().toString().trim();

        Toast.makeText(Lab7_Bai2.this, data, Toast.LENGTH_SHORT).show();
    }
    public void bai3Lab7Lesson(View view){
        Intent intent = new Intent(Lab7_Bai2.this, Lession_Lab7_Bai3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
        }
}