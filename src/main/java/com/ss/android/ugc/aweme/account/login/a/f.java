package com.ss.android.ugc.aweme.account.login.a;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.b.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.g;
import javax.annotation.Nonnull;

public abstract class f extends b {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f32061e;

    /* renamed from: c  reason: collision with root package name */
    private k f32062c;

    /* renamed from: a */
    public abstract void g(c<com.bytedance.sdk.account.f.a.b> cVar);

    public abstract void b(c<com.bytedance.sdk.account.f.a.b> cVar);

    public f(@Nonnull k kVar) {
        this.f32062c = kVar;
    }

    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
        c cVar = (c) baseApiResponse;
        if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f32061e, false, 20222, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f32061e, false, 20222, new Class[]{c.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            this.f32062c.a(str, cVar.errorMsg, g.i, new g(this.f32062c, this, (com.bytedance.sdk.account.f.a.b) cVar.f22251a));
        } else {
            b(cVar);
        }
    }

    public final void a(c<com.bytedance.sdk.account.f.a.b> cVar, int i) {
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32061e, false, 20221, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32061e, false, 20221, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(cVar);
    }
}
