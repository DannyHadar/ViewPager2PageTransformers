package com.hadar.danny.horinzontaltransformers;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class ZoomInTransformer implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        final float scale = position < 0 ? position + 1f : Math.abs( 1f - position );
        page.setScaleX( scale );
        page.setScaleY( scale );
        page.setPivotX( page.getWidth() * 0.5f );
        page.setPivotY( page.getHeight() * 0.5f );
        page.setAlpha( position < -1f || position > 1f ? 0f : 1f - (scale - 1f) );
    }
}
