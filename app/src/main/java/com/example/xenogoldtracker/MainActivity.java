package com.example.xenogoldtracker;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    CardView cv_mercMissions, cv_blade, cv_shopDeed, cv_monster, cv_hiddenQuest, cv_SecretArea, cv_expMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv_mercMissions = findViewById(R.id.cv_mercmissions);
        cv_blade = findViewById(R.id.cv_blade);
        cv_monster = findViewById(R.id.cv_monsters);
        cv_hiddenQuest = findViewById(R.id.cv_hiddenQuest);
        cv_SecretArea = findViewById(R.id.cv_secretArea);
        cv_expMan = findViewById(R.id.cv_expMan);
        cv_shopDeed = findViewById(R.id.cv_shopDeed);



        cv_mercMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: mercMission");
            }
        });

        cv_shopDeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: ShopDeed");
            }
        });

        cv_monster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Monsters");
            }
        });

        cv_hiddenQuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Hidden-Quest");
            }
        });
        cv_SecretArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: SecretArea");
            }
        });
        cv_blade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Blade");
                Intent intent= new Intent(MainActivity.this,BladePage.class);
                startActivity(intent);
            }
        });
        cv_expMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("testing ");
                Log.d(TAG, "onClick: EXP-MAN");
            }
        });

    }
}