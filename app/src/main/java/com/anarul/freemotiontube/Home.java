package com.anarul.freemotiontube;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Home extends AppCompatActivity {



    AdView mAdView;
    public static int CategoryClicked = -10;
    ImageSlider imageSlider;
    ExpandableHeightGridView mainGrid;
    RelativeLayout rLayRateUs;
    LinearLayout update_webview;
    private InterstitialAd mInterstitialAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAdView = findViewById(R.id.adView);
        imageSlider = findViewById(R.id.image_slider);
        mainGrid = findViewById(R.id.mainGrid);
        rLayRateUs = findViewById(R.id.rLayRateUs);
        mAdView.setVisibility(View.GONE);
        update_webview = findViewById(R.id.update_webview);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });

       loadFullAd();




        update_webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent myintent = new Intent(Home.this,ButtonPage.class);
                startActivity(myintent);


                if (mInterstitialAdd != null) {
                    mInterstitialAdd.show(Home.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
            }
        });

        if (getString(R.string.show_admob_ad).contains("ON")){
            initAdmobAd();
            loadBannerAd();
            loadFullscreenAd();
        }

        createSlider();
        MakeVideoList.createMyAlbums();
        rateUsOnGooglePlay();

        MyAdapter adapter = new MyAdapter();
        mainGrid.setExpanded(true);
        mainGrid.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    } //------------------------------onCreate (bundle) ENDS here






    // ================================================================
    // ================================================================
    // ================================================================

    private void createSlider(){

        ArrayList<SlideModel> imageList = new ArrayList<>();
        //imageList.add(new SlideModel(R.drawable.slide_1, null));
        imageList.add(new SlideModel(R.drawable.free_motion, "Wellcome to Motion Tube", null));
        imageList.add(new SlideModel(R.drawable.funny_videos, "Funny Video", null));
        imageList.add(new SlideModel(R.drawable.update_video_slider, "Update Videos", null));
        imageList.add(new SlideModel(R.drawable.u_fun, "Unlimited Fun", null));
        imageList.add(new SlideModel(R.drawable.kaissa, "বহুরূপি কাইশ্যা", null));
        imageList.add(new SlideModel(R.drawable.mlw_bd_com, "Dawonload New Movie", null));

        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);

    }
    // ================================================================
    // ================================================================
    // ================================================================



    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public  MyAdapter(){
            this.inflater = (LayoutInflater) Home.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return MakeVideoList.catArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);


            ImageView imgIcon = convertView.findViewById(R.id.imgIcon);
            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            LinearLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> mHashMap = MakeVideoList.catArrayList.get(position);
            String catName = mHashMap.get("category_name");
            String img = mHashMap.get("img");



            if (tvTitle!=null) tvTitle.setText(catName);
            if (imgIcon!=null && img!=null) {
                int drawable = Integer.parseInt(img);
                imgIcon.setImageResource( drawable );
            }

            Animation animation = AnimationUtils.loadAnimation(Home.this, R.anim.anim_grid);
            animation.setStartOffset(position*300);
            convertView.startAnimation(animation);



            if (layItem!=null){
                layItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //We are tracking the category postion. So that we can call the intent after ad loads
                        CategoryClicked = position;

                        if (mInterstitialAd==null){
                            MainActivity.arrayList = MakeVideoList.rootArrayList.get(position);
                            startActivity(new Intent(Home.this, MainActivity.class));
                        }else{
                            mInterstitialAd.show(Home.this);
                        }

                    }
                });
            }



            return convertView;
        }
    }




    //=============================================
    //=============================================
    //=============================================









    int BANNER_AD_CLICK_COUNT =0;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }else{
                    if(mAdView!=null) mAdView.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                BANNER_AD_CLICK_COUNT++;

                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>













    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // loadFullscreenAd method starts here.....
    InterstitialAd mInterstitialAd;

    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        loadFullscreenAd();

                        if (CategoryClicked>=0){
                            MainActivity.arrayList = MakeVideoList.rootArrayList.get(CategoryClicked);
                            startActivity(new Intent(Home.this, MainActivity.class));
                        }

                    }

                }); // FullScreen Callback Ends here


            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }


    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    private void initAdmobAd(){

        if (getString(R.string.device_id).length()>12){
            //Adding your device id -- to avoid invalid activity from your device
            List<String> testDeviceIds = Arrays.asList(getString(R.string.device_id));
            RequestConfiguration configuration =
                    new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
            MobileAds.setRequestConfiguration(configuration);
        }




        //Init Admob Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    private void rateUsOnGooglePlay(){
        rLayRateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }

            }
        });
    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



    ///====================================================
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button

            if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            } else {

                Toast.makeText(getBaseContext(), "Press again to exit",
                        Toast.LENGTH_SHORT).show();
            }

            mBackPressed = System.currentTimeMillis();



    } // end of onBackpressed method

    //#############################################################################################




    /////////////////my code/////loadFullAd();///////////////
    private void loadFullAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAdd.load(this,"ca-app-pub-9443277100616934/8883365529", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAdd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");


                        mInterstitialAdd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdClicked() {
                                // Called when a click is recorded for an ad.
                                Log.d(TAG, "Ad was clicked.");
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                // Set the ad reference to null so you don't show the ad a second time.
                                Log.d(TAG, "Ad dismissed fullscreen content.");
                                mInterstitialAdd = null;
                                //////////loadFullAd//////
                                loadFullAd();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.
                                Log.e(TAG, "Ad failed to show fullscreen content.");
                                mInterstitialAdd = null;
                            }

                            @Override
                            public void onAdImpression() {
                                // Called when an impression is recorded for an ad.
                                Log.d(TAG, "Ad recorded an impression.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d(TAG, "Ad showed fullscreen content.");
                            }
                        });

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d(TAG, loadAdError.toString());
                        mInterstitialAdd = null;
                    }
                });

    }


    /////////////////////////////////////////////////





}