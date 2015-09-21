package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<String> tempData = new ArrayList<String>();
        tempData.add("Today - Sunny - 88/63");
        tempData.add("Tomorrow - Foggy - 70/46");
        tempData.add("Weds - Cloudy - 72/63");
        tempData.add("Thurs - Rainy - 64/51");
        tempData.add("Fri - Foggy - 70/46");
        tempData.add("Sat - Sunny - 76/68");


        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
