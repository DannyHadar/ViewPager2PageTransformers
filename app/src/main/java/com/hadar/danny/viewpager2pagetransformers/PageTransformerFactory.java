package com.hadar.danny.viewpager2pagetransformers;

import com.hadar.danny.horinzontaltransformers.*;

import androidx.viewpager2.widget.ViewPager2;

public final class PageTransformerFactory {

    private static final BackgroundToForegroundTransformer sBackgroundToForegroundTransformer = new BackgroundToForegroundTransformer();

    private static final CubeInTransformer sCubeInTransformer = new CubeInTransformer();

    private static final CubeOutTransformer sCubeOutTransformer = new CubeOutTransformer();

    private static final DepthTransformer sDepthTransformer = new DepthTransformer();

    private static final FlipHorizontalTransformer sFlipHorizontalTransformer = new FlipHorizontalTransformer();

    private static final FlipVerticalTransformer sFlipVerticalTransformer = new FlipVerticalTransformer();

    private static final ForegroundToBackgroundTransformer sForegroundToBackgroundTransformer = new ForegroundToBackgroundTransformer();

    private static final RotateDownTransformer sRotateDownTransformer = new RotateDownTransformer();

    private static final RotateUpTransformer sRotateUpTransformer = new RotateUpTransformer();

    private static final TabletTransformer sTabletTransformer = new TabletTransformer();

    private static final ZoomInTransformer sZoomInTransformer = new ZoomInTransformer();

    private static final ZoomOutTransformer sZoomOutTransformer = new ZoomOutTransformer();

    public static ViewPager2.PageTransformer getTransformer(int id) {
        switch (id) {
            case R.id.mi_background_to_foreground:
                return new BackgroundToForegroundTransformer();
            case R.id.mi_cube_in:
                return new CubeInTransformer();
            case R.id.mi_cube_out:
                return new CubeOutTransformer();
            case R.id.mi_depth:
                return new DepthTransformer();
            case R.id.mi_flip_horizontal:
                return new FlipHorizontalTransformer();
            case R.id.mi_flip_vertical:
                return new FlipVerticalTransformer();
            case R.id.mi_foreground_to_background:
                return new ForegroundToBackgroundTransformer();
            case R.id.mi_rotate_down:
                return new RotateDownTransformer();
            case R.id.mi_rotate_up:
                return new RotateUpTransformer();
            case R.id.mi_tablet:
                return new TabletTransformer();
            case R.id.mi_zoom_in:
                return new ZoomInTransformer();
            default:
            case R.id.mi_zoom_out:
                return new ZoomOutTransformer();
        }
    }
}
