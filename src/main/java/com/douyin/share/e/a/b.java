package com.douyin.share.e.a;

import android.text.TextUtils;
import android.util.SparseArray;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<String> f23220a = new SparseArray<>();

    public static String a(int i) {
        String str;
        String str2 = f23220a.get(i);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (i > 10000) {
            int i2 = (i % 10000) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            str = (i / 10000) + ClassUtils.PACKAGE_SEPARATOR + i2 + "w";
        } else {
            str = String.valueOf(i);
        }
        f23220a.put(i, str);
        return str;
    }
}
