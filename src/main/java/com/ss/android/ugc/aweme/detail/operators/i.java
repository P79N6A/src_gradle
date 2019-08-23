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

public final class i extends a<g, m> implements s.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41234a;

    public final int a(int i) {
        return 1;
    }

    public final void a(x xVar) {
        ((m) this.f41201d).f45510b = xVar;
    }

    public final void a(boolean z) {
        ((m) this.f41201d).g = true;
    }

    public i(@Nullable a aVar) {
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
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f41234a, false, 34773, new Class[]{Fragment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragment2}, this, f41234a, false, 34773, new Class[]{Fragment.class}, Boolean.TYPE)).booleanValue();
        }
        this.f41201d = new m(fragment2);
        return true;
    }

    public final void a(int i, @NonNull b bVar, int i2, boolean z) {
        int i3 = i;
        int i4 = 1;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41234a, false, 34774, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41234a, false, 34774, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        m mVar = (m) this.f41201d;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = 1;
        if (i3 != 4) {
            switch (i3) {
                case 2:
                    i4 = 3;
                    break;
            }
        } else {
            i4 = 2;
        }
        objArr[2] = Integer.valueOf(i4);
        mVar.a(objArr);
    }
}
