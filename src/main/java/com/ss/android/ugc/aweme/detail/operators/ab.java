package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.sticker.prop.a.b;

public final class ab extends a<b, com.ss.android.ugc.aweme.common.f.b<b>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41205a;

    public final int a(int i) {
        return i + 10000;
    }

    public ab(@Nullable a aVar) {
        b bVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
        } else {
            bVar = new b();
        }
        this.f41200c = bVar;
        this.f41201d = new com.ss.android.ugc.aweme.common.f.b();
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41205a, false, 34849, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41205a, false, 34849, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41201d.a(Integer.valueOf(i), bVar.getStickerId(), Integer.valueOf(bVar.getVideoType()));
    }
}
