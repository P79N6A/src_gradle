package com.ss.android.ugc.aweme.account.login.a;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.b.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class d extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32055c;

    /* renamed from: d  reason: collision with root package name */
    private k f32056d;

    /* renamed from: a */
    public abstract void g(c<com.bytedance.sdk.account.f.a.a> cVar);

    public abstract void b(c<com.bytedance.sdk.account.f.a.a> cVar);

    public d(k kVar) {
        this.f32056d = kVar;
    }

    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
        c cVar = (c) baseApiResponse;
        if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f32055c, false, 20219, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f32055c, false, 20219, new Class[]{c.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            this.f32056d.a(str, cVar.errorMsg, ((com.bytedance.sdk.account.f.a.a) cVar.f22251a).l, new e(this.f32056d, this, (com.bytedance.sdk.account.f.a.a) cVar.f22251a));
        } else {
            b(cVar);
        }
    }

    public final void a(c<com.bytedance.sdk.account.f.a.a> cVar, int i) {
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32055c, false, 20218, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32055c, false, 20218, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(cVar);
    }
}
