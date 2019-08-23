package com.amap.api.maps2d.overlay;

import android.content.Context;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.Polyline;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.BusPath;
import com.amap.api.services.route.BusStep;
import com.amap.api.services.route.RouteBusLineItem;
import com.amap.api.services.route.WalkStep;
import java.util.ArrayList;
import java.util.List;

public class BusRouteOverlay extends b {

    /* renamed from: a  reason: collision with root package name */
    private BusPath f6424a;

    /* renamed from: b  reason: collision with root package name */
    private LatLng f6425b;

    /* access modifiers changed from: protected */
    public float getBuslineWidth() {
        return 18.0f;
    }

    public /* bridge */ /* synthetic */ void removeFromMap() {
        super.removeFromMap();
    }

    public /* bridge */ /* synthetic */ void zoomToSpan() {
        super.zoomToSpan();
    }

    public void addToMap() {
        try {
            List steps = this.f6424a.getSteps();
            for (int i = 0; i < steps.size(); i++) {
                BusStep busStep = (BusStep) steps.get(i);
                if (i < steps.size() - 1) {
                    BusStep busStep2 = (BusStep) steps.get(i + 1);
                    if (!(busStep.getWalk() == null || busStep.getBusLine() == null)) {
                        b(busStep);
                    }
                    if (!(busStep.getBusLine() == null || busStep2.getWalk() == null)) {
                        c(busStep, busStep2);
                    }
                    if (!(busStep.getBusLine() == null || busStep2.getWalk() != null || busStep2.getBusLine() == null)) {
                        b(busStep, busStep2);
                    }
                    if (!(busStep.getBusLine() == null || busStep2.getWalk() != null || busStep2.getBusLine() == null)) {
                        a(busStep, busStep2);
                    }
                }
                if (busStep.getWalk() != null && busStep.getWalk().getSteps().size() > 0) {
                    a(busStep);
                } else if (busStep.getBusLine() == null) {
                    this.allPolyLines.add(a(this.f6425b, this.endPoint));
                }
                if (busStep.getBusLine() != null) {
                    RouteBusLineItem busLine = busStep.getBusLine();
                    a(busLine);
                    b(busLine);
                }
            }
            addStartAndEndMarker();
        } catch (Throwable unused) {
        }
    }

    public /* bridge */ /* synthetic */ void setNodeIconVisibility(boolean z) {
        super.setNodeIconVisibility(z);
    }

    private LatLonPoint f(BusStep busStep) {
        return (LatLonPoint) busStep.getBusLine().getPolyline().get(0);
    }

    private void b(BusStep busStep) {
        LatLonPoint d2 = d(busStep);
        LatLonPoint f2 = f(busStep);
        if (!d2.equals(f2)) {
            this.allPolyLines.add(a(d2, f2));
        }
    }

    private LatLonPoint c(BusStep busStep) {
        return (LatLonPoint) ((WalkStep) busStep.getWalk().getSteps().get(0)).getPolyline().get(0);
    }

    private LatLonPoint e(BusStep busStep) {
        List polyline = busStep.getBusLine().getPolyline();
        return (LatLonPoint) polyline.get(polyline.size() - 1);
    }

    private String b(List<WalkStep> list) {
        float f2 = 0.0f;
        for (WalkStep distance : list) {
            f2 += distance.getDistance();
        }
        return "步行" + f2 + "米";
    }

    private String c(RouteBusLineItem routeBusLineItem) {
        return "(" + routeBusLineItem.getDepartureBusStation().getBusStationName() + "-->" + routeBusLineItem.getArrivalBusStation().getBusStationName() + ") 经过" + (routeBusLineItem.getPassStationNum() + 1) + "站";
    }

    private LatLonPoint d(BusStep busStep) {
        List steps = busStep.getWalk().getSteps();
        List polyline = ((WalkStep) steps.get(steps.size() - 1)).getPolyline();
        return (LatLonPoint) polyline.get(polyline.size() - 1);
    }

