package com.example.deeproute;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class loginPage extends AppCompatActivity {

    EditText t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        t1 = (EditText) findViewById(R.id.username);
        t2 = (EditText) findViewById(R.id.username2);
    }
    public void CheckLogin(View view){
        Intent intent = getIntent();
        String username = intent.getStringExtra(register_page.EXTRA_MESSAGE);
        String password = intent.getStringExtra(register_page.EXTRA_MESSAGE2);
        String thisUsername = t1.getText().toString();
        String thisPass = t2.getText().toString();

        if (Objects.equals(username, thisUsername) && Objects.equals(password, thisPass)){
            Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(this, search_city.class);
            startActivity(intent1);
        }else{
            Toast.makeText(this, "Login UnSuccessfully", Toast.LENGTH_SHORT).show();
        }
    }
}