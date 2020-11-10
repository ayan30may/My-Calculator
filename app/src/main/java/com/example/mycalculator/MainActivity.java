package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_dot,btn_0,btn_equal,btn_add,btn_sub,btn_mul,btn_div,btn_clear,btn_delete;
    EditText input_text;
    TextView calculator_text;
    float res1,res2;
    boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
        btn_0=findViewById(R.id.btn_0);
        btn_dot=findViewById(R.id.btn_dot);
        btn_equal=findViewById(R.id.btn_equal);
        btn_add=findViewById(R.id.btn_add);
        btn_sub=findViewById(R.id.btn_sub);
        btn_mul=findViewById(R.id.btn_mul);
        btn_div=findViewById(R.id.btn_div);
        btn_clear=findViewById(R.id.btn_clear);
        btn_delete=findViewById(R.id.btn_delete);

        input_text=findViewById(R.id.input_text);
        calculator_text=findViewById(R.id.calculator_text);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+"0");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText(input_text.getText()+".");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input_text==null){
                    input_text.setText("");
                }else{
                    res1=Float.parseFloat(input_text.getText()+"");
                    Add=true;
                    input_text.setText(null);
                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input_text==null){
                    input_text.setText("");
                }else{
                    res1=Float.parseFloat(input_text.getText()+"");
                    Sub=true;
                    input_text.setText(null);
                }
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input_text==null){
                    input_text.setText("");
                }else{
                    res1=Float.parseFloat(input_text.getText()+"");
                    Mul=true;
                    input_text.setText(null);
                }
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input_text==null){
                    input_text.setText("");
                }else{
                    res1=Float.parseFloat(input_text.getText()+"");
                    Div=true;
                    input_text.setText(null);
                }
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2=Float.parseFloat(input_text.getText()+"");
                if(Add==true){
                    input_text.setText(res1+res2+"");
                    Add=false;
                }

                if(Sub==true){
                    input_text.setText(res1-res2+"");
                    Sub=false;
                }

                if(Mul==true){
                    input_text.setText(res1*res2+"");
                    Mul=false;
                }

                if(Div==true){
                    input_text.setText(res1/res2+"");
                    Div=false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText("");
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=input_text.getText().toString();
                s=s.substring(0,s.length()-1);
                input_text.setText(s);
            }
        });
    }
}