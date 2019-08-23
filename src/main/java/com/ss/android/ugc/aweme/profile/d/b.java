package com.ss.android.ugc.aweme.profile.d;

import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.i18n.c;
import com.taobao.android.dexposed.ClassUtils;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61383a;

    /* renamed from: b  reason: collision with root package name */
    private static SparseArray<String> f61384b = new SparseArray<>();

    public static String a(int i) {
        String str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f61383a, true, 69886, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f61383a, true, 69886, new Class[]{Integer.TYPE}, String.class);
        } else if (c.a()) {
            return com.ss.android.ugc.aweme.i18n.b.a((long) i2);
        } else {
            String str2 = f61384b.get(i2);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            if (i2 > 10000) {
                int i3 = (i2 % 10000) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                str = (i2 / 10000) + ClassUtils.PACKAGE_SEPARATOR + i3 + "w";
            } else {
                str = String.valueOf(i);
            }
            String str3 = str + " ";
            f61384b.put(i2, str3);
            return str3;
        }
    }
}
