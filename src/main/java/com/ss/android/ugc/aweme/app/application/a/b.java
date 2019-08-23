package com.ss.android.ugc.aweme.app.application.a;

import a.g;
import a.i;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.model.f;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.login.LoginUtils;
import com.ss.android.ugc.aweme.rocket.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class b implements IAccountService.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33917a;

    public final f a() {
        if (!PatchProxy.isSupport(new Object[0], this, f33917a, false, 23233, new Class[0], f.class)) {
            return AbTestManager.a().d();
        }
        return (f) PatchProxy.accessDispatch(new Object[0], this, f33917a, false, 23233, new Class[0], f.class);
    }

    public final i<Bundle> c(@Nullable Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{bundle}, this, f33917a, false, 23229, new Class[]{Bundle.class}, i.class)) {
            return LoginUtils.a(bundle);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{bundle}, this, f33917a, false, 23229, new Class[]{Bundle.class}, i.class);
    }

    public final i<Bundle> a(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!PatchProxy.isSupport(new Object[]{bundle2}, this, f33917a, false, 23227, new Class[]{Bundle.class}, i.class)) {
            return LoginUtils.a(bundle).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(bundle2));
        }
        return (i) PatchProxy.accessDispatch(new Object[]{bundle2}, this, f33917a, false, 23227, new Class[]{Bundle.class}, i.class);
    }

    public final i<Bundle> b(@Nullable Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{bundle}, this, f33917a, false, 23228, new Class[]{Bundle.class}, i.class)) {
            return LoginUtils.a(bundle).a(d.f33921b, i.f1052b);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{bundle}, this, f33917a, false, 23228, new Class[]{Bundle.class}, i.class);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33917a, false, 23230, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f33917a, false, 23230, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(str2, "flipchat")) {
            IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
            if (a2 != null) {
                a2.onFlipChatMsgBind(a.f63644b.a(FusionFuelSdk.getLastMsg(), FusionFuelSdk.getMsgUnReadCountData()));
            }
        }
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33917a, false, 23231, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f33917a, false, 23231, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(str2, "flipchat")) {
            IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
            if (a2 != null) {
                a2.onFlipChatMsgUnbind(true);
            }
        }
    }
}
