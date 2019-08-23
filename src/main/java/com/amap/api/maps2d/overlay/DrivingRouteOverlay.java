package com.amap.api.maps2d.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.DrivePath;
import com.amap.api.services.route.DriveStep;
import java.util.ArrayList;
import java.util.List;

public class DrivingRouteOverlay extends b {

    /* renamed from: a  reason: collision with root package name */
    private DrivePath f6426a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f6427b;

    /* renamed from: c  reason: collision with root package name */
    private List<LatLonPoint> f6428c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6429d = true;
    protected List<Marker> mPassByMarkers = new ArrayList();

    /* access modifiers changed from: protected */
    public float getBuslineWidth() {
        return 18.0f;
    }

    public /* bridge */ /* synthetic */ void zoomToSpan() {
        super.zoomToSpan();
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getPassedByBitmapDescriptor() {
        return getBitDes(this.f6427b, "amap_throughpoint.png");
    }

    public void removeFromMap() {
        super.removeFromMap();
        for (Marker remove : this.mPassByMarkers) {
            remove.remove();
        }
    }

    private void a() {
        if (this.f6428c != null && this.f6428c.size() != 0) {
            for (LatLonPoint a2 : this.f6428c) {
                LatLng a3 = a.a(a2);
                if (a3 != null) {
                    this.mPassByMarkers.add(this.mAMap.addMarker(new MarkerOptions().position(a3).title("途经点").visible(this.f6429d).icon(getPassedByBitmapDescriptor())));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public LatLngBounds getLatLngBounds() {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        builder.include(new LatLng(this.startPoint.latitude, this.startPoint.longitude));
        builder.include(new LatLng(this.endPoint.latitude, this.endPoint.longitude));
        if (this.f6428c != null && this.f6428c.size() > 0) {
            for (int i = 0; i < this.f6428c.size(); i++) {
                builder.include(new LatLng(this.f6428c.get(i).getLatitude(), this.f6428c.get(i).getLongitude()));
            }
        }
        return builder.build();
    }

    public void addToMap() {
        if (this.mAMap != null && this.f6426a != null) {
            List steps = this.f6426a.getSteps();
            for (int i = 0; i < steps.size(); i++) {
                DriveStep driveStep = (DriveStep) steps.get(i);
                if (driveStep != null) {
                    LatLng a2 = a.a((LatLonPoint) driveStep.getPolyline().get(0));
                    if (i < steps.size() - 1) {
                        if (i == 0) {
                            this.allPolyLines.add(this.mAMap.addPolyline(new PolylineOptions().add(this.startPoint, a2).color(getDriveColor()).width(getBuslineWidth())));
                        }
                        LatLng a3 = a.a((LatLonPoint) driveStep.getPolyline().get(driveStep.getPolyline().size() - 1));
                        LatLng a4 = a.a((LatLonPoint) ((DriveStep) steps.get(i + 1)).getPolyline().get(0));
                        if (!a3.equals(a4)) {
                            this.allPolyLines.add(this.mAMap.addPolyline(new PolylineOptions().add(a3, a4).color(getDriveColor()).width(getBuslineWidth())));
                        }
                    } else {
                        LatLng a5 = a.a((LatLonPoint) driveStep.getPolyline().get(driveStep.getPolyline().size() - 1));
                        this.allPolyLines.add(this.mAMap.addPolyline(new PolylineOptions().add(a5, this.endPoint).color(getDriveColor()).width(getBuslineWidth())));
                    }
                    AMap aMap = this.mAMap;
                    MarkerOptions position = new MarkerOptions().position(a2);
                    this.stationMarkers.add(aMap.addMarker(position.title("方向:" + driveStep.getAction() + "\n道路:" + driveStep.getRoad()).snippet(driveStep.getInstruction()).anchor(0.5f, 0.5f).visible(this.mNodeIconVisible).icon(getDriveBitmapDescriptor())));
                    this.allPolyLines.add(this.mAMap.addPolyline(new PolylineOptions().addAll(a.a(driveStep.getPolyline())).color(getDriveColor()).width(getBuslineWidth())));
                }
            }
            a();
            addStartAndEndMarker();
        }
    }

    public /* bridge */ /* synthetic */ void setNodeIconVisibility(boolean z) {
        super.setNodeIconVisibility(z);
    }

    public void setThroughPointIconVisibility(boolean z) {
        this.f6429d = z;
        for (Marker visible : this.mPassByMarkers) {
            visible.setVisible(z);
        }
        this.mAMap.postInvalidate();
    }

    public DrivingRouteOverlay(Context context, AMap aMap, DrivePath drivePath, LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
        super(context);
        this.mAMap = aMap;
        this.f6426a = drivePath;
        this.startPoint = a.a(latLonPoint);
        this.endPoint = a.a(latLonPoint2);
    }

    public DrivingRouteOverlay(Context context, AMap aMap, DrivePath drivePath, LatLonPoint latLonPoint, LatLonPoint latLonPoint2, List<LatLonPoint> list) {
        super(context);
        this.mAMap = aMap;
        this.f6426a = drivePath;
        this.startPoint = a.a(latLonPoint);
        this.endPoint = a.a(latLonPoint2);
        this.f6428c = list;
    }
}
