package com.example.task2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText_lower_case = findViewById(R.id.editText_lower_case);
        EditText editText_to_upper = findViewById(R.id.editText_to_upper);
        Button btn_to_uppercase = findViewById(R.id.btn_to_uppercase);

        btn_to_uppercase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText_lower_case.getText().toString();
                editText_to_upper.setText(text.toUpperCase());
            }
        });
    }
}