package com.iams0nu.newyear2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean hn=true;
private Button btn;
    public void newyear(View view)
    {


        ImageView img = (ImageView) findViewById(R.id.imageView2);
        ImageView img2 = (ImageView) findViewById(R.id.imageView3);
        ImageView img3 = (ImageView) findViewById(R.id.imageView4);

            img.animate().alpha(0).translationYBy(-1900).setDuration(1000);
            img2.animate().alpha(1).setStartDelay(500).setDuration(1000);
            img3.animate().alpha(1).setStartDelay(1000).scaleX(1.5f).scaleY(1.5f).setDuration(2000);
            btn.animate().alpha(1).setDuration(2500);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(getIntent());
                overridePendingTransition(0,0);

            }
        });


    }
}