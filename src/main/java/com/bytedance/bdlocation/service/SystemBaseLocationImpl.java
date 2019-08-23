package com.bytedance.bdlocation.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.IThirdPartLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.netwok.a.b;
import com.bytedance.bdlocation.netwok.a.e;
import com.bytedance.bdlocation.netwok.a.i;
import com.ss.b.a.a;
import java.util.List;
import java.util.Locale;

@Keep
public class SystemBaseLocationImpl implements IThirdPartLocation {
    private BDLocationClient.Callback mCallback;
    private Context mContext;
    private LocationListener mGPSListener = new LocationListener() {
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }

        public final void onProviderEnabled(String str) {
            SystemBaseLocationImpl.this.mNetworkDisabled = false;
        }

        public final void onProviderDisabled(String str) {
            a.c("BDLocation", "onProviderDisabled:" + str);
            SystemBaseLocationImpl.this.mGpsDisabled = true;
            SystemBaseLocationImpl.this.checkAndCallback();
        }

        public final void onLocationChanged(Location location) {
            try {
                if (!a.a().b()) {
                    SystemBaseLocationImpl.this.stopLocation();
                }
                SystemBaseLocationImpl.this.mLastLocation = SystemBaseLocationImpl.this.transform(location);
                SystemBaseLocationImpl.this.mQpsController.callback(SystemBaseLocationImpl.this.mLastLocation);
                SystemBaseLocationImpl.this.callback(SystemBaseLocationImpl.this.mLastLocation);
            } catch (Exception e2) {
                a.b("SystemLocation", (Throwable) e2);
            }
        }
    };
    public boolean mGpsDisabled;
    public BDLocation mLastLocation;
    private LocationManager mManager;
    private LocationListener mNetWorkListener = new LocationListener() {
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }

        public final void onProviderEnabled(String str) {
            SystemBaseLocationImpl.this.mNetworkDisabled = false;
        }

        public final void onProviderDisabled(String str) {
            a.c("BDLocation", "onProviderDisabled:" + str);
            SystemBaseLocationImpl.this.mNetworkDisabled = true;
            SystemBaseLocationImpl.this.checkAndCallback();
        }

        public final void onLocationChanged(Location location) {
            try {
                if (!a.a().b()) {
                    SystemBaseLocationImpl.this.stopLocation();
                }
                SystemBaseLocationImpl.this.mLastLocation = SystemBaseLocationImpl.this.transform(location);
                SystemBaseLocationImpl.this.mQpsController.callback(SystemBaseLocationImpl.this.mLastLocation);
                SystemBaseLocationImpl.this.callback(SystemBaseLocationImpl.this.mLastLocation);
            } catch (Exception e2) {
                a.b("SystemLocation", (Throwable) e2);
            }
        }
    };
    public boolean mNetworkDisabled;
    private LocationOption mOption;
    public QPSController mQpsController;

    @Nullable
    public BDPoint convertGCJ02(@NonNull BDPoint bDPoint) {
        return null;
    }

    public String getLocationName() {
        return "SystemLocation";
    }

    @Nullable
    public List<i> getPoiSync(@NonNull BDPoint bDPoint, String str) {
        return null;
    }

    public void setLocale(Locale locale) {
    }

    public void stopLocation() {
        this.mManager.removeUpdates(this.mNetWorkListener);
        this.mManager.removeUpdates(this.mGPSListener);
    }

    public void checkAndCallback() {
        if (checkProviderDisabled(this.mOption.getMode())) {
            callback(null);
        }
    }

    @VisibleForTesting
    public void setLocation(BDLocation bDLocation) {
        this.mLastLocation = bDLocation;
    }

    public BDLocation transform(Location location) {
        return transform(location, false);
    }

    private boolean checkProviderDisabled(int i) {
        if (i == 2) {
            if (!this.mGpsDisabled || !this.mNetworkDisabled) {
                return false;
            }
            return true;
        } else if (i == 0) {
            return this.mNetworkDisabled;
        } else {
            return this.mGpsDisabled;
        }
    }

    public void callback(@Nullable BDLocation bDLocation) {
        try {
            if (BDLocationConfig.isDebug() && bDLocation != null) {
                a.b("BDLocation", "Sys onLocationChanged: " + bDLocation.getAddress());
            }
            if (!LocationUtil.isEmpty(bDLocation)) {
                a a2 = a.a();
                BDPoint bDPoint = new BDPoint(bDLocation.getLatitude(), bDLocation.getLongitude(), bDLocation.getProvider());
                BDLocation a3 = a2.a(bDPoint, "wgs", this.mOption.geocodeMode());
                if (a3 != null) {
                    this.mCallback.onLocationChanged(LocationUtil.composeLocation(bDLocation, a3));
                } else {
                    this.mCallback.onLocationChanged(bDLocation);
                }
                return;
            }
            this.mCallback.onError(new BDLocationException("LBS Service fail!"));
        } catch (Exception e2) {
            a.b("SystemLocation", (Throwable) e2);
            this.mCallback.onError(new BDLocationException((Throwable) e2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.gson.JsonArray getWIFIInfo(android.content.Context r9) {
        /*
            java.util.List r0 = com.bytedance.bdlocation.utils.g.b(r9)
            android.net.wifi.WifiInfo r9 = com.bytedance.bdlocation.utils.g.a(r9)
            com.google.gson.JsonArray r1 = new com.google.gson.JsonArray
            r1.<init>()
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L_0x0027
            java.lang.String r4 = r9.getBSSID()
            java.lang.String r5 = "^[0-9|A-Z|a-z]{2}(:[0-9|A-Z|a-z]{2}){5}$"
            boolean r5 = r4.matches(r5)
            if (r5 == 0) goto L_0x0027
            java.lang.String r5 = "02:00:00:00:00:00"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L_0x0027
            r4 = 1
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r4 == 0) goto L_0x0072
            com.google.gson.JsonObject r4 = new com.google.gson.JsonObject
            r4.<init>()
            java.lang.String r5 = r9.getSSID()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x004a
            java.lang.String r6 = "\".*\""
            boolean r6 = r5.matches(r6)
            if (r6 == 0) goto L_0x004a
            int r6 = r5.length()
            int r6 = r6 - r3
            java.lang.String r5 = r5.substring(r3, r6)
        L_0x004a:
            java.lang.String r6 = r9.getBSSID()
            java.lang.String r7 = "wifi_name"
            r4.addProperty((java.lang.String) r7, (java.lang.String) r5)
            java.lang.String r5 = "wifi_mac"
            r4.addProperty((java.lang.String) r5, (java.lang.String) r6)
            java.lang.String r5 = "rssi"
            int r9 = r9.getRssi()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4.addProperty((java.lang.String) r5, (java.lang.Number) r9)
            java.lang.String r9 = "is_current"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.addProperty((java.lang.String) r9, (java.lang.Number) r3)
            r1.add((com.google.gson.JsonElement) r4)
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x00d9
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L_0x00d9
            int r9 = r0.size()
            int r3 = com.bytedance.bdlocation.client.BDLocationConfig.getWifiNum()
            if (r9 <= r3) goto L_0x0089
            int r9 = com.bytedance.bdlocation.client.BDLocationConfig.getWifiNum()
        L_0x0089:
            r3 = 0
        L_0x008a:
            if (r3 >= r9) goto L_0x00d9
            java.lang.Object r4 = r0.get(r3)
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4
            if (r4 == 0) goto L_0x00d6
            java.lang.String r5 = r4.SSID
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00d6
            java.lang.String r5 = r4.BSSID
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00d6
            java.lang.String r5 = r4.BSSID
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 != 0) goto L_0x00d6
            com.google.gson.JsonObject r5 = new com.google.gson.JsonObject
            r5.<init>()
            java.lang.String r7 = "wifi_name"
            java.lang.String r8 = r4.SSID
            r5.addProperty((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "wifi_mac"
            java.lang.String r8 = r4.BSSID
            r5.addProperty((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "rssi"
            int r4 = r4.level
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.addProperty((java.lang.String) r7, (java.lang.Number) r4)
            java.lang.String r4 = "is_current"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r5.addProperty((java.lang.String) r4, (java.lang.Number) r7)
            r1.add((com.google.gson.JsonElement) r5)
        L_0x00d6:
            int r3 = r3 + 1
            goto L_0x008a
        L_0x00d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.service.SystemBaseLocationImpl.getWIFIInfo(android.content.Context):com.google.gson.JsonArray");
    }

    @Keep
    public SystemBaseLocationImpl(Context context, QPSController qPSController) {
        this.mContext = context;
        this.mQpsController = qPSController;
        this.mManager = (LocationManager) context.getSystemService("location");
    }

    private BDLocation transform(Location location, boolean z) {
        if (location == null) {
            return null;
        }
        BDLocation bDLocation = new BDLocation(location, "SystemLocation");
        if (z) {
            bDLocation.setLocationType(5);
        }
        return bDLocation;
    }

    @Keep
    @VisibleForTesting
    public SystemBaseLocationImpl(Context context, @Nullable LocationManager locationManager) {
        this.mContext = context;
        if (locationManager == null) {
            this.mManager = (LocationManager) context.getSystemService("location");
        } else {
            this.mManager = locationManager;
        }
    }

    private static e bdLocationToGpsInfo(BDLocation bDLocation, boolean z) {
        if (bDLocation == null) {
            return null;
        }
        e eVar = new e();
        eVar.f19239a = bDLocation.getCountry();
        eVar.f19241c = bDLocation.getDistrict();
        eVar.f19240b = bDLocation.getProvider();
        eVar.f19242d = bDLocation.getAddress();
        if (z) {
            eVar.f19244f = bDLocation.getLatitude();
            eVar.f19243e = bDLocation.getLongitude();
        }
        eVar.g = bDLocation.getTime();
        return eVar;
    }

    @Nullable
    public BDLocation geocode(@NonNull BDPoint bDPoint, String str) {
        BDLocation bDLocation;
        BDLocation bDLocation2 = null;
        if (!"wgs".equals(str)) {
            return null;
        }
        BDLocation bDLocation3 = new BDLocation(bDPoint.getProvider(), "SystemLocation");
        bDLocation3.setLatitude(bDPoint.getLatitude());
        bDLocation3.setLongitude(bDPoint.getLongitude());
        try {
            b andUploadLocation = getAndUploadLocation(bDLocation3, this.mContext);
            if (andUploadLocation != null) {
                bDLocation2 = LocationUtil.locationResultToBDLocation(andUploadLocation.f19230a);
            }
            if (!LocationUtil.checkGeocode(bDLocation2)) {
                bDLocation = LocationUtil.geocode(this.mContext, bDLocation3);
                return bDLocation;
            }
        } catch (Exception e2) {
            a.b("BDLocation", (Throwable) e2);
        }
        bDLocation = bDLocation2;
        return bDLocation;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0284 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009a A[SYNTHETIC, Splitter:B:59:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.bdlocation.netwok.a.b getAndUploadLocation(com.bytedance.bdlocation.BDLocation r16, android.content.Context r17) throws java.lang.Exception {
        /*
            r0 = r16
            r1 = r17
            r2 = 0
            if (r0 == 0) goto L_0x000d
            com.bytedance.bdlocation.BDLocation r3 = new com.bytedance.bdlocation.BDLocation
            r3.<init>(r0)
            goto L_0x000e
        L_0x000d:
            r3 = r2
        L_0x000e:
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isUploadBaseSite()     // Catch:{ Exception -> 0x0021 }
            if (r0 == 0) goto L_0x001e
            com.bytedance.bdlocation.utils.c r0 = new com.bytedance.bdlocation.utils.c     // Catch:{ Exception -> 0x0021 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0021 }
            com.bytedance.bdlocation.netwok.a.a r0 = r0.a()     // Catch:{ Exception -> 0x0021 }
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            r4 = r0
            goto L_0x002e
        L_0x0021:
            r0 = move-exception
            boolean r4 = com.bytedance.bdlocation.client.BDLocationConfig.isDebug()
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = "BDLocation"
            com.ss.b.a.a.b((java.lang.String) r4, (java.lang.Throwable) r0)
        L_0x002d:
            r4 = r2
        L_0x002e:
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isUploadWIFI()     // Catch:{ Exception -> 0x003c }
            if (r0 == 0) goto L_0x0039
            com.google.gson.JsonArray r0 = getWIFIInfo(r17)     // Catch:{ Exception -> 0x003c }
            goto L_0x003a
        L_0x0039:
            r0 = r2
        L_0x003a:
            r5 = r0
            goto L_0x0049
        L_0x003c:
            r0 = move-exception
            boolean r5 = com.bytedance.bdlocation.client.BDLocationConfig.isDebug()
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = "BDLocation"
            com.ss.b.a.a.b((java.lang.String) r5, (java.lang.Throwable) r0)
        L_0x0048:
            r5 = r2
        L_0x0049:
            r6 = 1
            r7 = 0
            java.lang.String r0 = "location"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x008a }
            android.location.LocationManager r0 = (android.location.LocationManager) r0     // Catch:{ Exception -> 0x008a }
            if (r0 == 0) goto L_0x0085
            java.util.List r1 = r0.getProviders(r6)     // Catch:{ Exception -> 0x008a }
            if (r1 == 0) goto L_0x0085
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x008a }
            if (r1 != 0) goto L_0x0085
            java.lang.String r1 = "gps"
            boolean r1 = r0.isProviderEnabled(r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r8 = "network"
            boolean r8 = r0.isProviderEnabled(r8)     // Catch:{ Exception -> 0x007e }
            if (r8 == 0) goto L_0x0071
            r1 = r1 | 2
        L_0x0071:
            java.lang.String r8 = "passive"
            boolean r0 = r0.isProviderEnabled(r8)     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x007c
            r0 = r1 | 4
            r1 = r0
        L_0x007c:
            r0 = 1
            goto L_0x0087
        L_0x007e:
            r0 = move-exception
            r8 = r1
            r1 = 1
            goto L_0x008d
        L_0x0082:
            r0 = move-exception
            r1 = 1
            goto L_0x008c
        L_0x0085:
            r0 = 0
            r1 = 0
        L_0x0087:
            r8 = r1
            r1 = r0
            goto L_0x0098
        L_0x008a:
            r0 = move-exception
            r1 = 0
        L_0x008c:
            r8 = 0
        L_0x008d:
            boolean r9 = com.bytedance.bdlocation.client.BDLocationConfig.isDebug()
            if (r9 == 0) goto L_0x0098
            java.lang.String r9 = "BDLocation"
            com.ss.b.a.a.b((java.lang.String) r9, (java.lang.Throwable) r0)
        L_0x0098:
            if (r3 == 0) goto L_0x015b
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isUploadPoi()     // Catch:{ Exception -> 0x014b }
            if (r0 == 0) goto L_0x00ea
            com.bytedance.bdlocation.client.BDPoint r0 = r3.getGCJ02()     // Catch:{ Exception -> 0x014b }
            if (r0 == 0) goto L_0x00b6
            com.bytedance.bdlocation.service.a r0 = com.bytedance.bdlocation.service.a.a()     // Catch:{ Exception -> 0x014b }
            com.bytedance.bdlocation.client.BDPoint r9 = r3.getGCJ02()     // Catch:{ Exception -> 0x014b }
            java.lang.String r10 = "gcj"
            java.util.List r0 = r0.a((com.bytedance.bdlocation.client.BDPoint) r9, (java.lang.String) r10)     // Catch:{ Exception -> 0x014b }
        L_0x00b4:
            r9 = r0
            goto L_0x00d3
        L_0x00b6:
            com.bytedance.bdlocation.service.a r0 = com.bytedance.bdlocation.service.a.a()     // Catch:{ Exception -> 0x014b }
            com.bytedance.bdlocation.client.BDPoint r15 = new com.bytedance.bdlocation.client.BDPoint     // Catch:{ Exception -> 0x014b }
            double r10 = r3.getLatitude()     // Catch:{ Exception -> 0x014b }
            double r12 = r3.getLongitude()     // Catch:{ Exception -> 0x014b }
            java.lang.String r14 = r3.getProvider()     // Catch:{ Exception -> 0x014b }
            r9 = r15
            r9.<init>(r10, r12, r14)     // Catch:{ Exception -> 0x014b }
            java.lang.String r9 = "wgs"
            java.util.List r0 = r0.a((com.bytedance.bdlocation.client.BDPoint) r15, (java.lang.String) r9)     // Catch:{ Exception -> 0x014b }
            goto L_0x00b4
        L_0x00d3:
            if (r9 == 0) goto L_0x00eb
            int r0 = r9.size()     // Catch:{ Exception -> 0x0149 }
            int r10 = com.bytedance.bdlocation.client.BDLocationConfig.getPoiNum()     // Catch:{ Exception -> 0x0149 }
            if (r0 <= r10) goto L_0x00eb
            int r0 = com.bytedance.bdlocation.client.BDLocationConfig.getPoiNum()     // Catch:{ Exception -> 0x0149 }
            int r0 = r0 - r6
            java.util.List r0 = r9.subList(r7, r0)     // Catch:{ Exception -> 0x0149 }
            r9 = r0
            goto L_0x00eb
        L_0x00ea:
            r9 = r2
        L_0x00eb:
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isChineseChannel()     // Catch:{ Exception -> 0x0149 }
            if (r0 == 0) goto L_0x012a
            com.bytedance.bdlocation.client.BDPoint r0 = r3.getGCJ02()     // Catch:{ Exception -> 0x0149 }
            if (r0 != 0) goto L_0x012a
            com.bytedance.bdlocation.service.a r0 = com.bytedance.bdlocation.service.a.a()     // Catch:{ Exception -> 0x0149 }
            com.bytedance.bdlocation.client.BDPoint r6 = new com.bytedance.bdlocation.client.BDPoint     // Catch:{ Exception -> 0x0149 }
            double r11 = r3.getLatitude()     // Catch:{ Exception -> 0x0149 }
            double r13 = r3.getLongitude()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r15 = r3.getProvider()     // Catch:{ Exception -> 0x0149 }
            r10 = r6
            r10.<init>(r11, r13, r15)     // Catch:{ Exception -> 0x0149 }
            com.bytedance.bdlocation.client.BDPoint r0 = r0.a((com.bytedance.bdlocation.client.BDPoint) r6)     // Catch:{ Exception -> 0x0149 }
            if (r0 != 0) goto L_0x011c
            r6 = 0
            r3.setLatitude(r6)     // Catch:{ Exception -> 0x0149 }
            r3.setLongitude(r6)     // Catch:{ Exception -> 0x0149 }
            goto L_0x012a
        L_0x011c:
            double r6 = r0.getLatitude()     // Catch:{ Exception -> 0x0149 }
            r3.setLatitude(r6)     // Catch:{ Exception -> 0x0149 }
            double r6 = r0.getLongitude()     // Catch:{ Exception -> 0x0149 }
            r3.setLongitude(r6)     // Catch:{ Exception -> 0x0149 }
        L_0x012a:
            java.lang.String r0 = "SystemLocation"
            java.lang.String r6 = r3.getLocationSDKName()     // Catch:{ Exception -> 0x0149 }
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x0149 }
            if (r0 == 0) goto L_0x0140
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isUploadGPS()     // Catch:{ Exception -> 0x0149 }
            com.bytedance.bdlocation.netwok.a.e r0 = bdLocationToGpsInfo(r3, r0)     // Catch:{ Exception -> 0x0149 }
            r3 = r2
            goto L_0x015f
        L_0x0140:
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isUploadGPS()     // Catch:{ Exception -> 0x0149 }
            com.bytedance.bdlocation.netwok.a.e r0 = bdLocationToGpsInfo(r3, r0)     // Catch:{ Exception -> 0x0149 }
            goto L_0x015d
        L_0x0149:
            r0 = move-exception
            goto L_0x014d
        L_0x014b:
            r0 = move-exception
            r9 = r2
        L_0x014d:
            boolean r3 = com.bytedance.bdlocation.client.BDLocationConfig.isDebug()
            if (r3 == 0) goto L_0x0158
            java.lang.String r3 = "BDLocation"
            com.ss.b.a.a.b((java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x0158:
            r0 = r2
            r3 = r0
            goto L_0x015f
        L_0x015b:
            r0 = r2
            r9 = r0
        L_0x015d:
            r3 = r0
            r0 = r2
        L_0x015f:
            if (r4 == 0) goto L_0x0164
            java.util.List<com.bytedance.bdlocation.netwok.a.c> r6 = r4.f19229b
            goto L_0x0165
        L_0x0164:
            r6 = r2
        L_0x0165:
            com.google.gson.JsonObject r7 = new com.google.gson.JsonObject
            r7.<init>()
            java.lang.String r10 = "sys_location"
            com.google.gson.Gson r11 = com.bytedance.bdlocation.Util.sGson
            com.google.gson.JsonElement r0 = r11.toJsonTree(r0)
            r7.add(r10, r0)
            java.lang.String r0 = "amap_location"
            com.google.gson.Gson r10 = com.bytedance.bdlocation.Util.sGson
            com.google.gson.JsonElement r3 = r10.toJsonTree(r3)
            r7.add(r0, r3)
            java.lang.String r0 = "base_station"
            com.google.gson.Gson r3 = com.bytedance.bdlocation.Util.sGson
            com.google.gson.JsonElement r3 = r3.toJsonTree(r4)
            r7.add(r0, r3)
            java.lang.String r0 = "wifi_info"
            com.google.gson.Gson r3 = com.bytedance.bdlocation.Util.sGson
            com.google.gson.JsonElement r3 = r3.toJsonTree(r5)
            r7.add(r0, r3)
            java.lang.String r0 = "cell"
            com.google.gson.Gson r3 = com.bytedance.bdlocation.Util.sGson
            com.google.gson.JsonElement r3 = r3.toJsonTree(r6)
            r7.add(r0, r3)
            java.lang.String r0 = "location_mode"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r7.addProperty((java.lang.String) r0, (java.lang.Number) r3)
            java.lang.String r0 = "location_setting"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.addProperty((java.lang.String) r0, (java.lang.Number) r1)
            java.lang.String r0 = "submit_time"
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r7.addProperty((java.lang.String) r0, (java.lang.Number) r1)
            java.util.Locale r0 = com.bytedance.bdlocation.client.BDLocationConfig.getLocale()
            if (r0 != 0) goto L_0x01ca
            java.util.Locale r0 = java.util.Locale.getDefault()
        L_0x01ca:
            java.lang.String r1 = " language"
            java.lang.String r3 = r0.getLanguage()
            java.lang.String r0 = r0.getCountry()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x01ee
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "-"
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
        L_0x01ee:
            r7.addProperty((java.lang.String) r1, (java.lang.String) r3)
            java.lang.String r0 = "pois"
            com.google.gson.Gson r1 = com.bytedance.bdlocation.Util.sGson
            com.google.gson.JsonElement r1 = r1.toJsonTree(r9)
            r7.add(r0, r1)
            java.lang.String r0 = "BDLocation"
            com.google.gson.Gson r1 = com.bytedance.bdlocation.Util.sGson
            java.lang.String r1 = r1.toJson((com.google.gson.JsonElement) r7)
            com.ss.b.a.a.c(r0, r1)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.lang.String r0 = "dwinfo"
            java.lang.String r1 = com.bytedance.bdlocation.netwok.b.a((com.google.gson.JsonObject) r7)
            r12.put(r0, r1)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.lang.String r0 = "sdk_version"
            java.lang.String r1 = "1.2.0-alpha.0"
            r11.put(r0, r1)
            com.bytedance.bdlocation.netwok.a r8 = com.bytedance.bdlocation.client.BDLocationConfig.getNetworkApi()
            if (r8 == 0) goto L_0x0234
            java.lang.String r9 = com.bytedance.bdlocation.netwok.b.a()
            java.lang.String r10 = "/location/locate/"
            r13 = 0
            r14 = 1
            java.lang.String r0 = r8.a(r9, r10, r11, r12, r13, r14)
            goto L_0x0255
        L_0x0234:
            java.lang.String r0 = com.bytedance.bdlocation.netwok.b.a()
            java.lang.Class<com.bytedance.bdlocation.netwok.INetworkApiCopy> r1 = com.bytedance.bdlocation.netwok.INetworkApiCopy.class
            java.lang.Object r0 = com.bytedance.ttnet.utils.RetrofitUtils.createSsService(r0, r1)
            r8 = r0
            com.bytedance.bdlocation.netwok.INetworkApiCopy r8 = (com.bytedance.bdlocation.netwok.INetworkApiCopy) r8
            r9 = -1
            java.lang.String r10 = "/location/locate/"
            r13 = 0
            r14 = 0
            r15 = 1
            com.bytedance.retrofit2.Call r0 = r8.doPost(r9, r10, r11, r12, r13, r14, r15)
            com.bytedance.retrofit2.SsResponse r0 = r0.execute()
            java.lang.Object r0 = r0.body()
            java.lang.String r0 = (java.lang.String) r0
        L_0x0255:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "data"
            java.lang.String r0 = r1.getString(r0)
            com.google.gson.Gson r1 = com.bytedance.bdlocation.Util.sGson
            java.lang.String r0 = com.bytedance.bdlocation.netwok.b.a((java.lang.String) r0)
            java.lang.Class<com.bytedance.bdlocation.netwok.a.b> r3 = com.bytedance.bdlocation.netwok.a.b.class
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, (java.lang.Class<T>) r3)
            com.bytedance.bdlocation.netwok.a.b r0 = (com.bytedance.bdlocation.netwok.a.b) r0
            if (r0 == 0) goto L_0x0284
            com.bytedance.bdlocation.service.a r1 = com.bytedance.bdlocation.service.a.a()
            com.bytedance.bdlocation.a.a r1 = r1.f19267a
            r1.f19224c = r0
            java.lang.String r1 = "BDLocation"
            com.google.gson.Gson r2 = com.bytedance.bdlocation.Util.sGson
            java.lang.String r2 = r2.toJson((java.lang.Object) r0)
            com.ss.b.a.a.c(r1, r2)
            return r0
        L_0x0284:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.service.SystemBaseLocationImpl.getAndUploadLocation(com.bytedance.bdlocation.BDLocation, android.content.Context):com.bytedance.bdlocation.netwok.a.b");
    }

    @SuppressLint({"MissingPermission"})
    public void startLocation(@NonNull BDLocationClient.Callback callback, @NonNull LocationOption locationOption, @NonNull Looper looper) {
        boolean z;
        long j;
        this.mCallback = callback;
        this.mOption = locationOption;
        if (locationOption.getInterval() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Location lastKnownLocation = this.mManager.getLastKnownLocation("gps");
                Location lastKnownLocation2 = this.mManager.getLastKnownLocation("network");
                if (lastKnownLocation2 != null && LocationUtil.checkCacheTime(lastKnownLocation2.getTime(), locationOption.getMaxCacheTime()) && !LocationUtil.isEmpty(lastKnownLocation2)) {
                    callback(transform(lastKnownLocation2, true));
                    return;
                } else if (lastKnownLocation != null && LocationUtil.checkCacheTime(lastKnownLocation.getTime(), locationOption.getMaxCacheTime()) && !LocationUtil.isEmpty(lastKnownLocation)) {
                    callback(transform(lastKnownLocation, true));
                    return;
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
        if (locationOption.getInterval() > 0) {
            j = locationOption.getInterval();
        } else {
            j = 300;
        }
        if (locationOption.getMode() == 0) {
            this.mManager.requestLocationUpdates("network", j, 0.0f, this.mNetWorkListener, looper);
        } else if (locationOption.getMode() == 1) {
            this.mManager.requestLocationUpdates("gps", j, 0.0f, this.mGPSListener, looper);
        } else {
            this.mManager.requestLocationUpdates("network", j, 0.0f, this.mNetWorkListener, looper);
            this.mManager.requestLocationUpdates("gps", j, 0.0f, this.mGPSListener, looper);
        }
    }
}
