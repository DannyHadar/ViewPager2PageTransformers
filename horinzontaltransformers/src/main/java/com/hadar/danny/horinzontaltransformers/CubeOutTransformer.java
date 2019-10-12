package com.hadar.danny.horinzontaltransformers;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

public class CubeOutTransformer implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setPivotX(position < 0f ? page.getWidth() : 0f);
        page.setPivotY(page.getHeight() * 0.5f);
        page.setRotationY(90f * position);
    }
}