package com.example3.kitri.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnNate;
    Button btn911;
    Button btnGal;
    Button btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNate = (Button) findViewById(R.id.btnNate);
        btnNate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "네이트 홈페이지 열기", Toast.LENGTH_SHORT).show();
            }
        });

        btn911 = (Button) findViewById(R.id.btn911);
        btn911.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "911 응급전화 걸기", Toast.LENGTH_SHORT).show();
            }
        });

        btnGal = (Button) findViewById(R.id.btnGal);
        btnGal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "갤러리 열기", Toast.LENGTH_SHORT).show();
            }
        });

        btnEnd = (Button) findViewById(R.id.btnEnd);
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "끝내기", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
