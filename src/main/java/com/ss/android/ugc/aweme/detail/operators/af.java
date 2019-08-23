package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.e.g;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.newfollow.userstate.a;

public final class af extends a<a, g> implements s.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41209a;

    public final int a(int i) {
        return 1;
    }

    public final void a(x xVar) {
        ((g) this.f41201d).f41186b = xVar;
    }

    public final void a(boolean z) {
        ((g) this.f41201d).g = true;
    }

    public af(@Nullable com.ss.android.ugc.aweme.common.f.a aVar) {
        a aVar2;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
        } else {
            aVar2 = new a();
        }
        this.f41200c = aVar2;
        this.f41201d = new g();
    }

    public final void a(int i, @NonNull b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41209a, false, 34856, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41209a, false, 34856, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((g) this.f41201d).a(Integer.valueOf(i), bVar.getUid());
    }
}
