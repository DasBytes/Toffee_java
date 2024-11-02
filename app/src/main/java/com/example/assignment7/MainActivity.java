package com.example.assignment7;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

//import com.example.assignment7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static  int SPLASH_TIME_OUT =2900;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, main_page.class);
                startActivity(i);
                finish(); // Close this activity so that user won't be able to go back to the splash screen
            }
        }, SPLASH_TIME_OUT);


    }
}