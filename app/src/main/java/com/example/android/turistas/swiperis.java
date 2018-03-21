package com.example.android.turistas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import layout.SiauliuRestoranai_fragment;
public class swiperis extends FragmentPagerAdapter {

    public swiperis(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MazeikiuRestoranai_fragmentas();
        } else if (position == 1){
            return new TelsiuRestoranai_fragment();
        } else if (position==2) {
            return new SiauliuRestoranai_fragment();
        }
        else if (position==3) {
            return new TauragesRestoranai_fragmentas();
        }
        else if (position==4) {
            return new PlungesRestoranai_fragment();
        }
        else if (position==5) {
            return new KretingosRestoranai_fragment();
        }
        else if (position==6) {
            return new SkuodoRestoranai_fragmentas();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 7;
    }
}