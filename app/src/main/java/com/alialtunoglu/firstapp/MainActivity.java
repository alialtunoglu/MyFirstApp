package com.alialtunoglu.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Oluşturulan butonun tıklandığında ne yapacağını belirliyoruz
    public void changeImage(View view){
        //mor yazı -> resimin id si imageView
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.metellica2);


    }

}