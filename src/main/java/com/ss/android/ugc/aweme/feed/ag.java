package com.ss.android.ugc.aweme.feed;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.newmedia.app.e;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.base.n;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3141a;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    private long H;
    private long I;
    private long J;
    private long K;
    private long L;
    private long M;
    private long N;
    private long O;
    private long P;
    private long Q;
    private List<a> R;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3142b;

    /* renamed from: c  reason: collision with root package name */
    public long f3143c;

    /* renamed from: d  reason: collision with root package name */
    public long f3144d;

    /* renamed from: e  reason: collision with root package name */
    public long f3145e;

    /* renamed from: f  reason: collision with root package name */
    public long f3146f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public static abstract class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void onRender() {
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ag f3147a = new ag((byte) 0);
    }

    public final void h() {
        this.f3142b = false;
    }

    public static ag i() {
        return b.f3147a;
    }

    private ag() {
        this.f3142b = true;
        this.R = new ArrayList();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3141a, false, 40168, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3141a, false, 40168, new Class[0], Void.TYPE);
        } else if (this.H > 0) {
            h();
        } else {
            this.H = SystemClock.uptimeMillis();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3141a, false, 40169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3141a, false, 40169, new Class[0], Void.TYPE);
        } else if (this.I <= 0) {
            this.I = SystemClock.uptimeMillis();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3141a, false, 40170, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3141a, false, 40170, new Class[0], Void.TYPE);
        } else if (this.J <= 0) {
            this.J = SystemClock.uptimeMillis();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3141a, false, 40177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3141a, false, 40177, new Class[0], Void.TYPE);
        } else if (this.K <= 0) {
            this.K = SystemClock.uptimeMillis();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3141a, false, 40179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3141a, false, 40179, new Class[0], Void.TYPE);
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && this.L <= 0) {
            this.L = SystemClock.uptimeMillis();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3141a, false, 40180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3141a, false, 40180, new Class[0], Void.TYPE);
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && this.M <= 0) {
            this.M = SystemClock.uptimeMillis();
        }
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3141a, false, 40201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3141a, false, 40201, new Class[0], Void.TYPE);
            return;
        }
        for (a onRender : this.R) {
            onRender.onRender();
        }
    }

    private boolean k() {
        if (this.g - this.f3146f > 1000 || this.i - this.h > 1000 || this.k - this.j > 1000 || this.h == 0 || this.j == 0 || this.l == 0 || this.n == 0 || this.p == 0 || this.H == 0 || this.q == 0 || this.r == 0 || this.s == 0 || this.t == 0 || this.u == 0 || this.v == 0 || this.w == 0) {
            return true;
        }
        return false;
    }

    private boolean l() {
        if (PatchProxy.isSupport(new Object[0], this, f3141a, false, 40195, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3141a, false, 40195, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Context context = i.a().getContext();
        String a2 = e.a(context).a("release_build", "");
        if (com.ss.android.ugc.aweme.aj.b.b().a(context, "log_release_build_version").equals(a2)) {
            return false;
        }
        com.ss.android.ugc.aweme.aj.b.b().a(context, "log_release_build_version", a2);
        return true;
    }

    public boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f3141a, false, 40196, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3141a, false, 40196, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return com.ss.android.ugc.aweme.aj.b.b().a(i.a().getContext(), "log_release_build_version").isEmpty();
    }

    /* synthetic */ ag(byte b2) {
        this();
    }

    public final synchronized void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3141a, false, 40199, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3141a, false, 40199, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.R.add(aVar);
    }

    public void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f3141a, false, 40197, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f3141a, false, 40197, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (g()) {
            l();
        } else if (!this.f3142b || k() || l()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        if (this.K == 0) {
            this.K = this.w;
        }
        try {
            jSONObject.put("app2main5s", 1);
            jSONObject2.put("app_start_to_main_focus" + str2, this.p - this.f3143c);
            jSONObject2.put("feed_total" + str2, this.w - this.f3143c);
            jSONObject2.put("feed_cover_total" + str2, this.K - this.f3143c);
            jSONObject2.put("cold_boot_application_attach_duration" + str2, this.f3144d - this.f3143c);
            jSONObject2.put("cold_boot_application_attach_to_create" + str2, this.f3145e - this.f3144d);
            jSONObject2.put("cold_boot_application_create_duration" + str2, this.f3146f - this.f3145e);
            jSONObject2.put("cold_boot_application_to_splash" + str2, this.g - this.f3146f);
            jSONObject2.put("cold_boot_splash_duration" + str2, this.h - this.g);
            jSONObject2.put("cold_boot_splash_to_main" + str2, this.i - this.h);
            jSONObject2.put("cold_boot_main_create_duration" + str2, this.j - this.i);
            jSONObject2.put("cold_boot_main_create_to_resume" + str2, this.k - this.j);
            jSONObject2.put("cold_boot_main_resume_duration" + str2, this.l - this.k);
            jSONObject2.put("cold_boot_main_resume_to_measure" + str2, this.m - this.l);
            jSONObject2.put("cold_boot_main_measure_duration" + str2, this.n - this.m);
            jSONObject2.put("cold_boot_main_measure_to_focus" + str2, this.o - this.n);
            jSONObject2.put("cold_boot_main_focus_duration" + str2, this.p - this.o);
            jSONObject2.put("cold_boot_to_feed_request" + str2, this.H - this.f3143c);
            jSONObject2.put("cold_boot_feed_request_to_network" + str2, this.q - this.H);
            jSONObject2.put("cold_boot_feed_wait_ttnet_init_duration" + str2, this.J - this.I);
            jSONObject2.put("cold_boot_feed_network_duration" + str2, this.r - this.q);
            jSONObject2.put("cold_boot_feed_network_to_ui" + str2, this.s - this.r);
            jSONObject2.put("cold_boot_feed_ui_duration" + str2, this.t - this.s);
            jSONObject2.put("cold_boot_feed_ui_to_video" + str2, this.u - this.t);
            jSONObject2.put("cold_boot_feed_video_duration" + str2, this.v - this.u);
            jSONObject2.put("cold_boot_feed_video_to_total" + str2, this.w - this.v);
            jSONObject2.put("cold_boot_ab_init_duration" + str2, this.M - this.L);
            jSONObject2.put("cold_boot_session_resume_duration" + str2, this.x - this.y);
            jSONObject2.put("cold_boot_session_pause_duration" + str2, this.z - this.A);
            jSONObject2.put("cold_boot_app_flyer_duration" + str2, this.O - this.N);
            jSONObject2.put("cold_boot_mini_app_duration" + str2, this.Q - this.P);
            jSONObject2.put("cold_boot_fresco_ensure_duration" + str2, this.C - this.B);
            jSONObject2.put("cold_boot_absdk_ensure_duration" + str2, this.E - this.D);
            jSONObject2.put("cold_boot_modules_ensure_duration" + str2, this.G - this.F);
            jSONObject3.put("category", jSONObject);
            jSONObject3.put("metric", jSONObject2);
            jSONObject4.put("placeHolder", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } catch (JSONException unused) {
        }
        n.a(str, jSONObject4, jSONObject3);
        AppLogNewUtils.onEventV3(str, jSONObject2);
        h();
    }
}
