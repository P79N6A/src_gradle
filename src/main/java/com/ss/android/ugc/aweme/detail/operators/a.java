package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public abstract class a<MODEL extends com.ss.android.ugc.aweme.common.f.a, PRESENTER extends b<MODEL>> implements s.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f41199b;

    /* renamed from: c  reason: collision with root package name */
    protected MODEL f41200c;

    /* renamed from: d  reason: collision with root package name */
    protected PRESENTER f41201d;

    public int a(int i) {
        return -1;
    }

    public boolean a(@NonNull Fragment fragment) {
        return true;
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f41199b, false, 34746, new Class[0], Boolean.TYPE)) {
            return this.f41200c.isDataEmpty();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41199b, false, 34746, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f41199b, false, 34747, new Class[0], Boolean.TYPE)) {
            return this.f41201d.m();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41199b, false, 34747, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41199b, false, 34749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41199b, false, 34749, new Class[0], Void.TYPE);
            return;
        }
        this.f41201d.k();
        this.f41201d.j();
    }

    public void a(@NonNull DetailFragmentPanel detailFragmentPanel) {
        if (PatchProxy.isSupport(new Object[]{detailFragmentPanel}, this, f41199b, false, 34744, new Class[]{DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{detailFragmentPanel}, this, f41199b, false, 34744, new Class[]{DetailFragmentPanel.class}, Void.TYPE);
            return;
        }
        this.f41201d.a(detailFragmentPanel);
        this.f41201d.a((d) detailFragmentPanel);
        this.f41201d.a(this.f41200c);
    }

    public final boolean a(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f41199b, false, 34748, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f41199b, false, 34748, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str2);
        if (b2 == null) {
            b2 = com.ss.android.ugc.aweme.feed.a.a().a(str2);
        }
        if (b2 == null) {
            return false;
        }
        return this.f41201d.a((Object) b2);
    }

    public void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41199b, false, 34745, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41199b, false, 34745, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41201d.a(Integer.valueOf(i));
    }
}
