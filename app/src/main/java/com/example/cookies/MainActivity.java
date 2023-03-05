package com.example.cookies;

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
    }

    public void eatCookie(View view){
        TextView fullText = (TextView) findViewById(R.id.text);
        fullText.setText("I'm full! :)");

        ImageView fullCookie = (ImageView) findViewById(R.id.image);
        fullCookie.setImageResource(R.drawable.after_cookie);
    }
}