package com.example.tailor;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.tailor.user.ForgetPasswordActivity;

public class LoginActivity extends AppCompatActivity {
  EditText inputEmailLogin, inputPasswordLogin;
  TextView forgotPassword;
  Button btnSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignin = (Button) findViewById(R.id.btnSignIn);

        inputEmailLogin = findViewById(R.id.inputEmailLogin);
        inputPasswordLogin = findViewById(R.id.inputPasswordLogin);

        forgotPassword = findViewById(R.id.forgotPassword);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ForgetPasswordActivity.class));
            }
        });

        TextView signup = findViewById(R.id.signupLogin);
        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmailLogin.getText().toString();
                String password = inputPasswordLogin.getText().toString();
                if(email.equals("email") && password.equals("123"))
                {
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }
                else
                    {
                        Toast.makeText(LoginActivity.this, "Email and password are invalid", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}