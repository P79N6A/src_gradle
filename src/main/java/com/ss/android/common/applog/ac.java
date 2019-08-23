package com.ss.android.common.applog;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28104a;

    public static String a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f28104a, true, 15673, new Class[]{Context.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f28104a, true, 15673, new Class[]{Context.class, String.class}, String.class);
        }
        if (context != null) {
            try {
                if (AccountManager.get(context) != null) {
                    Account[] accountsByType = AccountManager.get(context).getAccountsByType(str2);
                    if (accountsByType != null && accountsByType.length > 0) {
                        return accountsByType[0].name;
                    }
                    return null;
                }
            } catch (Throwable unused) {
                Logger.debug();
            }
        }
        return null;
    }
}
