package com.example.stringcustmization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText string;
    Button enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        string= findViewById(R.id.string);
        enter =findViewById(R.id.enter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=string.getText().toString();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);

                i.putExtra("name_key", name);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "String is succesfully added!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}


