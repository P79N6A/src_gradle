package com.ss.android.ugc.aweme.login;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.CookieManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.feed.ao;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.freeflowcard.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.qrcode.g;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.o;
import com.ss.android.ugc.aweme.shortvideo.util.h;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53769a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f53770b;

    j(Bundle bundle) {
        this.f53770b = bundle;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f53769a, false, 56374, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f53769a, false, 56374, new Class[0], Object.class);
        }
        Bundle bundle = this.f53770b;
        if (Build.VERSION.SDK_INT >= 21 && !a.a()) {
            CookieManager.getInstance().removeAllCookies(null);
        }
        n.g(true);
        SharePrefCache.inst().clearCache();
        c.a().c();
        com.ss.android.ugc.aweme.bridgeservice.a.a().afterLogOut();
        k.a().c();
        com.ss.android.ugc.aweme.freeflowcard.data.a.a().e();
        b.a().b();
        o.a().a(4);
        SearchHistoryManager.inst().clearForAccountChange();
        AbTestManager.a().b();
        LoginUtils.a();
        TimeLockRuler.clearCache();
        com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d.g();
        com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b.a(null);
        if (PatchProxy.isSupport(new Object[0], null, g.f63484a, true, 70396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, g.f63484a, true, 70396, new Class[0], Void.TYPE);
        } else {
            g.d(0);
            g.d(1);
        }
        h.a();
        new Handler().postDelayed(new k(bundle), 500);
        com.ss.android.ugc.aweme.im.b.a().refreshLoginState();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().clearUnlockedStickerIds();
        com.ss.android.ugc.aweme.im.b.a().onFlipChatMsgUnbind(false);
        if (PatchProxy.isSupport(new Object[0], null, b.f53741a, true, 56333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, b.f53741a, true, 56333, new Class[0], Void.TYPE);
        } else {
            FusionFuelSdk.logout();
        }
        if (PatchProxy.isSupport(new Object[0], null, ao.f45046a, true, 40253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, ao.f45046a, true, 40253, new Class[0], Void.TYPE);
        } else {
            e.d().b("last_share_type", (String) null);
        }
        com.ss.android.ugc.aweme.live.a.b();
        ((i) ServiceManager.get().getService(i.class)).c();
        bg.a(new com.ss.android.ugc.aweme.base.a.g());
        return bundle;
    }
}
