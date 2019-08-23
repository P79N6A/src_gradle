package com.bytedance.ttnet.a;

import android.location.Address;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.frameworks.baselib.network.http.cronet.a.d;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a implements ICronetAppProvider, ICronetDepend {

    /* renamed from: a  reason: collision with root package name */
    public d f22536a;

    public String getAbClient() {
        return "";
    }

    public String getAbFeature() {
        return "";
    }

    public String getAbVersion() {
        return "";
    }

    public String getAppId() {
        return "-1";
    }

    public String getAppName() {
        return "";
    }

    public String getCarrierRegion() {
        return "";
    }

    public String getChannel() {
        return "";
    }

    public String getDeviceId() {
        return "";
    }

    public String getDevicePlatform() {
        return "android";
    }

    public String getGetDomainDefaultJSON() {
        return null;
    }

    public String getIId() {
        return "";
    }

    public String getOpenUdid() {
        return "";
    }

    public String getRegion() {
        return "";
    }

    public String getSsCookieKey() {
        return "X-SS-Cookie";
    }

    public String getSsmix() {
        return "a";
    }

    public String getStoreIdc() {
        return "";
    }

    public String getSysRegion() {
        return "";
    }

    public String getUUID() {
        return "";
    }

    public String getUserId() {
        return "";
    }

    public String getVersionName() {
        return "";
    }

    public void loggerD(String str, String str2) {
    }

    public void sendAppMonitorEvent(String str, String str2) {
    }

    public void setAdapter(ICronetDepend iCronetDepend) {
    }

    protected a() {
    }

    public String getDeviceBrand() {
        return Build.BRAND;
    }

    public String getDeviceType() {
        return Build.MODEL;
    }

    public final synchronized d a() {
        return this.f22536a;
    }

    public String getAbFlag() {
        return String.valueOf("-1");
    }

    public String getManifestVersionCode() {
        return String.valueOf("-1");
    }

    public String getOSApi() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public String getUpdateVersionCode() {
        return String.valueOf("-1");
    }

    public String getVersionCode() {
        return String.valueOf("-1");
    }

    public boolean loggerDebug() {
        return Logger.debug();
    }

    public String getAbi() {
        if (Build.VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return Build.SUPPORTED_ABIS[0];
    }

    public String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public String getNetAccessType() {
        return NetworkUtils.getNetworkAccessType(TTNetInit.getTTNetDepend().a());
    }

    public String getRticket() {
        return String.valueOf(System.currentTimeMillis());
    }

    public final void onColdStartFinish() {
        Logger.debug();
        new ThreadPlus("NetWork-Event") {
            public final void run() {
                TTNetInit.notifyColdStartFinish();
            }
        }.start();
    }

    public String getCityName() {
        Address a2 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a());
        if (a2 != null) {
            String locality = a2.getLocality();
            if (!StringUtils.isEmpty(locality)) {
                return locality;
            }
        }
        return "";
    }

    public String getDPI() {
        int dpi = UIUtils.getDpi(TTNetInit.getTTNetDepend().a());
        if (dpi > 0) {
            return String.valueOf(dpi);
        }
        return "";
    }

    public String getOSVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            if (str != null && str.length() > 10) {
                str = str.substring(0, 10);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public String getResolution() {
        String screenResolution = UIUtils.getScreenResolution(TTNetInit.getTTNetDepend().a());
        if (!StringUtils.isEmpty(screenResolution)) {
            return screenResolution;
        }
        return "";
    }

    public Map<String, String> getGetDomainDependHostMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] b2 = TTNetInit.getTTNetDepend().b();
        if (b2 != null) {
            if (b2.length > 0) {
                linkedHashMap.put("first", b2[0]);
            }
            if (b2.length > 1) {
                linkedHashMap.put("second", b2[1]);
            }
            if (b2.length > 2) {
                linkedHashMap.put("third", b2[2]);
            }
        }
        Map e2 = TTNetInit.getTTNetDepend().e();
        if (e2 != null && !e2.isEmpty()) {
            for (Map.Entry entry : e2.entrySet()) {
                if (entry != null) {
                    linkedHashMap.put(entry.getValue(), entry.getKey());
                }
            }
        }
        return linkedHashMap;
    }

    public void onServerConfigUpdated(final String str) {
        try {
            Logger.debug();
            new ThreadPlus("NetWork-Event") {
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r5 = this;
                        com.bytedance.ttnet.c r0 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x0040 }
                        android.content.Context r0 = r0.a()     // Catch:{ Throwable -> 0x0040 }
                        com.bytedance.ttnet.config.a r0 = com.bytedance.ttnet.config.a.a((android.content.Context) r0)     // Catch:{ Throwable -> 0x0040 }
                        java.lang.String r1 = r3     // Catch:{ Throwable -> 0x0040 }
                        r2 = 0
                        boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0040 }
                        if (r3 != 0) goto L_0x003f
                        com.bytedance.ttnet.config.a$5 r3 = new com.bytedance.ttnet.config.a$5     // Catch:{ Exception -> 0x0024 }
                        java.lang.String r4 = "AppConfig-SaveWaitConfigTimesTask"
                        r3.<init>(r4)     // Catch:{ Exception -> 0x0024 }
                        r3.start()     // Catch:{ Exception -> 0x0024 }
                        boolean r1 = r0.a((java.lang.Object) r1)     // Catch:{ Exception -> 0x0024 }
                        goto L_0x0025
                    L_0x0024:
                        r1 = 0
                    L_0x0025:
                        r2 = 102(0x66, float:1.43E-43)
                        if (r1 == 0) goto L_0x002b
                        r2 = 101(0x65, float:1.42E-43)
                    L_0x002b:
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x003a }
                        r1.<init>()     // Catch:{ Throwable -> 0x003a }
                        java.lang.String r3 = "from"
                        java.lang.String r4 = "cronet"
                        r1.put(r3, r4)     // Catch:{ Throwable -> 0x003a }
                        com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x003a }
                    L_0x003a:
                        com.bytedance.common.utility.collection.WeakHandler r0 = r0.j     // Catch:{ Throwable -> 0x0040 }
                        r0.sendEmptyMessage(r2)     // Catch:{ Throwable -> 0x0040 }
                    L_0x003f:
                        return
                    L_0x0040:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.a.a.AnonymousClass1.run():void");
                }
            }.start();
        } catch (Throwable unused) {
        }
    }

    public final void onTTNetStateChanged(final int i) {
        Logger.debug();
        new ThreadPlus("NetWork-Event") {
            public final void run() {
            }
        }.start();
    }

    public final void onTTNetDetectInfoChanged(final String str) {
        Logger.debug();
        if (!TextUtils.isEmpty(str)) {
            new ThreadPlus("NetWork-Event") {
                public final void run() {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        d dVar = new d();
                        dVar.f19812a = jSONObject.getInt("source");
                        dVar.f19813b = jSONObject.getLong("timestamp");
                        dVar.f19814c = jSONObject.getInt("succ");
                        dVar.f19815d = jSONObject.getInt("fail");
                        dVar.f19816e = jSONObject.getInt("rank");
                        JSONArray jSONArray = jSONObject.getJSONArray("result");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            Object obj = null;
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String string = jSONObject2.getString("type");
                            if ("http_get".equalsIgnoreCase(string)) {
                                obj = d.b.a(jSONObject2);
                            } else if ("ping".equalsIgnoreCase(string)) {
                                obj = d.e.a(jSONObject2);
                            } else if ("traceroute".equalsIgnoreCase(string)) {
                                obj = d.f.a(jSONObject2);
                            } else if ("dns_local".equalsIgnoreCase(string)) {
                                obj = d.C0160d.a(jSONObject2);
                            } else if ("dns_http".equalsIgnoreCase(string)) {
                                obj = d.a.a(jSONObject2);
                            }
                            if (obj != null) {
                                dVar.f19817f.add(obj);
                            }
                        }
                        synchronized (this) {
                            a.this.f22536a = dVar;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }.start();
        }
    }

    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(next.getValue());
            hashMap.put(next.getKey(), arrayList);
        }
        return e.a(str, (Map) hashMap);
    }
}
