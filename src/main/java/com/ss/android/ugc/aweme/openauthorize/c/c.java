package com.ss.android.ugc.aweme.openauthorize.c;

import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.account.b.a.a;
import com.bytedance.sdk.account.b.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58371a;

    /* renamed from: b  reason: collision with root package name */
    private Context f58372b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.sdk.account.bdplatform.a.c f58373c;

    c(Context context, com.bytedance.sdk.account.bdplatform.a.c cVar) {
        this.f58372b = context;
        this.f58373c = cVar;
    }

    public final boolean a(Intent intent, a aVar) {
        Intent intent2 = intent;
        a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{intent2, aVar2}, this, f58371a, false, 63398, new Class[]{Intent.class, a.class}, Boolean.TYPE)) {
            return this.f58373c.a(intent2, aVar2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent2, aVar2}, this, f58371a, false, 63398, new Class[]{Intent.class, a.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(com.bytedance.sdk.account.b.c.a aVar, b bVar) {
        com.bytedance.sdk.account.b.c.a aVar2 = aVar;
        b bVar2 = bVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2, bVar2}, this, f58371a, false, 63399, new Class[]{com.bytedance.sdk.account.b.c.a.class, b.class}, Boolean.TYPE)) {
            return this.f58373c.a(aVar2, bVar2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, bVar2}, this, f58371a, false, 63399, new Class[]{com.bytedance.sdk.account.b.c.a.class, b.class}, Boolean.TYPE)).booleanValue();
    }
}
