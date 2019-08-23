package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class k implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39791a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f39792b;

    /* renamed from: c  reason: collision with root package name */
    private final j f39793c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f39794d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f39795e;

    k(Context context, j jVar, Aweme aweme, boolean z) {
        this.f39792b = context;
        this.f39793c = jVar;
        this.f39794d = aweme;
        this.f39795e = z;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39791a, false, 32380, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39791a, false, 32380, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context context = this.f39792b;
        j jVar = this.f39793c;
        Aweme aweme = this.f39794d;
        boolean z2 = this.f39795e;
        if (z) {
            com.ss.android.ugc.aweme.commercialize.log.g.a("deeplink_success", context, jVar, aweme, z2);
        } else {
            com.ss.android.ugc.aweme.commercialize.log.g.a("deeplink_failed", context, jVar, aweme, z2);
        }
    }
}
