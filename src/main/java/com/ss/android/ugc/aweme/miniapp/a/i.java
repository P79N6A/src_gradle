package com.ss.android.ugc.aweme.miniapp.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.a.g;

public final /* synthetic */ class i implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55443a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f55444b;

    /* renamed from: c  reason: collision with root package name */
    private final long f55445c;

    /* renamed from: d  reason: collision with root package name */
    private final String f55446d;

    public i(Context context, long j, String str) {
        this.f55444b = context;
        this.f55445c = j;
        this.f55446d = str;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f55443a, false, 59153, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f55443a, false, 59153, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context context = this.f55444b;
        long j = this.f55445c;
        String str = this.f55446d;
        if (z) {
            g.a(context, "deeplink_success", j, str);
        } else {
            g.a(context, "deeplink_failed", j, str);
        }
    }
}
