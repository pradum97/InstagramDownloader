package com.pradum.instagramdownoader;

import android.content.Context;
import android.widget.Toast;

public class InstagramDownloader {

    public static void setUrl(Context context , String url){

        Toast.makeText(context, ""+url, Toast.LENGTH_SHORT).show();
    }
}
