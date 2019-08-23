package com.ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AuthFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static IAuth createIAuth(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 71077, new Class[]{String.class}, IAuth.class)) {
            return (IAuth) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 71077, new Class[]{String.class}, IAuth.class);
        }
        AliPayAuth aliPayAuth = null;
        if ("alipay".equals(str2)) {
            aliPayAuth = new AliPayAuth();
        }
        return aliPayAuth;
    }
}
