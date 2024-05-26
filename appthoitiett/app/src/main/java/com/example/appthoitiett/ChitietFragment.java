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


public class ChitietFragment extends Fragment {
    FutureAdapter adapter;
    ArrayList<Future> list;
    RecyclerView recyclerViewFuture;




    public ChitietFragment() {
        // Required empty public constructor
    }


    public static ChitietFragment newInstance(String param1, String param2) {
        ChitietFragment fragment = new ChitietFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<Future>();


        list.add(new Future("CN",  "mua",    "Mưa rào",  33,25));
        list.add(new Future("Th 2","mua",    "Mưa rào",  34,26));
        list.add(new Future("Th 3","sunyy2", "Trời nắng",33,26));
        list.add(new Future("Th 4","muanang","Mây mù",   33,26));
        list.add(new Future("Th 5","mua",    "Mưa rào",  32,25));
        list.add(new Future("Th 6","sunyy2", "Nắng nhẹ", 32,25));
        list.add(new Future("Th 7","cloudy1","Mây mù",   33,25));

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewChitiet = inflater.inflate(R.layout.fragment_chitiet, container, false);

        recyclerViewFuture = viewChitiet.findViewById(R.id.rychitiett);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewChitiet.getContext());
        recyclerViewFuture.setLayoutManager(layoutLinear);

        adapter = new FutureAdapter(viewChitiet.getContext(),list);
        recyclerViewFuture.setAdapter(adapter);
        return viewChitiet;
    }
}