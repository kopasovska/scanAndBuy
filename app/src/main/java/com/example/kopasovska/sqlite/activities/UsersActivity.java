package com.example.kopasovska.sqlite.activities;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kopasovska.sqlite.R;
import com.example.kopasovska.sqlite.model.User;
import com.example.kopasovska.sqlite.sql.DatabaseHelper;

/**
 * Created by Kopasovska on 03.12.2017.
 */

public class UsersActivity extends AppCompatActivity {

    private final AppCompatActivity activity = UsersActivity.this;
    private LinearLayout linearLayout;
    private TextView textViewName;

    private DatabaseHelper databaseHelper;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_users);


            linearLayout = findViewById(R.id.linearLayout);
            textViewName = findViewById(R.id.text_view_name);


            String nameFromIntent = getIntent().getStringExtra("EMAIL");
            textViewName.setText("Welcome " + nameFromIntent);


            databaseHelper = new DatabaseHelper(activity);
            user = new User();


    }


}
