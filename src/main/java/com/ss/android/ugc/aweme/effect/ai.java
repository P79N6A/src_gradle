package com.ss.android.ugc.aweme.effect;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.u;
import com.ss.android.vesdk.p;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.Nullable;

public final class ai implements u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43695a;

    /* renamed from: b  reason: collision with root package name */
    p f43696b;

    /* renamed from: c  reason: collision with root package name */
    boolean f43697c;

    /* renamed from: d  reason: collision with root package name */
    private i<Boolean> f43698d;

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f43695a, false, 38792, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f43695a, false, 38792, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (c() != null) {
            z = true;
        }
        return z;
    }

    @Nullable
    public final String[] c() {
        if (!PatchProxy.isSupport(new Object[0], this, f43695a, false, 38794, new Class[0], String[].class)) {
            return this.f43696b.n();
        }
        return (String[]) PatchProxy.accessDispatch(new Object[0], this, f43695a, false, 38794, new Class[0], String[].class);
    }

    @Nullable
    public final String[] d() {
        if (!PatchProxy.isSupport(new Object[0], this, f43695a, false, 38795, new Class[0], String[].class)) {
            return this.f43696b.p();
        }
        return (String[]) PatchProxy.accessDispatch(new Object[0], this, f43695a, false, 38795, new Class[0], String[].class);
    }

    @Nullable
    public final String[] e() {
        if (!PatchProxy.isSupport(new Object[0], this, f43695a, false, 38796, new Class[0], String[].class)) {
            return this.f43696b.o();
        }
        return (String[]) PatchProxy.accessDispatch(new Object[0], this, f43695a, false, 38796, new Class[0], String[].class);
    }

    public final i<Boolean> a() {
        if (PatchProxy.isSupport(new Object[0], this, f43695a, false, 38791, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, f43695a, false, 38791, new Class[0], i.class);
        }
        if (this.f43698d == null) {
            if (this.f43696b.n() != null) {
                this.f43697c = true;
                return i.a(Boolean.TRUE);
            }
            this.f43698d = i.a((Callable<TResult>) new aj<TResult>(this));
        }
        return this.f43698d;
    }

    public ai(p pVar) {
        this.f43696b = pVar;
    }
}
