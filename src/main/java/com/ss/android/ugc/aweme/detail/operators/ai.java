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

public final class ai implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41213a;

    /* renamed from: b  reason: collision with root package name */
    private a f41214b;

    /* renamed from: c  reason: collision with root package name */
    private b f41215c = new b();

    public final int a(int i) {
        return 9;
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f41213a, false, 34883, new Class[0], Boolean.TYPE)) {
            return this.f41214b.isDataEmpty();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41213a, false, 34883, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f41213a, false, 34884, new Class[0], Boolean.TYPE)) {
            return this.f41215c.m();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41213a, false, 34884, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41213a, false, 34886, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41213a, false, 34886, new Class[0], Void.TYPE);
            return;
        }
        this.f41215c.k();
        this.f41215c.j();
    }

    public final boolean a(@NonNull Fragment fragment) {
        if (this.f41214b != null) {
            return true;
        }
        return false;
    }

    public ai(@Nullable a aVar) {
        this.f41214b = aVar;
    }

    public final void a(@NonNull DetailFragmentPanel detailFragmentPanel) {
        if (PatchProxy.isSupport(new Object[]{detailFragmentPanel}, this, f41213a, false, 34881, new Class[]{DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{detailFragmentPanel}, this, f41213a, false, 34881, new Class[]{DetailFragmentPanel.class}, Void.TYPE);
            return;
        }
        this.f41215c.a(detailFragmentPanel);
        this.f41215c.a((d) detailFragmentPanel);
        this.f41215c.a(this.f41214b);
    }

    public final boolean a(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f41213a, false, 34885, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f41213a, false, 34885, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str2);
        if (b2 == null) {
            b2 = com.ss.android.ugc.aweme.feed.a.a().a(str2);
        }
        if (b2 == null) {
            return false;
        }
        return this.f41215c.a((Object) b2);
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41213a, false, 34882, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41213a, false, 34882, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41215c.b();
    }
}
