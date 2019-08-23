package com.bytedance.android.livesdk.floatwindow;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14567a;

    /* renamed from: b  reason: collision with root package name */
    public static Map<String, b> f14568b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static String f14569c = "live_default_window";

    /* renamed from: d  reason: collision with root package name */
    private static a f14570d = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14571a;

        /* renamed from: b  reason: collision with root package name */
        Context f14572b;

        /* renamed from: c  reason: collision with root package name */
        View f14573c;

        /* renamed from: d  reason: collision with root package name */
        int f14574d;

        /* renamed from: e  reason: collision with root package name */
        int f14575e = -2;

        /* renamed from: f  reason: collision with root package name */
        int f14576f = -2;
        int g = 8388659;
        int h;
        int i;
        boolean j = true;
        Class[] k;
        int l = 3;
        int m;
        int n;
        long o = 300;
        TimeInterpolator p;
        String q = h.f14569c;
        boolean r;
        d s;
        e t;

        private a() {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f14571a, false, 9098, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14571a, false, 9098, new Class[0], Void.TYPE);
            } else if (h.f14568b.containsKey(this.q)) {
                throw new IllegalArgumentException("Float window has been added!");
            } else if (this.f14573c == null && this.f14574d == 0) {
                throw new IllegalArgumentException("view can not be null!");
            } else {
                if (this.f14573c == null) {
                    this.f14573c = ((LayoutInflater) this.f14572b.getSystemService("layout_inflater")).inflate(this.f14574d, null);
                }
                h.f14568b.put(this.q, new g(this));
            }
        }

        public final a a(int i2) {
            this.f14575e = i2;
            return this;
        }

        public final a b(int i2) {
            this.f14576f = i2;
            return this;
        }

        public final a c(int i2) {
            this.l = 2;
            return this;
        }

        public final a a(View view) {
            this.f14573c = view;
            return this;
        }

        a(Context context) {
            this.f14572b = context;
        }

        public final a a(e eVar) {
            this.t = eVar;
            return this;
        }

        public final a a(String str) {
            this.q = str;
            return this;
        }

        public final a a(boolean z) {
            this.r = true;
            return this;
        }

        public final a a(int i2, int i3) {
            this.m = 0;
            this.n = 0;
            return this;
        }

        public final a a(long j2, TimeInterpolator timeInterpolator) {
            this.o = 300;
            this.p = timeInterpolator;
            return this;
        }

        public final a a(int i2, float f2) {
            if (PatchProxy.isSupport(new Object[]{0, Float.valueOf(0.1f)}, this, f14571a, false, 9096, new Class[]{Integer.TYPE, Float.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{0, Float.valueOf(0.1f)}, this, f14571a, false, 9096, new Class[]{Integer.TYPE, Float.TYPE}, a.class);
            }
            this.h = (int) (((float) UIUtils.getScreenWidth(this.f14572b)) * 0.1f);
            return this;
        }

        public final a b(int i2, float f2) {
            if (PatchProxy.isSupport(new Object[]{1, Float.valueOf(f2)}, this, f14571a, false, 9097, new Class[]{Integer.TYPE, Float.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{1, Float.valueOf(f2)}, this, f14571a, false, 9097, new Class[]{Integer.TYPE, Float.TYPE}, a.class);
            }
            this.i = (int) (((float) UIUtils.getScreenHeight(this.f14572b)) * f2);
            return this;
        }
    }

    @MainThread
    public static a a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14567a, true, 9092, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f14567a, true, 9092, new Class[]{Context.class}, a.class);
        }
        a aVar = new a(context2);
        f14570d = aVar;
        return aVar;
    }

    @Nullable
    public static b a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f14567a, true, 9091, new Class[]{String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str2}, null, f14567a, true, 9091, new Class[]{String.class}, b.class);
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            return f14568b.get(str2);
        }
    }
}
