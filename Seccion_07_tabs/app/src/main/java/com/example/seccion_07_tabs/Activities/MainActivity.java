package com.example.seccion_07_tabs.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;


import com.example.seccion_07_tabs.Adapters.PagerAdapter;
import com.example.seccion_07_tabs.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();
//        // Creacion de Tabs
        TabLayout tabLayout = findViewById(R.id.tabLayout);
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//        // Creacion de Tabs

        ViewPager2 viewPager2 = findViewById(R.id.viewPager);
        viewPager2.setAdapter(new PagerAdapter(this));


        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position) {
                    case 0:
                        tab.setText("Tab 1");
                        //tab.setIcon(R.drawable....);
                        break;
                    case 1:
                        tab.setText("Tab 2");
                        break;
                    case 2:
                        tab.setText("Tab 3");
//                        https://www.youtube.com/watch?v=ajVVjuOSlV4
//                        BadgeDrawable badgeDrawable = tab.getOrCreateBadge();
//                        badgeDrawable.setBackgroundColor(
//                                ContextCompat.getColor(getApplicationContext(), R.color.purple_200)
//                        );
//                        badgeDrawable.setVisible(true);
//                        badgeDrawable.setNumber(100);
                        break;
                }
            }
        }
        );
        tabLayoutMediator.attach();

    }

    private void setToolbar (){
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}