package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import com.bytedance.sdk.account.i.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.w;
import java.util.Map;

public final /* synthetic */ class q implements PhonePassLoginView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32641a;

    /* renamed from: b  reason: collision with root package name */
    private final OneLoginFragment f32642b;

    q(OneLoginFragment oneLoginFragment) {
        this.f32642b = oneLoginFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32641a, false, 20645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32641a, false, 20645, new Class[0], Void.TYPE);
            return;
        }
        OneLoginFragment oneLoginFragment = this.f32642b;
        String str = oneLoginFragment.m;
        String str2 = oneLoginFragment.n;
        a.C0406a aVar = a.C0406a.ONE_LOGIN;
        a.a(str, str2, aVar, oneLoginFragment.f32492e + oneLoginFragment.f32491d);
        if (!oneLoginFragment.f32493f.f32555e) {
            oneLoginFragment.f32493f.d();
            com.ss.android.ugc.aweme.account.terminal.a.a("NotAcceptPrivacyAndTerm");
            com.ss.android.ugc.aweme.account.terminal.a.c("NotAcceptPrivacyAndTerm");
            a.b("", "NotAcceptPrivacyAndTerm", a.b.CHECK_PRIVACY_ACCEPT, a.C0406a.ONE_LOGIN, "");
            return;
        }
        r.a("login_submit", (Map) b.a().a("enter_method", oneLoginFragment.n).a("carrier", oneLoginFragment.f32490c.getFromMobLabel()).a("platform", "one_click").f31599b);
        oneLoginFragment.f32493f.b();
        if (w.a(4, (Object) oneLoginFragment.f32492e)) {
            com.ss.android.ugc.aweme.account.terminal.a.a("NeedIntercepte");
            a.b("", "NeedIntercepte", a.b.NEED_INTERCEPTE, a.C0406a.ONE_LOGIN, "");
            return;
        }
        if (oneLoginFragment.h == null) {
            oneLoginFragment.h = (com.bytedance.sdk.account.i.a.b) c.a(com.bytedance.sdk.account.i.a.b.class);
        }
        if (oneLoginFragment.h == null) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) oneLoginFragment.getActivity(), (int) C0906R.string.abl).a();
            if (oneLoginFragment.f32493f != null) {
                oneLoginFragment.f32493f.a();
            }
        } else {
            oneLoginFragment.h.b(oneLoginFragment.h.a(), oneLoginFragment.g);
            oneLoginFragment.g.f32183f = System.currentTimeMillis();
        }
    }
}
