package com.fg.lat2_akb12_10116520_fajarabdulghani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerifyActivity extends AppCompatActivity {
    // Kamis, 18 April 2019, 10116520- Fajar Abdul Ghani - AKB12
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        Button a = (Button) findViewById(R.id.btn_verify);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VerifyActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });

    }
}
