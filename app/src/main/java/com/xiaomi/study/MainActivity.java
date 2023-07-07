package com.xiaomi.study;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        tv.setText("来了");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "点击", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getBaseContext(),ExampleActivity.class));
            }
        });
        Log.i("lyr", ".......onCreate enter");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lyr", ".......onResume enter");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lyr", ".......onPause enter");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lyr", ".......onDestroy enter");
    }
}