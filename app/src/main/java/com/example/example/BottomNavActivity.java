package com.example.example;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavActivity extends AppCompatActivity {

    BottomNavigationView navView;

    //Creating objects of the fragments and getting the FragmentManager
    //FragmentManager manages which fragment to show at which point
    HomeFragment homeFragment;
    HelplinesFragment helplinesFragment;
    SirenFragment sirenFragment;
    VideosFragment videosFragment;
    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        navView = findViewById(R.id.bottomNavView);
        navView.setOnNavigationItemSelectedListener(navListener);

        //Making HomeFragment the first fragment that gets displayed when activity starts
        homeFragment = new HomeFragment();
        fragmentManager.beginTransaction().replace(R.id.frameLayout, homeFragment).commit();
    }

    //Changing the fragment based on which menu item is selected
    BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {
            int id = item.getItemId();

            if (id == R.id.miHome)
            {
                homeFragment = new HomeFragment();
                fragmentManager.beginTransaction().replace(R.id.frameLayout, homeFragment).commit();
            }
            else if (id == R.id.miHelplines)
            {
                helplinesFragment = new HelplinesFragment();
                fragmentManager.beginTransaction().replace(R.id.frameLayout, helplinesFragment).commit();
            }
            else if (id == R.id.miSiren)
            {
                sirenFragment = new SirenFragment();
                fragmentManager.beginTransaction().replace(R.id.frameLayout, sirenFragment).commit();
            }
            else if (id == R.id.miVideos)
            {
                videosFragment = new VideosFragment();
                fragmentManager.beginTransaction().replace(R.id.frameLayout, videosFragment).commit();
            }

            return true;
        }
    };

}