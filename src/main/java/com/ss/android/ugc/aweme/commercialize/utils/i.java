package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class i implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39786a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f39787b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f39788c;

    i(Context context, Aweme aweme) {
        this.f39787b = context;
        this.f39788c = aweme;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39786a, false, 32378, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39786a, false, 32378, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context context = this.f39787b;
        Aweme aweme = this.f39788c;
        if (z) {
            com.ss.android.ugc.aweme.commercialize.log.g.g(context, aweme);
        } else {
            com.ss.android.ugc.aweme.commercialize.log.g.h(context, aweme);
        }
    }
}
