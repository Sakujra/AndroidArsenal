package com.vincentlaf.androidarsenal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image_view);
    }

    public void loadImage(View view) {
        String url = "https://cn.bing.com/az/hprichbg/rb/StelvioPass_ZH-CN13895715460_1920x1080.jpg";
        Glide.with(this).load(url).into(imageView);
    }
}
