package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        RadioGroup answerGroup2 = findViewById(R.id.answerGroup2);

        answerGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id == R.id.ans1){
                    Toast.makeText(Question3.this, "You choose answer A", Toast.LENGTH_SHORT).show();
                    StoreScore.score++;
                }
                else if(id == R.id.ans2){
                    Toast.makeText(Question3.this, "You choose answer B", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.ans3){
                    Toast.makeText(Question3.this, "You choose answer C", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Question3.this, "You choose answer D", Toast.LENGTH_SHORT).show();
                }
                Intent newIntent2 = new Intent(Question3.this, Question4.class);
                startActivity(newIntent2);
            }
        });
    }
}