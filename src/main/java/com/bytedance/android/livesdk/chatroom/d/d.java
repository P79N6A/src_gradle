package com.bytedance.android.livesdk.chatroom.d;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9892a;

    public static boolean a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f9892a, true, 5353, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f9892a, true, 5353, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || TextUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                context.getPackageManager().getPackageInfo(str2, 0);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
