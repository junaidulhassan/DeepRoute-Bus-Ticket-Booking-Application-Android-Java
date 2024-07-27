package com.example.deeproute;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class register_page extends AppCompatActivity {
    EditText name,uname,pass,cPass;
    public static String EXTRA_MESSAGE="Hassan";
    public static String EXTRA_MESSAGE1="Ali";
    public static String EXTRA_MESSAGE2="Emir";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        name = (EditText) findViewById(R.id.username);
        uname = (EditText) findViewById(R.id.username2);
        pass = (EditText) findViewById(R.id.username3);
        cPass = (EditText) findViewById(R.id.username4);
    }
    public void Registered(View view){
        String nameTxt = name.getText().toString();
        String unameTxt = uname.getText().toString();
        String passTxt = pass.getText().toString();
        String cPassTxt = cPass.getText().toString();
        if(!nameTxt.isEmpty() && !unameTxt.isEmpty() && !passTxt.isEmpty()){
            if (passTxt.equals(cPassTxt)){
                Intent intent = new Intent(this, loginPage.class);
                intent.putExtra(EXTRA_MESSAGE,nameTxt);
                intent.putExtra(EXTRA_MESSAGE1,unameTxt);
                intent.putExtra(EXTRA_MESSAGE2,passTxt);
                startActivity(intent);
                name.setText("");
                uname.setText("");
                pass.setText("");
                cPass.setText("");
            }else{
                Toast.makeText(this, "Password not matched", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "Please fill all form", Toast.LENGTH_SHORT).show();
        }
    }
}