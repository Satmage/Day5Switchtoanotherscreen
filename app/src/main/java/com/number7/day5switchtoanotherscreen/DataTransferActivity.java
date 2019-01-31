package com.number7.day5switchtoanotherscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataTransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer);

        // Значения по умолчанию
        String username = "Asdasd";
        String gift = "sdsa";

        username = getIntent().getStringExtra("u");
        gift = getIntent().getStringExtra("g");

        TextView textViewDataTransfer = findViewById(R.id.textViewDataTransfer);
        textViewDataTransfer.setText(username + ", отправил вам следующее сообщение: " + gift);

    }
}
