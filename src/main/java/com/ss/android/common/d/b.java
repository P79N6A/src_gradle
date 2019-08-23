package com.ss.android.common.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.os.Looper;
import android.os.Message;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.q.c;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public class b implements AMapLocationListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28253a;
    private static b i;

    /* renamed from: b  reason: collision with root package name */
    public long f28254b;

    /* renamed from: c  reason: collision with root package name */
    f f28255c;

    /* renamed from: d  reason: collision with root package name */
    public h f28256d;

    /* renamed from: e  reason: collision with root package name */
    public AMapLocationClient f28257e;

    /* renamed from: f  reason: collision with root package name */
    public AMapLocationClientOption f28258f;
    public boolean g;
    public String h;
    private final SharedPreferences j = c.a(this.k, "ss_location", 0);
    private Context k;
    private long l;
    private JSONObject m;
    private int n;
    private final WeakHandler o = new WeakHandler(Looper.getMainLooper(), this);

    public void handleMsg(Message message) {
    }

    public final f b() {
        if (PatchProxy.isSupport(new Object[0], this, f28253a, false, 15839, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f28253a, false, 15839, new Class[0], f.class);
        }
        c();
        if (System.currentTimeMillis() - this.f28254b > c.f2442b * 1000) {
            return null;
        }
        return this.f28255c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void c() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x005b }
            com.meituan.robust.ChangeQuickRedirect r3 = f28253a     // Catch:{ all -> 0x005b }
            r4 = 0
            r5 = 15834(0x3dda, float:2.2188E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x005b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x005b }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x005b }
            com.meituan.robust.ChangeQuickRedirect r4 = f28253a     // Catch:{ all -> 0x005b }
            r5 = 0
            r6 = 15834(0x3dda, float:2.2188E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x005b }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x005b }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005b }
            monitor-exit(r9)
            return
        L_0x0025:
            android.content.SharedPreferences r0 = r9.j     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = "gd_fix_time"
            r2 = 0
            long r0 = r0.getLong(r1, r2)     // Catch:{ Exception -> 0x0059 }
            r9.f28254b = r0     // Catch:{ Exception -> 0x0059 }
            android.content.SharedPreferences r0 = r9.j     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = "gd_nearby_wifi"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x0059 }
            r9.h = r0     // Catch:{ Exception -> 0x0059 }
            android.content.SharedPreferences r0 = r9.j     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = "gd_loc_json"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x0059 }
            if (r0 == 0) goto L_0x0057
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0059 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0059 }
            r9.m = r1     // Catch:{ Exception -> 0x0059 }
            org.json.JSONObject r0 = r9.m     // Catch:{ Exception -> 0x0059 }
            com.ss.android.common.d.f r0 = com.ss.android.common.d.f.parseJSONObject(r0)     // Catch:{ Exception -> 0x0059 }
            r9.f28255c = r0     // Catch:{ Exception -> 0x0059 }
        L_0x0057:
            monitor-exit(r9)
            return
        L_0x0059:
            monitor-exit(r9)
            return
        L_0x005b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.d.b.c():void");
    }

    public final synchronized JSONObject a() {
        if (PatchProxy.isSupport(new Object[0], this, f28253a, false, 15838, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f28253a, false, 15838, new Class[0], JSONObject.class);
        }
        c();
        if (System.currentTimeMillis() - this.f28254b > c.f2442b * 1000) {
            return null;
        }
        return this.m;
    }

    public final boolean a(long j2) {
        if (this.f28254b + c.f2445e >= j2) {
            return true;
        }
        return false;
    }

    private b(Context context) {
        this.k = context;
        c();
    }

    public static synchronized b a(Context context) {
        synchronized (b.class) {
            if (PatchProxy.isSupport(new Object[]{context}, null, f28253a, true, 15833, new Class[]{Context.class}, b.class)) {
                b bVar = (b) PatchProxy.accessDispatch(new Object[]{context}, null, f28253a, true, 15833, new Class[]{Context.class}, b.class);
                return bVar;
            }
            if (i == null) {
                i = new b(context.getApplicationContext());
            }
            b bVar2 = i;
            return bVar2;
        }
    }

    public void onLocationChanged(AMapLocation aMapLocation) {
        String str;
        final AMapLocation aMapLocation2 = aMapLocation;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aMapLocation2}, this, f28253a, false, 15840, new Class[]{AMapLocation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aMapLocation2}, this, f28253a, false, 15840, new Class[]{AMapLocation.class}, Void.TYPE);
            return;
        }
        this.n++;
        if (aMapLocation2 == null || aMapLocation.getErrorCode() != 0) {
            z = false;
        } else {
            this.f28254b = System.currentTimeMillis();
            Context context = this.k;
            if (PatchProxy.isSupport(new Object[]{context}, null, a.f28251a, true, 15829, new Class[]{Context.class}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{context}, null, a.f28251a, true, 15829, new Class[]{Context.class}, String.class);
            } else {
                List<String> a2 = a.a(context);
                if (a2.size() == 0) {
                    str = "";
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (String append : a2) {
                        stringBuffer.append(append);
                        stringBuffer.append(";");
                    }
                    str = stringBuffer.toString();
                }
            }
            this.h = str;
            a(aMapLocation);
            if (StringUtils.isEmpty(aMapLocation.getCity())) {
                new ThreadPlus(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f28259a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f28259a, false, 15844, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f28259a, false, 15844, new Class[0], Void.TYPE);
                            return;
                        }
                        b bVar = b.this;
                        AMapLocation aMapLocation = aMapLocation2;
                        if (PatchProxy.isSupport(new Object[]{aMapLocation}, bVar, b.f28253a, false, 15837, new Class[]{AMapLocation.class}, Void.TYPE)) {
                            Object[] objArr = {aMapLocation};
                            b bVar2 = bVar;
                            PatchProxy.accessDispatch(objArr, bVar2, b.f28253a, false, 15837, new Class[]{AMapLocation.class}, Void.TYPE);
                            return;
                        }
                        double latitude = aMapLocation.getLatitude();
                        double longitude = aMapLocation.getLongitude();
                        Address address = new Address(Locale.getDefault());
                        address.setLatitude(latitude);
                        address.setLongitude(longitude);
                    }
                }, "LocationGaoDeHelperThread", true).start();
            }
        }
        if (!z && this.f28256d != null) {
            this.f28256d.a("fail to get location");
        }
        if (this.n > 0) {
            this.n = 0;
            try {
                if (this.f28257e != null) {
                    this.f28257e.unRegisterLocationListener(this);
                    this.f28257e.onDestroy();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(AMapLocation aMapLocation) {
        if (PatchProxy.isSupport(new Object[]{aMapLocation}, this, f28253a, false, 15836, new Class[]{AMapLocation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aMapLocation}, this, f28253a, false, 15836, new Class[]{AMapLocation.class}, Void.TYPE);
        } else if (aMapLocation != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("longitude", aMapLocation.getLongitude());
                jSONObject.put("latitude", aMapLocation.getLatitude());
                jSONObject.put("loc_type", aMapLocation.getProvider());
                jSONObject.put("loc_time", aMapLocation.getTime());
                jSONObject.put("address", aMapLocation.getAddress());
                jSONObject.put("district", aMapLocation.getDistrict());
                jSONObject.put("city", aMapLocation.getCity());
                jSONObject.put("province", aMapLocation.getProvince());
                jSONObject.put("country", aMapLocation.getCountry());
                this.m = jSONObject;
                SharedPreferences.Editor edit = this.j.edit();
                edit.putLong("gd_fix_time", this.f28254b);
                edit.putString("gd_loc_json", jSONObject.toString());
                edit.putString("gd_nearby_wifi", this.h);
                edit.apply();
                this.f28255c = f.parseAMapLocation(aMapLocation, aMapLocation.getTime());
                if (this.f28256d != null) {
                    this.f28256d.c();
                }
            } catch (Exception unused) {
                if (this.f28256d != null) {
                    this.f28256d.a("fail to save location");
                }
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f28253a, false, 15835, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f28253a, false, 15835, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (NetworkUtils.isNetworkAvailable(this.k)) {
                long currentTimeMillis = System.currentTimeMillis();
                if (z2 || (currentTimeMillis - this.l >= c.f2443c && currentTimeMillis - this.f28254b >= c.f2445e)) {
                    this.f28257e = new AMapLocationClient(this.k);
                    this.f28258f = new AMapLocationClientOption();
                    this.f28257e.setLocationListener(this);
                    this.f28258f.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
                    this.f28258f.setInterval(2000);
                    this.f28258f.setGpsFirst(z);
                    this.f28258f.setMockEnable(this.g);
                    this.f28257e.setLocationOption(this.f28258f);
                    this.f28257e.startLocation();
                    this.l = currentTimeMillis;
                    a.a("GAODE location start ... ...");
                    if (this.f28256d != null) {
                        this.f28256d.d();
                    }
                }
            }
        } catch (Exception unused) {
            if (this.f28256d != null) {
                this.f28256d.a("fail to start location");
            }
        }
    }
}
