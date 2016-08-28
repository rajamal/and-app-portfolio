package com.frustoo.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.popular_movies_app_button).setOnClickListener(this);
        findViewById(R.id.stock_hawk_app_button).setOnClickListener(this);
        findViewById(R.id.build_it_bigger_app_button).setOnClickListener(this);
        findViewById(R.id.material_app_button).setOnClickListener(this);
        findViewById(R.id.ubiquitous_app_button).setOnClickListener(this);
        findViewById(R.id.capstone_app_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String message = "This button will launch my \"" +
                button.getText().toString().toUpperCase() + "\" app!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
