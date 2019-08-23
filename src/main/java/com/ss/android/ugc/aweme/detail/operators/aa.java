package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class aa implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41202a;

    /* renamed from: b  reason: collision with root package name */
    private a f41203b;

    /* renamed from: c  reason: collision with root package name */
    private b f41204c;

    public final int a(int i) {
        return 16;
    }

    public final boolean a(@NonNull Fragment fragment) {
        return true;
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f41202a, false, 34845, new Class[0], Boolean.TYPE)) {
            return this.f41203b.isDataEmpty();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41202a, false, 34845, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f41202a, false, 34846, new Class[0], Boolean.TYPE)) {
            return this.f41204c.m();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41202a, false, 34846, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41202a, false, 34848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41202a, false, 34848, new Class[0], Void.TYPE);
            return;
        }
        this.f41204c.k();
        this.f41204c.j();
    }

    public aa(@Nullable a aVar) {
        if (aVar == null) {
            this.f41203b = new com.ss.android.ugc.aweme.similarvideo.b.a();
            this.f41204c = new com.ss.android.ugc.aweme.similarvideo.b.b();
            return;
        }
        this.f41203b = aVar;
        this.f41204c = new com.ss.android.ugc.aweme.similarvideo.b.b();
    }

    public final void a(@NonNull DetailFragmentPanel detailFragmentPanel) {
        if (PatchProxy.isSupport(new Object[]{detailFragmentPanel}, this, f41202a, false, 34843, new Class[]{DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{detailFragmentPanel}, this, f41202a, false, 34843, new Class[]{DetailFragmentPanel.class}, Void.TYPE);
            return;
        }
        this.f41204c.a(detailFragmentPanel);
        this.f41204c.a((d) detailFragmentPanel);
        this.f41204c.a(this.f41203b);
    }

    public final boolean a(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f41202a, false, 34847, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f41202a, false, 34847, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str2);
        if (b2 == null) {
            b2 = com.ss.android.ugc.aweme.feed.a.a().a(str2);
        }
        if (b2 == null) {
            return false;
        }
        return this.f41204c.a((Object) b2);
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41202a, false, 34844, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41202a, false, 34844, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41204c.a(Integer.valueOf(i));
    }
}
