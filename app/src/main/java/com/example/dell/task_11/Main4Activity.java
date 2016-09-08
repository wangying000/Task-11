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

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Integer price=intent.getIntExtra("price",3);
        Toast.makeText(this,name+price+"元",Toast.LENGTH_LONG).show();

        Button button=(Button)findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String name=intent.getStringExtra("name");
                Integer price=intent.getIntExtra("price",3);
                intent.putExtra("result","水果："+name+"   价钱："+price);
                setResult(0,intent);
                finish();
            }
        });
    }

}
