package com.example.dell.task_11;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(Main2Activity.this,"请重新选购",Toast.LENGTH_LONG).show();
                finish();
            }
        });

        Button button1 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
                intent.putExtra("name", "苹果");
                intent.putExtra("price", 3);
                startActivityForResult(intent, 0);
            }
        });

        Button button2= (Button) findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
                intent.putExtra("name", "橘子");
                intent.putExtra("price", 2);
                startActivityForResult(intent, 0);
            }
        });
    }


        protected void onActivityResult(int requestCode,int resultCode, Intent data){
            super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == 0 && resultCode == 0) {
                String str = data.getStringExtra("result");
                Toast.makeText(this, str, Toast.LENGTH_LONG).show();
            }
        }

    }

