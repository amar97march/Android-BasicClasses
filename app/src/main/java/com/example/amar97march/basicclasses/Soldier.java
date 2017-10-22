package com.example.amar97march.basicclasses;

import android.util.Log;

/**
 * Created by amar97march on 24-06-2017.
 */

public class Soldier {
    private int health;
    String soldierType;
    void shootEnemy(){
        Log.i(soldierType,"is shooting.");
     }
    public int gethealth(){
            return health;
        }
    public void sethealth( int newhealth){
        health=newhealth;
    }

}
