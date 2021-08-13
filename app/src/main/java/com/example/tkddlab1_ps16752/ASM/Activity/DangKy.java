package com.example.tkddlab1_ps16752.ASM.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tkddlab1_ps16752.ASM.DAO.LoginDAO;
import com.example.tkddlab1_ps16752.R;
import com.google.android.material.textfield.TextInputEditText;

public class DangKy extends AppCompatActivity {

    TextInputEditText edtRGUser, edtRGPass, edtRGPassAgain;
    Button btnRGSig;
    LoginDAO loginDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        loginDAO = new LoginDAO(this);

    }

    public void openDangNhap(View view){
        Intent intent = new Intent(DangKy.this, DangNhap.class);
        startActivity(intent);
    }

    public void openDangKy(View view){
        edtRGUser = (TextInputEditText) findViewById(R.id.edTextname);
        edtRGPass = (TextInputEditText) findViewById(R.id.edTextPass);
        edtRGPassAgain = (TextInputEditText)  findViewById(R.id.edTextPassAgain);

        String user = edtRGUser.getText().toString();
        String pass = edtRGPass.getText().toString();
        String repass = edtRGPassAgain.getText().toString();

        if(user.equals("")||pass.equals("")||repass.equals(""))
            Toast.makeText(DangKy.this, "Vui lòng nhập tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
        else{
            if(pass.equals(repass)){
                Boolean checkuser = loginDAO.checkusername(user);
                if(checkuser==false){
                    Boolean insert = loginDAO.insertData(user, pass);
                    if(insert==true){
                        Toast.makeText(DangKy.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),DangNhap.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(DangKy.this, "Đăng ký thất bai!", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(DangKy.this, "Tài khoản này đã có! Đăng ký một tài khoản khác!", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(DangKy.this, "Mật khẩu không giống nhau!", Toast.LENGTH_SHORT).show();
            }
        }
    }

}