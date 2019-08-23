package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.ap;
import com.umeng.analytics.pro.ar;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bd;
import com.umeng.analytics.pro.bf;
import com.umeng.analytics.pro.bt;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.bz;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.f;
import com.umeng.analytics.pro.m;
import com.umeng.analytics.pro.w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

public class b implements ay {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f80292a;

    /* renamed from: b  reason: collision with root package name */
    private bx f80293b;

    /* renamed from: c  reason: collision with root package name */
    private as f80294c = new as();

    /* renamed from: d  reason: collision with root package name */
    private bf f80295d = new bf();

    /* renamed from: e  reason: collision with root package name */
    private bd f80296e = new bd();

    /* renamed from: f  reason: collision with root package name */
    private at f80297f = null;
    /* access modifiers changed from: private */
    public ar g = null;
    private ap h = null;
    /* access modifiers changed from: private */
    public m i = null;
    private boolean k = false;
    /* access modifiers changed from: private */
    public boolean l = false;
    private JSONObject m = null;
    private boolean n = false;

    public void a(Context context, String str, Object obj) {
    }

    public void a(Context context, String str, Map<String, Object> map) {
    }

    public void c(Context context, String str) {
    }

    public Object d(Context context, String str) {
        return null;
    }

    public String e(Context context) {
        return null;
    }

    public void f(Context context) {
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (!AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            try {
                this.f80295d.a(str);
            } catch (Exception unused) {
            }
        }
    }

    public void a(bx bxVar) {
        this.f80293b = bxVar;
    }

