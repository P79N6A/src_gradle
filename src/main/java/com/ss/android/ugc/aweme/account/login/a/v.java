package com.ss.android.ugc.aweme.account.login.a;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.a.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.annotation.Nonnull;

public abstract class v extends j {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32102c;

    /* renamed from: d  reason: collision with root package name */
    private k f32103d;

    public abstract void b(c<k> cVar);

    public v(@Nonnull k kVar) {
        this.f32103d = kVar;
    }

    /* renamed from: a */
    public void g(c<k> cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32102c, false, 20258, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32102c, false, 20258, new Class[]{c.class}, Void.TYPE);
            return;
        }
        super.g(cVar);
    }

    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
        c cVar = (c) baseApiResponse;
        if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f32102c, false, 20260, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f32102c, false, 20260, new Class[]{c.class, String.class}, Void.TYPE);
        } else if (cVar == null || TextUtils.isEmpty(str)) {
            b(cVar);
        } else {
            this.f32103d.a(str, cVar.errorMsg, ((k) cVar.f22251a).l, new u(this.f32103d, this, (k) cVar.f22251a));
        }
    }

    public final void a(c<k> cVar, int i) {
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32102c, false, 20259, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32102c, false, 20259, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(cVar, i);
        b(cVar);
    }
}
