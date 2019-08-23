package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.CallSuper;
import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.a.e;
import com.bytedance.sdk.account.f.b.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.w;
import javax.annotation.Nonnull;

public abstract class n extends d {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32078c;

    /* renamed from: d  reason: collision with root package name */
    private k f32079d;

    @CallSuper
    public void b(c<e> cVar) {
    }

    public n(@Nonnull k kVar) {
        this.f32079d = kVar;
    }

    public final /* synthetic */ void f(BaseApiResponse baseApiResponse) {
        c cVar = (c) baseApiResponse;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32078c, false, 20234, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32078c, false, 20234, new Class[]{c.class}, Void.TYPE);
            return;
        }
        super.f(cVar);
        b(cVar);
    }

    @CallSuper
    /* renamed from: a */
    public void g(c<e> cVar) {
        c<e> cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f32078c, false, 20233, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f32078c, false, 20233, new Class[]{c.class}, Void.TYPE);
            return;
        }
        w.a(((e) cVar2.f22251a).a());
        com.ss.android.ugc.aweme.account.util.n.d(true);
    }

    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
        c cVar = (c) baseApiResponse;
        if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f32078c, false, 20236, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f32078c, false, 20236, new Class[]{c.class, String.class}, Void.TYPE);
        } else if (cVar == null || TextUtils.isEmpty(str)) {
            b(cVar);
        } else {
            String valueOf = String.valueOf(cVar.error);
            String str2 = cVar.errorMsg;
            a.b bVar = a.b.LOGIN_BY_PASS;
            a.C0406a aVar = a.C0406a.PHONE_NUMBER_PASS;
            a.a(valueOf, str2, bVar, aVar, "on need captcha:" + str);
            this.f32079d.a(str, cVar.errorMsg, ((e) cVar.f22251a).l, new m(this.f32079d, this, (e) cVar.f22251a));
        }
    }

    public final void a(c<e> cVar, int i) {
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32078c, false, 20235, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32078c, false, 20235, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(cVar);
    }
}
