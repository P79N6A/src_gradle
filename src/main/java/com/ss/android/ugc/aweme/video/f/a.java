package com.ss.android.ugc.aweme.video.f;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.preload.g;
import com.toutiao.proxyserver.Proxy;
import java.lang.ref.WeakReference;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76069a = null;
    private static final String u = "a";

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f76070b;

    /* renamed from: c  reason: collision with root package name */
    public long f76071c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f76072d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f76073e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f76074f;
    public boolean g;
    public int h;
    public int i = -1;
    public long j = -1;
    public int k;
    public float l;
    public String m;
    String n;
    public String o;
    public String p;
    public boolean q;
    public String r;
    public boolean s;
    public String t;
    private C0793a v;
    private b w;
    private SparseArray<View> x = new SparseArray<>();

    /* renamed from: com.ss.android.ugc.aweme.video.f.a$a  reason: collision with other inner class name */
    static class C0793a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76075a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<a> f76076b;

        C0793a(a aVar) {
            this.f76076b = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            String str;
            String str2;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f76075a, false, 89350, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f76075a, false, 89350, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            a aVar = null;
            if (this.f76076b != null) {
                aVar = (a) this.f76076b.get();
            }
            if (aVar != null && message2.what == 1) {
                if (PatchProxy.isSupport(new Object[0], aVar, a.f76069a, false, 89338, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f76069a, false, 89338, new Class[0], Void.TYPE);
                } else {
                    o b2 = o.b();
                    aVar.a(C0906R.string.c9d, aVar.p);
                    if (aVar.o == null || aVar.o.length() <= 25) {
                        aVar.a(C0906R.string.dpc, aVar.o);
                    } else {
                        aVar.a(C0906R.string.dpc, aVar.o.substring(0, 25) + "\n" + aVar.o.substring(25, aVar.o.length()));
                    }
                    aVar.a(C0906R.string.afc, String.valueOf(aVar.f76074f) + "ms");
                    aVar.a(C0906R.string.os, String.valueOf(aVar.f76072d));
                    aVar.a(C0906R.string.ot, String.valueOf(aVar.f76071c) + "ms");
                    aVar.a(C0906R.string.b9f, String.valueOf(aVar.f76073e));
                    aVar.a(C0906R.string.p7, String.valueOf(aVar.i));
                    aVar.a(C0906R.string.drt, String.valueOf(aVar.j));
                    aVar.a(C0906R.string.c9n, aVar.t);
                    aVar.a(C0906R.string.b3k, String.valueOf(aVar.g));
                    aVar.a(C0906R.string.bn4, String.valueOf(b2.m()));
                    aVar.a(C0906R.string.dpr, String.valueOf(Proxy.k));
                    aVar.a(C0906R.string.bmz, String.valueOf(aVar.l));
                    aVar.a(C0906R.string.b1y, String.valueOf(aVar.h) + "KBps");
                    aVar.a(C0906R.string.n_, String.valueOf(aVar.k));
                    if (aVar.m != null) {
                        aVar.a(C0906R.string.nb, aVar.m);
                    }
                    if (PatchProxy.isSupport(new Object[0], aVar, a.f76069a, false, 89346, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], aVar, a.f76069a, false, 89346, new Class[0], String.class);
                    } else {
                        RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.a().f76001b;
                        if (rateSettingsResponse != null) {
                            if (rateSettingsResponse.getAdaptiveGearGroup() != null) {
                                str = r1.a() + "\n" + r1.b().toString();
                            }
                        }
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        aVar.a(C0906R.string.na, str);
                    }
                    aVar.a(C0906R.string.afb, aVar.n);
                    aVar.a(C0906R.string.cgk, String.valueOf(o.b().f76180b));
                    o.b();
                    aVar.a(C0906R.string.bcv, String.valueOf(o.f76179d));
                    aVar.a(C0906R.string.cgj, aVar.q + ",enable=" + SharePrefCache.inst().getEableUltraResolution().c() + "\n" + AbTestManager.a().bn() + "," + AbTestManager.a().bm() + "," + AbTestManager.a().bo());
                    aVar.a(C0906R.string.dpn, String.valueOf(aVar.s));
                    if (aVar.r == null || aVar.r.length() <= 120) {
                        str2 = aVar.r;
                    } else {
                        str2 = aVar.r.substring(0, 120);
                    }
                    aVar.a(C0906R.string.bn6, str2);
                    aVar.a(C0906R.string.bn5, o.b().s());
                    aVar.a(C0906R.string.bqd, g.f().h().getClass().getSimpleName());
                }
                removeMessages(1);
                if (!aVar.f76070b) {
                    sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76069a, false, 89342, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76069a, false, 89342, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f76070b = !z;
        if (z) {
            this.v.sendEmptyMessageDelayed(1, 1000);
        } else {
            this.v.removeMessages(1);
        }
    }

    public a(Context context, FrameLayout frameLayout) {
        this.w = new b(context);
        frameLayout.addView(this.w.f76078b, new FrameLayout.LayoutParams(-1, -1));
        this.v = new C0793a(this);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f76069a, false, 89341, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f76069a, false, 89341, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        View view = this.x.get(i2);
        if (view == null) {
            this.x.put(i2, this.w.a(i2, str));
            return;
        }
        this.w.a(view, str);
    }
}
