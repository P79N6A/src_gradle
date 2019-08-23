package com.ss.android.ugc.aweme.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.o;

public class b<T extends a, K extends o> implements p {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f2977d;

    /* renamed from: e  reason: collision with root package name */
    public T f2978e;

    /* renamed from: f  reason: collision with root package name */
    public K f2979f;

    public void a(Exception exc) {
    }

    public void b() {
    }

    public void n_() {
    }

    public T i() {
        return this.f2978e;
    }

    public final boolean l() {
        if (this.f2979f != null) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.f2978e == null || !this.f2978e.mIsLoading) {
            return false;
        }
        return true;
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, f2977d, false, 33201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2977d, false, 33201, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e != null) {
            this.f2978e.clearNotifyListener(this);
            this.f2978e = null;
        }
    }

    public void k() {
        if (PatchProxy.isSupport(new Object[0], this, f2977d, false, 33203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2977d, false, 33203, new Class[0], Void.TYPE);
            return;
        }
        this.f2979f = null;
        j();
    }

    public void a(K k) {
        this.f2979f = k;
    }

    public void a(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f2977d, false, 33200, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f2977d, false, 33200, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f2978e = t;
        this.f2978e.addNotifyListener(this);
    }

    public boolean a(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f2977d, false, 33204, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f2977d, false, 33204, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (this.f2978e == null || m() || !this.f2978e.sendRequest(objArr)) {
            return false;
        } else {
            n_();
            return true;
        }
    }
}
