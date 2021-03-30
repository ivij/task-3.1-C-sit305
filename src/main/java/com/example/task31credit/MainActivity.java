package com.example.task31credit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    TextView textView1,textView2;
    EditText name;


    public void startButton(View view)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("username",name.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        name = findViewById(R.id.name);

        if (name != null)
        {
            Intent intent = getIntent();
            String names = intent.getStringExtra("username");
            name.setText(names);
        }

    }


}