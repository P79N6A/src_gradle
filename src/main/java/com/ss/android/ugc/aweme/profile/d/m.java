package com.ss.android.ugc.aweme.profile.d;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61458a;

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f61458a, true, 69972, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f61458a, true, 69972, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || TextUtils.equals("\n", str2)) {
            return false;
        } else {
            return true;
        }
    }
}
