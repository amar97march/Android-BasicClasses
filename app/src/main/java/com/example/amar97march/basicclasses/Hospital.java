package com.example.amar97march.basicclasses;

/**
 * Created by amar97march on 24-06-2017.
 */

public class Hospital {
    public void healSoldier( Soldier soldierToHeal){
        int health= soldierToHeal.gethealth();
        health=health+10;
        soldierToHeal.sethealth(health);
    }
}
