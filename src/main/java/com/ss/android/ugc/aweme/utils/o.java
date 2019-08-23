package com.ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.download.b.e;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.shortvideo.ea;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75911a;

    /* renamed from: b  reason: collision with root package name */
    public static e f75912b = new e(10);

    /* renamed from: c  reason: collision with root package name */
    public static long f75913c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f75914d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f75915e = {"appConstructToOnCreateStart", "appOnCreateDuration", "appOnCreateEndToMainOnCreateStart", "mainOnCreateDuration", "mainOnCreateToOnResumeEnd", "mainOnResumeEndToOnWindowFocusChange", "mainOnWindowFocusChangeToMainFeedShown"};

    /* renamed from: f  reason: collision with root package name */
    private static long[] f75916f = new long[7];

    public static void a() {
        long j;
        if (PatchProxy.isSupport(new Object[0], null, f75911a, true, 87913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75911a, true, 87913, new Class[0], Void.TYPE);
            return;
        }
        f75916f[6] = a(9);
        if (f75916f[6] > 0) {
            if (f75916f[6] > ea.f66827f) {
                f75916f[6] = 0;
            }
            if (PatchProxy.isSupport(new Object[0], null, f75911a, true, 87918, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f75911a, true, 87918, new Class[0], Void.TYPE);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < f75916f.length; i++) {
                        if (f75916f[i] > 0) {
                            j = f75916f[i];
                        } else {
                            j = 0;
                        }
                        jSONObject.put(f75915e[i], j);
                    }
                    n.a("aweme_app_performance", "aweme_app_performance", jSONObject);
                } catch (JSONException e2) {
                    a.a("trackTimeError" + e2.getMessage());
                }
            }
            for (int i2 = 0; i2 < f75916f.length; i2++) {
                f75916f[i2] = -1;
            }
        }
    }

    public static long a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f75911a, true, 87915, new Class[]{Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f75911a, true, 87915, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long a2 = f75912b.a(j2);
        if (a2 <= 0) {
            return -1;
        }
        f75912b.b(j2);
        return uptimeMillis - a2;
    }
}
