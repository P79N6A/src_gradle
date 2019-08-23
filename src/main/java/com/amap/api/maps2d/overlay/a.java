package com.amap.api.maps2d.overlay;

import android.graphics.Bitmap;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static int f6434a = 2048;

    public static LatLng a(LatLonPoint latLonPoint) {
        if (latLonPoint == null) {
            return null;
        }
        return new LatLng(latLonPoint.getLatitude(), latLonPoint.getLongitude());
    }

    public static ArrayList<LatLng> a(List<LatLonPoint> list) {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        for (LatLonPoint next : list) {
            if (next != null) {
                arrayList.add(a(next));
            }
        }
        return arrayList;
    }

    public static Bitmap a(Bitmap bitmap, float f2) {
        if (bitmap == null) {
            return null;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * f2), (int) (((float) bitmap.getHeight()) * f2), true);
    }
}
