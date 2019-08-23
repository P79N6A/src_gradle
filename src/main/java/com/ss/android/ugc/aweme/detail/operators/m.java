package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.hotsearch.b.b;

public final class m extends a<b, com.ss.android.ugc.aweme.common.f.b<b>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41239a;

    /* renamed from: e  reason: collision with root package name */
    private String f41240e;

    public final int a(int i) {
        return 13;
    }

    public m(@Nullable a aVar, @NonNull String str) {
        b bVar;
        this.f41240e = str;
        if (aVar instanceof b) {
            bVar = (b) aVar;
        } else {
            bVar = new b();
        }
        this.f41200c = bVar;
        this.f41201d = new com.ss.android.ugc.aweme.common.f.b();
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41239a, false, 34781, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41239a, false, 34781, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (TextUtils.equals(this.f41240e, "from_hot_search_aweme")) {
            this.f41201d.a(1);
        } else {
            if (TextUtils.equals(this.f41240e, "from_hot_search_positive_aweme")) {
                this.f41201d.a(1, 1);
            }
        }
    }
}
