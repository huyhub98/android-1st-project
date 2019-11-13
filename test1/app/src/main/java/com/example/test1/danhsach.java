package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class danhsach extends AppCompatActivity {
    Button btnOK;
    Button btnExit;
    CheckBox chkPT2;
    CheckBox chkShh;
    CheckBox chkXau;
    CheckBox chkTinnhan;
    CheckBox chkImage;
    CheckBox chkCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsach);
        addControls();
        addEvents();
    }
    private void addEvents() {
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chkPT2.isChecked()){
                    Intent intent = new Intent(this,GPTBH.class);
                    startActivity(intent);
                }
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void addControls(){
        btnOK = findViewById(R.id.btnOK);
        btnExit = findViewById(R.id.btnExit);
        chkPT2 = findViewById(R.id.chkPT2);
        chkShh = findViewById(R.id.chkShh);
        chkXau = findViewById(R.id.chkXau);
        chkTinnhan = findViewById(R.id.chkTinnhan);
        chkImage = findViewById(R.id.chkImage);
        chkCall = findViewById(R.id.chkCall);
    }

}
