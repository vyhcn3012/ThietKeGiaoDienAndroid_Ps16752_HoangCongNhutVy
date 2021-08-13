package com.example.tkddlab1_ps16752.ASM.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tkddlab1_ps16752.ASM.DAO.LoginDAO;
import com.example.tkddlab1_ps16752.R;
import com.google.android.material.textfield.TextInputEditText;

public class DangNhap extends AppCompatActivity {

    TextInputEditText edtLGUser, edtLGPass;
    LoginDAO loginDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        loginDAO = new LoginDAO(this);

    }

    public void openDangKy(View view){
        Intent intent = new Intent(DangNhap.this, DangKy.class);
        startActivity(intent);
    }

    public void openMainActivity(View view){
        edtLGUser = findViewById(R.id.edTextname);
        edtLGPass = findViewById(R.id.edTextPass);

        String user = edtLGUser.getText().toString();
        String pass = edtLGPass.getText().toString();

        if(user.equals("")||pass.equals(""))
            Toast.makeText(DangNhap.this, "Vui lòng nhập tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
        else{
            Boolean checkuserpass = loginDAO.checkusernamepassword(user, pass);
            if(checkuserpass==true){
                Toast.makeText(DangNhap.this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(DangNhap.this, "Đăng nhập thất bại!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}