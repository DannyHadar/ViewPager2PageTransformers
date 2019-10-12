package com.hadar.danny.horinzontaltransformers;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

public class FlipVerticalTransformer implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        final float rotation = -180f * position;

        page.setAlpha(rotation > 90f || rotation < -90f ? 0f : 1f);
        page.setPivotX(page.getWidth() * 0.5f);
        page.setPivotY(page.getHeight() * 0.5f);
        page.setRotationX(rotation);
    }
}
