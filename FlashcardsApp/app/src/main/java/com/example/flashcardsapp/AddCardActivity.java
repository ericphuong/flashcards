package com.example.flashcardsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                if (data != null) {
                    data.putExtra("string1", ((EditText) findViewById(R.id.editQuestionField)).getText().toString());
                    data.putExtra("string2", ((EditText) findViewById(R.id.editAnswerField)).getText().toString());
                }

                setResult(RESULT_OK, data);
                finish();
            }
        });

    }
}