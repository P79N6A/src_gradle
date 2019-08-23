package com.amap.api.services.traffic;

import android.content.Context;
import com.amap.api.services.a.bb;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.ITrafficSearch;

public class TrafficSearch {
    public static int ROAD_LEVEL_CITY_QUICK_WAY = 2;
    public static int ROAD_LEVEL_HIGH_WAY = 1;
    public static int ROAD_LEVEL_HIGH_WAY_BYROAD = 3;
    public static int ROAD_LEVEL_MAIN_WAY = 4;
    public static int ROAD_LEVEL_NONAME_WAY = 6;
    public static int ROAD_LEVEL_NORMAL_WAY = 5;

    /* renamed from: a  reason: collision with root package name */
    private ITrafficSearch f7311a;

    public interface OnTrafficSearchListener {
        void onRoadTrafficSearched(TrafficStatusResult trafficStatusResult, int i);
    }

    public TrafficStatusResult loadTrafficByCircle(CircleTrafficQuery circleTrafficQuery) throws AMapException {
        if (this.f7311a != null) {
            return this.f7311a.loadTrafficByCircle(circleTrafficQuery);
        }
        return null;
    }

    public void loadTrafficByCircleAsyn(CircleTrafficQuery circleTrafficQuery) {
        if (this.f7311a != null) {
            this.f7311a.loadTrafficByCircleAsyn(circleTrafficQuery);
        }
    }

    public TrafficStatusResult loadTrafficByRoad(RoadTrafficQuery roadTrafficQuery) throws AMapException {
        if (this.f7311a != null) {
            return this.f7311a.loadTrafficByRoad(roadTrafficQuery);
        }
        return null;
    }

    public void loadTrafficByRoadAsyn(RoadTrafficQuery roadTrafficQuery) {
        if (this.f7311a != null) {
            this.f7311a.loadTrafficByRoadAsyn(roadTrafficQuery);
        }
    }

    public void setTrafficSearchListener(OnTrafficSearchListener onTrafficSearchListener) {
        if (this.f7311a != null) {
            this.f7311a.setTrafficSearchListener(onTrafficSearchListener);
        }
    }

    public TrafficSearch(Context context) {
        try {
            Context context2 = context;
            this.f7311a = (ITrafficSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.TrafficSearchWrapper", bb.class, new Class[]{Context.class}, new Object[]{context});
        } catch (be unused) {
        }
        if (this.f7311a == null) {
            try {
                this.f7311a = new bb(context);
            } catch (Exception unused2) {
            }
        }
    }
}
