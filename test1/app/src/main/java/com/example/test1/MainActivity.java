package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    Button btnexit;
    EditText txtuser;
    EditText txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }
    private void setBtnlogin(){
        if (txtuser.getText().toString().equals("huy") && txtpass.getText().toString().equals("huy"))
        {
            Intent main = new Intent(this,danhsach.class);
            startActivity(main);
        }
        else{
            Toast.makeText(this, "nhap lai",Toast.LENGTH_SHORT).show();
        }
    }
    private void addEvents() {
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtnlogin();
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void addControls() {
        btnlogin = findViewById(R.id.btnlogin);
        btnexit = findViewById(R.id.btnExit);
        txtpass = findViewById(R.id.txtpass);
        txtuser = findViewById(R.id.txtuser);
    }

}
