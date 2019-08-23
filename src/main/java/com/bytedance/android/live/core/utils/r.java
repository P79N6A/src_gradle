package com.bytedance.android.live.core.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8318a;

    public static String a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, null, f8318a, true, 1179, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f8318a, true, 1179, new Class[]{String.class}, String.class);
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "-1";
        } else {
            str2 = str;
        }
        if (!str2.contains("_")) {
            str2 = TextUtils.concat(new CharSequence[]{str2, "_", PushConstants.PUSH_TYPE_NOTIFY}).toString();
        }
        return str2;
    }
}
