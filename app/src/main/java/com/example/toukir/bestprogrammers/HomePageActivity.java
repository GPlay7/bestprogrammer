package com.example.toukir.bestprogrammers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;


public class HomePageActivity extends AppCompatActivity {

    Button btnBillGates, btnMarkJukarbarg, btnLinus, btnDineshRichi, btnSteveWazniak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ome_page);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        setContentView(R.layout.activity_main);


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.SMART_BANNER);

        btnBillGates= (Button) findViewById(R.id.btnBillGates);
        btnDineshRichi= (Button) findViewById(R.id.btnDenishRichi);
        btnLinus= (Button) findViewById(R.id.btnLinus);
        btnMarkJukarbarg= (Button) findViewById(R.id.btnMarkJukarBarg);
        btnSteveWazniak= (Button) findViewById(R.id.btnsteveWazniak);


        btnBillGates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,FourthProgrammer.class);
                startActivity(intent);
            }
        });


        btnMarkJukarbarg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, SecondProgrammer.class);
                startActivity(intent);
            }
        });

        btnLinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, FifthProgrammer.class);
                startActivity(intent);
            }
        });

        btnSteveWazniak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,ThirdProgrammer.class);
                startActivity(intent);
            }
        });

        btnDineshRichi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,FirstProgrammer.class);
                startActivity(intent);
            }
        });
    }
}

