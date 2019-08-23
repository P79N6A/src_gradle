package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.e.h;
import com.ss.android.ugc.aweme.detail.e.i;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.param.b;
import java.lang.ref.WeakReference;

public final class e implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41223a;

    /* renamed from: b  reason: collision with root package name */
    private h f41224b = new h();

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<DetailFragmentPanel> f41225c = null;

    /* renamed from: d  reason: collision with root package name */
    private i f41226d = new i();

    public final int a(int i) {
        return 7000;
    }

    public final boolean a() {
        return true;
    }

    public final boolean a(@NonNull Fragment fragment) {
        return true;
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f41223a, false, 34763, new Class[0], Boolean.TYPE)) {
            return this.f41226d.m();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41223a, false, 34763, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41223a, false, 34765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41223a, false, 34765, new Class[0], Void.TYPE);
            return;
        }
        this.f41225c = null;
        this.f41226d.k();
        this.f41226d.j();
    }

    public final void a(@NonNull DetailFragmentPanel detailFragmentPanel) {
        if (PatchProxy.isSupport(new Object[]{detailFragmentPanel}, this, f41223a, false, 34761, new Class[]{DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{detailFragmentPanel}, this, f41223a, false, 34761, new Class[]{DetailFragmentPanel.class}, Void.TYPE);
            return;
        }
        this.f41225c = new WeakReference<>(detailFragmentPanel);
        this.f41226d.a(detailFragmentPanel);
        this.f41226d.a(this.f41224b);
    }

    public final boolean a(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f41223a, false, 34764, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f41223a, false, 34764, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!(this.f41225c == null || this.f41225c.get() == null)) {
            ((DetailFragmentPanel) this.f41225c.get()).m();
        }
        return false;
    }

    public final void a(int i, @NonNull b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41223a, false, 34762, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41223a, false, 34762, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41226d.a(bVar.getAid(), bVar.getEventType());
    }
}
