package com.ss.android.ugc.aweme.account.login.a;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.a.h;
import com.bytedance.sdk.account.f.b.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.w;
import javax.annotation.Nonnull;

public abstract class o extends f {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32080c;

    /* renamed from: d  reason: collision with root package name */
    protected k f32081d;

    public void b(c<h> cVar) {
    }

    public o(@Nonnull k kVar) {
        this.f32081d = kVar;
    }

    /* renamed from: a */
    public void g(c<h> cVar) {
        c<h> cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f32080c, false, 20237, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f32080c, false, 20237, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (!(cVar2.f22251a == null || ((h) cVar2.f22251a).f22382d == null)) {
            w.a(((h) cVar2.f22251a).a());
            n.d(true);
        }
    }

    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
        c cVar = (c) baseApiResponse;
        if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f32080c, false, 20239, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f32080c, false, 20239, new Class[]{c.class, String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str)) {
            b(cVar);
        } else {
            String valueOf = String.valueOf(cVar.error);
            String str2 = cVar.errorMsg;
            a.a(valueOf, str2, null, null, "on need captcha:" + str);
            this.f32081d.a(str, cVar.errorMsg, ((h) cVar.f22251a).l, new p(this.f32081d, this, (h) cVar.f22251a));
        }
    }

    public final void a(c<h> cVar, int i) {
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32080c, false, 20238, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32080c, false, 20238, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(cVar);
    }
}
