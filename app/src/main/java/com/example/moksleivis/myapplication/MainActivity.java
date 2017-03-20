package com.example.moksleivis.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void veikla (View v){
        Intent intent = new Intent (MainActivity.this, LoggedActivity.class);
        startActivity(intent);

    }
}