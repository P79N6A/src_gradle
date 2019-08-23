package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52485a;

    public static String a(String str) {
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52485a, true, 53689, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f52485a, true, 53689, new Class[]{String.class}, String.class);
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        while (i < length) {
            char c2 = charArray[i];
            if (c2 > ' ' && c2 != 160 && c2 != 12288) {
                break;
            }
            i++;
        }
        while (i < length) {
            char c3 = charArray[length - 1];
            if (c3 > ' ' && c3 != 160 && c3 != 12288) {
                break;
            }
            length--;
        }
        if (i > 0 || length < str.length()) {
            return str2.substring(i, length);
        }
        return str2;
    }
}
