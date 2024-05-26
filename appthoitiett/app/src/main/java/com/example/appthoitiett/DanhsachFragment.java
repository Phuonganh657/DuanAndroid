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


public class DanhsachFragment extends Fragment {
    LandSpaceAdapter adapter;
    ArrayList<LandSpace> list;
    RecyclerView recyclerViewLandSpace;



    public DanhsachFragment() {
        // Required empty public constructor
    }


    public static DanhsachFragment newInstance(String param1, String param2) {
        DanhsachFragment fragment = new DanhsachFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<LandSpace>();
        list.add(new LandSpace("hanoi", "Hà Nội                                         29°  32°"));
        list.add(new LandSpace("danang", "Tp. Đà Nẵng                                   28°  30°"));
        list.add(new LandSpace("hcm", "Tp. Hồ Chí Minh                                  29°  30°"));
        list.add(new LandSpace("cantho", "Tp. Cần Thơ                                   28°  32°"));


    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewDanhsach = inflater.inflate(R.layout.fragment_danhsach, container, false);
        recyclerViewLandSpace = viewDanhsach.findViewById(R.id.rydanhsach);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewDanhsach.getContext());
        recyclerViewLandSpace.setLayoutManager(layoutLinear);

        adapter = new LandSpaceAdapter(viewDanhsach.getContext(),list);
        recyclerViewLandSpace.setAdapter(adapter);
        return viewDanhsach;

    }
}