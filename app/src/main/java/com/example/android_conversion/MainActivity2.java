package com.example.android_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ProgressBar progbar = findViewById(R.id.Loading);

        long msFuture = 3000;
        progbar.setMax((int)msFuture);

        Intent iniciar= new Intent(this, MainActivity.class);

        new CountDownTimer(msFuture, 1000)
        {
            public void onTick(long msUntilFinished)
            {
                progbar.setProgress((int)msUntilFinished);
            }
            public void onFinish() {
                startActivity(iniciar);
            }
        }.start();

    }
}