package com.ss.android.ugc.aweme.net;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.taobao.android.dexposed.ClassUtils;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57009a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f57009a, true, 60743, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f57009a, true, 60743, new Class[]{String.class}, String.class);
        } else if (Build.VERSION.SDK_INT >= 27) {
            return Uri.parse(str).getHost();
        } else {
            int indexOf = str2.indexOf(92);
            if (indexOf == -1) {
                return Uri.parse(str).getHost();
            }
            return Uri.parse(str2.substring(0, indexOf)).getHost();
        }
    }

    public static boolean a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f57009a, true, 60742, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f57009a, true, 60742, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            if (!TextUtils.equals(str, str2)) {
                if (str3.endsWith(ClassUtils.PACKAGE_SEPARATOR + str4)) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }
}
