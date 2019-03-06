package com.suwec.vectoranimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private boolean flag = true;
    private AnimatedVectorDrawable anim1/*,anim2*/;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        anim1 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim_show,null);
//        anim2 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim_hide,null);
//        anim1 = (AnimatedVectorDrawable) imageView.getDrawable();
        imageView.setImageDrawable(anim1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (flag){
//                    imageView.setImageDrawable(anim1);
                if (anim1.isRunning())
                    anim1.stop();
                else
                    anim1.start();
//                    flag = false;
//                }else {
//                    imageView.setImageDrawable(anim2);
//                    anim2.start();
//                    flag = true;
//                }
            }
        });
    }
}
