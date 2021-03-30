package com.example.task31credit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView textView3,textView4,textView5;
    int progress = 1;
    int score = 0;
    ProgressBar progressBar;
    String response,option,choice,chance,col;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,submitButton,nextButton,nextButton1,nextButton2,nextButton3,nextButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        submitButton = findViewById(R.id.submitButton);
        nextButton = findViewById(R.id.nextButton);
        nextButton1 = findViewById(R.id.nextButton1);
        nextButton2 = findViewById(R.id.nextButton2);
        nextButton3 = findViewById(R.id.nextButton3);
        nextButton4 = findViewById(R.id.nextButton4);
        progressBar = findViewById(R.id.progressBar);

        Intent intent = getIntent();
        String name = intent.getStringExtra("username");
        textView3.setText("Welcome " + name + "!" );

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                response = "one";
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                response = "two";
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                response = "three";
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option = "one";
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option = "two";
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option = "three";
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = "one";
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = "two";
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = "three";
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chance = "one";
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chance = "two";
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chance = "three";
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                col = "one";
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                col = "two";
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                col = "three";
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(response == "one")
                {
                    button1.setBackgroundColor(Color.RED);
                    button3.setBackgroundColor(Color.GREEN);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton.setEnabled(true);
                    nextButton.setVisibility(View.VISIBLE);

                }
                else if(response == "two")
                {
                    button2.setBackgroundColor(Color.RED);
                    button3.setBackgroundColor(Color.GREEN);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton.setEnabled(true);
                    nextButton.setVisibility(View.VISIBLE);

                }
                else if(response == "three")
                {
                    button3.setBackgroundColor(Color.GREEN);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton.setEnabled(true);
                    nextButton.setVisibility(View.VISIBLE);
                    score++;
                }

                else if(option == "one") {

                    button4.setBackgroundColor(Color.GREEN);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton1.setEnabled(true);
                    nextButton1.setVisibility(View.VISIBLE);
                    score++;
                }

                else if(option == "two")
                {
                    button4.setBackgroundColor(Color.GREEN);
                    button5.setBackgroundColor(Color.RED);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton1.setEnabled(true);
                    nextButton1.setVisibility(View.VISIBLE);

                }

                else if(option == "three") {
                    button4.setBackgroundColor(Color.GREEN);
                    button6.setBackgroundColor(Color.RED);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton1.setEnabled(true);
                    nextButton1.setVisibility(View.VISIBLE);
                }

                else if(choice == "one") {

                    button8.setBackgroundColor(Color.GREEN);
                    button7.setBackgroundColor(Color.RED);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton2.setEnabled(true);
                    nextButton2.setVisibility(View.VISIBLE);

                }

                else if(choice == "two")
                {
                    button8.setBackgroundColor(Color.GREEN);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton2.setEnabled(true);
                    nextButton2.setVisibility(View.VISIBLE);
                    score++;
                }

                else if(choice == "three") {
                    button8.setBackgroundColor(Color.GREEN);
                    button9.setBackgroundColor(Color.RED);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton2.setEnabled(true);
                    nextButton2.setVisibility(View.VISIBLE);
                }
                else if(chance == "one") {

                    button11.setBackgroundColor(Color.GREEN);
                    button10.setBackgroundColor(Color.RED);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton3.setEnabled(true);
                    nextButton3.setVisibility(View.VISIBLE);

                }

                else if(chance == "two")
                {
                    button11.setBackgroundColor(Color.GREEN);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton3.setEnabled(true);
                    nextButton3.setVisibility(View.VISIBLE);
                    score++;
                }

                else if(chance == "three") {
                    button11.setBackgroundColor(Color.GREEN);
                    button12.setBackgroundColor(Color.RED);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton3.setEnabled(true);
                    nextButton3.setVisibility(View.VISIBLE);
                }

                else if(col == "one") {

                    button15.setBackgroundColor(Color.GREEN);
                    button13.setBackgroundColor(Color.RED);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton.setEnabled(true);
                    nextButton4.setVisibility(View.VISIBLE);

                }

                else if(col == "two")
                {
                    button15.setBackgroundColor(Color.GREEN);
                    button14.setBackgroundColor(Color.RED);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton4.setEnabled(true);
                    nextButton4.setVisibility(View.VISIBLE);

                }

                else if(col == "three") {
                    button15.setBackgroundColor(Color.GREEN);
                    submitButton.setEnabled(false);
                    submitButton.setVisibility(View.INVISIBLE);
                    nextButton4.setEnabled(true);
                    nextButton4.setVisibility(View.VISIBLE);
                    score++;

                }

                else
                {
                    Toast.makeText( MainActivity2.this ,  "Please select an option before pressing Submit Button",Toast.LENGTH_LONG).show();
                }

            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView4.setText("Topic: question 2");
                textView5.setText("What is the unit code of this unit?");
                button1.setEnabled(false);
                button1.setVisibility(View.INVISIBLE);
                button2.setEnabled(false);
                button2.setVisibility(View.INVISIBLE);
                button3.setEnabled(false);
                button3.setVisibility(View.INVISIBLE);
                button4.setEnabled(true);
                button4.setVisibility(View.VISIBLE);
                button5.setEnabled(true);
                button5.setVisibility(View.VISIBLE);
                button6.setEnabled(true);
                button6.setVisibility(View.VISIBLE);
                response = null;
                submitButton.setEnabled(true);
                submitButton.setVisibility(View.VISIBLE);
                nextButton.setEnabled(false);
                nextButton.setVisibility(View.INVISIBLE);
                progressBar.setProgress((progress + 1));
                progress++;
            }
        });

        nextButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView4.setText("Topic: question 3");
                textView5.setText("What is the name of the Unit chair of this unit?");
                button4.setEnabled(false);
                button4.setVisibility(View.INVISIBLE);
                button5.setEnabled(false);
                button5.setVisibility(View.INVISIBLE);
                button6.setEnabled(false);
                button6.setVisibility(View.INVISIBLE);
                button7.setEnabled(true);
                button7.setVisibility(View.VISIBLE);
                button8.setEnabled(true);
                button8.setVisibility(View.VISIBLE);
                button9.setEnabled(true);
                button9.setVisibility(View.VISIBLE);
                option = null;
                submitButton.setEnabled(true);
                submitButton.setVisibility(View.VISIBLE);
                nextButton1.setEnabled(false);
                nextButton1.setVisibility(View.INVISIBLE);
                progressBar.setProgress((progress + 1));
                progress++;
            }
        });

        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView4.setText("Topic: question 4");
                textView5.setText("How to make a dropbox list");
                button7.setEnabled(false);
                button7.setVisibility(View.INVISIBLE);
                button8.setEnabled(false);
                button8.setVisibility(View.INVISIBLE);
                button9.setEnabled(false);
                button9.setVisibility(View.INVISIBLE);
                button10.setEnabled(true);
                button10.setVisibility(View.VISIBLE);
                button11.setEnabled(true);
                button11.setVisibility(View.VISIBLE);
                button12.setEnabled(true);
                button12.setVisibility(View.VISIBLE);
                choice = null;
                submitButton.setEnabled(true);
                submitButton.setVisibility(View.VISIBLE);
                nextButton2.setEnabled(false);
                nextButton2.setVisibility(View.INVISIBLE);
                progressBar.setProgress((progress + 1));
                progress++;
            }
        });

        nextButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView4.setText("Topic: question 5");
                textView5.setText("How to close an application");
                button10.setEnabled(false);
                button10.setVisibility(View.INVISIBLE);
                button11.setEnabled(false);
                button11.setVisibility(View.INVISIBLE);
                button12.setEnabled(false);
                button12.setVisibility(View.INVISIBLE);
                button13.setEnabled(true);
                button13.setVisibility(View.VISIBLE);
                button14.setEnabled(true);
                button14.setVisibility(View.VISIBLE);
                button15.setEnabled(true);
                button15.setVisibility(View.VISIBLE);
                chance = null;
                submitButton.setEnabled(true);
                submitButton.setVisibility(View.VISIBLE);
                nextButton3.setEnabled(false);
                nextButton3.setVisibility(View.INVISIBLE);
                progressBar.setProgress((progress + 1));
                progress++;
            }
        });

    }

    public void NextButton(View view)
    {
        Intent intent = getIntent();
        Intent intent2 = new Intent(this, MainActivity3.class);
        intent2.putExtra("marks",score);
        intent2.putExtra("username",intent.getStringExtra("username"));
        startActivity(intent2);

    }
}