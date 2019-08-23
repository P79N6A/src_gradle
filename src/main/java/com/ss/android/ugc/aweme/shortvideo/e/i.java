package com.ss.android.ugc.aweme.shortvideo.e;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ea;

public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66821a;

    private long a() {
        if (PatchProxy.isSupport(new Object[0], this, f66821a, false, 75296, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66821a, false, 75296, new Class[0], Long.TYPE)).longValue();
        } else if (a.L.a(e.a.DurationMode)) {
            return a.L.c(e.a.LongVideoThreshold);
        } else {
            return ea.f66827f;
        }
    }

    public final long a(@Nullable String str) {
        long j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f66821a, false, 75295, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, f66821a, false, 75295, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        long a2 = a();
        if (!TextUtils.isEmpty(str)) {
            j = (long) a.i.b(str2);
        } else {
            j = -1;
        }
        if (j == -1) {
            return a2;
        }
        return Math.min(a2, j);
    }
}
