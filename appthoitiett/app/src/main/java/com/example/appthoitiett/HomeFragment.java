package com.example.appthoitiett;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    HourlyAdapter adapter;
    ArrayList<Hourly> list;
    RecyclerView recyclerViewHourly;



    public HomeFragment() {

    }


    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<Hourly>();

        list.add(new Hourly("Bây giờ", 28, "cloudy1"));
        list.add(new Hourly("15 giờ", 30, "sunyy2"));
        list.add(new Hourly("16 giờ", 29, "cloudy1"));
        list.add(new Hourly("17 giờ", 28, "cloudy1"));
        list.add(new Hourly("18 giờ", 28, "muanang"));

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewHome = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerViewHourly = viewHome.findViewById(R.id.ryhome);
        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false);
        recyclerViewHourly.setLayoutManager(layoutLinearHorizonal);


        adapter = new HourlyAdapter(viewHome.getContext(),list);
        recyclerViewHourly.setAdapter(adapter);
        return viewHome;

    }
}