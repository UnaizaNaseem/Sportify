package com.example.sportify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CarouselItem {

    private int imageResId;

    public CarouselItem(int imageResId) {
        this.imageResId = imageResId;
    }

    public int getImageResId() {
        return imageResId;
    }
}