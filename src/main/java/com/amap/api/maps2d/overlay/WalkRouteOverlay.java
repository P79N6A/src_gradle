package com.amap.api.maps2d.overlay;

import android.content.Context;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.WalkPath;
import com.amap.api.services.route.WalkStep;
import java.util.List;

public class WalkRouteOverlay extends b {

    /* renamed from: a  reason: collision with root package name */
    private WalkPath f6433a;

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
        if (this.f6433a != null) {
            try {
                List steps = this.f6433a.getSteps();
                for (int i = 0; i < steps.size(); i++) {
                    WalkStep walkStep = (WalkStep) steps.get(i);
                    LatLng a2 = a.a(walkStep.getPolyline().get(0));
                    if (i < steps.size() - 1) {
                        if (i == 0) {
                            this.allPolyLines.add(this.mAMap.addPolyline(new PolylineOptions().add(this.startPoint, a2).color(getWalkColor()).width(getBuslineWidth())));
                        }
                        LatLng a3 = a.a(walkStep.getPolyline().get(walkStep.getPolyline().size() - 1));
                        LatLng a4 = a.a(((WalkStep) steps.get(i + 1)).getPolyline().get(0));
                        if (!a3.equals(a4)) {
                            this.allPolyLines.add(this.mAMap.addPolyline(new PolylineOptions().add(a3, a4).color(getWalkColor()).width(getBuslineWidth())));
                        }
                    } else {
                        LatLng a5 = a.a(walkStep.getPolyline().get(walkStep.getPolyline().size() - 1));
                        this.allPolyLines.add(this.mAMap.addPolyline(new PolylineOptions().add(a5, this.endPoint).color(getWalkColor()).width(getBuslineWidth())));
                    }
                    AMap aMap = this.mAMap;
                    MarkerOptions position = new MarkerOptions().position(a2);
                    this.stationMarkers.add(aMap.addMarker(position.title("方向:" + walkStep.getAction() + "\n道路:" + walkStep.getRoad()).snippet(walkStep.getInstruction()).anchor(0.5f, 0.5f).visible(this.mNodeIconVisible).icon(getWalkBitmapDescriptor())));
                    this.allPolyLines.add(this.mAMap.addPolyline(new PolylineOptions().addAll(a.a(walkStep.getPolyline())).color(getWalkColor()).width(getBuslineWidth())));
                }
                addStartAndEndMarker();
            } catch (Throwable unused) {
            }
        }
    }

    public /* bridge */ /* synthetic */ void setNodeIconVisibility(boolean z) {
        super.setNodeIconVisibility(z);
    }

    public WalkRouteOverlay(Context context, AMap aMap, WalkPath walkPath, LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
        super(context);
        this.mAMap = aMap;
        this.f6433a = walkPath;
        this.startPoint = a.a(latLonPoint);
        this.endPoint = a.a(latLonPoint2);
    }
}
