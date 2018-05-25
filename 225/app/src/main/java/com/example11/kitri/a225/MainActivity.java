package com.example11.kitri.a225;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5
    , R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
    TextView resultView1;
    String num1, num2;
    Integer result;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("테이블레이아웃 계산기");
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        resultView1 = (TextView) findViewById(R.id.resultView1);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "먼저 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    resultView1.setText("계산 결과 : " + result.toString());
                }return false;
            }
        });
        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "먼저 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    resultView1.setText("계산 결과 : " + result.toString());
                }
                return false;
            }
        });
        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "먼저 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    resultView1.setText("계산 결과 : " + result.toString());
                }
                return false;
            }
        });
        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "먼저 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    resultView1.setText("계산 결과 : " + result.toString());
                }return false;
            }
        });

        for(i=0; i<numBtnIDs.length; i++) {
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }

        for(i=0; i<numBtnIDs.length; i++) {
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(edit1.isFocused() == true) {
                        num1 = edit1.getText().toString()+numButtons[index].getText().toString();
                        edit1.setText(num1);
                    } else if(edit2.isFocused() == true) {
                        num2 = edit2.getText().toString()+numButtons[index].getText().toString();
                        edit2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(), "먼저 에디트텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}

