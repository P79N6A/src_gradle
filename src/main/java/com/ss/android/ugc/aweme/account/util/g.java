package com.ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33089a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33089a, true, 21310, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f33089a, true, 21310, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            try {
                byte[] bytes = str2.getBytes("UTF-8");
                for (int i = 0; i < bytes.length; i++) {
                    bytes[i] = (byte) (bytes[i] ^ 5);
                }
                return DigestUtils.toHexString(bytes, 0, bytes.length);
            } catch (Exception unused) {
                return str2;
            }
        }
    }
}
