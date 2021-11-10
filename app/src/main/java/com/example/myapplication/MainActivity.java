package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText edit1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button1);
        edit1=(EditText)findViewById(R.id.etNum);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tr= Double.parseDouble(edit1.getText().toString())*9/5;
                double rs=tr+32;
                TextView text=(TextView)findViewById(R.id.tv2) ;
                String tt = String.valueOf(rs);
                text.setText("華氏為"+tt);
            }
        });
    }
}