 package com.example.android_2;

import androidx.appcompat.app.AppCompatActivity;

//import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import java.util.stream.IntStream;

 public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;
    Button bt3;
    TextView tx1;
    TextView tx2;

    EditText et;

    float price= 2.4f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        tx1=findViewById(R.id.edit);
        tx2=findViewById(R.id.text3);
        et=findViewById(R.id.edit);
        bt1.setOnClickListener(view -> {
            int quantity=Integer.parseInt(et.getText().toString());
            if(quantity>0)
            {
                tx1.setText(quantity);
            }
                }
        );
        bt2.setOnClickListener(view ->
        {
            int quantity=Integer.parseInt(et.getText().toString());
            tx1.setText(quantity);
        });
        bt3.setOnClickListener(view -> {
            int order=Integer.parseInt(bt3.getText().toString());
            tx2.setText((int) (order*2.4f));
        });
    }
}