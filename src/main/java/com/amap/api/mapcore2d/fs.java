package com.amap.api.mapcore2d;

import com.amap.api.mapcore2d.cy;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;

public final class fs {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f6175a = {"com.amap.api.maps2d", "com.amap.api.mapcore2d"};

    public static cy a() throws co {
        return new cy.a("2dmap", "5.2.0", "AMAP_SDK_Android_2DMap_5.2.0").a(f6175a).a();
    }

    public static boolean a(fi fiVar) {
        if (fiVar != null && !fiVar.d().equals("8") && !fiVar.d().equals("5") && !fiVar.d().equals("6")) {
            return a((Inner_3dMap_location) fiVar);
        }
        return false;
    }

    private static boolean a(Inner_3dMap_location inner_3dMap_location) {
        double longitude = inner_3dMap_location.getLongitude();
        double latitude = inner_3dMap_location.getLatitude();
        return !(longitude == 0.0d && latitude == 0.0d) && longitude <= 180.0d && latitude <= 90.0d && longitude >= -180.0d && latitude >= -90.0d;
    }
}
