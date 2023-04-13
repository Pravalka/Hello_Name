package com.example.hello_name;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hello_name.R;

public class MainActivity extends AppCompatActivity {
    EditText username;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.name);
        b = findViewById(R.id.display);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = username.getText().toString();
                Toast.makeText(MainActivity.this, "Hello " + s, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

