package com.geecktech.mydz33;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView camera;
    ImageView phone;
    ImageView google;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        clickListeners();
    }

    private void initViews() {
        camera = findViewById(R.id.camera);
        phone = findViewById(R.id.phone);
        textView = findViewById(R.id.textSity);
        google = findViewById(R.id.google);
        view = findViewById(R.id.Kgz);
    }

    private void clickListeners() {

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 500);
            }

        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityCamera.class);
                startActivity(intent);
            }

        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityCalll.class);
                startActivity(intent);

            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivitySearch.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 500 && resultCode == RESULT_OK) {
            String value = data.getStringExtra("huhu");
            textView.setText(value);

            if (value.equals("Иссык-Куль")) view.setBackgroundResource(R.drawable.article_big_);
            else if (value.equals("Нарын")) view.setBackgroundResource(R.drawable.unnamed);
            else if (value.equals("Талас")) view.setBackgroundResource(R.drawable.talas_79159);
            else if (value.equals("Жалал-Абад")) view.setBackgroundResource(R.drawable.jalal_j);
            else if (value.equals("Баткен")) view.setBackgroundResource(R.drawable.batken_);
            else if (value.equals("Чуй")) view.setBackgroundResource(R.drawable.chuy_);
            else if (value.equals("Ош")) view.setBackgroundResource(R.drawable.osh_1);


        }

    }


}