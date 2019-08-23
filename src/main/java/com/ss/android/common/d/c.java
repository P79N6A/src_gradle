package com.ss.android.common.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class c implements LocationListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2441a = null;

    /* renamed from: b  reason: collision with root package name */
    public static long f2442b = 432000;

    /* renamed from: c  reason: collision with root package name */
    public static long f2443c = 120000;

    /* renamed from: d  reason: collision with root package name */
    public static a f2444d = null;

    /* renamed from: e  reason: collision with root package name */
    public static long f2445e = 600000;
    private static c i = null;
    private static int w = 1800000;
    private static float x = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f2446f = new AtomicInteger(0);
    public final b g;
    public g h;
    private final Context j;
    private final WeakHandler k;
    private volatile long l;
    private volatile long m;
    private long n;
    private volatile boolean o;
    private Address p;
    private f q;
    private h r;
    private volatile boolean s = false;
    private long t;
    private double u;
    private double v;

    public interface a {
        void a(double d2, double d3);
    }

    public void onProviderEnabled(String str) {
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2441a, false, 15847, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2441a, false, 15847, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a.a("-------------------------------");
        a.a("tryRefreshLocation ------------");
        a.a("-------------------------------");
        if (!z || !f()) {
            this.g.a(false, false);
            c(false);
            return;
        }
        c(false);
    }

    @SuppressLint({"MissingPermission"})
    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f2441a, false, 15865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2441a, false, 15865, new Class[0], Void.TYPE);
            return;
        }
        try {
            ((LocationManager) this.j.getSystemService("location")).removeUpdates(this);
        } catch (Throwable unused) {
        }
    }

    public final JSONObject d() {
        if (!PatchProxy.isSupport(new Object[0], this, f2441a, false, 15867, new Class[0], JSONObject.class)) {
            return this.g.a();
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f2441a, false, 15867, new Class[0], JSONObject.class);
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f2441a, false, 15850, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2441a, false, 15850, new Class[0], Boolean.TYPE)).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f2446f.get() > 0 || currentTimeMillis - this.n < f2443c || currentTimeMillis - this.m < f2445e) {
            return true;
        }
        return false;
    }

    public final f b() {
        if (PatchProxy.isSupport(new Object[0], this, f2441a, false, 15859, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f2441a, false, 15859, new Class[0], f.class);
        } else if (this.g.b() != null && this.g.b().isValid()) {
            return this.g.b();
        } else {
            if (this.q == null || !this.q.isValid()) {
                return null;
            }
            return this.q;
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f2441a, false, 15857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2441a, false, 15857, new Class[0], Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(this.j, "ss_location", 0).edit();
        edit.putString("latitude", String.valueOf(this.p.getLatitude()));
        edit.putString("longitude", String.valueOf(this.p.getLongitude()));
        String countryCode = this.p.getCountryCode();
        if (countryCode == null) {
            countryCode = "";
        }
        edit.putString("country_code", countryCode);
        String adminArea = this.p.getAdminArea();
        if (adminArea == null) {
            adminArea = "";
        }
        edit.putString("admin_area", adminArea);
        String locality = this.p.getLocality();
        if (locality == null) {
            locality = "";
        }
        edit.putString("locality", locality);
        String countryName = this.p.getCountryName();
        if (countryName == null) {
            countryName = "";
        }
        edit.putString("country_name", countryName);
        String thoroughfare = this.p.getThoroughfare();
        if (thoroughfare == null) {
            thoroughfare = "";
        }
        edit.putString("address", thoroughfare);
        String subLocality = this.p.getSubLocality();
        if (subLocality == null) {
            subLocality = "";
        }
        edit.putString("district", subLocality);
        edit.putLong("fix_time", this.m);
        edit.putLong("location_time", this.l);
        edit.apply();
        this.q = f.parseAddress(this.p, this.m);
        try {
            a aVar = f2444d;
            if (aVar != null) {
                aVar.a(this.p.getLatitude(), this.p.getLongitude());
            }
        } catch (Exception unused) {
        }
        if (this.r != null) {
            this.r.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONObject c() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00a9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f2441a     // Catch:{ all -> 0x00a9 }
            r4 = 0
            r5 = 15866(0x3dfa, float:2.2233E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00a9 }
            java.lang.Class<org.json.JSONObject> r7 = org.json.JSONObject.class
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00a9 }
            com.meituan.robust.ChangeQuickRedirect r4 = f2441a     // Catch:{ all -> 0x00a9 }
            r5 = 0
            r6 = 15866(0x3dfa, float:2.2233E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x00a9 }
            java.lang.Class<org.json.JSONObject> r8 = org.json.JSONObject.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a9 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x00a9 }
            monitor-exit(r9)
            return r0
        L_0x0028:
            android.location.Address r0 = r9.a()     // Catch:{ all -> 0x00a9 }
            r1 = 0
            if (r0 == 0) goto L_0x00a7
            boolean r2 = r0.hasLatitude()     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x00a7
            boolean r2 = r0.hasLongitude()     // Catch:{ all -> 0x00a9 }
            if (r2 != 0) goto L_0x003c
            goto L_0x00a7
        L_0x003c:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a9 }
            long r4 = r9.m     // Catch:{ all -> 0x00a9 }
            r6 = 0
            long r2 = r2 - r4
            long r4 = f2442b     // Catch:{ all -> 0x00a9 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0050
            monitor-exit(r9)
            return r1
        L_0x0050:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a5 }
            r2.<init>()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = "latitude"
            double r4 = r0.getLatitude()     // Catch:{ Exception -> 0x00a5 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = "longitude"
            double r4 = r0.getLongitude()     // Catch:{ Exception -> 0x00a5 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = "country"
            java.lang.String r4 = r0.getCountryName()     // Catch:{ Exception -> 0x00a5 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = "province"
            java.lang.String r4 = r0.getAdminArea()     // Catch:{ Exception -> 0x00a5 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = "city"
            java.lang.String r4 = r0.getLocality()     // Catch:{ Exception -> 0x00a5 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = "district"
            java.lang.String r4 = r0.getSubLocality()     // Catch:{ Exception -> 0x00a5 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = "address"
            java.lang.String r0 = r0.getThoroughfare()     // Catch:{ Exception -> 0x00a5 }
            r2.put(r3, r0)     // Catch:{ Exception -> 0x00a5 }
            long r3 = r9.l     // Catch:{ Exception -> 0x00a5 }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x009e
            long r3 = r9.m     // Catch:{ Exception -> 0x00a5 }
        L_0x009e:
            java.lang.String r0 = "loc_time"
            r2.put(r0, r3)     // Catch:{ Exception -> 0x00a5 }
            monitor-exit(r9)
            return r2
        L_0x00a5:
            monitor-exit(r9)
            return r1
        L_0x00a7:
            monitor-exit(r9)
            return r1
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.d.c.c():org.json.JSONObject");
    }

    private boolean f() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f2441a, false, 15852, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2441a, false, 15852, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (e()) {
            a.a(">>>>>>> cache in use, NO NEED TO REFRESH");
            return false;
        } else if (!((WifiManager) this.j.getSystemService("wifi")).isWifiEnabled()) {
            a.a("useCacheIfNeeded wifi disable");
            return false;
        } else {
            String str = this.g.h;
            if (TextUtils.isEmpty(str)) {
                a.a("useCacheIfNeeded no cache wifi");
                return false;
            }
            b bVar = this.g;
            int i2 = w;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, bVar, b.f28253a, false, 15841, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                b bVar2 = bVar;
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, bVar2, b.f28253a, false, 15841, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                a.a("check cache validity ... " + bVar.f28254b + "/current : " + System.currentTimeMillis() + " validity : " + i2);
                if (System.currentTimeMillis() - bVar.f28254b >= ((long) i2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                a.a("useCacheIfNeeded over time");
                return false;
            }
            List<String> asList = Arrays.asList(str.split(";"));
            List<String> a2 = a.a(this.j);
            if (a2.isEmpty()) {
                a.a("useCacheIfNeeded no current wifi");
                return false;
            }
            HashMap hashMap = new HashMap();
            for (String str2 : a2) {
                hashMap.put(str2, str2);
            }
            a.a("useCacheIfNeeded check wifi >>>>>>>>>>>>>>>>>>>>>>>>");
            int i3 = 0;
            for (String str3 : asList) {
                if (hashMap.containsKey(str3)) {
                    i3++;
                    a.a("useCacheIfNeeded " + i3 + " wifi bssid : " + str3);
                    continue;
                }
                if (i3 >= 3) {
                    break;
                }
            }
            if (i3 >= 3) {
                this.s = true;
                a.a("useCacheIfNeeded has 3 or more wifi in common");
                return true;
            }
            a.a("useCacheIfNeeded wifi < 3 in common");
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(5:12|13|14|15|(2:17|(1:19)(7:20|(1:22)|23|(1:27)|28|(1:30)(1:31)|32)))|36|37|(1:45)(2:43|44)) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011d, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0109 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.location.Address a() {
        /*
            r17 = this;
            r8 = r17
            monitor-enter(r17)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x011e }
            com.meituan.robust.ChangeQuickRedirect r3 = f2441a     // Catch:{ all -> 0x011e }
            r4 = 0
            r5 = 15858(0x3df2, float:2.2222E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x011e }
            java.lang.Class<android.location.Address> r7 = android.location.Address.class
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x011e }
            com.meituan.robust.ChangeQuickRedirect r3 = f2441a     // Catch:{ all -> 0x011e }
            r4 = 0
            r5 = 15858(0x3df2, float:2.2222E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x011e }
            java.lang.Class<android.location.Address> r7 = android.location.Address.class
            r2 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x011e }
            android.location.Address r0 = (android.location.Address) r0     // Catch:{ all -> 0x011e }
            monitor-exit(r17)
            return r0
        L_0x002c:
            boolean r1 = r8.o     // Catch:{ all -> 0x011e }
            r2 = 0
            if (r1 != 0) goto L_0x0109
            r1 = 1
            r8.o = r1     // Catch:{ all -> 0x011e }
            android.content.Context r1 = r8.j     // Catch:{ all -> 0x011e }
            java.lang.String r3 = "ss_location"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r1, r3, r0)     // Catch:{ all -> 0x011e }
            java.lang.String r1 = "latitude"
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r3 = "longitude"
            java.lang.String r3 = r0.getString(r3, r2)     // Catch:{ Exception -> 0x0109 }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0109 }
            if (r4 != 0) goto L_0x0106
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0109 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0106
        L_0x0056:
            double r4 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x0109 }
            double r6 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r1 = "country_code"
            java.lang.String r3 = ""
            java.lang.String r1 = r0.getString(r1, r3)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r3 = "admin_area"
            java.lang.String r9 = ""
            java.lang.String r3 = r0.getString(r3, r9)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r9 = "locality"
            java.lang.String r10 = ""
            java.lang.String r9 = r0.getString(r9, r10)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r10 = "country_name"
            java.lang.String r11 = ""
            java.lang.String r10 = r0.getString(r10, r11)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r11 = "district"
            java.lang.String r12 = ""
            java.lang.String r11 = r0.getString(r11, r12)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r12 = "address"
            java.lang.String r13 = ""
            java.lang.String r12 = r0.getString(r12, r13)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r13 = "fix_time"
            r14 = 0
            r16 = r3
            long r2 = r0.getLong(r13, r14)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r13 = "location_time"
            long r13 = r0.getLong(r13, r14)     // Catch:{ Exception -> 0x0109 }
            android.location.Address r0 = new android.location.Address     // Catch:{ Exception -> 0x0109 }
            java.util.Locale r15 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0109 }
            r0.<init>(r15)     // Catch:{ Exception -> 0x0109 }
            r0.setLatitude(r4)     // Catch:{ Exception -> 0x0109 }
            r0.setLongitude(r6)     // Catch:{ Exception -> 0x0109 }
            r0.setCountryCode(r1)     // Catch:{ Exception -> 0x0109 }
            r1 = r16
            r0.setAdminArea(r1)     // Catch:{ Exception -> 0x0109 }
            r0.setLocality(r9)     // Catch:{ Exception -> 0x0109 }
            r0.setCountryName(r10)     // Catch:{ Exception -> 0x0109 }
            r0.setSubLocality(r11)     // Catch:{ Exception -> 0x0109 }
            r0.setThoroughfare(r12)     // Catch:{ Exception -> 0x0109 }
            r8.p = r0     // Catch:{ Exception -> 0x0109 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0109 }
            r8.m = r2     // Catch:{ Exception -> 0x0109 }
            long r2 = r8.m     // Catch:{ Exception -> 0x0109 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d1
            r8.m = r0     // Catch:{ Exception -> 0x0109 }
        L_0x00d1:
            double r2 = r8.u     // Catch:{ Exception -> 0x0109 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00df
            double r2 = r8.v     // Catch:{ Exception -> 0x0109 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00f3
        L_0x00df:
            long r2 = r8.m     // Catch:{ Exception -> 0x0109 }
            r8.t = r2     // Catch:{ Exception -> 0x0109 }
            android.location.Address r2 = r8.p     // Catch:{ Exception -> 0x0109 }
            double r2 = r2.getLatitude()     // Catch:{ Exception -> 0x0109 }
            r8.u = r2     // Catch:{ Exception -> 0x0109 }
            android.location.Address r2 = r8.p     // Catch:{ Exception -> 0x0109 }
            double r2 = r2.getLongitude()     // Catch:{ Exception -> 0x0109 }
            r8.v = r2     // Catch:{ Exception -> 0x0109 }
        L_0x00f3:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r0 = r13
        L_0x00f9:
            r8.l = r0     // Catch:{ Exception -> 0x0109 }
            android.location.Address r0 = r8.p     // Catch:{ Exception -> 0x0109 }
            long r1 = r8.m     // Catch:{ Exception -> 0x0109 }
            com.ss.android.common.d.f r0 = com.ss.android.common.d.f.parseAddress(r0, r1)     // Catch:{ Exception -> 0x0109 }
            r8.q = r0     // Catch:{ Exception -> 0x0109 }
            goto L_0x0109
        L_0x0106:
            monitor-exit(r17)
            r0 = 0
            return r0
        L_0x0109:
            android.location.Address r0 = r8.p     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x011b
            boolean r1 = r0.hasLatitude()     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x011b
            boolean r1 = r0.hasLongitude()     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x011b
            monitor-exit(r17)
            return r0
        L_0x011b:
            monitor-exit(r17)
            r0 = 0
            return r0
        L_0x011e:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.d.c.a():android.location.Address");
    }

    public final void a(h hVar) {
        this.r = hVar;
        this.g.f28256d = hVar;
    }

    public static void a(int i2) {
        if (i2 > 300) {
            f2445e = (long) (i2 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }

    public final boolean a(long j2) {
        if (this.m + f2445e >= j2) {
            return true;
        }
        return false;
    }

    private c(Context context) {
        this.j = context;
        this.p = new Address(Locale.getDefault());
        this.g = b.a(context);
        this.k = new WeakHandler(Looper.getMainLooper(), this);
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f2441a, false, 15868, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f2441a, false, 15868, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 1) {
            h();
        }
    }

    public void onProviderDisabled(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2441a, false, 15863, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2441a, false, 15863, new Class[]{String.class}, Void.TYPE);
            return;
        }
        h();
    }

    public static synchronized c a(Context context) {
        synchronized (c.class) {
            if (PatchProxy.isSupport(new Object[]{context}, null, f2441a, true, 15845, new Class[]{Context.class}, c.class)) {
                c cVar = (c) PatchProxy.accessDispatch(new Object[]{context}, null, f2441a, true, 15845, new Class[]{Context.class}, c.class);
                return cVar;
            }
            if (i == null) {
                i = new c(context.getApplicationContext());
            }
            c cVar2 = i;
            return cVar2;
        }
    }

    public final void c(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2441a, false, 15851, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2441a, false, 15851, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (NetworkUtils.isNetworkAvailable(this.j) && !e()) {
            this.f2446f.incrementAndGet();
            this.n = System.currentTimeMillis();
            new ThreadPlus(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f28262a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f28262a, false, 15869, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f28262a, false, 15869, new Class[0], Void.TYPE);
                        return;
                    }
                    c.this.a(null, z);
                    c.this.f2446f.decrementAndGet();
                }
            }, "LocationHelperThread", true).start();
        }
    }

    public void onLocationChanged(final Location location) {
        if (PatchProxy.isSupport(new Object[]{location}, this, f2441a, false, 15862, new Class[]{Location.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{location}, this, f2441a, false, 15862, new Class[]{Location.class}, Void.TYPE);
            return;
        }
        try {
            h();
            if (location != null) {
                Address address = this.p;
                if (address != null && address.hasLatitude() && address.hasLongitude()) {
                    if (a(address.getLatitude(), address.getLongitude(), location.getLatitude(), location.getLongitude()) && address.getLocality() != null) {
                        return;
                    }
                }
                this.f2446f.incrementAndGet();
                this.n = System.currentTimeMillis();
                new ThreadPlus(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f28265a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f28265a, false, 15870, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f28265a, false, 15870, new Class[0], Void.TYPE);
                            return;
                        }
                        c.this.a(location, false);
                        c.this.f2446f.decrementAndGet();
                    }
                }, "localechange", true).start();
            }
        } catch (Exception unused) {
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f2441a, false, 15849, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f2441a, false, 15849, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.a(true, true);
        c(true);
    }

    private void a(Location location) {
        boolean z;
        double d2;
        if (PatchProxy.isSupport(new Object[]{location}, this, f2441a, false, 15853, new Class[]{Location.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{location}, this, f2441a, false, 15853, new Class[]{Location.class}, Void.TYPE);
        } else if (this.s) {
            if (location != null) {
                z = true;
            } else {
                z = false;
            }
            a.a("receiveSystemLocationResult result: " + z);
            this.s = false;
            if (!(!z || this.u == 0.0d || this.v == 0.0d)) {
                double d3 = this.u;
                double d4 = this.v;
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                if (PatchProxy.isSupport(new Object[]{Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(latitude), Double.valueOf(longitude)}, null, a.f28251a, true, 15831, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)) {
                    d2 = ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(latitude), Double.valueOf(longitude)}, null, a.f28251a, true, 15831, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
                } else {
                    double b2 = a.b(d3);
                    double b3 = a.b(d4);
                    double b4 = a.b(latitude);
                    d2 = 12742.0d * Math.asin(Math.sqrt(a.a(Math.abs(b2 - b4)) + (Math.cos(b2) * Math.cos(b4) * a.a(Math.abs(b3 - a.b(longitude))))));
                }
                a.a("receiveSystemLocationResult cal distance : " + d2 + " cache time " + (this.m - this.t));
                if (d2 > ((double) x)) {
                    this.t = this.m;
                    this.u = location.getLatitude();
                    this.v = location.getLongitude();
                    a.a("receiveSystemLocationResult distance too far, retry gaode");
                    this.g.a(false, false);
                    return;
                }
            }
            b bVar = this.g;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f28253a, false, 15842, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f28253a, false, 15842, new Class[0], Void.TYPE);
            } else if (!(bVar.f28254b == 0 || bVar.f28255c == null || !bVar.f28255c.isValid())) {
                bVar.f28254b += f2445e;
            }
            if (this.h != null) {
                this.h.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00dd, code lost:
        monitor-enter(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r10.p = r2;
        r10.o = true;
        r10.m = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e8, code lost:
        if (r12 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ea, code lost:
        r10.l = com.bytedance.common.util.JellyBeanMR1V17Compat.getTime(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f0, code lost:
        g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f3, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f4, code lost:
        r13 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0105 A[Catch:{ Throwable -> 0x0168 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.location.Location r17, boolean r18) {
        /*
            r16 = this;
            r10 = r16
            r0 = r17
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r0
            java.lang.Byte r2 = java.lang.Byte.valueOf(r18)
            r11 = 1
            r1[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f2441a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.location.Location> r2 = android.location.Location.class
            r6[r9] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r11] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 15854(0x3dee, float:2.2216E-41)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x004b
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r18)
            r1[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f2441a
            r4 = 0
            r5 = 15854(0x3dee, float:2.2216E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            r6[r9] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x004b:
            r16.a()     // Catch:{ Throwable -> 0x0168 }
            android.content.Context r1 = r10.j     // Catch:{ Throwable -> 0x0168 }
            java.lang.String r2 = "location"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Throwable -> 0x0168 }
            android.location.LocationManager r1 = (android.location.LocationManager) r1     // Catch:{ Throwable -> 0x0168 }
            if (r0 != 0) goto L_0x0060
            r2 = r18
            android.location.Location r0 = r10.a(r0, r2, r1)     // Catch:{ Throwable -> 0x0168 }
        L_0x0060:
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0168 }
            java.lang.String r1 = "doRefreshLocation "
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0168 }
            if (r12 == 0) goto L_0x006d
            java.lang.String r1 = "success"
            goto L_0x006f
        L_0x006d:
            java.lang.String r1 = "fail"
        L_0x006f:
            r0.append(r1)     // Catch:{ Throwable -> 0x0168 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0168 }
            com.ss.android.common.d.a.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x0168 }
            r0 = 0
            if (r12 != 0) goto L_0x0080
            r10.a((android.location.Location) r0)     // Catch:{ Throwable -> 0x0168 }
            return
        L_0x0080:
            r10.a((android.location.Location) r12)     // Catch:{ Throwable -> 0x0168 }
            double r2 = r12.getLatitude()     // Catch:{ Throwable -> 0x0168 }
            double r4 = r12.getLongitude()     // Catch:{ Throwable -> 0x0168 }
            android.location.Address r7 = new android.location.Address     // Catch:{ Throwable -> 0x0168 }
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x0168 }
            r7.<init>(r1)     // Catch:{ Throwable -> 0x0168 }
            r7.setLatitude(r2)     // Catch:{ Throwable -> 0x0168 }
            r7.setLongitude(r4)     // Catch:{ Throwable -> 0x0168 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0168 }
            java.lang.String r6 = "LocationManager locate successfully : "
            r1.<init>(r6)     // Catch:{ Throwable -> 0x0168 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0168 }
            java.lang.String r6 = "/"
            r1.append(r6)     // Catch:{ Throwable -> 0x0168 }
            r1.append(r4)     // Catch:{ Throwable -> 0x0168 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0168 }
            com.ss.android.common.d.a.a((java.lang.String) r1)     // Catch:{ Throwable -> 0x0168 }
            android.location.Geocoder r1 = new android.location.Geocoder     // Catch:{ Exception -> 0x00f9 }
            android.content.Context r6 = r10.j     // Catch:{ Exception -> 0x00f9 }
            java.util.Locale r8 = java.util.Locale.CHINESE     // Catch:{ Exception -> 0x00f9 }
            r1.<init>(r6, r8)     // Catch:{ Exception -> 0x00f9 }
            r6 = 2
            java.util.List r1 = r1.getFromLocation(r2, r4, r6)     // Catch:{ Exception -> 0x00f9 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00f9 }
        L_0x00c5:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00f9 }
            if (r2 == 0) goto L_0x00f9
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00f9 }
            android.location.Address r2 = (android.location.Address) r2     // Catch:{ Exception -> 0x00f9 }
            boolean r3 = r2.hasLatitude()     // Catch:{ Exception -> 0x00f9 }
            if (r3 == 0) goto L_0x00c5
            boolean r3 = r2.hasLongitude()     // Catch:{ Exception -> 0x00f9 }
            if (r3 == 0) goto L_0x00c5
            monitor-enter(r16)     // Catch:{ Exception -> 0x00f9 }
            r10.p = r2     // Catch:{ all -> 0x00f6 }
            r10.o = r11     // Catch:{ all -> 0x00f6 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f6 }
            r10.m = r1     // Catch:{ all -> 0x00f6 }
            if (r12 == 0) goto L_0x00f0
            long r1 = com.bytedance.common.util.JellyBeanMR1V17Compat.getTime(r12)     // Catch:{ all -> 0x00f6 }
            r10.l = r1     // Catch:{ all -> 0x00f6 }
        L_0x00f0:
            r16.g()     // Catch:{ all -> 0x00f6 }
            monitor-exit(r16)     // Catch:{ all -> 0x00f6 }
            r13 = r0
            goto L_0x00fa
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x00f6 }
            throw r0     // Catch:{ Exception -> 0x00f9 }
        L_0x00f9:
            r13 = r7
        L_0x00fa:
            if (r13 != 0) goto L_0x00fd
            return
        L_0x00fd:
            if (r13 == 0) goto L_0x0167
            boolean r0 = r13.hasLatitude()     // Catch:{ Throwable -> 0x0168 }
            if (r0 == 0) goto L_0x0167
            boolean r0 = r13.hasLongitude()     // Catch:{ Throwable -> 0x0168 }
            if (r0 != 0) goto L_0x010c
            goto L_0x0167
        L_0x010c:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0168 }
            android.location.Address r0 = r10.p     // Catch:{ Throwable -> 0x0168 }
            if (r0 == 0) goto L_0x0141
            double r2 = r0.getLatitude()     // Catch:{ Throwable -> 0x0168 }
            double r4 = r0.getLongitude()     // Catch:{ Throwable -> 0x0168 }
            double r6 = r13.getLatitude()     // Catch:{ Throwable -> 0x0168 }
            double r8 = r13.getLongitude()     // Catch:{ Throwable -> 0x0168 }
            r1 = r16
            boolean r0 = r1.a(r2, r4, r6, r8)     // Catch:{ Throwable -> 0x0168 }
            if (r0 == 0) goto L_0x0141
            long r0 = com.bytedance.common.util.JellyBeanMR1V17Compat.getTime(r12)     // Catch:{ Throwable -> 0x0168 }
            long r2 = r10.m     // Catch:{ Throwable -> 0x0168 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0138
            r10.m = r0     // Catch:{ Throwable -> 0x0168 }
        L_0x0138:
            long r2 = r10.l     // Catch:{ Throwable -> 0x0168 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0140
            r10.l = r0     // Catch:{ Throwable -> 0x0168 }
        L_0x0140:
            return
        L_0x0141:
            long r0 = r10.m     // Catch:{ Throwable -> 0x0168 }
            r2 = 0
            long r0 = r14 - r0
            r2 = 10800000(0xa4cb80, double:5.335909E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0166
            monitor-enter(r13)     // Catch:{ Throwable -> 0x0168 }
            r0 = 300000(0x493e0, double:1.482197E-318)
            long r14 = r14 - r0
            r10.m = r14     // Catch:{ all -> 0x0163 }
            long r0 = com.bytedance.common.util.JellyBeanMR1V17Compat.getTime(r12)     // Catch:{ all -> 0x0163 }
            r10.l = r0     // Catch:{ all -> 0x0163 }
            r10.p = r13     // Catch:{ all -> 0x0163 }
            r10.o = r11     // Catch:{ all -> 0x0163 }
            r16.g()     // Catch:{ all -> 0x0163 }
            monitor-exit(r13)     // Catch:{ all -> 0x0163 }
            goto L_0x0168
        L_0x0163:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ Throwable -> 0x0168 }
        L_0x0166:
            return
        L_0x0167:
            return
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.d.c.a(android.location.Location, boolean):void");
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), bundle}, this, f2441a, false, 15864, new Class[]{String.class, Integer.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), bundle}, this, f2441a, false, 15864, new Class[]{String.class, Integer.TYPE, Bundle.class}, Void.TYPE);
            return;
        }
        h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.location.Location a(android.location.Location r14, boolean r15, android.location.LocationManager r16) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r14
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r11 = 1
            r0[r11] = r1
            r12 = 2
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2441a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.location.Location> r1 = android.location.Location.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
            r5[r12] = r1
            java.lang.Class<android.location.Location> r6 = android.location.Location.class
            r3 = 0
            r4 = 15855(0x3def, float:2.2218E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0058
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r14
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r0[r11] = r1
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2441a
            r3 = 0
            r4 = 15855(0x3def, float:2.2218E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.location.Location> r1 = android.location.Location.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
            r5[r12] = r1
            java.lang.Class<android.location.Location> r6 = android.location.Location.class
            r1 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.location.Location r0 = (android.location.Location) r0
            return r0
        L_0x0058:
            r0 = 60000(0xea60, double:2.9644E-319)
            if (r15 == 0) goto L_0x0074
            java.lang.String r2 = "gps"
            boolean r2 = r8.isProviderEnabled(r2)     // Catch:{ Exception -> 0x008a }
            if (r2 == 0) goto L_0x0074
            java.lang.String r2 = "gps"
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x008a }
            com.bytedance.common.util.GingerBreadV9Compat.requestSingleUpdate((android.location.LocationManager) r8, (java.lang.String) r2, (android.location.LocationListener) r13, (android.os.Looper) r3)     // Catch:{ Exception -> 0x008a }
            com.bytedance.common.utility.collection.WeakHandler r2 = r7.k     // Catch:{ Exception -> 0x008a }
            r2.sendEmptyMessageDelayed(r11, r0)     // Catch:{ Exception -> 0x008a }
            goto L_0x008a
        L_0x0074:
            java.lang.String r2 = "network"
            boolean r2 = r8.isProviderEnabled(r2)     // Catch:{ Exception -> 0x008a }
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = "network"
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x008a }
            com.bytedance.common.util.GingerBreadV9Compat.requestSingleUpdate((android.location.LocationManager) r8, (java.lang.String) r2, (android.location.LocationListener) r13, (android.os.Looper) r3)     // Catch:{ Exception -> 0x008a }
            com.bytedance.common.utility.collection.WeakHandler r2 = r7.k     // Catch:{ Exception -> 0x008a }
            r2.sendEmptyMessageDelayed(r11, r0)     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            java.util.List r0 = r8.getProviders(r11)
            java.util.Iterator r0 = r0.iterator()
        L_0x0092:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c9
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            android.location.Location r1 = r8.getLastKnownLocation(r1)
            if (r1 == 0) goto L_0x0092
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.getTime()
            long r2 = r2 - r4
            long r4 = f2442b
            r9 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r9
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0092
            com.bytedance.common.utility.Logger.debug()
            if (r14 == 0) goto L_0x00c8
            long r2 = r14.getTime()
            long r4 = r1.getTime()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0092
        L_0x00c8:
            return r1
        L_0x00c9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.d.c.a(android.location.Location, boolean, android.location.LocationManager):android.location.Location");
    }

    private boolean a(double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, f2441a, false, 15861, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, f2441a, false, 15861, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Boolean.TYPE)).booleanValue();
        }
        float[] fArr = new float[3];
        Location.distanceBetween(d2, d3, d4, d5, fArr);
        if (fArr[0] < 10000.0f) {
            return true;
        }
        return false;
    }
}
