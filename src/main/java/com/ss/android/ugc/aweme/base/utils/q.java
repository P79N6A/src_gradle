package com.ss.android.ugc.aweme.base.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35047a;

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f35047a, true, 25285, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f35047a, true, 25285, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (str2 != null) {
            int length = str.length();
            if (length != 0) {
                for (int i = 0; i < length; i++) {
                    if (!Character.isWhitespace(str2.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }
}
