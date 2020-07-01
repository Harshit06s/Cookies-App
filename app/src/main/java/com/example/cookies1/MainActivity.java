package com.example.cookies1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    @SuppressLint("SetTextI18n")
    public void eatCookie(View view) {


        ImageView orderimageview = (ImageView) findViewById(R.id.android_cookie_image_view);
        orderimageview.setImageResource(R.drawable.after_cookie);



        TextView textview = (TextView) findViewById(R.id.status_text_view);
        textview.setText("i'm so full.");
    }
}