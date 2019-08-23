package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.d;
import com.umeng.commonsdk.internal.utils.b;
import com.umeng.commonsdk.internal.utils.j;
import com.umeng.commonsdk.internal.utils.l;
import com.umeng.commonsdk.proguard.a;
import com.umeng.commonsdk.proguard.c;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.stateless.f;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONArray;
import org.json.JSONObject;

public class UMConfigureImpl {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f80728a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f80729b;

    public static void init(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            b(applicationContext);
            a(applicationContext);
        }
    }

    private static synchronized void a(final Context context) {
        synchronized (UMConfigureImpl.class) {
            if (context != null) {
                try {
                    if (!f80729b) {
                        String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                        String packageName = context.getPackageName();
                        if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                            new Thread(new Runnable() {
                                public final void run() {
                                    try {
                                        JSONArray b2 = c.b(context);
                                        if (b2 != null && b2.length() > 0) {
                                            f.a(context, context.getFilesDir() + "/stateless" + "/" + Base64.encodeToString("umpx_oplus_lbs".getBytes(), 0), 10);
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("lbs", b2);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("tp", jSONObject);
                                            UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                                            uMSLEnvelopeBuild.buildSLEnvelope(context, uMSLEnvelopeBuild.buildSLBaseHeader(context), jSONObject2, "umpx_oplus_lbs");
                                        }
                                    } catch (Exception e2) {
                                        UMCrashManager.reportCrash(context, e2);
                                    }
                                }
                            }).start();
                        }
                        f80729b = true;
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
    }

    private static synchronized void b(final Context context) {
        synchronized (UMConfigureImpl.class) {
            if (context != null) {
                try {
                    if (!f80728a) {
                        new Thread(new Runnable() {
                            public final void run() {
                                try {
                                    String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                    String packageName = context.getPackageName();
                                    if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                                        a.a(context);
                                        try {
                                            c.a(context);
                                        } catch (Throwable th) {
                                            ULog.e("internal", "e is " + th);
                                        }
                                        try {
                                            if (!com.umeng.commonsdk.internal.utils.c.a(context).a()) {
                                                com.umeng.commonsdk.internal.utils.c.a(context).b();
                                            }
                                        } catch (Throwable th2) {
                                            ULog.e("internal", "e is " + th2);
                                        }
                                        try {
                                            l.b(context);
                                        } catch (Throwable th3) {
                                            ULog.e("internal", "e is " + th3);
                                        }
                                        try {
                                            com.umeng.commonsdk.internal.utils.a.n(context);
                                        } catch (Throwable th4) {
                                            ULog.e("internal", "e is " + th4);
                                        }
                                        try {
                                            com.umeng.commonsdk.internal.utils.a.d(context);
                                        } catch (Throwable th5) {
                                            ULog.e("internal", "e is " + th5);
                                        }
                                        try {
                                            j.b(context);
                                        } catch (Throwable th6) {
                                            ULog.e("internal", "e is " + th6);
                                        }
                                        try {
                                            d.b(context);
                                        } catch (Throwable th7) {
                                            ULog.e("internal", "e is " + th7);
                                        }
                                        try {
                                            d.c(context);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                } catch (Throwable th8) {
                                    UMCrashManager.reportCrash(context, th8);
                                }
                            }
                        }).start();
                        if (!b.a(context).a()) {
                            b.a(context).b();
                        }
                        f80728a = true;
                    }
                } catch (Throwable th) {
                    ULog.e("internal", "e is " + th.getMessage());
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
    }
}
