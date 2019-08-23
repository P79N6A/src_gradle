package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.poi.model.j;

public final class v extends a<j, b<j>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41281a;

    public v(@Nullable a aVar) {
        j jVar;
        if (aVar instanceof j) {
            jVar = (j) aVar;
        } else {
            jVar = new j();
        }
        this.f41200c = jVar;
        this.f41201d = new b();
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41281a, false, 34830, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41281a, false, 34830, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41201d.a(Integer.valueOf(i), bVar.getPoiId(), Integer.valueOf(i2), Boolean.FALSE);
    }
}
