package com.ss.android.ugc.aweme.im.sdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import java.util.Locale;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52669a;

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f52669a, true, 53546, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f52669a, true, 53546, new Class[0], String.class);
        }
        Locale a2 = a();
        if (a2 == null) {
            return "";
        }
        return a2.getLanguage();
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f52669a, true, 53547, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52669a, true, 53547, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return TextUtils.equals(Locale.CHINESE.getLanguage(), b());
    }

    public static Locale a() {
        Locale locale;
        if (PatchProxy.isSupport(new Object[0], null, f52669a, true, 53545, new Class[0], Locale.class)) {
            return (Locale) PatchProxy.accessDispatch(new Object[0], null, f52669a, true, 53545, new Class[0], Locale.class);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locale = GlobalContext.getContext().getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = GlobalContext.getContext().getResources().getConfiguration().locale;
        }
        return locale;
    }
}
