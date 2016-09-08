package com.example.dell.task_11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"请选购水果",Toast.LENGTH_LONG).show();
                finish();
            }
        });

        Button button1=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"请选购零食",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
