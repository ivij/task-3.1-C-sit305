package com.example.task31credit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView textView, score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textView);
        score = findViewById(R.id.score);


        Intent intent2 = getIntent();
        int scores = intent2.getIntExtra("marks",0);
        String name = intent2.getStringExtra("username") ;
        score.setText(scores + "/5" );
        textView.setText("Congratulations " + name + "!" );

    }

    public void finishButton(View view)
    {
        finish();
        moveTaskToBack(true);
    }

    public void newQuizButton(View view)
    {
        Intent intent = getIntent();
        Intent intent3 = new Intent(this, MainActivity.class);
        intent3.putExtra("username",intent.getStringExtra("username"));
        startActivity(intent3);
    }

}