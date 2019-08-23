package com.bytedance.common.util;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.widget.ListView;

public class GingerBreadV9Compat {
    static final BaseImpl IMPL;

    static class BaseImpl {
        public void requestSingleUpdate(LocationManager locationManager, Criteria criteria, LocationListener locationListener, Looper looper) {
        }

        public void requestSingleUpdate(LocationManager locationManager, String str, LocationListener locationListener, Looper looper) {
        }

        public void setListViewOverScrollHeader(ListView listView, Drawable drawable) {
        }

        public void setViewOverScrollMode(View view, int i) {
        }

        BaseImpl() {
        }
    }

    @TargetApi(11)
    static class V9Impl extends BaseImpl {
        V9Impl() {
        }

        public void setListViewOverScrollHeader(ListView listView, Drawable drawable) {
            listView.setOverscrollHeader(drawable);
        }

        public void setViewOverScrollMode(View view, int i) {
            view.setOverScrollMode(i);
        }

        public void requestSingleUpdate(LocationManager locationManager, Criteria criteria, LocationListener locationListener, Looper looper) {
            locationManager.requestSingleUpdate(criteria, locationListener, looper);
        }

        public void requestSingleUpdate(LocationManager locationManager, String str, LocationListener locationListener, Looper looper) {
            locationManager.requestSingleUpdate(str, locationListener, looper);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 9) {
            IMPL = new V9Impl();
        } else {
            IMPL = new BaseImpl();
        }
    }

    public static void setListViewOverScrollHeader(ListView listView, Drawable drawable) {
        IMPL.setListViewOverScrollHeader(listView, drawable);
    }

    public static void setViewOverScrollMode(View view, int i) {
        IMPL.setViewOverScrollMode(view, i);
    }

    public static void requestSingleUpdate(LocationManager locationManager, Criteria criteria, LocationListener locationListener, Looper looper) {
        IMPL.requestSingleUpdate(locationManager, criteria, locationListener, looper);
    }

    public static void requestSingleUpdate(LocationManager locationManager, String str, LocationListener locationListener, Looper looper) {
        IMPL.requestSingleUpdate(locationManager, str, locationListener, looper);
    }
}
