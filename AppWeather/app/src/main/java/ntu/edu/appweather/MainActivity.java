package ntu.edu.appweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import ntu.edu.appweather.Adapters.HourlyAdapters;
import ntu.edu.appweather.Domains.Hourly;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterHourly;
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
        setVaribla();

    }

    private void setVaribla() {
        TextView dubao7ngayBtn = findViewById(R.id.nextBtn);
        dubao7ngayBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FutureActivity2.class)));
    }


    private void initRecyclerview() {
        ArrayList<Hourly> items = new ArrayList<>();
        items.add(new Hourly("Bây giờ", 28, "cloudy1"));
        items.add(new Hourly("15 giờ", 30, "sunyy2"));
        items.add(new Hourly("16 giờ", 29, "cloudy1"));
        items.add(new Hourly("17 giờ", 28, "cloudy1"));
        items.add(new Hourly("18 giờ", 28, "muanang"));

        recyclerView = findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        adapterHourly = new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHourly);
        
    }
}