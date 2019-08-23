package com.mapbox.mapboxsdk.plugins.china.maps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.maps.SupportMapFragment;
import com.mapbox.mapboxsdk.utils.d;
import java.lang.reflect.Field;

public class ChinaSupportMapFragment extends SupportMapFragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = layoutInflater.getContext();
        a aVar = new a(context, d.a(context, getArguments()));
        try {
            Field declaredField = SupportMapFragment.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            declaredField.set(this, aVar);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        return aVar;
    }
}
