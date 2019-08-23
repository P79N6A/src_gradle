package com.amap.api.mapcore2d;

import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;

public final class fh {
    public static AMapLocationClientOption a() {
        return new AMapLocationClientOption();
    }

    public static void a(AMapLocationClientOption aMapLocationClientOption, Inner_3dMap_locationOption inner_3dMap_locationOption) {
        AMapLocationClientOption.AMapLocationMode aMapLocationMode;
        try {
            aMapLocationClientOption.setInterval(inner_3dMap_locationOption.getInterval());
            switch (inner_3dMap_locationOption.getLocationMode()) {
                case Battery_Saving:
                    aMapLocationMode = AMapLocationClientOption.AMapLocationMode.Battery_Saving;
                    break;
                case Device_Sensors:
                    aMapLocationMode = AMapLocationClientOption.AMapLocationMode.Device_Sensors;
                    break;
                default:
                    aMapLocationMode = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
                    break;
            }
            aMapLocationClientOption.setLocationMode(aMapLocationMode);
            aMapLocationClientOption.setOnceLocation(inner_3dMap_locationOption.isOnceLocation());
            aMapLocationClientOption.setNeedAddress(inner_3dMap_locationOption.isNeedAddress());
        } catch (Throwable unused) {
        }
    }

    public static void a(Object obj, Inner_3dMap_locationListener inner_3dMap_locationListener) {
        fj fjVar = new fj();
        fjVar.a(inner_3dMap_locationListener);
        ((AMapLocationClient) obj).setLocationListener(fjVar);
    }
}
