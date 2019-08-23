package com.tencent.open.d;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.open.a.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, d> f79735f = Collections.synchronizedMap(new HashMap());
    private static String g = null;

    /* renamed from: a  reason: collision with root package name */
    Context f79736a;

    /* renamed from: b  reason: collision with root package name */
    String f79737b;

    /* renamed from: c  reason: collision with root package name */
    JSONObject f79738c;

    /* renamed from: d  reason: collision with root package name */
    long f79739d;

    /* renamed from: e  reason: collision with root package name */
    int f79740e;
    private boolean h = true;

    private void b() {
        int optInt = this.f79738c.optInt("Common_frequency");
        if (optInt == 0) {
            optInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f79739d >= ((long) (optInt * 3600000))) {
            a();
        }
    }

    private void a() {
        if (this.f79740e != 0) {
            c("update thread is running, return");
            return;
        }
        this.f79740e = 1;
        final Bundle bundle = new Bundle();
        bundle.putString("appid", this.f79737b);
        bundle.putString("appid_for_getting_config", this.f79737b);
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", Build.MODEL);
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", "3.3.0.lite");
        bundle.putString("sdkp", "a");
        new Thread() {
            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|(1:6)|7|8|9|10|12) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0058 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                    r0 = 0
                    com.tencent.open.d.d r1 = com.tencent.open.d.d.this     // Catch:{ Exception -> 0x005e }
                    android.content.Context r1 = r1.f79736a     // Catch:{ Exception -> 0x005e }
                    java.lang.String r2 = "http://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf"
                    java.lang.String r3 = "GET"
                    android.os.Bundle r4 = r0     // Catch:{ Exception -> 0x005e }
                    com.tencent.open.d.h$a r1 = com.tencent.open.d.a.a(r1, r2, r3, r4)     // Catch:{ Exception -> 0x005e }
                    java.lang.String r1 = r1.f79759a     // Catch:{ Exception -> 0x005e }
                    org.json.JSONObject r1 = com.tencent.open.d.h.d((java.lang.String) r1)     // Catch:{ Exception -> 0x005e }
                    com.tencent.open.d.d r2 = com.tencent.open.d.d.this     // Catch:{ Exception -> 0x005e }
                    java.lang.String r3 = "cgi back, do update"
                    r2.c(r3)     // Catch:{ Exception -> 0x005e }
                    r2.f79738c = r1     // Catch:{ Exception -> 0x005e }
                    java.lang.String r3 = "com.tencent.open.config.json"
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x005e }
                    java.lang.String r4 = r2.f79737b     // Catch:{ IOException -> 0x0058 }
                    if (r4 == 0) goto L_0x003e
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0058 }
                    r4.<init>()     // Catch:{ IOException -> 0x0058 }
                    r4.append(r3)     // Catch:{ IOException -> 0x0058 }
                    java.lang.String r3 = "."
                    r4.append(r3)     // Catch:{ IOException -> 0x0058 }
                    java.lang.String r3 = r2.f79737b     // Catch:{ IOException -> 0x0058 }
                    r4.append(r3)     // Catch:{ IOException -> 0x0058 }
                    java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x0058 }
                L_0x003e:
                    android.content.Context r4 = r2.f79736a     // Catch:{ IOException -> 0x0058 }
                    java.io.FileOutputStream r3 = r4.openFileOutput(r3, r0)     // Catch:{ IOException -> 0x0058 }
                    java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0058 }
                    java.lang.String r5 = "UTF-8"
                    java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ IOException -> 0x0058 }
                    r4.<init>(r3, r5)     // Catch:{ IOException -> 0x0058 }
                    r4.write(r1)     // Catch:{ IOException -> 0x0058 }
                    r4.flush()     // Catch:{ IOException -> 0x0058 }
                    r4.close()     // Catch:{ IOException -> 0x0058 }
                L_0x0058:
                    long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x005e }
                    r2.f79739d = r3     // Catch:{ Exception -> 0x005e }
                L_0x005e:
                    com.tencent.open.d.d r1 = com.tencent.open.d.d.this
                    r1.f79740e = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.d.d.AnonymousClass1.run():void");
            }
        }.start();
    }

    public final int a(String str) {
        c("get " + str);
        b();
        return this.f79738c.optInt(str);
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        if (this.h) {
            f.a("openSDK_LOG.OpenConfig", str + "; appid: " + this.f79737b);
        }
    }

    public final boolean b(String str) {
        c("get " + str);
        b();
        Object opt = this.f79738c.opt(str);
        if (opt == null) {
            return false;
        }
        if (opt instanceof Integer) {
            if (!opt.equals(0)) {
                return true;
            }
            return false;
        } else if (opt instanceof Boolean) {
            return ((Boolean) opt).booleanValue();
        } else {
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1 = r4.f79736a.getAssets().open(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String d(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r4.f79737b     // Catch:{ FileNotFoundException -> 0x0025 }
            if (r1 == 0) goto L_0x001d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0025 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0025 }
            r1.append(r5)     // Catch:{ FileNotFoundException -> 0x0025 }
            java.lang.String r2 = "."
            r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0025 }
            java.lang.String r2 = r4.f79737b     // Catch:{ FileNotFoundException -> 0x0025 }
            r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0025 }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0025 }
            goto L_0x001e
        L_0x001d:
            r1 = r5
        L_0x001e:
            android.content.Context r2 = r4.f79736a     // Catch:{ FileNotFoundException -> 0x0025 }
            java.io.FileInputStream r1 = r2.openFileInput(r1)     // Catch:{ FileNotFoundException -> 0x0025 }
            goto L_0x002f
        L_0x0025:
            android.content.Context r1 = r4.f79736a     // Catch:{ IOException -> 0x0069 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x0069 }
            java.io.InputStream r1 = r1.open(r5)     // Catch:{ IOException -> 0x0069 }
        L_0x002f:
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r2.<init>(r1, r3)
            r5.<init>(r2)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
        L_0x0044:
            java.lang.String r3 = r5.readLine()     // Catch:{ IOException -> 0x0062, all -> 0x005a }
            if (r3 == 0) goto L_0x004e
            r2.append(r3)     // Catch:{ IOException -> 0x0062, all -> 0x005a }
            goto L_0x0044
        L_0x004e:
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0062, all -> 0x005a }
            r1.close()     // Catch:{ IOException -> 0x0058 }
            r5.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            r0 = r2
            goto L_0x0068
        L_0x005a:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0061 }
            r5.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            r1.close()     // Catch:{ IOException -> 0x0068 }
            r5.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            return r0
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.d.d.d(java.lang.String):java.lang.String");
    }

    private d(Context context, String str) {
        this.f79736a = context.getApplicationContext();
        this.f79737b = str;
        try {
            this.f79738c = new JSONObject(d("com.tencent.open.config.json"));
        } catch (JSONException unused) {
            this.f79738c = new JSONObject();
        }
        a();
    }

    public static d a(Context context, String str) {
        d dVar;
        synchronized (f79735f) {
            f.a("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                g = str;
            }
            if (str == null) {
                if (g != null) {
                    str = g;
                } else {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
            }
            dVar = f79735f.get(str);
            if (dVar == null) {
                dVar = new d(context, str);
                f79735f.put(str, dVar);
            }
            f.a("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return dVar;
    }
}
