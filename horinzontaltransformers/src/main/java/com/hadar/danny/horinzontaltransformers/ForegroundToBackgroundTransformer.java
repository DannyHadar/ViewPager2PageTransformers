package com.hadar.danny.horinzontaltransformers;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

public class ForegroundToBackgroundTransformer implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        final float height = page.getHeight();
        final float width = page.getWidth();
        final float scale = Math.min(position > 0 ? 1f : Math.abs(1f + position), 1f);

        page.setScaleX(scale);
        page.setScaleY(scale);
        page.setPivotX(width * 0.5f);
        page.setPivotY(height * 0.5f);
        page.setTranslationX(position > 0 ? width * position : -width * position * 0.25f);
    }
}
