package com.example.tryl.AllOthers;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.tryl.Fragment.BlankFragment;
import com.example.tryl.R;

public class NavigationDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private Toolbar toolbar;

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle drawerToggle;

    private RelativeLayout rel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        rel1 = findViewById(R.id.rel1);

        setupToolbar();
        setupNavigationDrawer();
    }

    private void setupNavigationDrawer() {
        navigationView = findViewById(R.id.navigation_side);

        drawerLayout = findViewById(R.id.navigation_drawer);

        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


    }

    private void setupToolbar() {

        toolbar = findViewById(R.id.nav_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Navigation Drawer");
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        String selected_text = (String) menuItem.getTitle();

        switch (menuItem.getItemId()) {
            case R.id.bathroom:
                addFragment(new BlankFragment());
                rel1.setAlpha(0);
                closeDrawer();
                break;

            case R.id.facebook:
                addFragment(new SecondFragment());
                rel1.setAlpha(0);
                closeDrawer();
                break;

            case R.id.pendrive:
                addFragment(new BlankFragment());
                rel1.setAlpha(0);
                closeDrawer();
                break;

            case R.id.cycle:
                Toast.makeText(this, selected_text + " has been clicked", Toast.LENGTH_SHORT).show();
                closeDrawer();
                break;

            case R.id.teamword:
                Toast.makeText(this, selected_text + " has been clicked", Toast.LENGTH_SHORT).show();
                closeDrawer();
                break;
        }
        return true;
    }

    private void closeDrawer() {
        drawerLayout.closeDrawer(GravityCompat.START);
    }

    private void openDrawer() {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            closeDrawer();
        } else {
            super.onBackPressed();
        }
    }


    public void addFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }

    public void loadHome() {
        Intent intent = new Intent(NavigationDrawerActivity.this, NavigationDrawerActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_items,menu);
        MenuItem.OnActionExpandListener onActionExpandListener= new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                return false;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                return false;
            }
        };

        MenuItem searchItem=menu.findItem(R.id.search);
        searchItem.setOnActionExpandListener(onActionExpandListener);
        return true;
    }

}
