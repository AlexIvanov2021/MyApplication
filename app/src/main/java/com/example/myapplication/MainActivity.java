package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);

        LessonTwo lessonTwo_one = new LessonTwo(1, "a" );
        LessonTwo lessonTwo_two = new LessonTwo(1,"a");

        textView.append("hashCode()lessonTwo_one"+lessonTwo_one.hashCode()+"\n" );
        textView.append("hashCode() lessonTwo_two"+ lessonTwo_two.hashCode()+"\n");
        textView.append("" + lessonTwo_one.equals(lessonTwo_two));


    }

}



