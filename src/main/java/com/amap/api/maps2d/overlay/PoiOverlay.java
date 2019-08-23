package com.amap.api.maps2d.overlay;

import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.services.core.PoiItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PoiOverlay {

    /* renamed from: a  reason: collision with root package name */
    private List<PoiItem> f6430a;

    /* renamed from: b  reason: collision with root package name */
    private AMap f6431b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<Marker> f6432c = new ArrayList<>();

    /* access modifiers changed from: protected */
    public BitmapDescriptor getBitmapDescriptor(int i) {
        return null;
    }

    public void removeFromMap() {
        Iterator<Marker> it2 = this.f6432c.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
    }

    public void zoomToSpan() {
        if (this.f6430a != null && this.f6430a.size() > 0 && this.f6431b != null) {
            this.f6431b.moveCamera(CameraUpdateFactory.newLatLngBounds(a(), 5));
        }
    }

    private LatLngBounds a() {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        for (int i = 0; i < this.f6430a.size(); i++) {
            builder.include(new LatLng(this.f6430a.get(i).getLatLonPoint().getLatitude(), this.f6430a.get(i).getLatLonPoint().getLongitude()));
        }
        return builder.build();
    }

    public void addToMap() {
        for (int i = 0; i < this.f6430a.size(); i++) {
            Marker addMarker = this.f6431b.addMarker(a(i));
            addMarker.setObject(Integer.valueOf(i));
            this.f6432c.add(addMarker);
        }
    }

    /* access modifiers changed from: protected */
    public String getSnippet(int i) {
        return this.f6430a.get(i).getSnippet();
    }

    /* access modifiers changed from: protected */
    public String getTitle(int i) {
        return this.f6430a.get(i).getTitle();
    }

    public int getPoiIndex(Marker marker) {
        for (int i = 0; i < this.f6432c.size(); i++) {
            if (this.f6432c.get(i).equals(marker)) {
                return i;
            }
        }
        return -1;
    }

    public PoiItem getPoiItem(int i) {
        if (i < 0 || i >= this.f6430a.size()) {
            return null;
        }
        return this.f6430a.get(i);
    }

    private MarkerOptions a(int i) {
        return new MarkerOptions().position(new LatLng(this.f6430a.get(i).getLatLonPoint().getLatitude(), this.f6430a.get(i).getLatLonPoint().getLongitude())).title(getTitle(i)).snippet(getSnippet(i)).icon(getBitmapDescriptor(i));
    }

    public PoiOverlay(AMap aMap, List<PoiItem> list) {
        this.f6431b = aMap;
        this.f6430a = list;
    }
}
