package com.hadar.danny.viewpager2pagetransformers;

import com.hadar.danny.horinzontaltransformers.*;

import androidx.viewpager2.widget.ViewPager2;

final class PageTransformerFactory {

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

    static ViewPager2.PageTransformer getTransformer(int id) {
        switch (id) {
            case R.id.mi_background_to_foreground:
                return sBackgroundToForegroundTransformer;
            case R.id.mi_cube_in:
                return sCubeInTransformer;
            case R.id.mi_cube_out:
                return sCubeOutTransformer;
            case R.id.mi_depth:
                return sDepthTransformer;
            case R.id.mi_flip_horizontal:
                return sFlipHorizontalTransformer;
            case R.id.mi_flip_vertical:
                return sFlipVerticalTransformer;
            case R.id.mi_foreground_to_background:
                return sForegroundToBackgroundTransformer;
            case R.id.mi_rotate_down:
                return sRotateDownTransformer;
            case R.id.mi_rotate_up:
                return sRotateUpTransformer;
            case R.id.mi_tablet:
                return sTabletTransformer;
            case R.id.mi_zoom_in:
                return sZoomInTransformer;
            default:
            case R.id.mi_zoom_out:
                return sZoomOutTransformer;
        }
    }
}
