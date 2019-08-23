package com.ss.android.ugc.aweme.map.b;

import android.content.Context;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DrivePath;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.DriveStep;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.WalkPath;
import com.amap.api.services.route.WalkRouteResult;
import com.amap.api.services.route.WalkStep;
import com.mapbox.geojson.Point;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.map.g;
import com.ss.android.ugc.aweme.map.h;
import java.util.ArrayList;
import java.util.List;

public final class a implements RouteSearch.OnRouteSearchListener, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55050a;

    /* renamed from: b  reason: collision with root package name */
    private Context f55051b;

    /* renamed from: c  reason: collision with root package name */
    private d f55052c;

    /* renamed from: d  reason: collision with root package name */
    private List<Point> f55053d;

    /* renamed from: e  reason: collision with root package name */
    private List<Point> f55054e;

    public final void onBusRouteSearched(BusRouteResult busRouteResult, int i) {
    }

    public final void onRideRouteSearched(RideRouteResult rideRouteResult, int i) {
    }

    public a(Context context, d dVar) {
        this.f55051b = context;
        this.f55052c = dVar;
    }

    public final void onDriveRouteSearched(DriveRouteResult driveRouteResult, int i) {
        if (PatchProxy.isSupport(new Object[]{driveRouteResult, Integer.valueOf(i)}, this, f55050a, false, 58408, new Class[]{DriveRouteResult.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{driveRouteResult, Integer.valueOf(i)}, this, f55050a, false, 58408, new Class[]{DriveRouteResult.class, Integer.TYPE}, Void.TYPE);
        } else if (i != 1000) {
            if (this.f55052c != null) {
                this.f55052c.a(g.RouteDrive, -1);
            }
        } else if (driveRouteResult != null && driveRouteResult.getPaths() != null && driveRouteResult.getPaths().size() != 0) {
            this.f55053d = new ArrayList();
            DrivePath drivePath = driveRouteResult.getPaths().get(0);
            int duration = (int) drivePath.getDuration();
            for (DriveStep polyline : drivePath.getSteps()) {
                for (LatLonPoint next : polyline.getPolyline()) {
                    this.f55053d.add(Point.fromLngLat(next.getLongitude(), next.getLatitude()));
                }
            }
            if (this.f55052c != null) {
                this.f55052c.a(this.f55053d, g.RouteDrive, duration);
            }
        }
    }

    public final void onWalkRouteSearched(WalkRouteResult walkRouteResult, int i) {
        if (PatchProxy.isSupport(new Object[]{walkRouteResult, Integer.valueOf(i)}, this, f55050a, false, 58409, new Class[]{WalkRouteResult.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{walkRouteResult, Integer.valueOf(i)}, this, f55050a, false, 58409, new Class[]{WalkRouteResult.class, Integer.TYPE}, Void.TYPE);
        } else if (i != 1000) {
            if (this.f55052c != null) {
                this.f55052c.a(g.RouteWalking, -1);
            }
        } else if (walkRouteResult != null && walkRouteResult.getPaths() != null && walkRouteResult.getPaths().size() != 0) {
            this.f55054e = new ArrayList();
            WalkPath walkPath = walkRouteResult.getPaths().get(0);
            int duration = (int) walkPath.getDuration();
            for (WalkStep polyline : walkPath.getSteps()) {
                for (LatLonPoint next : polyline.getPolyline()) {
                    this.f55054e.add(Point.fromLngLat(next.getLongitude(), next.getLatitude()));
                }
            }
            if (this.f55052c != null) {
                this.f55052c.a(this.f55054e, g.RouteWalking, duration);
            }
        }
    }

    public final void a(h hVar, h hVar2, String str) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        if (PatchProxy.isSupport(new Object[]{hVar3, hVar4, str}, this, f55050a, false, 58407, new Class[]{h.class, h.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar3, hVar4, str}, this, f55050a, false, 58407, new Class[]{h.class, h.class, String.class}, Void.TYPE);
            return;
        }
        RouteSearch.FromAndTo fromAndTo = new RouteSearch.FromAndTo(new LatLonPoint(hVar3.f55066a, hVar3.f55067b), new LatLonPoint(hVar4.f55066a, hVar4.f55067b));
        RouteSearch routeSearch = new RouteSearch(this.f55051b);
        routeSearch.setRouteSearchListener(this);
        RouteSearch.DriveRouteQuery driveRouteQuery = new RouteSearch.DriveRouteQuery(fromAndTo, 0, null, null, "");
        routeSearch.calculateDriveRouteAsyn(driveRouteQuery);
        routeSearch.calculateWalkRouteAsyn(new RouteSearch.WalkRouteQuery(fromAndTo, 0));
    }
}
