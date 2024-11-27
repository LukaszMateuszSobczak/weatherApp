package com.lukaszsobczak.weatherapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    private Weather[] wethersArray;

    public WeatherAdapter(Weather[] wethersArray) {
        this.wethersArray = wethersArray;
    }

    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_element, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {
        holder.bind(wethersArray[position]);
    }

    @Override
    public int getItemCount() {
        return wethersArray.length;
    }

    static class WeatherViewHolder extends RecyclerView.ViewHolder{

        private TextView city;
        private TextView province;
        private TextView precipitation;
        private TextView temperature;
        private ImageView image;

        public WeatherViewHolder(@NonNull View itemView) {
            super(itemView);
            city = itemView.findViewById(R.id.text_view_city);
            province = itemView.findViewById(R.id.text_view_province);
            precipitation = itemView.findViewById(R.id.text_view_precipitation);
            temperature = itemView.findViewById(R.id.text_view_temperature);
            image = itemView.findViewById(R.id.image_view_icon);
        }

        public void bind(Weather weather) {
            city.setText(weather.getCityName());
            province.setText(weather.getProvince());
            precipitation.setText(weather.getPrecipitation());
            temperature.setText(weather.getTemperature());
            image.setImageResource(weather.getImage());
        }
    }
}
