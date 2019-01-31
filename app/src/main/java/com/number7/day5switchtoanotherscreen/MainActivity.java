package com.number7.day5switchtoanotherscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWho;
    private EditText editTextDescription;
    private TextView textViewDataTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWho = findViewById(R.id.editTextWho);
        editTextDescription = findViewById(R.id.editTextDescription);
        textViewDataTransfer = findViewById(R.id.textViewDataTransfer);
    }


    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onClickSend(View view) {
        Intent intent = new Intent(MainActivity.this, DataTransferActivity.class);
        intent.putExtra("u", editTextWho.getText().toString());
        intent.putExtra("g", editTextDescription.getText().toString());
        startActivity(intent);
    }

}
