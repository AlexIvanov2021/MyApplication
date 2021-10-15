package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.button);

        textView.append("onCreate " +"\n");

   button.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent = new Intent(MainActivity.this,SecondActivity.class);
           startActivity(intent);
       }
   });
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.append("onStart " +"\n");


    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.append("onResume " +"\n");

    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.append("onPause " +"\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView.append("onStop " +"\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.append("onDestroy " +"\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.append("onRestart " +"\n");
    }
}