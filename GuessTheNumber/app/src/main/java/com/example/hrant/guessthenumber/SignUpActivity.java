package com.example.hrant.guessthenumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import client.RestClient;

public class SignUpActivity extends AppCompatActivity {
    RestClient restClient;
    Button signUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        restClient = RestClient.getInstance();
        signUpButton = (Button)findViewById(R.id.activity_sign_up_sign_up_button);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,PhoneConfirmActivity.class);
                startActivity(intent);
            }
        });
    }
}
