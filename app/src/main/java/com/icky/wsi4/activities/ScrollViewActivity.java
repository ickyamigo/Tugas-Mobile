package com.icky.wsi4.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.icky.wsi4.R;

public class ScrollViewActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        btn1  = findViewById(R.id.button);
        btn2 = findViewById(R.id.button3);
        btn3 = findViewById(R.id.button4);
        btn4 = findViewById(R.id.button5);
        btn5 = findViewById(R.id.button7);
        btn6 = findViewById(R.id.button8);
    }
}
