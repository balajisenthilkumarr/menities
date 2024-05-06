package com.example.menities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Signuppage extends AppCompatActivity {
    EditText email;
    EditText password;
    EditText conformpssword;
    EditText username;
    TextView Signup;
    RadioButton mentar,menties;
    RadioGroup radio;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);
        Signup=(TextView) findViewById(R.id.Sign);
        mentar=(RadioButton) findViewById(R.id.mentarsignupadioButton);
        menties=(RadioButton) findViewById(R.id.mentiessignupradioButton) ;
        radio=(RadioGroup) findViewById(R.id.singupratiogrup) ;

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radio.getCheckedRadioButtonId();
                RadioButton selectedRadioButton1 = findViewById(selectedId);
                if(selectedRadioButton1==menties) {
                    Intent nextScreen = new Intent(Signuppage.this, MainActivity.class);
                    startActivity(nextScreen);
                }
                else if(selectedRadioButton1==mentar)
                {
                    Intent nextScreen = new Intent(Signuppage.this, mentarhome.class);
                    startActivity(nextScreen);
                }
            }
        });

    }
}