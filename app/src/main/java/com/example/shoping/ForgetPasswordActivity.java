package com.example.shoping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ForgetPasswordActivity extends AppCompatActivity {

    //UI view
    private ImageButton backBtn;
    private EditText emailEt;
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        init();
    }

    //initialize view
    private void init() {
        backBtn = findViewById(R.id.backBtn);
        emailEt = findViewById(R.id.emailEt);
        sendBtn = findViewById(R.id.sendBtn);

        //when user clicked on back button
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}