package com.anarul.freemotiontube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class ButtonPage extends AppCompatActivity {

    RelativeLayout web_url,web_url2,web_url3,web_url4,web_url5,web_url6,web_url7,web_url8,web_url9,web_url10;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_page);


        web_url = findViewById(R.id.web_url);
        web_url2 =findViewById(R.id.web_url2);
        web_url3 = findViewById(R.id.web_url3);
        web_url4 = findViewById(R.id.web_url4);
        web_url5 = findViewById(R.id.web_url5);
        web_url6 = findViewById(R.id.web_url6);
        web_url7 = findViewById(R.id.web_url7);
        web_url8 = findViewById(R.id.web_url8);
        web_url9 = findViewById(R.id.web_url9);
        web_url10 = findViewById(R.id.web_url10);

        web_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPage.video_url ="https://www.youtube.com/c/FreeMotionByFirozHasan/videos";
                Intent myintent = new Intent(ButtonPage.this,VideoPage.class);
                startActivity(myintent);
            }
        });



        web_url2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPage.video_url ="https://www.youtube.com/channel/UC1-ZbtT-wzWkF_SzeCBycqA/videos";
                Intent myintent = new Intent(ButtonPage.this,VideoPage.class);
                startActivity(myintent);
            }
        });


        web_url3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPage.video_url ="https://www.youtube.com/channel/UCiw00QK4H5BeD9LUmgnmcew/videos";
                Intent myintent = new Intent(ButtonPage.this,VideoPage.class);
                startActivity(myintent);
            }
        });


        web_url4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPage.video_url ="https://www.youtube.com/c/FunnyDayComedy/videos";
                Intent myintent = new Intent(ButtonPage.this,VideoPage.class);
                startActivity(myintent);
            }
        });


        web_url5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPage.video_url ="https://www.youtube.com/c/TKFShorts/videos";
                Intent myintent = new Intent(ButtonPage.this,VideoPage.class);
                startActivity(myintent);
            }
        });



        web_url6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPage.video_url ="https://www.youtube.com/c/HaHaidea/videos";
                Intent myintent = new Intent(ButtonPage.this,VideoPage.class);
                startActivity(myintent);
            }
        });


        web_url7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPage.video_url ="https://www.youtube.com/channel/UCsIRS73pc0elkECQAvLRBIQ/videos";
                Intent myintent = new Intent(ButtonPage.this,VideoPage.class);
                startActivity(myintent);
            }
        });


        web_url8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent myintents = new Intent(ButtonPage.this,MlwBd.class);
                startActivity(myintents);
            }
        });

        web_url9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPage.video_url ="https://www.youtube.com/c/YouRAhosaN/videos";
                Intent myintent = new Intent(ButtonPage.this,VideoPage.class);
                startActivity(myintent);
            }
        });


        web_url10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPage.video_url ="https://www.youtube.com/c/mayajaalbangla/videos";
                Intent myintent = new Intent(ButtonPage.this,VideoPage.class);
                startActivity(myintent);
            }
        });









        ///////////////////////////////////


            MobileAds.initialize(this, new OnInitializationCompleteListener() {
                @Override
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                }
            });

            mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);




    }





    }

