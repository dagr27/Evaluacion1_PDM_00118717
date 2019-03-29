package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button send;
    private LinearLayout b1, b2, b3,b4,b5,b6,b7,b8,b9;
    Integer c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0, total=0;
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    private EditText name, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        send = findViewById(R.id.sendbt);
        t1 = findViewById(R.id.txt1);
        t2 = findViewById(R.id.txt2);
        t3 = findViewById(R.id.txt3);
        t4 = findViewById(R.id.txt4);
        t5 = findViewById(R.id.txt5);
        t6 = findViewById(R.id.txt6);
        t7 = findViewById(R.id.txt7);
        t8 = findViewById(R.id.txt8);
        t9 = findViewById(R.id.txt9);
        name = findViewById(R.id.user);
        email = findViewById(R.id.email);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1 +=1;
                t1.setText(c1.toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2 +=1;
                t2.setText(c2.toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c3 +=1;
                t3.setText(c3.toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c4 +=1;
                t4.setText(c4.toString());
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c5 +=1;
                t5.setText(c5.toString());
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c6 +=1;
                t6.setText(c6.toString());
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c7 +=1;
                t7.setText(c7.toString());
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c8 +=1;
                t8.setText(c8.toString());
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c9 +=1;
                t9.setText(c9.toString());
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total = c1+c2+c3+c4+c5+c6+c7+c8+c9;
                Intent mIntent = new Intent(MainActivity.this, newActivity.class);
                mIntent.putExtra("k1",t1.getText().toString());
                mIntent.putExtra("k2",t2.getText().toString());
                mIntent.putExtra("k3",t3.getText().toString());
                mIntent.putExtra("k4",t4.getText().toString());
                mIntent.putExtra("k5",t5.getText().toString());
                mIntent.putExtra("k6",t6.getText().toString());
                mIntent.putExtra("k7",t7.getText().toString());
                mIntent.putExtra("k8",t8.getText().toString());
                mIntent.putExtra("k9",t9.getText().toString());
                mIntent.putExtra("user",name.getText().toString());
                mIntent.putExtra("mail",email.getText().toString());
                mIntent.putExtra("total",total.toString());
                startActivity(mIntent);
            }
        });

    }
}
