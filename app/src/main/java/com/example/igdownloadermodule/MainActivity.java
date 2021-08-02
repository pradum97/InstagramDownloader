package com.example.igdownloadermodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pradum.instagramdownoader.InstagramDownloader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InstagramDownloader.setUrl(this,"hello");
    }
}