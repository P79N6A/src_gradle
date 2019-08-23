package com.ss.android.ugc.aweme.newfollow.util;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class m implements h {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f57447d;

    /* renamed from: e  reason: collision with root package name */
    public int f57448e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f57449f;
    public boolean g;

    public abstract Rect a();

    public void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57447d, false, 61974, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57447d, false, 61974, new Class[]{Integer.TYPE}, Void.TYPE);
        }
    }

    public boolean d() {
        return false;
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public final void e() {
        this.f57448e = 0;
        this.f57449f = false;
    }
}
