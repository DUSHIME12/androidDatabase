package com.example.onlineshoping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etusername,etpassword;
    TextView txtregister;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etusername=(EditText)findViewById(R.id.etusername);
        etpassword=(EditText)findViewById(R.id.etpassword);
        txtregister=(TextView)findViewById(R.id.txtregister);
        btnlogin=(Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "loged to the navigation drawer", Toast.LENGTH_SHORT).show();
                Intent login=new Intent(MainActivity.this,Categories.class);
                startActivity(login);
            }
        });
        txtregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "register your self here", Toast.LENGTH_SHORT).show();
                Intent register=new Intent(MainActivity.this,Register.class);
                startActivity(register);
            }
        });
    }
}
