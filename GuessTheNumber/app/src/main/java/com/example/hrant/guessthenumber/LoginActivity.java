package com.example.hrant.guessthenumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import client.RestClient;

public class LoginActivity extends AppCompatActivity {
    RestClient restClient;
    EditText usernameEditText;
    EditText passwordEditText;
    Button signInButton;
    Button signUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        restClient = RestClient.getInstance();
        usernameEditText = (EditText)findViewById(R.id.username_edit_text);
        passwordEditText =(EditText)findViewById(R.id.password_edit_text);
        signInButton = (Button)findViewById(R.id.sign_in_button);
        signUpButton = (Button)findViewById(R.id.activity_login_sign_up_button);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
