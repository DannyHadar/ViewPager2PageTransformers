package com.hadar.danny.horinzontaltransformers;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

public class RotateDownTransformer implements ViewPager2.PageTransformer {
    private static final float ROTATION = -15f;

    @Override
    public void transformPage(View page, float position) {
        final float width = page.getWidth();
        final float rotation = ROTATION * position;

        page.setPivotX(width * 0.5f);
        page.setPivotY(0f);
        page.setTranslationX(0f);
        page.setRotation(rotation);
    }
}
