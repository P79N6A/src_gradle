package com.ss.android.ugc.aweme.shortvideo.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65656a;

    public static int[] a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f65656a, true, 75096, new Class[]{String.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{str2}, null, f65656a, true, 75096, new Class[]{String.class}, int[].class);
        }
        try {
            String[] split = str2.split(";");
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        } catch (Exception unused) {
            return new int[0];
        }
    }
}
