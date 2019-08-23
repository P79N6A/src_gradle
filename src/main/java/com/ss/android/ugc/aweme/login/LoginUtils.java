package com.ss.android.ugc.aweme.login;

import a.i;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.a.f;
import com.ss.android.ugc.aweme.bridgeservice.a;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.freeflowcard.b;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.o;
import com.ss.android.ugc.aweme.shortvideo.util.h;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;

public class LoginUtils {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53736a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f53737b = "LoginUtils";

    @Retention(RetentionPolicy.SOURCE)
    public @interface AuthState {
    }

    static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f53736a, true, 56370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f53736a, true, 56370, new Class[0], Void.TYPE);
            return;
        }
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService != null) {
            iWalletService.clearWallet();
        }
    }

    static final /* synthetic */ Bundle c(@NonNull Bundle bundle) throws Exception {
        n.g(false);
        SharePrefCache.inst().clearCache();
        c.a().c();
        c.a().a(false, 5);
        a.a().afterSwitchAccount();
        com.ss.android.ugc.aweme.freeflowcard.data.a.a().e();
        b.a().b();
        o.a().a(l.f53774b);
        o.a().a(3);
        SearchHistoryManager.inst().clearForAccountChange();
        AbTestManager.a().b();
        g.b();
        d.a().checkIn();
        com.ss.android.ugc.aweme.im.b.a().resetLoginState();
        a();
        TimeLockRuler.clearCache();
        com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b.a(null);
        h.a();
        bundle.putInt("switch_account_success_toast_res_id", C0906R.string.cgz);
        bundle.putBoolean("need_restart", true);
        com.ss.android.ugc.aweme.live.a.b();
        return bundle;
    }

    private static i<Bundle> e(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!PatchProxy.isSupport(new Object[]{bundle2}, null, f53736a, true, 56365, new Class[]{Bundle.class}, i.class)) {
            return i.a((Callable<TResult>) new h<TResult>(bundle2), i.f1052b);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f53736a, true, 56365, new Class[]{Bundle.class}, i.class);
    }

    private static i<Bundle> f(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!PatchProxy.isSupport(new Object[]{bundle2}, null, f53736a, true, 56367, new Class[]{Bundle.class}, i.class)) {
            return i.a((Callable<TResult>) new i<TResult>(bundle2), i.f1052b);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f53736a, true, 56367, new Class[]{Bundle.class}, i.class);
    }

    private static i<Bundle> g(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!PatchProxy.isSupport(new Object[]{bundle2}, null, f53736a, true, 56368, new Class[]{Bundle.class}, i.class)) {
            return i.b((Callable<TResult>) new j<TResult>(bundle2));
        }
        return (i) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f53736a, true, 56368, new Class[]{Bundle.class}, i.class);
    }

    public static i<Bundle> a(@Nullable Bundle bundle) {
        Bundle bundle2;
        int i;
        i<Bundle> iVar;
        if (PatchProxy.isSupport(new Object[]{bundle}, null, f53736a, true, 56364, new Class[]{Bundle.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{bundle}, null, f53736a, true, 56364, new Class[]{Bundle.class}, i.class);
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        String string = bundle2.getString("previous_uid");
        String curUserId = com.ss.android.ugc.aweme.account.c.d().getCurUserId();
        boolean isNullUid = com.ss.android.ugc.aweme.account.c.d().isNullUid(string);
        boolean isNullUid2 = com.ss.android.ugc.aweme.account.c.d().isNullUid(curUserId);
        if (isNullUid && !isNullUid2) {
            i = 0;
        } else if (isNullUid || isNullUid2) {
            i = 2;
        } else {
            i = 1;
        }
        if (i == 0) {
            iVar = e(bundle2);
        } else if (i == 1) {
            iVar = f(bundle2);
        } else {
            iVar = g(bundle2);
        }
        bg.a(new f(i));
        return iVar.c(g.f53764b);
    }

    public static void b(@NonNull Bundle bundle) {
        Intent intent;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, f53736a, true, 56369, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, null, f53736a, true, 56369, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            intent = MainActivity.getMainActivityIntent(AwemeAppData.p().c().getContext());
        } else {
            intent = new Intent(AwemeAppData.p().c().getContext(), MainActivity.class);
        }
        intent.putExtras(bundle2);
        intent.setFlags(268468224);
        Activity e2 = p.a().e();
        if (e2 != null) {
            e2.startActivity(intent);
            if (!e2.isFinishing()) {
                if (Build.VERSION.SDK_INT >= 21) {
                    e2.finishAndRemoveTask();
                } else {
                    e2.finish();
                }
            }
        } else if (k.a() != null) {
            k.a().startActivity(intent);
        }
    }

    static final /* synthetic */ Bundle d(@NonNull Bundle bundle) throws Exception {
        AppLog.setUserId(Long.parseLong(com.ss.android.ugc.aweme.account.c.d().getCurUserId()));
        AppLog.setSessionKey(com.ss.android.ugc.aweme.account.c.d().getSessionKey());
        n.g(false);
        com.ss.android.ugc.aweme.freeflowcard.data.a.a().e();
        b.a().b();
        o.a().a(m.f53776b);
        o.a().a(3);
        AbTestManager.a().b();
        g.b();
        d.a().checkIn();
        a.a().afterLogIn();
        com.ss.android.ugc.aweme.im.b.a().refreshLoginState();
        if (PatchProxy.isSupport(new Object[]{bundle}, null, f53736a, true, 56366, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, null, f53736a, true, 56366, new Class[]{Bundle.class}, Void.TYPE);
        } else if (TimeLockRuler.isInTeenagerModeNewVersion() && bundle != null) {
            if (com.ss.android.g.a.a()) {
                bundle.putBoolean("need_restart", true);
            } else {
                bg.a(new com.ss.android.ugc.aweme.login.a.a());
            }
        }
        if (((Boolean) SharePrefCache.inst().getIsFirstLaunch().c()).booleanValue()) {
            SharePrefCache.inst().getIsFirstLaunch().a(Boolean.FALSE);
        }
        if (PatchProxy.isSupport(new Object[0], null, b.f53741a, true, 56332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, b.f53741a, true, 56332, new Class[0], Void.TYPE);
        } else {
            FusionFuelSdk.login();
        }
        c.a().a(false, 5);
        com.ss.android.ugc.aweme.live.a.b();
        return bundle;
    }
}
