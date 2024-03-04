package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        RadioGroup Question1 = findViewById(R.id.answerGroup);

        Question1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id == R.id.answer1){
                    Toast.makeText(Question1.this, "You choose answer A", Toast.LENGTH_SHORT).show();
                    StoreScore.score++;
                }
                else if(id == R.id.answer2){
                    Toast.makeText(Question1.this, "You choose answer B", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.answer3){
                    Toast.makeText(Question1.this, "You choose answer C", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Question1.this, "You choose answer D", Toast.LENGTH_SHORT).show();
                }
                Intent newIntent = new Intent(Question1.this, Question2.class);
                startActivity(newIntent);
            }
        });
    }
}