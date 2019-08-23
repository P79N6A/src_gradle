package com.ss.android.ugc.aweme.wallet;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.sdk.IWalletMainProxy;

public class WalletMainProxy implements IWalletMainProxy {
    public static ChangeQuickRedirect changeQuickRedirect;

    public int getDiamondType() {
        return 0;
    }

    public String getHost() {
        return "aweme.snssdk.com";
    }

    public String getIapKey() {
        return "";
    }

    public boolean enableShoppingTotal() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89789, new Class[0], Boolean.TYPE)) {
            return ((Boolean) x.a().N().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89789, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public String getSchema(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, changeQuickRedirect, false, 89788, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3}, this, changeQuickRedirect, false, 89788, new Class[]{String.class}, String.class);
        }
        if (PatchProxy.isSupport(new Object[]{str3}, null, a.f76553a, true, 89784, new Class[]{String.class}, String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[]{str3}, null, a.f76553a, true, 89784, new Class[]{String.class}, String.class);
        } else if (a.f76554b == null) {
            str2 = SharePrefCache.inst().getSharePref().getString(str3, "");
        } else if (TextUtils.equals(str3, "page_charge") && !TextUtils.isEmpty(a.f76554b.a())) {
            str2 = a.f76554b.a();
        } else if (!TextUtils.equals(str3, "page_index") || TextUtils.isEmpty(a.f76554b.b())) {
            str2 = "";
        } else {
            str2 = a.f76554b.b();
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return "aweme://webview/?url=https%3A%2F%2Fwallet.snssdk.com%2Fdouyin%2Fpay%3Fhide_nav_bar%3D1";
    }

    public void openSchema(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, changeQuickRedirect, false, 89790, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, this, changeQuickRedirect, false, 89790, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        h.a().a(str2);
    }
}
