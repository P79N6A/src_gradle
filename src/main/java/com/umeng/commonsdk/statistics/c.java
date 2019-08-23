package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.a;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.ab;
import com.umeng.commonsdk.proguard.j;
import com.umeng.commonsdk.proguard.m;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.internal.d;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.File;

public class c {

    /* renamed from: a  reason: collision with root package name */
    String f80925a;

    /* renamed from: e  reason: collision with root package name */
    private final int f80926e = 1;

    /* renamed from: f  reason: collision with root package name */
    private com.umeng.commonsdk.statistics.internal.c f80927f;
    private ImprintHandler g;
    private e h;
    private ImprintHandler.a i;
    private ABTest j;
    /* access modifiers changed from: private */
    public Defcon k;
    private long l;
    private int m;
    private int n;
    /* access modifiers changed from: private */
    public Context r;
    private ReportPolicy.ReportStrategy s;

    public c(Context context) {
        this.r = context;
        this.i = ImprintHandler.getImprintService(this.r).c();
        this.k = Defcon.getService(this.r);
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.r);
        this.l = sharedPreferences.getLong("thtstart", 0);
        this.m = sharedPreferences.getInt("gkvc", 0);
        this.n = sharedPreferences.getInt("ekvc", 0);
        this.f80925a = UMEnvelopeBuild.imprintProperty(this.r, "track_list", null);
        this.g = ImprintHandler.getImprintService(this.r);
        this.g.a((d) new d() {
            public void onImprintChanged(ImprintHandler.a aVar) {
                c.this.k.onImprintChanged(aVar);
                c.this.f80925a = UMEnvelopeBuild.imprintProperty(c.this.r, "track_list", null);
                try {
                    String a2 = a.a(c.this.r, "umtt", (String) null);
                    if (!TextUtils.isEmpty(a2)) {
                        try {
                            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
                            if (cls != null) {
                                cls.getMethod("updateUMTT", new Class[]{Context.class, String.class}).invoke(cls, new Object[]{c.this.r, a2});
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        });
        this.h = e.a(this.r);
        this.f80927f = new com.umeng.commonsdk.statistics.internal.c(this.r);
        this.f80927f.a(StatTracer.getInstance(this.r));
    }

    private int a(byte[] bArr) {
        Response response = new Response();
        try {
            new m(new ab.a()).a((j) response, bArr);
            if (response.resp_code == 1) {
                this.g.b(response.getImprint());
                this.g.d();
            }
            MLog.i("send log:" + response.getMsg());
            UMRTLog.i("MobclickRT", "send log: " + response.getMsg());
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.r, th);
        }
        if (response.resp_code == 1) {
            return 2;
        }
        return 3;
    }

    public boolean a(File file) {
        int i2;
        if (file == null) {
            return false;
        }
        try {
            byte[] byteArray = UMFrUtils.toByteArray(file.getPath());
            if (byteArray == null) {
                return false;
            }
            com.umeng.commonsdk.statistics.internal.a.a(this.r).c(file.getName());
            byte[] a2 = this.f80927f.a(byteArray, com.umeng.commonsdk.statistics.internal.a.a(this.r).a(file.getName()));
            if (a2 == null) {
                i2 = 1;
            } else {
                i2 = a(a2);
            }
            switch (i2) {
                case 2:
                    this.h.d();
                    break;
                case 3:
                    break;
            }
            StatTracer.getInstance(this.r).saveSate();
            if (i2 == 2) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.r, th);
            return false;
        }
    }
}
