package com.example.hw1android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.ed);
        tw = findViewById(R.id.textwelcome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Вы зарегистрировлись успешно!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Вас приветсвует Viewpager!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}