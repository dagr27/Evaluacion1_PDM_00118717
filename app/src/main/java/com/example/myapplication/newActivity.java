package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class newActivity extends AppCompatActivity {
    Integer c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0, total=0;
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9, nombre, ttal, email1;
    private Button share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        nombre = findViewById(R.id.username);
        ttal = findViewById(R.id.total);
        share = findViewById(R.id.share);
        email1 = findViewById(R.id.email1);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            nombre.setText(mIntent.getStringExtra("user"));
            ttal.setText(mIntent.getStringExtra("total"));
            email1.setText(mIntent.getStringExtra("mail"));
            t1.setText(mIntent.getStringExtra("k1"));
            t2.setText(mIntent.getStringExtra("k2"));
            t3.setText(mIntent.getStringExtra("k3"));
            t4.setText(mIntent.getStringExtra("k4"));
            t5.setText(mIntent.getStringExtra("k5"));
            t6.setText(mIntent.getStringExtra("k6"));
            t7.setText(mIntent.getStringExtra("k7"));
            t8.setText(mIntent.getStringExtra("k8"));
            t9.setText(mIntent.getStringExtra("k9"));

        }
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mmIntent = new Intent();
                mmIntent.setAction(Intent.ACTION_SEND);
                mmIntent.setType("text/plain");
                startActivity(mmIntent);
            }
        });


    }
}
