package com.ss.android.ugc.aweme.account.login.a;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.a.j;
import com.bytedance.sdk.account.f.b.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.annotation.Nonnull;

public abstract class q extends h {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32086c;

    /* renamed from: d  reason: collision with root package name */
    private k f32087d;

    /* renamed from: a */
    public abstract void g(c<j> cVar);

    public abstract void b(c<j> cVar);

    public q(@Nonnull k kVar) {
        this.f32087d = kVar;
    }

    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
        c cVar = (c) baseApiResponse;
        if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f32086c, false, 20248, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f32086c, false, 20248, new Class[]{c.class, String.class}, Void.TYPE);
        } else if (cVar == null || TextUtils.isEmpty(str)) {
            b(cVar);
        } else {
            this.f32087d.a(str, cVar.errorMsg, ((j) cVar.f22251a).l, new r(this.f32087d, this, (j) cVar.f22251a));
        }
    }

    public final void a(c<j> cVar, int i) {
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32086c, false, 20247, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32086c, false, 20247, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(cVar);
    }
}
