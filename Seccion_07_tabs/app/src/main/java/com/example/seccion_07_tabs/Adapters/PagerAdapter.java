package com.example.seccion_07_tabs.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.seccion_07_tabs.Fragments.FirstFragment;
import com.example.seccion_07_tabs.Fragments.SecondFragment;
import com.example.seccion_07_tabs.Fragments.ThirdFragment;

public class PagerAdapter extends FragmentStateAdapter {



    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);

    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
