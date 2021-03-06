package com.example.shirish.shirishdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.shirish.shirishdemo.image.upload.ImageUpload;
import com.example.shirish.shirishdemo.listview.viewholder.ActCustom;
import com.example.shirish.shirishdemo.open.camera.CameraActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //demo 1
    public void openCamera(View v) {
        startActivity(new Intent(MainActivity.this, CameraActivity.class));
    }

    //demo 2
    public void uploadImageToServer(View v){
        startActivity(new Intent(MainActivity.this, ImageUpload.class));
    }

    //demo 3
    public void customListview(View v){
        startActivity(new Intent(MainActivity.this, ActCustom.class));
        finish();
    }
}
