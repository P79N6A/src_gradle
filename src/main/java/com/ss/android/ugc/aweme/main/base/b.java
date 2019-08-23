package com.ss.android.ugc.aweme.main.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54424a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f54425b;

    /* renamed from: c  reason: collision with root package name */
    private String f54426c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f54427d;

    public abstract void a(int i);

    public abstract void b();

    public abstract void c();

    public abstract void e();

    public abstract void f();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public String getTabType() {
        return this.f54426c;
    }

    public boolean isSelected() {
        return this.f54427d;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54424a, false, 57784, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54424a, false, 57784, new Class[0], Void.TYPE);
            return;
        }
        setSelected(false);
        if (this.f54425b) {
            c();
        } else {
            b();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f54424a, false, 57785, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54424a, false, 57785, new Class[0], Void.TYPE);
            return;
        }
        setSelected(true);
        if (this.f54425b) {
            f();
        } else {
            e();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f54424a, false, 57786, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54424a, false, 57786, new Class[0], Void.TYPE);
        } else if (!this.f54425b) {
            this.f54425b = true;
            h();
        }
    }

    public void setRefreshing(boolean z) {
        this.f54425b = z;
    }

    public void setSelected(boolean z) {
        this.f54427d = z;
    }

    public b(@NonNull Context context, @TabType String str) {
        super(context);
        this.f54426c = str;
        setClipChildren(false);
    }
}
