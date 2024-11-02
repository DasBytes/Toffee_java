package com.example.assignment7;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class main_page extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        // Find the drawer layout
        drawerLayout = findViewById(R.id.drawer_layout);

        // Find the navigation view
        NavigationView navigationView = findViewById(R.id.nav_drawer);

        // Setup the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LayoutInflater inflater = LayoutInflater.from(this);
        View customView = inflater.inflate(R.layout.icons_toolbar, toolbar, false);
        toolbar.addView(customView);
        // Find the bottom navigation view
        BottomNavigationView navView = findViewById(R.id.nav_view);

        // Define the top-level destinations for app bar configuration
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.home2, R.id.TV, R.id.upload, R.id.explore, R.id.my_Channel)
                .build();

        // Get the NavController
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);

        // Set up the bottom navigation view with the NavController
        NavigationUI.setupWithNavController(navView, navController);
        // Setup the drawer toggle
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        // Handle navigation item clicks
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Handle navigation item clicks here
                // You can navigate to different destinations based on the item clicked
                drawerLayout.closeDrawer(GravityCompat.START); // Close the drawer after handling click
                return true;
            }
        });
    }
//notification
    public void onNotificationIconClick(View view) {
        // Handle notification icon click
        Intent notificationIntent = new Intent(this, Notifications.class);
        startActivity(notificationIntent);
    }

    // Override onOptionsItemSelected to handle drawer toggle
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)) {
            int id = item.getItemId();
            if (id == R.id.account) {

            } else if (id == R.id.toffee_premium) {

            } else if (id == R.id.refer) {

            } else if (id == R.id.redeem) {

            }
            else if (id == R.id.setting) {

            }
            else if (id == R.id.Darkmode) {
            }

            else if (id == R.id.Faq) {
            }

            else if (id == R.id.policies) {

            }
            else if (id == R.id.signout) {

//        } else {
//            imageView.setImageResource(R.drawable.gear);
//        }
                return super.onOptionsItemSelected(item);
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
