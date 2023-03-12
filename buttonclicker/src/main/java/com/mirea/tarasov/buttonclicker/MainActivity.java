package com.mirea.tarasov.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("My number on the list №22");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }
    public void onButClick(View view) {
        Toast.makeText(this, "Try again!", Toast.LENGTH_SHORT).show();
    }

    public void onMBClick(View view) {
        Toast.makeText(this, "Who are you?", Toast.LENGTH_SHORT).show();
    }
}