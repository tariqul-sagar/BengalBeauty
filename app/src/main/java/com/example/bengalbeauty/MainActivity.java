package com.example.bengalbeauty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void team1(View view) {
        Team1 t1 = new Team1();
        FragmentManager aa = getSupportFragmentManager();
        FragmentTransaction a1 = aa.beginTransaction();
        a1.replace(R.id.team, t1);
        a1.addToBackStack(null);
        a1.commit();
    }

    public void team2(View view) {
        Team2 t2 = new Team2();
        FragmentManager aa = getSupportFragmentManager();
        FragmentTransaction a1 = aa.beginTransaction();
        a1.replace(R.id.team, t2);
        a1.addToBackStack(null);
        a1.commit();
    }

    public void team3(View view) {
        Team3 t3 = new Team3();
        FragmentManager aa = getSupportFragmentManager();
        FragmentTransaction a1 = aa.beginTransaction();
        a1.replace(R.id.team, t3);
        a1.addToBackStack(null);
        a1.commit();
    }

    public void team4(View view) {
        Team4 t4 = new Team4();
        FragmentManager aa = getSupportFragmentManager();
        FragmentTransaction a1 = aa.beginTransaction();
        a1.replace(R.id.team, t4);
        a1.addToBackStack(null);
        a1.commit();
    }

    public void team5(View view) {
        Team5 t5 = new Team5();
        FragmentManager aa = getSupportFragmentManager();
        FragmentTransaction a1 = aa.beginTransaction();
        a1.replace(R.id.team, t5);
        a1.addToBackStack(null);
        a1.commit();
    }

    public void team6(View view) {
        Team6 t6 = new Team6();
        FragmentManager aa = getSupportFragmentManager();
        FragmentTransaction a1 = aa.beginTransaction();
        a1.replace(R.id.team, t6);
        a1.addToBackStack(null);
        a1.commit();
    }

    public void team7(View view) {
        Team7 t7 = new Team7();
        FragmentManager aa = getSupportFragmentManager();
        FragmentTransaction a1 = aa.beginTransaction();
        a1.replace(R.id.team, t7);
        a1.addToBackStack(null);
        a1.commit();
    }

    public void team8(View view) {
        Team8 t8 = new Team8();
        FragmentManager aa = getSupportFragmentManager();
        FragmentTransaction a1 = aa.beginTransaction();
        a1.replace(R.id.team, t8);
        a1.addToBackStack(null);
        a1.commit();
    }
}