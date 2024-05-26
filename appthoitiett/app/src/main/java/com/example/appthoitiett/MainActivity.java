package com.example.appthoitiett;


import static com.example.appthoitiett.R.id.bottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();
                if(itemId == R.id.navigation_home){
                    selectedFragment = new HomeFragment();
                }else if(itemId == R.id.navigation_danhsach){
                    selectedFragment = new DanhsachFragment();
                }else if(itemId == R.id.navigation_chitiet){
                    selectedFragment = new ChitietFragment();
                }
                if(selectedFragment != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace, selectedFragment).commit();
                }



            }
        });
    }
}