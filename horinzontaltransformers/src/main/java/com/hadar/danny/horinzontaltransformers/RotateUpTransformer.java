package com.hadar.danny.horinzontaltransformers;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

public class RotateUpTransformer implements ViewPager2.PageTransformer {
    private static final float ROTATION = -15f;

    @Override
    public void transformPage(View page, float position) {
        final float width = page.getWidth();
        final float height = page.getHeight();
        final float rotation = ROTATION * position * -1.25f;

        page.setPivotX(width * 0.5f);
        page.setPivotY(height);
        page.setRotation(rotation);

    }
}