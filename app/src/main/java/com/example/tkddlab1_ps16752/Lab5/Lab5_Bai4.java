package com.example.tkddlab1_ps16752.Lab5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tkddlab1_ps16752.Lab4.Lab4_Bai5;
import com.example.tkddlab1_ps16752.Lab4.MenuLab4;
import com.example.tkddlab1_ps16752.R;

public class Lab5_Bai4 extends AppCompatActivity {

    Button btnLogon;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5_bai4);

        btnLogon = findViewById(R.id.button);
        tv2 = findViewById(R.id.txtLs);

        btnLogon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Lab5_Bai4.this);
                LayoutInflater inflater = Lab5_Bai4.this.getLayoutInflater();
                View view = inflater.inflate(R.layout.login_item, null);
                builder.setView(view);
                builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        EditText edtUser, edtPass;
                        edtUser = view.findViewById(R.id.username);
                        edtPass = view.findViewById(R.id.pass);
                        if(edtUser.getText().toString().equals("admin") && edtPass.getText().toString().equals("123")){
                            tv2.setText("Đăng nhập thành công");
                        }else{
                            tv2.setText("Đăng nhập thát bại");
                        }
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tv2.setText("Login Exit");
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }

    public void openMenu5(View view){
        Intent intent = new Intent(Lab5_Bai4.this, MenulLab5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slidr_in_left);
    }
}