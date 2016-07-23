package com.example.mpandroidchartsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mPieChartButton,mBarChartButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPieChartButton=(Button)findViewById(R.id.button);
        mBarChartButton=(Button)findViewById(R.id.button2);

        mPieChartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pieChartIntent;
                pieChartIntent=new Intent();
                pieChartIntent.setClassName("com.example.mpandroidchartsample","com.example.mpandroidchartsample.PieChartActivity");
                startActivity(pieChartIntent);
            }
        });
        mBarChartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barChartIntent;
                barChartIntent=new Intent();
                barChartIntent.setClassName("com.example.mpandroidchartsample","com.example.mpandroidchartsample.BarChartActivity");
                startActivity(barChartIntent);
            }
        });
    }
}
