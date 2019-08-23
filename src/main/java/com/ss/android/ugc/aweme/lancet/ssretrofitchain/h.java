package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import com.ss.android.ugc.aweme.sec.f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class h extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52995a;

    public static final class a extends f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52996a;
        private Request i;

        public final /* synthetic */ Object a() {
            if (PatchProxy.isSupport(new Object[0], this, f52996a, false, 55040, new Class[0], Boolean.class)) {
                return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f52996a, false, 55040, new Class[0], Boolean.class);
            }
            if (this.i.getUrl().contains("/passport/user/check_email_registered") || this.i.getUrl().contains("/passport/email/register/v2/")) {
                r.a("slide_verification_response", (Map) new d().a("enter_method", c.b().getLoginMobEnterMethod()).a("status", PushConstants.PUSH_TYPE_UPLOAD_LOG).f34114b);
            }
            return Boolean.FALSE;
        }

        public final /* synthetic */ Object b() throws Exception {
            if (PatchProxy.isSupport(new Object[0], this, f52996a, false, 55039, new Class[0], Boolean.class)) {
                return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f52996a, false, 55039, new Class[0], Boolean.class);
            }
            if (this.i.getUrl().contains("/passport/user/check_email_registered") || this.i.getUrl().contains("/passport/email/register/v2/")) {
                r.a("slide_verification_response", (Map) new d().a("enter_method", c.b().getLoginMobEnterMethod()).a("status", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).f34114b);
            }
            return Boolean.TRUE;
        }

        public a(Request request) {
            this.i = request;
        }
    }

    public h(c cVar) {
        super(null);
    }

    /* access modifiers changed from: package-private */
    @NotNull
    public final c.a a(e eVar, Request request, SsResponse ssResponse) {
        e eVar2 = eVar;
        Request request2 = request;
        if (PatchProxy.isSupport(new Object[]{eVar2, request2, ssResponse}, this, f52995a, false, 55038, new Class[]{e.class, Request.class, SsResponse.class}, c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[]{eVar2, request2, ssResponse}, this, f52995a, false, 55038, new Class[]{e.class, Request.class, SsResponse.class}, c.a.class);
        }
        a aVar = new a(request2);
        try {
            if (aVar.a(eVar2.f52987a.f52989a) && ((Boolean) aVar.c()).booleanValue()) {
                return new c.a(true, true);
            }
        } catch (Throwable unused) {
        }
        return b.f52968b;
    }
}
