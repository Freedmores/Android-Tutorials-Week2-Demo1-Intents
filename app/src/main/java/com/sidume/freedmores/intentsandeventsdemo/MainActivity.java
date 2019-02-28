package com.sidume.freedmores.intentsandeventsdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);

    }

    public void onButtonClick(View view) {
        int buttonClicked = view.getId(); // get the id of the button clicked

        switch (buttonClicked){
            case R.id.button1:
                Intent explicit_intent = new Intent(this,Main2Activity.class);
                startActivity(explicit_intent);
                break;
            case R.id.button2:
                Intent implicit_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.arsenal.com"));
                startActivity(implicit_intent);

        }
    }




}
