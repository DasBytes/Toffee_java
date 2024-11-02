package com.example.assignment7;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter_mychannel extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter_mychannel(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs; }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                mychannel_videos tab1 = new mychannel_videos();
                return tab1;
            case 1:
                Mychannel_Creatorsplaylist tab2 = new Mychannel_Creatorsplaylist();
                return tab2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}