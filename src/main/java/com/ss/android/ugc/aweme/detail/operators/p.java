package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.param.b;

public final class p extends b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41275c;

    public final int a(int i) {
        return i + 4000;
    }

    public p(@Nullable String str) {
        super(str);
    }

    public final void a(int i, @NonNull b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41275c, false, 34821, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41275c, false, 34821, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41217b.f41180b = bVar.getPageType();
        super.a(i, bVar, i2, z);
    }
}
