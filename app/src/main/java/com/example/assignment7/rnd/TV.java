package com.example.assignment7.rnd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment7.R;
import com.example.assignment7.popularTVChannels;

import java.util.ArrayList;

public class TV extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_t_v, container, false);
        initRecyclerViews(view);
        return view;
    }

    private void initRecyclerViews(View view) {
        // First RecyclerView
        RecyclerView recyclerView1 = view.findViewById(R.id.recycle5);
        ArrayList<String> names1 = new ArrayList<>();
        ArrayList<String> imageUrls1 = new ArrayList<>();
        names1.add("");
        imageUrls1.add("https://images.toffeelive.com/images/program/287497/logo/240x240/mobile_logo_644514001712755411.png");
        names1.add("");
        imageUrls1.add("https://images.toffeelive.com/images/program/26939/logo/240x240/mobile_logo_570467001711149160.png");
        popularTVChannels adapter1 = new popularTVChannels(getActivity(), names1, imageUrls1);
        recyclerView1.setAdapter(adapter1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        // Second RecyclerView
        RecyclerView recyclerView2 = view.findViewById(R.id.recycle6);
        ArrayList<String> names2 = new ArrayList<>();
        ArrayList<String> imageUrls2 = new ArrayList<>();
        names2.add("");
        imageUrls2.add("https://images.toffeelive.com/images/program/19779/logo/240x240/mobile_logo_141811001712122330.png");
        popularTVChannels adapter2 = new popularTVChannels(getActivity(), names2, imageUrls2);
        recyclerView2.setAdapter(adapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        // Third RecyclerView
        RecyclerView recyclerView3 = view.findViewById(R.id.recycle7);
        ArrayList<String> names3 = new ArrayList<>();
        ArrayList<String> imageUrls3 = new ArrayList<>();
        names3.add("");
        imageUrls3.add("https://images.toffeelive.com/images/program/44878/logo/240x240/mobile_logo_889093001687255310.png");
        popularTVChannels adapter3 = new popularTVChannels(getActivity(), names3, imageUrls3);
        recyclerView3.setAdapter(adapter3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        // Fourth RecyclerView
        RecyclerView recyclerView4 = view.findViewById(R.id.recycle8);
        ArrayList<String> names4 = new ArrayList<>();
        ArrayList<String> imageUrls4 = new ArrayList<>();
        names4.add("");
        imageUrls4.add("https://images.toffeelive.com/images/program/2708/logo/240x240/mobile_logo_406284001687254721.png");
        popularTVChannels adapter4 = new popularTVChannels(getActivity(), names4, imageUrls4);
        recyclerView4.setAdapter(adapter4);
        recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
    }
}
