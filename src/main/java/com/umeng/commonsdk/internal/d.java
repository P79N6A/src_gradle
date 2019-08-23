package com.umeng.commonsdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.a;
import com.umeng.commonsdk.internal.utils.d;
import com.umeng.commonsdk.internal.utils.j;
import com.umeng.commonsdk.internal.utils.k;
import com.umeng.commonsdk.internal.utils.l;
import com.umeng.commonsdk.proguard.c;
import com.umeng.commonsdk.proguard.s;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.stateless.f;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("f", a.c());
            jSONObject.put("t", a.d());
            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tot_s", a.h());
            jSONObject.put("ava_s", a.i());
            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a_pr", Build.PRODUCT);
            jSONObject.put("a_bl", Build.BOOTLOADER);
            if (Build.VERSION.SDK_INT >= 14) {
                jSONObject.put("a_rv", Build.getRadioVersion());
            }
            jSONObject.put("a_fp", Build.FINGERPRINT);
            jSONObject.put("a_hw", Build.HARDWARE);
            jSONObject.put("a_host", Build.HOST);
            if (Build.VERSION.SDK_INT >= 21) {
                JSONArray jSONArray = new JSONArray();
                for (String put : Build.SUPPORTED_32_BIT_ABIS) {
                    jSONArray.put(put);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("a_s32", jSONArray);
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                JSONArray jSONArray2 = new JSONArray();
                for (String put2 : Build.SUPPORTED_64_BIT_ABIS) {
                    jSONArray2.put(put2);
                }
                if (jSONArray2.length() > 0) {
                    jSONObject.put("a_s64", jSONArray2);
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                JSONArray jSONArray3 = new JSONArray();
                for (String put3 : Build.SUPPORTED_ABIS) {
                    jSONArray3.put(put3);
                }
                if (jSONArray3.length() > 0) {
                    jSONObject.put("a_sa", jSONArray3);
                }
            }
            jSONObject.put("a_ta", Build.TAGS);
            jSONObject.put("a_uk", "unknown");
            jSONObject.put("a_user", Build.USER);
            jSONObject.put("a_cpu1", Build.CPU_ABI);
            jSONObject.put("a_cpu2", Build.CPU_ABI2);
            jSONObject.put("a_ra", Build.RADIO);
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put("a_bos", Build.VERSION.BASE_OS);
                jSONObject.put("a_pre", Build.VERSION.PREVIEW_SDK_INT);
                jSONObject.put("a_sp", Build.VERSION.SECURITY_PATCH);
            }
            jSONObject.put("a_cn", Build.VERSION.CODENAME);
            jSONObject.put("a_intl", Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject d() {
        try {
            d.a a2 = com.umeng.commonsdk.internal.utils.d.a();
            if (a2 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pro", a2.f80771a);
                jSONObject.put("pla", a2.f80772b);
                jSONObject.put("cpus", a2.f80773c);
                jSONObject.put("fea", a2.f80774d);
                jSONObject.put("imp", a2.f80775e);
                jSONObject.put("arc", a2.f80776f);
                jSONObject.put("var", a2.g);
                jSONObject.put("par", a2.h);
                jSONObject.put("rev", a2.i);
                jSONObject.put("har", a2.j);
                jSONObject.put("rev", a2.k);
                jSONObject.put("ser", a2.l);
                jSONObject.put("cur_cpu", com.umeng.commonsdk.internal.utils.d.d());
                jSONObject.put("max_cpu", com.umeng.commonsdk.internal.utils.d.b());
                jSONObject.put("min_cpu", com.umeng.commonsdk.internal.utils.d.c());
                jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static JSONArray g(Context context) {
        if (context != null) {
            return k.g(context.getApplicationContext());
        }
        return null;
    }

    private static JSONArray o(Context context) {
        if (context != null) {
            return c.b(context.getApplicationContext());
        }
        return null;
    }

    private static JSONArray q(Context context) {
        JSONArray jSONArray = new JSONArray();
        JSONObject d2 = k.d(context);
        if (d2 != null) {
            try {
                String e2 = k.e(context);
                if (!TextUtils.isEmpty(e2)) {
                    d2.put("sig", e2);
                }
                jSONArray.put(d2);
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    private static JSONArray r(Context context) {
        JSONArray jSONArray = new JSONArray();
        String f2 = k.f(context);
        if (!TextUtils.isEmpty(f2)) {
            try {
                jSONArray.put(new JSONObject(f2));
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public static void b(Context context) {
        ULog.i("walle", "[internal] begin by stateful--->>>");
        if (context != null) {
            try {
                if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                    UMWorkDispatch.sendEvent(context, 32769, b.a(context).a(), null);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static String f(Context context) {
        try {
            e a2 = e.a(context);
            if (a2 == null) {
                return null;
            }
            a2.a();
            String encodeToString = Base64.encodeToString(new s().a(a2.b()), 0);
            if (!TextUtils.isEmpty(encodeToString)) {
                return encodeToString;
            }
            return null;
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        }
    }

    public static JSONObject h(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                jSONObject.put("a_st_h", a.h(context));
                jSONObject.put("a_nav_h", a.i(context));
                if (context.getResources() != null) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                        jSONObject.put("a_den", (double) displayMetrics.density);
                        jSONObject.put("a_dpi", displayMetrics.densityDpi);
                    }
                }
            } catch (Exception e2) {
                UMCrashManager.reportCrash(context, e2);
            }
        }
        return jSONObject;
    }

    public static JSONObject n(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            ActivityManager.MemoryInfo q = a.q(applicationContext);
            if (q != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        jSONObject.put("t", q.totalMem);
                    }
                    jSONObject.put("f", q.availMem);
                    jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                } catch (Exception e2) {
                    UMCrashManager.reportCrash(applicationContext, e2);
                }
            }
        }
        return jSONObject;
    }

    public static void a(Context context) {
        try {
            ULog.i("walle", "[internal] workEvent send envelope");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i_sdk_v", "1.2.0");
            JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, e(context));
            if (buildEnvelopeWithExtHeader != null && !buildEnvelopeWithExtHeader.has("exception")) {
                ULog.i("walle", "[internal] workEvent send envelope back, result is ok");
                a.f(context);
                j.d(context);
                c.c(context);
            }
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
        }
    }

    public static JSONObject d(Context context) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                JSONArray p = p(applicationContext);
                if (p != null && p.length() > 0) {
                    jSONObject2.put("run_server", p);
                }
            } catch (Exception e2) {
                try {
                    UMCrashManager.reportCrash(applicationContext, e2);
                } catch (Exception unused) {
                }
            }
            try {
                String k = a.k(applicationContext);
                if (!TextUtils.isEmpty(k)) {
                    jSONObject2.put("imsi", k);
                }
            } catch (Exception e3) {
                UMCrashManager.reportCrash(applicationContext, e3);
            }
            try {
                String l = a.l(applicationContext);
                if (!TextUtils.isEmpty(l)) {
                    jSONObject2.put("meid", l);
                }
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
            try {
                jSONObject.put("internal", jSONObject2);
            } catch (JSONException e5) {
                UMCrashManager.reportCrash(applicationContext, e5);
            }
        }
        return jSONObject;
    }

    public static JSONArray k(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            List<InputMethodInfo> m = a.m(applicationContext);
            if (m != null) {
                for (InputMethodInfo inputMethodInfo : m) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_id", inputMethodInfo.getId());
                        jSONObject.put("a_pn", inputMethodInfo.getPackageName());
                        jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Throwable th) {
                        UMCrashManager.reportCrash(applicationContext, th);
                    }
                }
            }
        }
        return jSONArray;
    }

    public static JSONArray l(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            List<j.a> e2 = j.e(applicationContext);
            if (e2 != null && !e2.isEmpty()) {
                for (j.a aVar : e2) {
                    if (aVar != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("a_w", aVar.f80789a);
                            jSONObject.put("a_h", aVar.f80790b);
                            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                            jSONArray.put(jSONObject);
                        } catch (Exception e3) {
                            UMCrashManager.reportCrash(applicationContext, e3);
                        }
                    }
                }
            }
        }
        return jSONArray;
    }

    public static JSONArray m(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            List<a.C0860a> p = a.p(applicationContext);
            if (p != null && !p.isEmpty()) {
                for (a.C0860a aVar : p) {
                    if (aVar != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("a_pn", aVar.f80749a);
                            jSONObject.put("a_la", aVar.f80750b);
                            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                            jSONArray.put(jSONObject);
                        } catch (Exception e2) {
                            UMCrashManager.reportCrash(applicationContext, e2);
                        }
                    }
                }
            }
        }
        return jSONArray;
    }

    public static void c(Context context) {
        Throwable th;
        Context context2;
        if (context != null) {
            try {
                ULog.i("walle", "[internal] begin by not stateful--->>>");
                context2 = context.getApplicationContext();
                try {
                    f.a(context2, context2.getFilesDir() + "/stateless" + "/" + Base64.encodeToString("umpx_internal".getBytes(), 0), 10);
                    UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                    JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(context2);
                    if (buildSLBaseHeader != null && buildSLBaseHeader.has("header")) {
                        try {
                            JSONObject jSONObject = (JSONObject) buildSLBaseHeader.opt("header");
                            if (jSONObject != null) {
                                jSONObject.put("i_sdk_v", "1.2.0");
                            }
                        } catch (Exception unused) {
                        }
                    }
                    ULog.i("walle", "[internal] header is " + buildSLBaseHeader.toString());
                    JSONObject d2 = d(context2);
                    ULog.i("walle", "[internal] body is " + d2.toString());
                    ULog.i("walle", uMSLEnvelopeBuild.buildSLEnvelope(context2, buildSLBaseHeader, d2, "umpx_internal").toString());
                } catch (Throwable th2) {
                    th = th2;
                    UMCrashManager.reportCrash(context2, th);
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                context2 = context;
                th = th4;
                UMCrashManager.reportCrash(context2, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|(1:6)(1:7)|8|(3:10|11|12)|13|14|(3:16|17|18)|19|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject i(android.content.Context r5) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r5 == 0) goto L_0x00a9
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r2 = "a_fit"
            long r3 = com.umeng.commonsdk.internal.utils.a.a(r5, r1)     // Catch:{ Exception -> 0x00a5 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r2 = "a_alut"
            long r3 = com.umeng.commonsdk.internal.utils.a.b(r5, r1)     // Catch:{ Exception -> 0x00a5 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r2 = "a_c"
            java.lang.String r3 = com.umeng.commonsdk.internal.utils.a.c(r5, r1)     // Catch:{ Exception -> 0x00a5 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r2 = "a_uid"
            int r1 = com.umeng.commonsdk.internal.utils.a.d(r5, r1)     // Catch:{ Exception -> 0x00a5 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00a5 }
            boolean r1 = com.umeng.commonsdk.internal.utils.a.a()     // Catch:{ Exception -> 0x00a5 }
            if (r1 == 0) goto L_0x0040
            java.lang.String r1 = "a_root"
            r2 = 1
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x0046
        L_0x0040:
            java.lang.String r1 = "a_root"
            r2 = 0
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a5 }
        L_0x0046:
            java.lang.String r1 = "tf"
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.a.b()     // Catch:{ Exception -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "s_fs"
            float r2 = com.umeng.commonsdk.internal.utils.a.a((android.content.Context) r5)     // Catch:{ Exception -> 0x00a5 }
            double r2 = (double) r2     // Catch:{ Exception -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "a_meid"
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.a.l(r5)     // Catch:{ Exception -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "a_imsi"
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.a.k(r5)     // Catch:{ Exception -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "st"
            long r2 = com.umeng.commonsdk.internal.utils.a.f()     // Catch:{ Exception -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = com.umeng.commonsdk.internal.utils.k.b(r5)     // Catch:{ Exception -> 0x00a5 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00a5 }
            if (r2 != 0) goto L_0x0083
            java.lang.String r2 = "a_iccid"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0083 }
        L_0x0083:
            java.lang.String r1 = com.umeng.commonsdk.internal.utils.k.c(r5)     // Catch:{ Exception -> 0x00a5 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00a5 }
            if (r2 != 0) goto L_0x0092
            java.lang.String r2 = "a_simei"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            java.lang.String r1 = "hn"
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.a.g()     // Catch:{ Exception -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r1)
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.d.i(android.content.Context):org.json.JSONObject");
    }

    public static JSONArray j(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            List<ScanResult> b2 = a.b(applicationContext);
            if (b2 != null && b2.size() > 0) {
                for (ScanResult scanResult : b2) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_bssid", scanResult.BSSID);
                        jSONObject.put("a_ssid", scanResult.SSID);
                        jSONObject.put("a_cap", scanResult.capabilities);
                        jSONObject.put("a_fcy", scanResult.frequency);
                        jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                        if (Build.VERSION.SDK_INT >= 23) {
                            jSONObject.put("a_c0", scanResult.centerFreq0);
                            jSONObject.put("a_c1", scanResult.centerFreq1);
                            jSONObject.put("a_cw", scanResult.channelWidth);
                            if (scanResult.is80211mcResponder()) {
                                jSONObject.put("a_is80211", 1);
                            } else {
                                jSONObject.put("a_is80211", 0);
                            }
                            if (scanResult.isPasspointNetwork()) {
                                jSONObject.put("a_isppn", 1);
                            } else {
                                jSONObject.put("a_isppn", 0);
                            }
                            jSONObject.put("a_ofn", scanResult.operatorFriendlyName);
                            jSONObject.put("a_vn", scanResult.venueName);
                        }
                        jSONObject.put("a_dc", scanResult.describeContents());
                        jSONArray.put(jSONObject);
                    } catch (Exception e2) {
                        UMCrashManager.reportCrash(applicationContext, e2);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONArray p(android.content.Context r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x00c2
            android.content.Context r1 = r7.getApplicationContext()     // Catch:{ Throwable -> 0x00be }
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Throwable -> 0x00be }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ Throwable -> 0x00be }
            if (r1 == 0) goto L_0x00c2
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r1 = r1.getRunningServices(r2)     // Catch:{ Throwable -> 0x00be }
            if (r1 == 0) goto L_0x00c2
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x00be }
            if (r2 != 0) goto L_0x00c2
            r2 = 0
        L_0x0021:
            int r3 = r1.size()     // Catch:{ Throwable -> 0x00be }
            if (r2 >= r3) goto L_0x0090
            java.lang.Object r3 = r1.get(r2)     // Catch:{ Throwable -> 0x00be }
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r1.get(r2)     // Catch:{ Throwable -> 0x00be }
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch:{ Throwable -> 0x00be }
            android.content.ComponentName r3 = r3.service     // Catch:{ Throwable -> 0x00be }
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r1.get(r2)     // Catch:{ Throwable -> 0x00be }
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch:{ Throwable -> 0x00be }
            android.content.ComponentName r3 = r3.service     // Catch:{ Throwable -> 0x00be }
            java.lang.String r3 = r3.getClassName()     // Catch:{ Throwable -> 0x00be }
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r1.get(r2)     // Catch:{ Throwable -> 0x00be }
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch:{ Throwable -> 0x00be }
            android.content.ComponentName r3 = r3.service     // Catch:{ Throwable -> 0x00be }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Throwable -> 0x00be }
            if (r3 == 0) goto L_0x008d
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008d }
            r3.<init>()     // Catch:{ JSONException -> 0x008d }
            java.lang.String r4 = "sn"
            java.lang.Object r5 = r1.get(r2)     // Catch:{ JSONException -> 0x008d }
            android.app.ActivityManager$RunningServiceInfo r5 = (android.app.ActivityManager.RunningServiceInfo) r5     // Catch:{ JSONException -> 0x008d }
            android.content.ComponentName r5 = r5.service     // Catch:{ JSONException -> 0x008d }
            java.lang.String r5 = r5.getClassName()     // Catch:{ JSONException -> 0x008d }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x008d }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x008d }
            java.lang.String r4 = "pn"
            java.lang.Object r5 = r1.get(r2)     // Catch:{ JSONException -> 0x008d }
            android.app.ActivityManager$RunningServiceInfo r5 = (android.app.ActivityManager.RunningServiceInfo) r5     // Catch:{ JSONException -> 0x008d }
            android.content.ComponentName r5 = r5.service     // Catch:{ JSONException -> 0x008d }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ JSONException -> 0x008d }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x008d }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x008d }
            if (r0 != 0) goto L_0x008a
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008d }
            r4.<init>()     // Catch:{ JSONException -> 0x008d }
            r0 = r4
        L_0x008a:
            r0.put(r3)     // Catch:{ JSONException -> 0x008d }
        L_0x008d:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0090:
            if (r0 == 0) goto L_0x00c2
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00be }
            r1.<init>()     // Catch:{ Throwable -> 0x00be }
            java.lang.String r2 = "ts"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00a5 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x00a5 }
            java.lang.String r2 = "ls"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x00a5 }
        L_0x00a5:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00be }
            r2.<init>()     // Catch:{ Throwable -> 0x00be }
            java.lang.String r3 = "sers"
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x00af }
        L_0x00af:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Throwable -> 0x00be }
            r1.<init>()     // Catch:{ Throwable -> 0x00be }
            r1.put(r2)     // Catch:{ Throwable -> 0x00b9 }
            r0 = r1
            goto L_0x00c2
        L_0x00b9:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x00bf
        L_0x00be:
            r1 = move-exception
        L_0x00bf:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r7, r1)
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.d.p(android.content.Context):org.json.JSONArray");
    }

    private static JSONArray s(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String a2 = k.a(applicationContext);
            JSONObject jSONObject = null;
            if (!TextUtils.isEmpty(a2)) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("bluetoothmac", a2);
                    } catch (Exception unused) {
                    }
                    jSONObject = jSONObject2;
                } catch (Exception unused2) {
                }
            }
            String b2 = k.b(applicationContext);
            if (!TextUtils.isEmpty(b2)) {
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused3) {
                    }
                }
                jSONObject.put("iccid", b2);
            }
            String c2 = k.c(applicationContext);
            if (!TextUtils.isEmpty(c2)) {
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused4) {
                    }
                }
                jSONObject.put("secondaryimei", c2);
            }
            JSONObject d2 = k.d(applicationContext);
            if (d2 != null) {
                try {
                    String e2 = k.e(applicationContext);
                    if (!TextUtils.isEmpty(e2)) {
                        d2.put("signalscale", e2);
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("basestation", d2);
                } catch (Exception unused5) {
                }
            }
            String f2 = k.f(applicationContext);
            if (!TextUtils.isEmpty(f2)) {
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused6) {
                    }
                }
                jSONObject.put("battery", new JSONObject(f2));
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x01b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00a4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0101 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject e(android.content.Context r5) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r5 == 0) goto L_0x01cc
            android.content.Context r5 = r5.getApplicationContext()
            org.json.JSONArray r2 = p(r5)     // Catch:{ Exception -> 0x0022 }
            if (r2 == 0) goto L_0x0026
            int r3 = r2.length()     // Catch:{ Exception -> 0x0022 }
            if (r3 <= 0) goto L_0x0026
            java.lang.String r3 = "rs"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x0026:
            org.json.JSONArray r2 = q(r5)     // Catch:{ Exception -> 0x0038 }
            if (r2 == 0) goto L_0x003c
            int r3 = r2.length()     // Catch:{ Exception -> 0x0038 }
            if (r3 <= 0) goto L_0x003c
            java.lang.String r3 = "bstn"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x003c:
            org.json.JSONArray r2 = r(r5)     // Catch:{ Exception -> 0x004e }
            if (r2 == 0) goto L_0x0052
            int r3 = r2.length()     // Catch:{ Exception -> 0x004e }
            if (r3 <= 0) goto L_0x0052
            java.lang.String r3 = "by"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x0052:
            a(r5, r1)     // Catch:{ Exception -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x005a:
            b(r5, r1)     // Catch:{ Exception -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x0062:
            org.json.JSONObject r2 = a()     // Catch:{ Exception -> 0x0074 }
            if (r2 == 0) goto L_0x0078
            int r3 = r2.length()     // Catch:{ Exception -> 0x0074 }
            if (r3 <= 0) goto L_0x0078
            java.lang.String r3 = "sd"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0078
        L_0x0074:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x0078:
            org.json.JSONObject r2 = b()     // Catch:{ Exception -> 0x008a }
            if (r2 == 0) goto L_0x008e
            int r3 = r2.length()     // Catch:{ Exception -> 0x008a }
            if (r3 <= 0) goto L_0x008e
            java.lang.String r3 = "build"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x008e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bb }
            r2.<init>()     // Catch:{ Exception -> 0x00bb }
            org.json.JSONArray r3 = g(r5)     // Catch:{ Exception -> 0x00bb }
            if (r3 == 0) goto L_0x00a4
            int r4 = r3.length()     // Catch:{ Exception -> 0x00bb }
            if (r4 <= 0) goto L_0x00a4
            java.lang.String r4 = "a_sr"
            r2.put(r4, r3)     // Catch:{ JSONException -> 0x00a4 }
        L_0x00a4:
            org.json.JSONArray r3 = com.umeng.commonsdk.internal.utils.j.c(r5)     // Catch:{ Exception -> 0x00bb }
            if (r3 == 0) goto L_0x00b5
            int r4 = r3.length()     // Catch:{ Exception -> 0x00bb }
            if (r4 <= 0) goto L_0x00b5
            java.lang.String r4 = "stat"
            r2.put(r4, r3)     // Catch:{ JSONException -> 0x00b5 }
        L_0x00b5:
            java.lang.String r3 = "sr"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00bf
        L_0x00bb:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x00bf:
            org.json.JSONObject r2 = h(r5)     // Catch:{ Exception -> 0x00d1 }
            if (r2 == 0) goto L_0x00d5
            int r3 = r2.length()     // Catch:{ Exception -> 0x00d1 }
            if (r3 <= 0) goto L_0x00d5
            java.lang.String r3 = "scr"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00d5
        L_0x00d1:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x00d5:
            org.json.JSONObject r2 = i(r5)     // Catch:{ Exception -> 0x00e7 }
            if (r2 == 0) goto L_0x00eb
            int r3 = r2.length()     // Catch:{ Exception -> 0x00e7 }
            if (r3 <= 0) goto L_0x00eb
            java.lang.String r3 = "sinfo"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x00eb:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0118 }
            r2.<init>()     // Catch:{ Exception -> 0x0118 }
            org.json.JSONArray r3 = com.umeng.commonsdk.internal.utils.a.e(r5)     // Catch:{ Exception -> 0x0118 }
            if (r3 == 0) goto L_0x0101
            int r4 = r3.length()     // Catch:{ Exception -> 0x0118 }
            if (r4 <= 0) goto L_0x0101
            java.lang.String r4 = "wl"
            r2.put(r4, r3)     // Catch:{ JSONException -> 0x0101 }
        L_0x0101:
            org.json.JSONArray r3 = j(r5)     // Catch:{ Exception -> 0x0118 }
            if (r3 == 0) goto L_0x0112
            int r4 = r3.length()     // Catch:{ Exception -> 0x0118 }
            if (r4 <= 0) goto L_0x0112
            java.lang.String r4 = "a_wls"
            r2.put(r4, r3)     // Catch:{ JSONException -> 0x0112 }
        L_0x0112:
            java.lang.String r3 = "winfo"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0118 }
            goto L_0x011c
        L_0x0118:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x011c:
            org.json.JSONArray r2 = k(r5)     // Catch:{ Exception -> 0x012e }
            if (r2 == 0) goto L_0x0132
            int r3 = r2.length()     // Catch:{ Exception -> 0x012e }
            if (r3 <= 0) goto L_0x0132
            java.lang.String r3 = "input"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x012e }
            goto L_0x0132
        L_0x012e:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x0132:
            org.json.JSONObject r2 = com.umeng.commonsdk.internal.utils.a.o(r5)     // Catch:{ Exception -> 0x0144 }
            if (r2 == 0) goto L_0x0148
            int r3 = r2.length()     // Catch:{ Exception -> 0x0144 }
            if (r3 <= 0) goto L_0x0148
            java.lang.String r3 = "bt"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0144 }
            goto L_0x0148
        L_0x0144:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x0148:
            org.json.JSONArray r2 = l(r5)     // Catch:{ Exception -> 0x015a }
            if (r2 == 0) goto L_0x015e
            int r3 = r2.length()     // Catch:{ Exception -> 0x015a }
            if (r3 <= 0) goto L_0x015e
            java.lang.String r3 = "cam"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x015a }
            goto L_0x015e
        L_0x015a:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x015e:
            org.json.JSONArray r2 = m(r5)     // Catch:{ Exception -> 0x0170 }
            if (r2 == 0) goto L_0x0174
            int r3 = r2.length()     // Catch:{ Exception -> 0x0170 }
            if (r3 <= 0) goto L_0x0174
            java.lang.String r3 = "appls"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0170 }
            goto L_0x0174
        L_0x0170:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x0174:
            org.json.JSONObject r2 = n(r5)     // Catch:{ Exception -> 0x0186 }
            if (r2 == 0) goto L_0x018a
            int r3 = r2.length()     // Catch:{ Exception -> 0x0186 }
            if (r3 <= 0) goto L_0x018a
            java.lang.String r3 = "mem"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0186 }
            goto L_0x018a
        L_0x0186:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x018a:
            org.json.JSONArray r2 = o(r5)     // Catch:{ Exception -> 0x019c }
            if (r2 == 0) goto L_0x01a0
            int r3 = r2.length()     // Catch:{ Exception -> 0x019c }
            if (r3 <= 0) goto L_0x01a0
            java.lang.String r3 = "lbs"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x019c }
            goto L_0x01a0
        L_0x019c:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x01a0:
            org.json.JSONObject r2 = d()     // Catch:{ Exception -> 0x01b1 }
            if (r2 == 0) goto L_0x01b1
            int r3 = r2.length()     // Catch:{ Exception -> 0x01b1 }
            if (r3 <= 0) goto L_0x01b1
            java.lang.String r3 = "cpu"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x01b1 }
        L_0x01b1:
            org.json.JSONObject r2 = c()     // Catch:{ Exception -> 0x01c2 }
            if (r2 == 0) goto L_0x01c2
            int r3 = r2.length()     // Catch:{ Exception -> 0x01c2 }
            if (r3 <= 0) goto L_0x01c2
            java.lang.String r3 = "rom"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x01c2 }
        L_0x01c2:
            java.lang.String r2 = "inner"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x01c8 }
            goto L_0x01cc
        L_0x01c8:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r1)
        L_0x01cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.d.e(android.content.Context):org.json.JSONObject");
    }

    private static void b(Context context, JSONObject jSONObject) {
        if (context != null) {
            String a2 = l.a(context);
            if (!TextUtils.isEmpty(a2)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(a2);
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    if (jSONObject2.has("_gdf_r")) {
                        jSONObject.put("_gdf_r", jSONObject2.opt("_gdf_r"));
                    }
                    if (jSONObject2.has("_thm_z")) {
                        jSONObject.put("_thm_z", jSONObject2.opt("_thm_z"));
                    }
                    if (jSONObject2.has("_dsk_s")) {
                        jSONObject.put("_dsk_s", jSONObject2.opt("_dsk_s"));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        if (context != null) {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            if (packageManager != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                a(jSONObject, "gp", packageManager.hasSystemFeature("android.hardware.location.gps"));
                a(jSONObject, "to", packageManager.hasSystemFeature("android.hardware.touchscreen"));
                a(jSONObject, "mo", packageManager.hasSystemFeature("android.hardware.telephony"));
                a(jSONObject, "ca", packageManager.hasSystemFeature("android.hardware.camera"));
                a(jSONObject, "fl", packageManager.hasSystemFeature("android.hardware.camera.flash"));
            }
        }
    }

    private static void a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    jSONObject.put(str, 1);
                } catch (Exception unused) {
                }
            } else {
                jSONObject.put(str, 0);
            }
        }
    }
}
