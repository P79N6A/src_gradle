package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65692a;

    public static String a(Context context) {
        Locale locale;
        if (PatchProxy.isSupport(new Object[]{context}, null, f65692a, true, 75135, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f65692a, true, 75135, new Class[]{Context.class}, String.class);
        } else if (context == null) {
            return "zh-CN";
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    locale = context.getResources().getConfiguration().getLocales().get(0);
                } else {
                    locale = context.getResources().getConfiguration().locale;
                }
                return locale.getLanguage() + "-" + locale.getCountry();
            } catch (Exception unused) {
                return "zh-CN";
            }
        }
    }
}
