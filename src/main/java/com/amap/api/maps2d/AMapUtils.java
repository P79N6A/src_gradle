package com.amap.api.maps2d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.amap.api.mapcore2d.co;
import com.amap.api.mapcore2d.cp;
import com.amap.api.mapcore2d.cr;
import com.amap.api.mapcore2d.cy;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.NaviPara;
import com.amap.api.maps2d.model.PoiPara;
import com.amap.api.maps2d.model.RoutePara;
import java.util.Locale;

public class AMapUtils {

    static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        String f6312a = "";

        /* renamed from: b  reason: collision with root package name */
        Context f6313b;

        public void run() {
            if (this.f6313b != null) {
                try {
                    cr.a(this.f6313b, new cy.a(this.f6312a, "5.2.0", "AMAP_SDK_Android_2DMap_5.2.0").a(new String[]{"com.amap.api.maps"}).a());
                    interrupt();
                } catch (co unused) {
                }
            }
        }

        public a(String str, Context context) {
            this.f6312a = str;
            if (context != null) {
                this.f6313b = context.getApplicationContext();
            }
        }
    }

    private static boolean a(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo("com.autonavi.minimap", 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void getLatestAMapApp(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(276824064);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("http://wap.amap.com/"));
            new a("glaa", context).start();
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    private static boolean a(RoutePara routePara) {
        if (routePara.getStartPoint() == null || routePara.getEndPoint() == null || routePara.getStartName() == null || routePara.getStartName().trim().length() <= 0 || routePara.getEndName() == null || routePara.getEndName().trim().length() <= 0) {
            return false;
        }
        return true;
    }

    public static void openAMapDrivingRoute(RoutePara routePara, Context context) throws AMapException {
        b(routePara, context, 2);
    }

    public static void openAMapTransitRoute(RoutePara routePara, Context context) throws AMapException {
        b(routePara, context, 1);
    }

    public static void openAMapWalkingRoute(RoutePara routePara, Context context) throws AMapException {
        b(routePara, context, 4);
    }

    private static String a(NaviPara naviPara, Context context) {
        return String.format(Locale.US, "androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=0&style=%d", new Object[]{cp.b(context), Double.valueOf(naviPara.getTargetPoint().latitude), Double.valueOf(naviPara.getTargetPoint().longitude), Integer.valueOf(naviPara.getNaviStyle())});
    }

    private static String a(PoiPara poiPara, Context context) {
        String format = String.format(Locale.US, "androidamap://arroundpoi?sourceApplication=%s&keywords=%s&dev=0", new Object[]{cp.b(context), poiPara.getKeywords()});
        if (poiPara.getCenter() == null) {
            return format;
        }
        return format + "&lat=" + poiPara.getCenter().latitude + "&lon=" + poiPara.getCenter().longitude;
    }

    public static float calculateArea(LatLng latLng, LatLng latLng2) {
        if (latLng == null || latLng2 == null) {
            try {
                throw new AMapException("非法坐标值");
            } catch (AMapException unused) {
                return 0.0f;
            }
        } else {
            double sin = Math.sin((latLng.latitude * 3.141592653589793d) / 180.0d) - Math.sin((latLng2.latitude * 3.141592653589793d) / 180.0d);
            double d2 = (latLng2.longitude - latLng.longitude) / 360.0d;
            if (d2 < 0.0d) {
                d2 += 1.0d;
            }
            return (float) (sin * 2.5560394669790553E14d * d2);
        }
    }

    public static void openAMapNavi(NaviPara naviPara, Context context) throws AMapException {
        if (!a(context)) {
            throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
        } else if (naviPara.getTargetPoint() != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(276824064);
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse(a(naviPara, context)));
                intent.setPackage("com.autonavi.minimap");
                new a("oan", context).start();
                context.startActivity(intent);
            } catch (Throwable unused) {
                throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
            }
        } else {
            throw new AMapException("非法导航参数");
        }
    }

    public static void openAMapPoiNearbySearch(PoiPara poiPara, Context context) throws AMapException {
        if (!a(context)) {
            throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
        } else if (poiPara.getKeywords() == null || poiPara.getKeywords().trim().length() <= 0) {
            throw new AMapException("非法导航参数");
        } else {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(276824064);
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse(a(poiPara, context)));
                intent.setPackage("com.autonavi.minimap");
                new a("oan", context).start();
                context.startActivity(intent);
            } catch (Throwable unused) {
                throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
            }
        }
    }

    public static float calculateLineDistance(LatLng latLng, LatLng latLng2) {
        LatLng latLng3 = latLng;
        LatLng latLng4 = latLng2;
        if (latLng3 == null || latLng4 == null) {
            try {
                throw new AMapException("非法坐标值");
            } catch (AMapException unused) {
                return 0.0f;
            }
        } else {
            double d2 = latLng3.longitude;
            double d3 = latLng3.latitude;
            double d4 = d2 * 0.01745329251994329d;
            double d5 = d3 * 0.01745329251994329d;
            double d6 = latLng4.longitude * 0.01745329251994329d;
            double d7 = latLng4.latitude * 0.01745329251994329d;
            double sin = Math.sin(d4);
            double sin2 = Math.sin(d5);
            double cos = Math.cos(d4);
            double cos2 = Math.cos(d5);
            double sin3 = Math.sin(d6);
            double sin4 = Math.sin(d7);
            double cos3 = Math.cos(d6);
            double cos4 = Math.cos(d7);
            double[] dArr = {cos * cos2, cos2 * sin, sin2};
            double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
            return (float) (Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d);
        }
    }

    private static void b(RoutePara routePara, Context context, int i) throws AMapException {
        if (!a(context)) {
            throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
        } else if (a(routePara)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(276824064);
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse(a(routePara, context, i)));
                intent.setPackage("com.autonavi.minimap");
                new a("oan", context).start();
                context.startActivity(intent);
            } catch (Throwable unused) {
                throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
            }
        } else {
            throw new AMapException("非法导航参数");
        }
    }

    private static String a(RoutePara routePara, Context context, int i) {
        String format = String.format(Locale.US, "androidamap://route?sourceApplication=%s&slat=%f&slon=%f&sname=%s&dlat=%f&dlon=%f&dname=%s&dev=0&t=%d", new Object[]{cp.b(context), Double.valueOf(routePara.getStartPoint().latitude), Double.valueOf(routePara.getStartPoint().longitude), routePara.getStartName(), Double.valueOf(routePara.getEndPoint().latitude), Double.valueOf(routePara.getEndPoint().longitude), routePara.getEndName(), Integer.valueOf(i)});
        if (i == 1) {
            return format + "&m=" + routePara.getTransitRouteStyle();
        } else if (i != 2) {
            return format;
        } else {
            return format + "&m=" + routePara.getDrivingRouteStyle();
        }
    }
}