    private Polyline a(List<LatLng> list) {
        return this.mAMap.addPolyline(new PolylineOptions().addAll(list).color(getWalkColor()).width(getBuslineWidth()));
    }

    private void b(RouteBusLineItem routeBusLineItem) {
        this.stationMarkers.add(this.mAMap.addMarker(new MarkerOptions().position(a.a(routeBusLineItem.getDepartureBusStation().getLatLonPoint())).title(routeBusLineItem.getBusLineName()).snippet(c(routeBusLineItem)).anchor(0.5f, 0.5f).visible(this.mNodeIconVisible).icon(getBusBitmapDescriptor())));
    }

    private void a(BusStep busStep) {
        List steps = busStep.getWalk().getSteps();
        for (int i = 0; i < steps.size(); i++) {
            WalkStep walkStep = (WalkStep) steps.get(i);
            if (walkStep != null) {
                if (i == 0) {
                    a(a.a((LatLonPoint) walkStep.getPolyline().get(0)), walkStep.getRoad(), b(steps));
                }
                ArrayList<LatLng> a2 = a.a(walkStep.getPolyline());
                this.f6425b = a2.get(a2.size() - 1);
                this.allPolyLines.add(a((List<LatLng>) a2));
                if (i < steps.size() - 1) {
                    LatLng latLng = a2.get(a2.size() - 1);
                    LatLng a3 = a.a((LatLonPoint) ((WalkStep) steps.get(i + 1)).getPolyline().get(0));
                    if (!latLng.equals(a3)) {
                        this.allPolyLines.add(a(latLng, a3));
                    }
                }
            }
        }
    }

    private void a(RouteBusLineItem routeBusLineItem) {
        this.allPolyLines.add(this.mAMap.addPolyline(new PolylineOptions().addAll(a.a(routeBusLineItem.getPolyline())).color(getBusColor()).width(getBuslineWidth())));
    }

    private Polyline a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
        LatLng a2 = a.a(latLonPoint);
        LatLng a3 = a.a(latLonPoint2);
        if (this.mAMap != null) {
            return a(a2, a3);
        }
        return null;
    }

    private Polyline a(LatLng latLng, LatLng latLng2) {
        return this.mAMap.addPolyline(new PolylineOptions().add(latLng, latLng2).width(getBuslineWidth()).color(getWalkColor()));
    }

    public void drawLineArrow(LatLng latLng, LatLng latLng2) {
        this.mAMap.addPolyline(new PolylineOptions().add(latLng, latLng2).width(3.0f).color(getBusColor()).width(getBuslineWidth()));
    }

    private void b(BusStep busStep, BusStep busStep2) {
        LatLng a2 = a.a(e(busStep));
        LatLng a3 = a.a(f(busStep2));
        if (!a2.equals(a3)) {
            drawLineArrow(a2, a3);
        }
    }

    private void c(BusStep busStep, BusStep busStep2) {
        LatLonPoint e2 = e(busStep);
        LatLonPoint c2 = c(busStep2);
        if (!e2.equals(c2)) {
            this.allPolyLines.add(a(e2, c2));
        }
    }

    private void a(BusStep busStep, BusStep busStep2) {
        LatLng a2 = a.a(e(busStep));
        LatLng a3 = a.a(f(busStep2));
        if (a3.latitude - a2.latitude > 1.0E-4d || a3.longitude - a2.longitude > 1.0E-4d) {
            drawLineArrow(a2, a3);
        }
    }

    private void a(LatLng latLng, String str, String str2) {
        this.stationMarkers.add(this.mAMap.addMarker(new MarkerOptions().position(latLng).title(str).snippet(str2).visible(this.mNodeIconVisible).anchor(0.5f, 0.5f).icon(getWalkBitmapDescriptor())));
    }

    public BusRouteOverlay(Context context, AMap aMap, BusPath busPath, LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
        super(context);
        this.f6424a = busPath;
        this.startPoint = a.a(latLonPoint);
        this.endPoint = a.a(latLonPoint2);
        this.mAMap = aMap;
    }
}
