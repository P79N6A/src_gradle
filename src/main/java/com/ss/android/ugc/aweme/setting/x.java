package com.ss.android.ugc.aweme.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64467a;

    /* renamed from: b  reason: collision with root package name */
    public int f64468b;

    /* renamed from: c  reason: collision with root package name */
    public int f64469c;

    /* renamed from: d  reason: collision with root package name */
    public int f64470d;

    /* renamed from: e  reason: collision with root package name */
    public int f64471e;

    /* renamed from: f  reason: collision with root package name */
    public int f64472f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    private int n;
    private int o;
    private int p;

    public final int a() {
        return this.n * 1024;
    }

    public final int b() {
        return this.o * 1024;
    }

    public final int c() {
        return this.p * 1024;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f64467a, false, 72100, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f64467a, false, 72100, new Class[0], String.class);
        }
        return "SmartPreload{lowSpeed=" + this.n + ", normalSpeed=" + this.o + ", highSpeed=" + this.p + ", lowPoint=" + this.f64468b + ", lowPreloadSize=" + this.f64469c + ", lowPreloadNumber=" + this.f64470d + ", middlePoint=" + this.f64471e + ", middlePreloadSize=" + this.f64472f + ", middlePreloadNumber=" + this.g + ", normalPoint=" + this.h + ", normalPreloadSize=" + this.i + ", normalPreloadNumber=" + this.j + ", highPoint=" + this.k + ", highPreloadSize=" + this.l + ", highPreloadNumber=" + this.m + '}';
    }
}
