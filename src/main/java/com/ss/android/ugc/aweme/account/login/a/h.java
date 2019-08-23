package com.ss.android.ugc.aweme.account.login.a;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.f.b.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.g;
import javax.annotation.Nonnull;

public abstract class h extends c {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32067c;

    /* renamed from: d  reason: collision with root package name */
    private k f32068d;

    /* renamed from: a */
    public abstract void g(com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.c> cVar);

    public abstract void b(com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.c> cVar);

    public h(@Nonnull k kVar) {
        this.f32068d = kVar;
    }

    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
        com.bytedance.sdk.account.api.call.c cVar = (com.bytedance.sdk.account.api.call.c) baseApiResponse;
        if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f32067c, false, 20228, new Class[]{com.bytedance.sdk.account.api.call.c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f32067c, false, 20228, new Class[]{com.bytedance.sdk.account.api.call.c.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            this.f32068d.a(str, cVar.errorMsg, g.m, new i(this.f32068d, this, (com.bytedance.sdk.account.f.a.c) cVar.f22251a));
        } else {
            b(cVar);
        }
    }

    public final void a(com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.c> cVar, int i) {
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32067c, false, 20227, new Class[]{com.bytedance.sdk.account.api.call.c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32067c, false, 20227, new Class[]{com.bytedance.sdk.account.api.call.c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(cVar);
    }
}
