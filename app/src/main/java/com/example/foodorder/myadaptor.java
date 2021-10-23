package com.example.giaodien;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.giaodien.fragment.dhFragment;
import com.example.giaodien.fragment.menuFragment;
import com.example.giaodien.fragment.psFragment;
import com.example.giaodien.fragment.tdFragment;

public class myadaptor extends FragmentStatePagerAdapter {


    public myadaptor(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new menuFragment();
            case 1:
                return new dhFragment();
            case 2:
                return new tdFragment();
            case 3:
                return new psFragment();
            default:
                return new menuFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
