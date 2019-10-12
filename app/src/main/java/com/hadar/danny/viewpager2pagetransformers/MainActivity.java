package com.hadar.danny.viewpager2pagetransformers;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 mVp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVp2 = findViewById(R.id.vp2);
        mVp2.setAdapter(new FragmentsAdapter(getSupportFragmentManager(), getLifecycle()));
        mVp2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.mi_background_to_foreground:
            case R.id.mi_cube_in:
            case R.id.mi_cube_out:
            case R.id.mi_depth:
            case R.id.mi_flip_horizontal:
            case R.id.mi_flip_vertical:
            case R.id.mi_foreground_to_background:
            case R.id.mi_rotate_down:
            case R.id.mi_rotate_up:
            case R.id.mi_tablet:
            case R.id.mi_zoom_in:
            case R.id.mi_zoom_out:
                ViewPager2.PageTransformer transformer = PageTransformerFactory.getTransformer(itemId);
                mVp2.setPageTransformer(transformer);
                item.setChecked(!item.isChecked());
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private static class FragmentsAdapter extends FragmentStateAdapter {
        List<Fragment> fragmentList;
        FragmentsAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);

            fragmentList = new ArrayList<>();

            fragmentList.add(new FirstFragment());
            fragmentList.add(new SecondFragment());
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getItemCount() {
            return fragmentList.size();
        }
    }
}
