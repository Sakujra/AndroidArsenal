package com.vincentlaf.androidarsenal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

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
        //可以接收Activity、Fragment、ApplicationContext
        //传入Activity或者Fragment，Activity或Fragment被销毁的时候，图片加载也会停止。
        //传入的是ApplicationContext，那么只有当应用程序被杀掉的时候，图片加载才会停止。
        Glide.with(this)
                .load(url)
                .placeholder(R.drawable.landscapes_cherry)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .error(R.drawable.error)
                .into(imageView);
    }
}
