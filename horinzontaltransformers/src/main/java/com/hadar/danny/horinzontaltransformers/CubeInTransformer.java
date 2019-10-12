package com.hadar.danny.horinzontaltransformers;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

public class CubeInTransformer implements ViewPager2.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        // Rotate the fragment on the left or right edge
        page.setPivotX(position > 0 ? 0 : page.getWidth());
        page.setPivotY(0);
        page.setRotationY(-90f * position);
    }
}
