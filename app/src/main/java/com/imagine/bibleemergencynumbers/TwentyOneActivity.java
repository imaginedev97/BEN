package com.imagine.bibleemergencynumbers;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;

import java.io.InputStream;

public class TwentyOneActivity extends AppCompatActivity {
    MediaPlayer player;
    private AdView adView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyone);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        AudienceNetworkAds.initialize(this);

        // Instantiate an AdView object.
        // NOTE: The placement ID from the Facebook Monetization Manager identifies your App.
        // To get test ads, add IMG_16_9_APP_INSTALL# to your placement id. Remove this when your app is ready to serve real ads.
        adView = new AdView(this, "229585168840467_229585345507116", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();

        TextView Text = findViewById(R.id.textView);
        try {
            Resources res = getResources();
            InputStream in_s = res.openRawResource(R.raw.tjohn15);
            byte[] b = new byte[in_s.available()];
            in_s.read(b);
            Text.setText(new String(b));
        } catch (Exception e) {
            Text.setText(R.string.error);
        }
    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    public void play(View v) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.john14);
            player.setOnCompletionListener(mp -> stopPlayer());
        }
        player.start();
    }

    public void pause(View v) {
        if (player != null) {
            player.pause();
        }
    }

    public void stop(View v) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}