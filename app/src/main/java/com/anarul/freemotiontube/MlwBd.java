package com.anarul.freemotiontube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MlwBd extends AppCompatActivity {

    WebView webViews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mlw_bd_activity);

        webViews = findViewById(R.id.mlw_bd);
        webViews.getSettings().setJavaScriptEnabled(true);
        webViews.loadUrl("https://mlwbd.love/");


    }
}