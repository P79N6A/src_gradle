package com.amap.api.maps2d.overlay;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.amap.api.mapcore2d.cm;
import com.amap.api.mapcore2d.q;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.Polyline;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private Marker f6435a;
    protected List<Polyline> allPolyLines = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private Marker f6436b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6437c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f6438d;

    /* renamed from: e  reason: collision with root package name */
    private Bitmap f6439e;
    protected LatLng endPoint;

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f6440f;
    private Bitmap g;
    private Bitmap h;
    private AssetManager i;
    protected AMap mAMap;
    protected boolean mNodeIconVisible = true;
    protected LatLng startPoint;
    protected List<Marker> stationMarkers = new ArrayList();

    /* access modifiers changed from: protected */
    public int getBusColor() {
        return Color.parseColor("#537edc");
    }

    /* access modifiers changed from: protected */
    public int getDriveColor() {
        return Color.parseColor("#537edc");
    }

    /* access modifiers changed from: protected */
    public int getWalkColor() {
        return Color.parseColor("#6db74d");
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getBusBitmapDescriptor() {
        return getBitDes(this.f6440f, "amap_bus.png");
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getDriveBitmapDescriptor() {
        return getBitDes(this.h, "amap_car.png");
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getEndBitmapDescriptor() {
        return getBitDes(this.f6439e, "amap_end.png");
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getStartBitmapDescriptor() {
        return getBitDes(this.f6438d, "amap_start.png");
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getWalkBitmapDescriptor() {
        return getBitDes(this.g, "amap_man.png");
    }

    public void zoomToSpan() {
        if (this.startPoint != null && this.endPoint != null && this.mAMap != null) {
            this.mAMap.moveCamera(CameraUpdateFactory.newLatLngBounds(getLatLngBounds(), 50));
        }
    }

    private void a() {
        if (this.f6438d != null) {
            this.f6438d.recycle();
            this.f6438d = null;
        }
        if (this.f6439e != null) {
            this.f6439e.recycle();
            this.f6439e = null;
        }
        if (this.f6440f != null) {
            this.f6440f.recycle();
            this.f6440f = null;
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
    public LatLngBounds getLatLngBounds() {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        builder.include(new LatLng(this.startPoint.latitude, this.startPoint.longitude));
        builder.include(new LatLng(this.endPoint.latitude, this.endPoint.longitude));
        return builder.build();
    }

    /* access modifiers changed from: protected */
    public void addStartAndEndMarker() {
        this.f6435a = this.mAMap.addMarker(new MarkerOptions().position(this.startPoint).icon(getStartBitmapDescriptor()).title("起点"));
        this.f6436b = this.mAMap.addMarker(new MarkerOptions().position(this.endPoint).icon(getEndBitmapDescriptor()).title("终点"));
    }

    public void removeFromMap() {
        if (this.f6435a != null) {
            this.f6435a.remove();
        }
        if (this.f6436b != null) {
            this.f6436b.remove();
        }
        for (Marker remove : this.stationMarkers) {
            remove.remove();
        }
        for (Polyline remove2 : this.allPolyLines) {
            remove2.remove();
        }
        a();
    }

    public void setNodeIconVisibility(boolean z) {
        this.mNodeIconVisible = z;
        for (Marker visible : this.stationMarkers) {
            visible.setVisible(z);
        }
        this.mAMap.postInvalidate();
    }

    public b(Context context) {
        this.f6437c = context;
        this.i = this.f6437c.getResources().getAssets();
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getBitDes(Bitmap bitmap, String str) {
        try {
            InputStream open = this.i.open(str);
            Bitmap decodeStream = BitmapFactory.decodeStream(open);
            try {
                bitmap = a.a(decodeStream, q.f6266a);
                open.close();
            } catch (IOException e2) {
                e = e2;
                bitmap = decodeStream;
                cm.a(e, "RouteOverlay", "getBitDes");
                return BitmapDescriptorFactory.fromBitmap(bitmap);
            } catch (Throwable th) {
                th = th;
                bitmap = decodeStream;
                cm.a(th, "RouteOverlay", "getBitDes");
                return BitmapDescriptorFactory.fromBitmap(bitmap);
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            cm.a(th, "RouteOverlay", "getBitDes");
            return BitmapDescriptorFactory.fromBitmap(bitmap);
        }
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }
}
