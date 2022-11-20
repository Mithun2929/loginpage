package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        }catch (Exception e) {
        }

        setContentView(R.layout.activity_main);

        TextView tvsignup =findViewById(R.id.tvsignup);
        TextView tvsignupsecond =findViewById(R.id.tvsignupsecond);
        tvsignup.setOnClickListener(onclicksignup());
        tvsignupsecond.setOnClickListener(onclicksignup());
    }
    private View.OnClickListener onclicksignup(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,registeractivity.class);
                        MainActivity.this.startActivity(intent);

            }
        };
    }
}