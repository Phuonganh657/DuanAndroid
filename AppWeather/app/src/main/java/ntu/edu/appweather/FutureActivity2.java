package ntu.edu.appweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import ntu.edu.appweather.Adapters.FutureAdapters;
import ntu.edu.appweather.Adapters.FutureAdapters;
import ntu.edu.appweather.Domains.FutureDomain;
import ntu.edu.appweather.R;

public class FutureActivity2 extends AppCompatActivity {
    private RecyclerView.Adapter adapterNgaymai;
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future2);

        initRecyclerView();
        setVaribale();
    }

    private void setVaribale() {
        ConstraintLayout backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(view -> startActivity(new Intent(FutureActivity2.this, MainActivity.class)));
    }

    private void initRecyclerView() {
        ArrayList<FutureDomain> items = new ArrayList<>();

        items.add(new FutureDomain("CN","mua","Mưa rào",33,25));
        items.add(new FutureDomain("Th 2","mua","Mưa rào",34,26));
        items.add(new FutureDomain("Th 3","mua","Mưa rào",33,26));
        items.add(new FutureDomain("Th 4","mua","Mưa rào",33,26));
        items.add(new FutureDomain("Th 5","mua","Mưa rào",32,25));
        items.add(new FutureDomain("Th 6","sunyy2","Nắng nhẹ",32,25));
        items.add(new FutureDomain("Th 7","cloudy1","Mây mù",33,25));

        recyclerView = findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterNgaymai = new FutureAdapters(items);
        recyclerView.setAdapter(adapterNgaymai);


    }
}