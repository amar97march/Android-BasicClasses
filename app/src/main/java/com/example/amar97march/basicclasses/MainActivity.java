package com.example.amar97march.basicclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Soldier rambo=new Soldier();
        rambo.soldierType="Green Beret";
        //rambo.health=150;
         rambo.sethealth(200);
        Soldier vassily =new Soldier();
        vassily.soldierType="Sniper";
        //vassily.health=50;
         Hospital militarymed=new Hospital();
        militarymed.healSoldier(vassily);
        Soldier wellington=new Soldier();
        wellington.soldierType="Sailor";
        //wellington.health=100;
        militarymed.healSoldier(wellington);
        Log.i("rambo's health is ",""+rambo.gethealth());
        Log.i("Vassily's health is ",""+vassily.gethealth());
        Log.i("Wellington's health is ",""+wellington.gethealth());
        rambo.shootEnemy();
        vassily.shootEnemy();
        wellington.shootEnemy();
    }
}
