package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.feed.h.m;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.feed.param.b;

public final class r extends a<g, m> implements s.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41277a;

    public final int a(int i) {
        return 7;
    }

    public final void a(x xVar) {
        ((m) this.f41201d).f45510b = xVar;
    }

    public final void a(boolean z) {
        ((m) this.f41201d).g = true;
    }

    public r(@Nullable a aVar) {
        g gVar;
        if (aVar instanceof g) {
            gVar = (g) aVar;
        } else {
            gVar = new g(6);
        }
        this.f41200c = gVar;
    }

    public final boolean a(@NonNull Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f41277a, false, 34823, new Class[]{Fragment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragment2}, this, f41277a, false, 34823, new Class[]{Fragment.class}, Boolean.TYPE)).booleanValue();
        }
        this.f41201d = new m(fragment2);
        return true;
    }

    public final void a(int i, @NonNull b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41277a, false, 34824, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41277a, false, 34824, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((m) this.f41201d).a(Integer.valueOf(i), 7, 0);
    }
}