    public void a(Context context, String str, HashMap<String, Object> hashMap) {
        try {
            if (!this.k || !this.n) {
                g(context);
            }
            this.f80297f.b(str, hashMap);
        } catch (Exception e2) {
            if (by.f80541a) {
                by.e((Throwable) e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, Throwable th) {
        if (context != null && th != null) {
            try {
                a(context, bt.a(th));
            } catch (Exception e2) {
                if (by.f80541a) {
                    by.e((Throwable) e2);
                }
            }
        }
    }

    public void a(Context context, List<String> list, int i2, String str) {
        try {
            if (!this.k || !this.n) {
                g(context);
            }
            this.f80297f.a(list, i2, str);
        } catch (Exception e2) {
            if (by.f80541a) {
                by.e((Throwable) e2);
            }
        }
    }

    public void a(Context context, String str, String str2, long j, int i2) {
        try {
            if (!this.k || !this.n) {
                g(context);
            }
            this.f80297f.a(str, str2, j, i2);
        } catch (Exception e2) {
            if (by.f80541a) {
                by.e((Throwable) e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, String str, Map<String, Object> map, long j) {
        try {
            if (!this.k || !this.n) {
                g(context);
            }
            this.f80297f.a(str, map, j);
        } catch (Exception e2) {
            if (by.f80541a) {
                by.e((Throwable) e2);
            }
        }
    }

    public void a(Throwable th) {
        try {
            this.f80295d.a();
            if (this.f80292a != null) {
                if (!(th == null || this.g == null)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                    jSONObject.put("error_source", 1);
                    jSONObject.put("context", bt.a(th));
                    w.a(this.f80292a).a(bd.a(), jSONObject.toString(), 1);
                }
                this.i.e();
                this.h.a(this.f80292a);
                i(this.f80292a);
                ba.a(this.f80292a).edit().commit();
            }
            bz.a();
        } catch (Exception e2) {
            if (by.f80541a) {
                by.e("Exception in onAppCrash", (Throwable) e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(final String str, final String str2) {
        try {
            bz.a(new cb() {
                public void a() {
                    String[] a2 = c.a(b.this.f80292a);
                    if (a2 == null || !str.equals(a2[0]) || !str2.equals(a2[1])) {
                        b.this.g.a(b.this.f80292a).a(b.this.f80292a);
                        boolean e2 = b.this.a().e(b.this.f80292a);
                        ar.b(b.this.f80292a).b();
                        if (e2) {
                            b.this.a().f(b.this.f80292a);
                        }
                        c.a(b.this.f80292a, str, str2);
                    }
                }
            });
        } catch (Exception e2) {
            if (by.f80541a) {
                by.e(" Excepthon  in  onProfileSignIn", (Throwable) e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        AnalyticsConfig.CATCH_EXCEPTION = z;
    }

    /* access modifiers changed from: package-private */
    public void a(GL10 gl10) {
        String[] a2 = bv.a(gl10);
        if (a2.length == 2) {
            AnalyticsConfig.GPU_VENDER = a2[0];
            AnalyticsConfig.GPU_RENDERER = a2[1];
        }
    }

    /* access modifiers changed from: package-private */
    public void a(MobclickAgent.UMAnalyticsConfig uMAnalyticsConfig) {
        if (uMAnalyticsConfig.mContext != null) {
            this.f80292a = uMAnalyticsConfig.mContext.getApplicationContext();
        }
        if (!TextUtils.isEmpty(uMAnalyticsConfig.mAppkey)) {
            AnalyticsConfig.a(uMAnalyticsConfig.mContext, uMAnalyticsConfig.mAppkey);
            if (!TextUtils.isEmpty(uMAnalyticsConfig.mChannelId)) {
                AnalyticsConfig.a(uMAnalyticsConfig.mChannelId);
            }
            AnalyticsConfig.CATCH_EXCEPTION = uMAnalyticsConfig.mIsCrashEnable;
            a(this.f80292a, uMAnalyticsConfig.mType);
            return;
        }
        by.e("the appkey is null!");
    }

    public void a(Context context, List<String> list) {
        try {
            if (!this.k || !this.n) {
                g(context);
            }
            this.f80297f.a(context, list);
        } catch (Exception e2) {
            by.e((Throwable) e2);
        }
    }

    public bd a() {
        return this.f80296e;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        try {
            bz.a(new cb() {
                public void a() {
                    String[] a2 = c.a(b.this.f80292a);
                    if (a2 != null && !TextUtils.isEmpty(a2[0]) && !TextUtils.isEmpty(a2[1])) {
                        b.this.g.a(b.this.f80292a).a(b.this.f80292a);
                        boolean e2 = b.this.a().e(b.this.f80292a);
                        ar.b(b.this.f80292a).b();
                        if (e2) {
                            b.this.a().f(b.this.f80292a);
                        }
                        c.b(b.this.f80292a);
                    }
                }
            });
        } catch (Exception e2) {
            if (by.f80541a) {
                by.e(" Excepthon  in  onProfileSignOff", (Throwable) e2);
            }
        }
    }

    b() {
        this.f80294c.a((ay) this);
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z) {
        by.f80541a = z;
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z) {
        AnalyticsConfig.a(z);
    }

    /* access modifiers changed from: private */
    public void h(Context context) {
        this.f80296e.c(context);
        if (this.f80293b != null) {
            this.f80293b.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(long j) {
        AnalyticsConfig.kContinueSessionMillis = j;
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z) {
        a.f80289d = z;
    }

    /* access modifiers changed from: private */
    public void i(Context context) {
        this.f80296e.d(context);
        bf.a(context);
        ap.b(context);
        this.g.a(this.f80292a).a(context);
        if (this.f80293b != null) {
            this.f80293b.b();
        }
    }

    private JSONObject j(Context context) {
        try {
            String string = ba.a(context).getString("sp", null);
            if (!TextUtils.isEmpty(string)) {
                return new JSONObject(string);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void c(Context context) {
        try {
            if (!this.k || !this.n) {
                g(context);
            }
            this.g.a();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void b(final Context context) {
        if (context == null) {
            by.e("unexpected null context in onPause");
            return;
        }
        if (AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            this.f80295d.b(context.getClass().getName());
        }
        try {
            if (!this.k || !this.n) {
                g(context);
            }
            bz.a(new cb() {
                public void a() {
                    b.this.i(context.getApplicationContext());
                    b.this.i.f();
                }
            });
        } catch (Exception e2) {
            if (by.f80541a) {
                by.e("Exception occurred in Mobclick.onRause(). ", (Throwable) e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Context context) {
        try {
            this.h.a(context);
            this.f80295d.a();
            i(context);
            ba.a(context).edit().commit();
            this.i.d();
            bz.a();
        } catch (Exception unused) {
        }
    }

    private void g(Context context) {
        if (context != null) {
            try {
                if (Build.VERSION.SDK_INT > 13 && !this.n && (context instanceof Activity)) {
                    this.h = new ap((Activity) context);
                    this.n = true;
                }
                if (!this.k) {
                    this.f80292a = context.getApplicationContext();
                    this.f80297f = new at(this.f80292a);
                    this.g = ar.b(this.f80292a);
                    this.k = true;
                    if (this.i == null) {
                        this.i = m.a(this.f80292a);
                    }
                    if (!this.l) {
                        bz.b(new cb() {
                            public void a() {
                                b.this.i.a((f) new f() {
                                    public void a(Object obj, boolean z) {
                                        boolean unused = b.this.l = true;
                                    }
                                });
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        AnalyticsConfig.sLatentWindow = ((int) j) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    }

    /* access modifiers changed from: package-private */
    public void a(final Context context) {
        if (context == null) {
            by.e("unexpected null context in onResume");
            return;
        }
        if (AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            this.f80295d.a(context.getClass().getName());
        }
        try {
            if (!this.k || !this.n) {
                g(context);
            }
            bz.a(new cb() {
                public void a() {
                    b.this.h(context.getApplicationContext());
                }
            });
        } catch (Exception e2) {
            by.e("Exception occurred in Mobclick.onResume(). ", (Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        if (!AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            try {
                this.f80295d.b(str);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        AnalyticsConfig.ACTIVITY_DURATION_OPEN = z;
    }

    /* access modifiers changed from: package-private */
    public void a(double d2, double d3) {
        if (AnalyticsConfig.f80279a == null) {
            AnalyticsConfig.f80279a = new double[2];
        }
        AnalyticsConfig.f80279a[0] = d2;
        AnalyticsConfig.f80279a[1] = d3;
    }

    /* access modifiers changed from: package-private */
    public void b(Context context, String str) {
        if (context != null) {
            this.f80292a = context.getApplicationContext();
        }
        AnalyticsConfig.b(context, str);
    }

    public void a(Context context, int i2) {
        AnalyticsConfig.a(context, i2);
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context != null) {
            this.f80292a = context.getApplicationContext();
        }
        if (eScenarioType != null) {
            a(context, eScenarioType.toValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (context == null) {
                by.e("unexpected null context in reportError");
                return;
            }
            try {
                if (!this.k || !this.n) {
                    g(context);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                jSONObject.put("error_source", 2);
                jSONObject.put("context", str);
                w.a(this.f80292a).a(bd.a(), jSONObject.toString(), 2);
            } catch (Exception e2) {
                if (by.f80541a) {
                    by.e((Throwable) e2);
                }
            }
        }
    }
}
