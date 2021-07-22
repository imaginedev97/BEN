package com.imagine.bibleemergencynumbers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;

public class MainActivity extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        Button buttonOne = findViewById(R.id.button1);
        buttonOne.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    OneActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonTwo = findViewById(R.id.button2);
        buttonTwo.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    TwoActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonThree = findViewById(R.id.button3);
        buttonThree.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    ThreeActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonFour = findViewById(R.id.button4);
        buttonFour.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    FourActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonFive = findViewById(R.id.button5);
        buttonFive.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    FiveActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonSix = findViewById(R.id.button6);
        buttonSix.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    SixActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonSeven = findViewById(R.id.button7);
        buttonSeven.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    SevenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonEight = findViewById(R.id.button8);
        buttonEight.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    EightActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonNine = findViewById(R.id.button9);
        buttonNine.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    NineActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonTen = findViewById(R.id.button10);
        buttonTen.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    TenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonEleven = findViewById(R.id.button11);
        buttonEleven.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    ElevenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonTwelve = findViewById(R.id.button12);
        buttonTwelve.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    TwelveActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonThirteen = findViewById(R.id.button13);
        buttonThirteen.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    ThirteenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonFourteen = findViewById(R.id.button14);
        buttonFourteen.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    FourteenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonFifteen = findViewById(R.id.button15);
        buttonFifteen.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    FifteenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonSixteen = findViewById(R.id.button16);
        buttonSixteen.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    SixteenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonSeventeen = findViewById(R.id.button17);
        buttonSeventeen.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    SeventeenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonEighteen = findViewById(R.id.button18);
        buttonEighteen.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    EighteenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonNineteen = findViewById(R.id.button19);
        buttonNineteen.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    NineteenActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonTwenty = findViewById(R.id.button20);
        buttonTwenty.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    TwentyActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonTwentyOne = findViewById(R.id.button21);
        buttonTwentyOne.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    TwentyOneActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonTwentyTwo = findViewById(R.id.button22);
        buttonTwentyTwo.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    TwentyTwoActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonTwentyThree = findViewById(R.id.button23);
        buttonTwentyThree.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    TwentyThreeActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonTwentyFour = findViewById(R.id.button24);
        buttonTwentyFour.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    TwentyFourActivity.class);
            startActivity(activity2Intent);
        });

        Button buttonTwentyFive = findViewById(R.id.button25);
        buttonTwentyFive.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),
                    TwentyFiveActivity.class);
            startActivity(activity2Intent);
        });

    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}