package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> tempData = new ArrayList<String>();
        tempData.add("Today - Sunny - 88/63");
        tempData.add("Tomorrow - Foggy - 70/46");
        tempData.add("Weds - Cloudy - 72/63");
        tempData.add("Thurs - Rainy - 64/51");
        tempData.add("Fri - Foggy - 70/46");
        tempData.add("Sat - Sunny - 76/68");

        ArrayAdapter<String> in = new ArrayAdapter<String>(getActivity(),
                R.layout.list_item_forecast, R.id.list_item_forecast_textview,
                tempData);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(in);


        return rootView;
    }
}
