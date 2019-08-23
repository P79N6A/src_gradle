package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.feed.h.af;
import com.ss.android.ugc.aweme.feed.h.ag;
import com.ss.android.ugc.aweme.feed.param.b;

public final class ae extends a<af, ag> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41208a;

    public final int a(int i) {
        return 10001000;
    }

    public ae(@Nullable a aVar) {
        af afVar;
        if (aVar instanceof af) {
            afVar = (af) aVar;
        } else {
            afVar = new af();
        }
        this.f41200c = afVar;
    }

    public final boolean a(@NonNull Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f41208a, false, 34854, new Class[]{Fragment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragment2}, this, f41208a, false, 34854, new Class[]{Fragment.class}, Boolean.TYPE)).booleanValue();
        }
        this.f41201d = new ag(fragment2);
        return true;
    }

    public final void a(int i, @NonNull b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41208a, false, 34855, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41208a, false, 34855, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((ag) this.f41201d).a(Integer.valueOf(i), bVar.getRelatedId());
    }
}
