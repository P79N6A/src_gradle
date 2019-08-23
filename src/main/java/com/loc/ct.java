package com.loc;

import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import org.json.JSONObject;

public final class ct {

    /* renamed from: a  reason: collision with root package name */
    Object f25709a = new Object();

    /* renamed from: b  reason: collision with root package name */
    Context f25710b;

    /* renamed from: c  reason: collision with root package name */
    AMapLocationClient f25711c = null;

    /* renamed from: d  reason: collision with root package name */
    WebView f25712d = null;

    /* renamed from: e  reason: collision with root package name */
    String f25713e = "AMap.Geolocation.cbk";

    /* renamed from: f  reason: collision with root package name */
    AMapLocationClientOption f25714f = null;
    volatile boolean g = false;
    a h = null;

    class a implements AMapLocationListener {
        a() {
        }

        public final void onLocationChanged(AMapLocation aMapLocation) {
            if (ct.this.g) {
                ct ctVar = ct.this;
                String a2 = ct.a(aMapLocation);
                try {
                    if (ctVar.f25712d != null) {
                        if (Build.VERSION.SDK_INT >= 19) {
                            WebView webView = ctVar.f25712d;
                            webView.evaluateJavascript("javascript:" + ctVar.f25713e + "('" + a2 + "')", new ValueCallback<String>() {
                                public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                                }
                            });
                            return;
                        }
                        ctVar.f25712d.post(new Runnable(a2) {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ String f25716a;

                            {
                                this.f25716a = r2;
                            }

                            public final void run() {
                                WebView webView = ct.this.f25712d;
                                cu.a(webView, "javascript:" + ct.this.f25713e + "('" + this.f25716a + "')");
                            }
                        });
                    }
                } catch (Throwable th) {
                    ce.a(th, "H5LocationClient", "callbackJs()");
                }
            }
        }
    }

    public ct(Context context, WebView webView) {
        this.f25710b = context.getApplicationContext();
        this.f25712d = webView;
        this.h = new a();
    }

    static String a(AMapLocation aMapLocation) {
        String str;
        Object obj;
        JSONObject jSONObject = new JSONObject();
        if (aMapLocation == null) {
            try {
                jSONObject.put("errorCode", -1);
                str = "errorInfo";
                obj = "unknownError";
            } catch (Throwable unused) {
            }
        } else if (aMapLocation.getErrorCode() == 0) {
            jSONObject.put("errorCode", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", aMapLocation.getLongitude());
            jSONObject2.put("y", aMapLocation.getLatitude());
            jSONObject2.put("precision", (double) aMapLocation.getAccuracy());
            jSONObject2.put("type", aMapLocation.getLocationType());
            jSONObject2.put("country", aMapLocation.getCountry());
            jSONObject2.put("province", aMapLocation.getProvince());
            jSONObject2.put("city", aMapLocation.getCity());
            jSONObject2.put("cityCode", aMapLocation.getCityCode());
            jSONObject2.put("district", aMapLocation.getDistrict());
            jSONObject2.put("adCode", aMapLocation.getAdCode());
            jSONObject2.put("street", aMapLocation.getStreet());
            jSONObject2.put("streetNum", aMapLocation.getStreetNum());
            jSONObject2.put("floor", aMapLocation.getFloor());
            jSONObject2.put("address", aMapLocation.getAddress());
            str = "result";
            obj = jSONObject2;
        } else {
            jSONObject.put("errorCode", aMapLocation.getErrorCode());
            jSONObject.put("errorInfo", aMapLocation.getErrorInfo());
            jSONObject.put("locationDetail", aMapLocation.getLocationDetail());
            return jSONObject.toString();
        }
        jSONObject.put(str, obj);
        return jSONObject.toString();
    }

    public final void a() {
        synchronized (this.f25709a) {
            this.g = false;
            if (this.f25711c != null) {
                this.f25711c.unRegisterLocationListener(this.h);
                this.f25711c.stopLocation();
                this.f25711c.onDestroy();
                this.f25711c = null;
            }
            this.f25714f = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:7|(1:9)|10|(16:11|12|13|14|15|(1:17)(1:18)|19|20|21|(1:23)|24|25|26|27|(1:30)|29)|37|38|(1:40)(1:42)|41|43|(1:45)|46|47|(1:49)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0079 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005b A[Catch:{ Throwable -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0063 A[Catch:{ Throwable -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0071 A[Catch:{ Throwable -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007d  */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getLocation(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f25709a
            monitor-enter(r0)
            boolean r1 = r8.g     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0009:
            com.amap.api.location.AMapLocationClientOption r1 = r8.f25714f     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0014
            com.amap.api.location.AMapLocationClientOption r1 = new com.amap.api.location.AMapLocationClientOption     // Catch:{ all -> 0x0090 }
            r1.<init>()     // Catch:{ all -> 0x0090 }
            r8.f25714f = r1     // Catch:{ all -> 0x0090 }
        L_0x0014:
            r1 = 5
            r2 = 30000(0x7530, double:1.4822E-319)
            r4 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0051 }
            r5.<init>(r9)     // Catch:{ Throwable -> 0x0051 }
            java.lang.String r9 = "to"
            long r6 = r5.optLong(r9, r2)     // Catch:{ Throwable -> 0x0051 }
            java.lang.String r9 = "useGPS"
            r2 = 1
            int r9 = r5.optInt(r9, r2)     // Catch:{ Throwable -> 0x0052 }
            if (r9 != r2) goto L_0x002e
            r9 = 1
            goto L_0x002f
        L_0x002e:
            r9 = 0
        L_0x002f:
            java.lang.String r3 = "watch"
            int r3 = r5.optInt(r3, r4)     // Catch:{ Throwable -> 0x0053 }
            if (r3 != r2) goto L_0x0038
            r4 = 1
        L_0x0038:
            java.lang.String r2 = "interval"
            int r2 = r5.optInt(r2, r1)     // Catch:{ Throwable -> 0x0053 }
            java.lang.String r1 = "callback"
            r3 = 0
            java.lang.String r1 = r5.optString(r1, r3)     // Catch:{ Throwable -> 0x0054 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0054 }
            if (r3 != 0) goto L_0x004e
        L_0x004b:
            r8.f25713e = r1     // Catch:{ Throwable -> 0x0054 }
            goto L_0x0054
        L_0x004e:
            java.lang.String r1 = "AMap.Geolocation.cbk"
            goto L_0x004b
        L_0x0051:
            r6 = r2
        L_0x0052:
            r9 = 0
        L_0x0053:
            r2 = 5
        L_0x0054:
            com.amap.api.location.AMapLocationClientOption r1 = r8.f25714f     // Catch:{ Throwable -> 0x0079 }
            r1.setHttpTimeOut(r6)     // Catch:{ Throwable -> 0x0079 }
            if (r9 == 0) goto L_0x0063
            com.amap.api.location.AMapLocationClientOption r9 = r8.f25714f     // Catch:{ Throwable -> 0x0079 }
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy     // Catch:{ Throwable -> 0x0079 }
        L_0x005f:
            r9.setLocationMode(r1)     // Catch:{ Throwable -> 0x0079 }
            goto L_0x0068
        L_0x0063:
            com.amap.api.location.AMapLocationClientOption r9 = r8.f25714f     // Catch:{ Throwable -> 0x0079 }
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving     // Catch:{ Throwable -> 0x0079 }
            goto L_0x005f
        L_0x0068:
            com.amap.api.location.AMapLocationClientOption r9 = r8.f25714f     // Catch:{ Throwable -> 0x0079 }
            r1 = r4 ^ 1
            r9.setOnceLocation(r1)     // Catch:{ Throwable -> 0x0079 }
            if (r4 == 0) goto L_0x0079
            com.amap.api.location.AMapLocationClientOption r9 = r8.f25714f     // Catch:{ Throwable -> 0x0079 }
            int r2 = r2 * 1000
            long r1 = (long) r2     // Catch:{ Throwable -> 0x0079 }
            r9.setInterval(r1)     // Catch:{ Throwable -> 0x0079 }
        L_0x0079:
            com.amap.api.location.AMapLocationClient r9 = r8.f25711c     // Catch:{ all -> 0x0090 }
            if (r9 == 0) goto L_0x008e
            com.amap.api.location.AMapLocationClient r9 = r8.f25711c     // Catch:{ all -> 0x0090 }
            com.amap.api.location.AMapLocationClientOption r1 = r8.f25714f     // Catch:{ all -> 0x0090 }
            r9.setLocationOption(r1)     // Catch:{ all -> 0x0090 }
            com.amap.api.location.AMapLocationClient r9 = r8.f25711c     // Catch:{ all -> 0x0090 }
            r9.stopLocation()     // Catch:{ all -> 0x0090 }
            com.amap.api.location.AMapLocationClient r9 = r8.f25711c     // Catch:{ all -> 0x0090 }
            r9.startLocation()     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0090:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ct.getLocation(java.lang.String):void");
    }

    @JavascriptInterface
    public final void stopLocation() {
        if (this.g && this.f25711c != null) {
            this.f25711c.stopLocation();
        }
    }
}
