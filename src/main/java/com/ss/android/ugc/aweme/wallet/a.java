package com.ss.android.ugc.aweme.wallet;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sdk.IWalletService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76553a;

    /* renamed from: b  reason: collision with root package name */
    static b f76554b;

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f76553a, true, 89783, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76553a, true, 89783, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (ServiceManager.get().getService(IWalletService.class) != null) {
            z = true;
        }
        return z;
    }

    public static void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f76553a, true, 89785, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, null, f76553a, true, 89785, new Class[]{b.class}, Void.TYPE);
        } else if (bVar2 != null) {
            f76554b = bVar2;
            SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
            edit.putString("page_charge", bVar2.f76567b);
            edit.putString("page_index", bVar2.f76568c);
        }
    }

    public static void a(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, null, f76553a, true, 89782, new Class[]{Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2}, null, f76553a, true, 89782, new Class[]{Activity.class, String.class}, Void.TYPE);
            return;
        }
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService != null && !TextUtils.equals("amazon", i.a().getChannel())) {
            iWalletService.openWallet(activity2, str2);
        }
    }
}
