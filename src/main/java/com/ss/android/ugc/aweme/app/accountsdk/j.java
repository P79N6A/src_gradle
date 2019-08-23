package com.ss.android.ugc.aweme.app.accountsdk;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class j extends d {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f33733e;

    public j(boolean z) {
        super(z);
    }

    public final void a(int i, int i2, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f33733e, false, 22997, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f33733e, false, 22997, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        super.a(i, i2, str);
    }
}
