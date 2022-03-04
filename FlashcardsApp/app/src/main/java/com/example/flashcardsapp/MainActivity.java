package com.example.flashcardsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.flashcard_question)).setVisibility(View.INVISIBLE);
                ((TextView) findViewById(R.id.flashcard_answer)).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.flashcard_question)).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.flashcard_answer)).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.first_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.first_answer).setBackgroundColor(getResources().getColor(R.color.red));
            }
        });

        findViewById(R.id.second_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.second_answer).setBackgroundColor(getResources().getColor(R.color.red));
            }
        });

        findViewById(R.id.third_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.third_answer).setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        findViewById(R.id.toggle_choices_invisibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(R.id.toggle_choices_invisibility)).setVisibility(View.INVISIBLE);
                ((ImageView) findViewById(R.id.toggle_choices_visibility)).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.first_answer)).setVisibility(View.INVISIBLE);
                ((TextView) findViewById(R.id.second_answer)).setVisibility(View.INVISIBLE);
                ((TextView) findViewById(R.id.third_answer)).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) findViewById(R.id.toggle_choices_visibility)).setVisibility(View.INVISIBLE);
                ((ImageView) findViewById(R.id.toggle_choices_invisibility)).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.first_answer)).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.second_answer)).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.third_answer)).setVisibility(View.VISIBLE);
            }
        });



    }
}