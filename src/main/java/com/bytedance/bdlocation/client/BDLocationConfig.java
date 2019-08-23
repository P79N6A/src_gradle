package com.bytedance.bdlocation.client;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.netwok.a;
import com.bytedance.bdlocation.service.c;
import com.bytedance.bdlocation.service.f;
import com.bytedance.bdlocation.utils.b;
import com.bytedance.bdlocation.utils.d;
import com.bytedance.bdlocation.utils.e;
import com.bytedance.frameworks.baselib.network.http.util.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BDLocationConfig {
    private static boolean isChineseChannel = true;
    private static boolean isDebug = false;
    private static boolean isUpload = false;
    private static boolean isUploadBaseSite = true;
    private static boolean isUploadGPS = false;
    private static boolean isUploadPoi = false;
    private static boolean isUploadWIFI = true;
    private static String sBaseUrl = null;
    private static int sBssNum = 10;
    @SuppressLint({"StaticFieldLeak"})
    public static Context sContext = null;
    private static long sInterval = 600000;
    private static Locale sLocale = null;
    private static long sMaxLocationTimeMs = -1;
    private static BDLocation sMockLocation = null;
    private static a sNetworkApi = null;
    private static SparseArray<List<BDLocationClient.LocationNotification>> sNotifications = new SparseArray<>();
    private static int sPoiNum = 20;
    private static b sProvider = null;
    private static boolean sReportAtStart = false;
    private static int sWifiNum = 10;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationRange {
    }

    public static b getAppBackgroundProvider() {
        return sProvider;
    }

    public static String getBaseUrl() {
        return sBaseUrl;
    }

    public static int getBssNum() {
        return sBssNum;
    }

    public static Context getContext() {
        return sContext;
    }

    public static Locale getLocale() {
        return sLocale;
    }

    public static long getMaxLocationTimeMs() {
        return sMaxLocationTimeMs;
    }

    public static BDLocation getMockLocation() {
        return sMockLocation;
    }

    public static a getNetworkApi() {
        return sNetworkApi;
    }

    public static int getPoiNum() {
        return sPoiNum;
    }

    public static long getUploadInterval() {
        return sInterval;
    }

    public static int getWifiNum() {
        return sWifiNum;
    }

    public static boolean isChineseChannel() {
        return isChineseChannel;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static boolean isReportAtStart() {
        return sReportAtStart;
    }

    public static boolean isUpload() {
        return isUpload;
    }

    public static boolean isUploadBaseSite() {
        return isUploadBaseSite;
    }

    public static boolean isUploadGPS() {
        return isUploadGPS;
    }

    public static boolean isUploadPoi() {
        return isUploadPoi;
    }

    public static boolean isUploadWIFI() {
        return isUploadWIFI;
    }

    private static boolean isInit() {
        if (sContext != null) {
            return true;
        }
        return false;
    }

    public static void checkInit() {
        if (getContext() == null) {
            throw new RuntimeException("Must be called after BDLocation initialization!");
        }
    }

    public static void setBaseUrl(String str) {
        sBaseUrl = str;
    }

    public static void setBssNum(int i) {
        sBssNum = i;
    }

    public static void setChineseChannel(boolean z) {
        isChineseChannel = z;
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static void setIsUploadGPS(boolean z) {
        isUploadGPS = z;
    }

    public static void setLocale(Locale locale) {
        sLocale = locale;
    }

    public static void setMaxLocationTimeMs(long j) {
        sMaxLocationTimeMs = j;
    }

    public static void setMockLocation(BDLocation bDLocation) {
        sMockLocation = bDLocation;
    }

    public static void setNetworkApi(a aVar) {
        sNetworkApi = aVar;
    }

    public static void setPoiNum(int i) {
        sPoiNum = i;
    }

    public static void setReportAtStart(boolean z) {
        sReportAtStart = z;
    }

    public static void setUploadBaseSite(boolean z) {
        isUploadBaseSite = z;
    }

    public static void setUploadInterval(long j) {
        sInterval = j;
    }

    public static void setUploadPoi(boolean z) {
        isUploadPoi = z;
    }

    public static void setUploadWIFI(boolean z) {
        isUploadWIFI = z;
    }

    public static void setWifiNum(int i) {
        sWifiNum = i;
    }

    public static void setAppBackgroundProvider(b bVar) {
        b.a aVar;
        if (sProvider != null) {
            aVar = sProvider.f19327a;
            sProvider.f19327a = null;
        } else {
            aVar = null;
        }
        sProvider = bVar;
        if (aVar != null) {
            sProvider.f19327a = aVar;
        }
    }

    private static List<BDLocationClient.LocationNotification> switchNotification(int i) {
        List<BDLocationClient.LocationNotification> list = sNotifications.get(i);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        sNotifications.put(i, arrayList);
        return arrayList;
    }

    public static void init(Application application) {
        if (sContext == null) {
            sContext = application.getApplicationContext();
            if (sProvider == null) {
                d dVar = new d();
                application.registerActivityLifecycleCallbacks(com.bytedance.bdlocation.utils.a.f19326c);
                synchronized (com.bytedance.bdlocation.utils.a.class) {
                    com.bytedance.bdlocation.utils.a.f19325b.add(dVar);
                }
                setAppBackgroundProvider(dVar);
            }
            com.bytedance.bdlocation.service.a.a();
        }
    }

    public static void setUpload(boolean z) {
        if (isInit() && !isUpload && z && g.a(sContext)) {
            new Handler(e.a()).postDelayed(new Runnable() {
                public final void run() {
                    if (!f.c()) {
                        f.a(true);
                        com.bytedance.bdlocation.service.a.a().a((c) new f(BDLocationConfig.sContext));
                    }
                }
            }, 30000);
        }
        isUpload = z;
    }

    public static void addNotification(BDLocationClient.LocationNotification locationNotification, int i) {
        switchNotification(i).add(locationNotification);
    }

    public static void removeNotification(BDLocationClient.LocationNotification locationNotification, int i) {
        switchNotification(i).remove(locationNotification);
    }

    public static void notificationLocationChange(int i, BDLocation bDLocation, BDLocation bDLocation2) {
        for (BDLocationClient.LocationNotification onLocationChanged : switchNotification(i)) {
            onLocationChanged.onLocationChanged(bDLocation, bDLocation2);
        }
    }
}
