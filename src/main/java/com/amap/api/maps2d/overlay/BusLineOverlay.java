package com.amap.api.maps2d.overlay;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.Polyline;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.services.busline.BusLineItem;
import com.amap.api.services.busline.BusStationItem;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BusLineOverlay {

    /* renamed from: a  reason: collision with root package name */
    private BusLineItem f6418a;

    /* renamed from: b  reason: collision with root package name */
    private AMap f6419b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<Marker> f6420c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private Polyline f6421d;

    /* renamed from: e  reason: collision with root package name */
    private List<BusStationItem> f6422e;

    /* renamed from: f  reason: collision with root package name */
    private BitmapDescriptor f6423f;
    private BitmapDescriptor g;
    private BitmapDescriptor h;
    private AssetManager i;
    private Context j;

    /* access modifiers changed from: protected */
    public float getBuslineWidth() {
        return 18.0f;
    }

    /* access modifiers changed from: protected */
    public String getSnippet(int i2) {
        return "";
    }

    /* access modifiers changed from: protected */
    public int getBusColor() {
        return Color.parseColor("#537edc");
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getBusBitmapDescriptor() {
        this.h = a("amap_bus.png");
        return this.h;
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getEndBitmapDescriptor() {
        this.g = a("amap_end.png");
        return this.g;
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getStartBitmapDescriptor() {
        this.f6423f = a("amap_start.png");
        return this.f6423f;
    }

    public void removeFromMap() {
        if (this.f6421d != null) {
            this.f6421d.remove();
        }
        Iterator<Marker> it2 = this.f6420c.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
        a();
    }

    public void zoomToSpan() {
        if (this.f6419b != null) {
            List directionsCoordinates = this.f6418a.getDirectionsCoordinates();
            if (directionsCoordinates != null && directionsCoordinates.size() > 0) {
                this.f6419b.moveCamera(CameraUpdateFactory.newLatLngBounds(a(directionsCoordinates), 5));
            }
        }
    }

    public void addToMap() {
        this.f6421d = this.f6419b.addPolyline(new PolylineOptions().addAll(a.a(this.f6418a.getDirectionsCoordinates())).color(getBusColor()).width(getBuslineWidth()));
        if (this.f6422e.size() > 0) {
            for (int i2 = 1; i2 < this.f6422e.size() - 1; i2++) {
                this.f6420c.add(this.f6419b.addMarker(a(i2)));
            }
            this.f6420c.add(this.f6419b.addMarker(a(0)));
            this.f6420c.add(this.f6419b.addMarker(a(this.f6422e.size() - 1)));
        }
    }

    private void a() {
        if (this.f6423f != null) {
            this.f6423f.recycle();
            this.f6423f = null;
        }
        if (this.g != null) {
            this.g.recycle();
            this.g = null;
        }
        if (this.h != null) {
            this.h.recycle();
            this.h = null;
        }
    }

    /* access modifiers changed from: protected */
    public String getTitle(int i2) {
        return this.f6422e.get(i2).getBusStationName();
    }

    public int getBusStationIndex(Marker marker) {
        for (int i2 = 0; i2 < this.f6420c.size(); i2++) {
            if (this.f6420c.get(i2).equals(marker)) {
                return i2;
            }
        }
        return -1;
    }

    public BusStationItem getBusStationItem(int i2) {
        if (i2 < 0 || i2 >= this.f6422e.size()) {
            return null;
        }
        return this.f6422e.get(i2);
    }

    private LatLngBounds a(List<LatLonPoint> list) {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            builder.include(new LatLng(list.get(i2).getLatitude(), list.get(i2).getLongitude()));
        }
        return builder.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r4 = r1;
        r1 = r6;
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        r4 = r1;
        r1 = r6;
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        com.amap.api.mapcore2d.cm.a(r6, "BusLineOverlay", "getBitDes");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[ExcHandler: all (r1v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003b A[SYNTHETIC, Splitter:B:25:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004d A[SYNTHETIC, Splitter:B:33:0x004d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.amap.api.maps2d.model.BitmapDescriptor a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "getBitDes"
            r1 = 0
            android.content.res.AssetManager r2 = r5.i     // Catch:{ IOException -> 0x0032 }
            java.io.InputStream r6 = r2.open(r6)     // Catch:{ IOException -> 0x0032 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x002a, all -> 0x0025 }
            float r1 = com.amap.api.mapcore2d.q.f6266a     // Catch:{ IOException -> 0x0020, all -> 0x0025 }
            android.graphics.Bitmap r1 = com.amap.api.mapcore2d.cm.a((android.graphics.Bitmap) r2, (float) r1)     // Catch:{ IOException -> 0x0020, all -> 0x0025 }
            if (r6 == 0) goto L_0x0046
            r6.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x0046
        L_0x0019:
            r6 = move-exception
            java.lang.String r2 = "BusLineOverlay"
            com.amap.api.mapcore2d.cm.a(r6, r2, r0)
            goto L_0x0046
        L_0x0020:
            r1 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
            goto L_0x0034
        L_0x0025:
            r1 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
            goto L_0x004b
        L_0x002a:
            r2 = move-exception
            r4 = r1
            r1 = r6
            r6 = r2
            r2 = r4
            goto L_0x0034
        L_0x0030:
            r6 = move-exception
            goto L_0x004b
        L_0x0032:
            r6 = move-exception
            r2 = r1
        L_0x0034:
            java.lang.String r3 = "BusLineOverlay"
            com.amap.api.mapcore2d.cm.a(r6, r3, r0)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0045
        L_0x003f:
            r6 = move-exception
            java.lang.String r1 = "BusLineOverlay"
            com.amap.api.mapcore2d.cm.a(r6, r1, r0)
        L_0x0045:
            r1 = r2
        L_0x0046:
            com.amap.api.maps2d.model.BitmapDescriptor r6 = com.amap.api.maps2d.model.BitmapDescriptorFactory.fromBitmap(r1)
            return r6
        L_0x004b:
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0057
        L_0x0051:
            r1 = move-exception
            java.lang.String r2 = "BusLineOverlay"
            com.amap.api.mapcore2d.cm.a(r1, r2, r0)
        L_0x0057:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.maps2d.overlay.BusLineOverlay.a(java.lang.String):com.amap.api.maps2d.model.BitmapDescriptor");
    }

    private MarkerOptions a(int i2) {
        MarkerOptions snippet = new MarkerOptions().position(new LatLng(this.f6422e.get(i2).getLatLonPoint().getLatitude(), this.f6422e.get(i2).getLatLonPoint().getLongitude())).title(getTitle(i2)).snippet(getSnippet(i2));
        if (i2 == 0) {
            snippet.icon(getStartBitmapDescriptor());
        } else if (i2 == this.f6422e.size() - 1) {
            snippet.icon(getEndBitmapDescriptor());
        } else {
            snippet.anchor(0.5f, 0.5f);
            snippet.icon(getBusBitmapDescriptor());
        }
        return snippet;
    }

    public BusLineOverlay(Context context, AMap aMap, BusLineItem busLineItem) {
        this.j = context;
        this.f6418a = busLineItem;
        this.f6419b = aMap;
        this.f6422e = this.f6418a.getBusStations();
        this.i = this.j.getResources().getAssets();
    }
}
