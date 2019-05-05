package com.group6.scamproject_131class;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        final EditText ed = (EditText) findViewById(R.id.pass);
        CheckBox c = (CheckBox) findViewById(R.id.checkBox);

        c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // TODO Auto-generated method stub
                if (!isChecked) {
                    ed.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    ed.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }

            }
        });
    }

    public void onClickButton(View view){
        if(view.getId() == R.id.bLogin){

            EditText username = (EditText) findViewById(R.id.name);
            String user = username.getText().toString();
            EditText password = (EditText) findViewById(R.id.pass);
            String pass = password.getText().toString();

            String test = helper.searchPass(user);

            if(pass.equals(test)){
                Toast.makeText(Login.this, "Login Success!", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(Login.this, "Username or Password do not match!", Toast.LENGTH_SHORT).show();
            }
        }
        if(view.getId() == R.id.bSignup){
            Intent intent = new Intent(Login.this, Signup.class);
            startActivity(intent);
        }
    }
}

