package com.lukaszsobczak.weatherapp;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageView imageViewBackground = findViewById(R.id.image_view_background);
        imageViewBackground.setColorFilter(Color.argb(100, 0,0,0));

        RecyclerView recyclerViewList = findViewById(R.id.recycle_view_list);

        Weather[] weathers = {
                new Weather("Lublin", "Lubelskie", "23%", "3.5°", R.drawable.clouds_cloud_svgrepo_com),
                new Weather("Świdnik", "Lubelskie", "", "-1.0°", R.drawable.night_svgrepo_com),
                new Weather("Kraśnik", "Lubelskie", "32%", "0.0°", R.drawable.clouds_cloud_svgrepo_com),
                new Weather("Warszawa", "Mazowieckie", "89%", "2.0°", R.drawable.clouds_cloud_svgrepo_com),
                new Weather("Ryki", "Mazowieckie", "45%", "1.0°", R.drawable.clouds_cloud_svgrepo_com),
                new Weather("Mińsk Mazowiecki", "Mazowieckie", "12%", "-2.0°", R.drawable.clouds_cloud_svgrepo_com),
                new Weather("Stalowa Wola", "podkarpackie", "", "4.0°", R.drawable.night_svgrepo_com),
                new Weather("Rzeszów", "Podkarpackie", "21%", "2.0°", R.drawable.clouds_cloud_svgrepo_com),
        };

        WeatherAdapter adapter = new WeatherAdapter(weathers);
        recyclerViewList.setAdapter(adapter);

        recyclerViewList.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}