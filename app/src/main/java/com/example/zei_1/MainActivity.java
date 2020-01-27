package com.example.zei_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcNum(View view){
        EditText editText1=(EditText)findViewById(R.id.editText1);
        String str1 = editText1.getText().toString();
        double num1 = Double.parseDouble(str1);
        double result = num1*1.08;
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        String str3 = String.valueOf(result);
        textView1.setText(str3);
    }
}
